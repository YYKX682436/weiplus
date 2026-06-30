package com.tencent.mm.mm7zip.impl;

/* loaded from: classes12.dex */
public class VolumedArchiveInStream implements com.tencent.mm.mm7zip.IInStream {
    private static final java.lang.String SEVEN_ZIP_FIRST_VOLUME_POSTFIX = ".7z.001";
    private long absoluteLength;
    private long absoluteOffset;
    private final com.tencent.mm.mm7zip.IArchiveOpenVolumeCallback archiveOpenVolumeCallback;
    private com.tencent.mm.mm7zip.IInStream currentInStream;
    private int currentIndex;
    private long currentVolumeLength;
    private long currentVolumeOffset;
    private java.lang.String cuttedVolumeFilename;
    private java.util.List<java.lang.Long> volumePositions;

    public VolumedArchiveInStream(com.tencent.mm.mm7zip.IArchiveOpenVolumeCallback iArchiveOpenVolumeCallback) {
        this((java.lang.String) iArchiveOpenVolumeCallback.getProperty(com.tencent.mm.mm7zip.PropID.NAME), iArchiveOpenVolumeCallback);
    }

    private void openVolume(int i17, boolean z17) {
        if (this.currentIndex == i17) {
            return;
        }
        for (int size = this.volumePositions.size(); size < i17 && this.absoluteLength == -1; size++) {
            openVolume(size, false);
        }
        if (this.absoluteLength == -1 || this.volumePositions.size() > i17) {
            com.tencent.mm.mm7zip.IInStream stream = this.archiveOpenVolumeCallback.getStream(this.cuttedVolumeFilename + java.text.MessageFormat.format("{0,number,000}", java.lang.Integer.valueOf(i17)));
            if (stream == null) {
                this.absoluteLength = this.volumePositions.get(r9.size() - 1).longValue();
                return;
            }
            this.currentInStream = stream;
            if (this.volumePositions.size() == i17) {
                long seek = this.currentInStream.seek(0L, 2);
                this.currentVolumeLength = seek;
                if (seek == 0) {
                    throw new java.lang.RuntimeException("Volume " + i17 + " is empty");
                }
                java.util.List<java.lang.Long> list = this.volumePositions;
                list.add(java.lang.Long.valueOf(list.get(i17 - 1).longValue() + this.currentVolumeLength));
                if (z17) {
                    this.currentInStream.seek(0L, 0);
                }
            } else {
                this.currentVolumeLength = this.volumePositions.get(i17).longValue() - this.volumePositions.get(i17 - 1).longValue();
            }
            if (z17) {
                this.currentVolumeOffset = 0L;
                this.absoluteOffset = this.volumePositions.get(i17 - 1).longValue();
            }
            this.currentIndex = i17;
        }
    }

    private void openVolumeToAbsoluteOffset() {
        int size = this.volumePositions.size() - 1;
        long j17 = this.absoluteLength;
        if (j17 == -1 || this.absoluteOffset < j17) {
            while (this.volumePositions.get(size).longValue() > this.absoluteOffset) {
                size--;
            }
            if (size < this.volumePositions.size() - 1) {
                openVolume(size + 1, false);
                return;
            }
            do {
                size++;
                openVolume(size, false);
                long j18 = this.absoluteLength;
                if (j18 != -1 && this.absoluteOffset >= j18) {
                    return;
                }
            } while (this.volumePositions.get(size).longValue() <= this.absoluteOffset);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.RuntimeException("close() method not supported. The user should implement its own caching and closing stratagies within the IArchiveOpenVolumeCallback.getStream() implementation.");
    }

    @Override // com.tencent.mm.mm7zip.ISequentialInStream
    public synchronized int read(byte[] bArr) {
        long j17 = this.absoluteLength;
        if (j17 != -1 && this.absoluteOffset >= j17) {
            return 0;
        }
        int read = this.currentInStream.read(bArr);
        long j18 = read;
        this.absoluteOffset += j18;
        long j19 = this.currentVolumeOffset + j18;
        this.currentVolumeOffset = j19;
        if (j19 >= this.currentVolumeLength) {
            openVolume(this.currentIndex + 1, true);
        }
        return read;
    }

    @Override // com.tencent.mm.mm7zip.ISeekableStream
    public synchronized long seek(long j17, int i17) {
        boolean z17;
        long j18;
        try {
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.RuntimeException("Seek: unknown origin: " + i17);
                    }
                    if (this.absoluteLength == -1) {
                        openVolume(Integer.MAX_VALUE, false);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    j17 += this.absoluteLength;
                    if (j17 != this.absoluteOffset && !z17) {
                        return j17;
                    }
                    this.absoluteOffset = j17;
                    openVolumeToAbsoluteOffset();
                    j18 = this.absoluteLength;
                    if (j18 == -1 && j18 <= this.absoluteOffset) {
                        this.absoluteOffset = j18;
                        return j18;
                    }
                    long longValue = this.absoluteOffset - this.volumePositions.get(this.currentIndex - 1).longValue();
                    this.currentVolumeOffset = longValue;
                    this.currentInStream.seek(longValue, 0);
                    return j17;
                }
                j17 += this.absoluteOffset;
            }
            z17 = false;
            if (j17 != this.absoluteOffset) {
            }
            this.absoluteOffset = j17;
            openVolumeToAbsoluteOffset();
            j18 = this.absoluteLength;
            if (j18 == -1) {
            }
            long longValue2 = this.absoluteOffset - this.volumePositions.get(this.currentIndex - 1).longValue();
            this.currentVolumeOffset = longValue2;
            this.currentInStream.seek(longValue2, 0);
            return j17;
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
    }

    public VolumedArchiveInStream(java.lang.String str, com.tencent.mm.mm7zip.IArchiveOpenVolumeCallback iArchiveOpenVolumeCallback) {
        this.absoluteLength = -1L;
        this.currentIndex = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.volumePositions = arrayList;
        this.archiveOpenVolumeCallback = iArchiveOpenVolumeCallback;
        arrayList.add(0L);
        if (str.endsWith(SEVEN_ZIP_FIRST_VOLUME_POSTFIX)) {
            this.cuttedVolumeFilename = str.substring(0, str.length() - 3);
            openVolume(1, true);
        } else {
            throw new com.tencent.mm.mm7zip.SevenZipException("The first 7z volume filename '" + str + "' don't ends with the postfix: '.7z.001'. Can't proceed");
        }
    }
}
