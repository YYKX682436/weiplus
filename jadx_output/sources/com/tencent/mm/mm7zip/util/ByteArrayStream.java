package com.tencent.mm.mm7zip.util;

/* loaded from: classes12.dex */
public class ByteArrayStream implements com.tencent.mm.mm7zip.IInStream, com.tencent.mm.mm7zip.IOutStream {
    private static final int INPUT_STREAM_READ_BUFFER_SIZE = 16384;
    private static final int MAX_CHUNK_SIZE = 1048576;
    private final java.util.List<byte[]> chunkList;
    private int currentChunkIndex;
    private int currentPosition;
    private int currentPositionInChunk;
    private final int initialSize;
    private final int maxSize;
    private int seekToPosition;
    private int size;

    public ByteArrayStream(byte[] bArr, boolean z17, int i17) {
        this(1024, i17);
        setBytes(bArr, z17);
    }

    private void allocateNextChunk(int i17) {
        int i18 = this.currentChunkIndex;
        if (i18 == -1 || (i18 == this.chunkList.size() - 1 && this.chunkList.get(this.currentChunkIndex).length == this.currentPositionInChunk)) {
            this.currentPositionInChunk = 0;
            this.currentChunkIndex++;
        }
        if (this.size >= this.maxSize) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
        }
        int size = this.chunkList.size() - 1;
        int length = size == -1 ? this.initialSize : this.chunkList.get(size).length << 1;
        if (length < 0 || length > 1048576) {
            length = 1048576;
        }
        int i19 = this.size;
        int i27 = i19 + length;
        int i28 = this.maxSize;
        if (i27 > i28) {
            length = i28 - i19;
        }
        if (i17 == -1 || length >= i17) {
            i17 = length;
        } else if (i19 + i17 >= i28) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
        }
        this.chunkList.add(new byte[i17]);
    }

    private void endWriting() {
        if (this.size == this.currentPosition && this.currentPositionInChunk == 0) {
            int i17 = this.currentChunkIndex;
            if (i17 == 0) {
                init();
                return;
            }
            java.util.List<byte[]> list = this.chunkList;
            this.currentChunkIndex = i17 - 1;
            list.remove(i17);
            this.currentPositionInChunk = this.chunkList.get(this.currentChunkIndex).length;
        }
    }

    private void init() {
        this.chunkList.clear();
        this.currentPosition = 0;
        this.currentPositionInChunk = 0;
        this.currentChunkIndex = -1;
        this.size = 0;
        this.seekToPosition = -1;
    }

    private void performDelayedSeek() {
        int i17 = this.seekToPosition;
        if (i17 == -1) {
            return;
        }
        if (this.currentPosition == i17) {
            this.seekToPosition = -1;
            return;
        }
        if (i17 > this.size) {
            setSize(i17, true);
            this.seekToPosition = -1;
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.chunkList.size(); i19++) {
            int length = this.chunkList.get(i19).length;
            i18 += length;
            int i27 = this.seekToPosition;
            if (i18 > i27) {
                this.currentChunkIndex = i19;
                this.currentPositionInChunk = length - (i18 - i27);
                this.currentPosition = i27;
                this.seekToPosition = -1;
                return;
            }
        }
        int size = this.chunkList.size() - 1;
        this.currentChunkIndex = size;
        this.currentPositionInChunk = this.chunkList.get(size).length;
        this.currentPosition = this.size;
        this.seekToPosition = -1;
    }

    private void startWriting() {
        int i17 = this.currentChunkIndex;
        if (i17 == -1 || this.currentPositionInChunk >= this.chunkList.get(i17).length) {
            allocateNextChunk(-1);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public synchronized byte[] getBytes() {
        byte[] bArr;
        bArr = new byte[this.size];
        int i17 = 0;
        for (byte[] bArr2 : this.chunkList) {
            int length = bArr2.length + i17;
            int i18 = this.size;
            int length2 = length > i18 ? i18 - i17 : bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i17, length2);
            i17 += length2;
        }
        return bArr;
    }

    public synchronized int getCurrentPosition() {
        int i17 = this.seekToPosition;
        if (i17 != -1) {
            return i17;
        }
        return this.currentPosition;
    }

    public java.io.InputStream getDetachedInputStream() {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    public java.io.InputStream getInputStream() {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    public java.io.OutputStream getOutputStream() {
        throw new java.lang.IllegalStateException("Not implemented");
    }

    public synchronized int getSize() {
        return this.size;
    }

    public synchronized boolean isEOF() {
        return getCurrentPosition() >= this.size;
    }

    @Override // com.tencent.mm.mm7zip.ISequentialInStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized void rewind() {
        this.seekToPosition = 0;
    }

    @Override // com.tencent.mm.mm7zip.ISeekableStream
    public synchronized long seek(long j17, int i17) {
        int i18;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    i18 = this.seekToPosition;
                    if (i18 == -1) {
                        i18 = this.currentPosition;
                    }
                } else {
                    if (i17 != 2) {
                        throw new com.tencent.mm.mm7zip.SevenZipException("Seek: unknown origin: " + i17);
                    }
                    i18 = this.size;
                }
                j17 += i18;
            }
            if (j17 > this.maxSize) {
                throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by seek to " + j17 + ", maximal size is " + this.maxSize + " bytes");
            }
            this.seekToPosition = (int) j17;
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        return j17;
    }

    public synchronized void setBytes(byte[] bArr, boolean z17) {
        init();
        int length = bArr.length;
        if (z17) {
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        this.chunkList.add(bArr);
        this.currentChunkIndex = 0;
        this.currentPosition = 0;
        this.currentPositionInChunk = 0;
        this.size = length;
    }

    @Override // com.tencent.mm.mm7zip.IOutStream
    public synchronized void setSize(long j17) {
        setSize(j17, false);
    }

    public synchronized void truncate() {
        init();
    }

    @Override // com.tencent.mm.mm7zip.ISequentialOutStream
    public int write(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    public synchronized void writeFromInputStream(java.io.InputStream inputStream, boolean z17) {
        performDelayedSeek();
        if (this.size == 0) {
            init();
            int available = inputStream.available();
            if (available > this.maxSize) {
                throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
            }
            if (available > this.initialSize) {
                byte[] bArr = new byte[available];
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                this.size = read;
                this.currentPosition = read;
                this.currentPositionInChunk = read;
                this.currentChunkIndex = 0;
                this.chunkList.add(bArr);
            }
            startWriting();
            while (true) {
                byte[] bArr2 = this.chunkList.get(this.currentChunkIndex);
                int i17 = this.currentPositionInChunk;
                int read2 = inputStream.read(bArr2, i17, bArr2.length - i17);
                if (read2 == -1) {
                    break;
                }
                this.currentPosition += read2;
                int i18 = this.currentPositionInChunk + read2;
                this.currentPositionInChunk = i18;
                if (bArr2.length - i18 == 0) {
                    allocateNextChunk(-1);
                }
            }
            this.size = this.currentPosition;
            endWriting();
        } else {
            byte[] bArr3 = new byte[16384];
            while (true) {
                int read3 = inputStream.read(bArr3);
                if (read3 == -1) {
                    break;
                } else {
                    write(bArr3, 0, read3);
                }
            }
        }
        if (z17) {
            inputStream.close();
        }
    }

    public synchronized void writeToOutputStream(java.io.OutputStream outputStream, boolean z17) {
        try {
            int i17 = 0;
            for (byte[] bArr : this.chunkList) {
                int length = bArr.length + i17;
                int i18 = this.size;
                int length2 = length > i18 ? i18 - i17 : bArr.length;
                outputStream.write(bArr, 0, length2);
                i17 += length2;
            }
            if (z17) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }

    public synchronized int read(byte[] bArr, int i17, int i18) {
        if (i17 >= 0 && i18 >= 0) {
            if (bArr.length >= i17 + i18) {
                if (this.seekToPosition > this.size) {
                    return 0;
                }
                performDelayedSeek();
                int i19 = this.currentPosition;
                int i27 = i19 + i18;
                int i28 = this.size;
                if (i27 > i28) {
                    i18 = i28 - i19;
                }
                int i29 = i18;
                while (i29 > 0) {
                    int length = this.chunkList.get(this.currentChunkIndex).length;
                    int i37 = length - this.currentPositionInChunk;
                    if (i29 <= i37) {
                        i37 = i29;
                    }
                    java.lang.System.arraycopy(this.chunkList.get(this.currentChunkIndex), this.currentPositionInChunk, bArr, i17, i37);
                    i17 += i37;
                    int i38 = this.currentPositionInChunk + i37;
                    this.currentPositionInChunk = i38;
                    i29 -= i37;
                    if (i38 >= length && this.currentChunkIndex < this.chunkList.size() - 1) {
                        int i39 = this.currentChunkIndex + 1;
                        this.currentChunkIndex = i39;
                        this.currentPositionInChunk = 0;
                        int length2 = this.chunkList.get(i39).length;
                    }
                }
                this.currentPosition += i18;
                return i18;
            }
        }
        throw new java.lang.IllegalStateException("Invalid start position (" + i17 + ") and length (" + i18 + ")");
    }

    public synchronized int write(byte[] bArr, int i17, int i18) {
        if (i17 >= 0 && i18 >= 0) {
            if (bArr.length >= i17 + i18) {
                if (i18 == 0) {
                    return 0;
                }
                performDelayedSeek();
                startWriting();
                do {
                    byte[] bArr2 = this.chunkList.get(this.currentChunkIndex);
                    int length = bArr2.length;
                    int i19 = this.currentPositionInChunk;
                    int i27 = length - i19;
                    if (i27 >= i18) {
                        i27 = i18;
                    }
                    java.lang.System.arraycopy(bArr, i17, bArr2, i19, i27);
                    int i28 = this.currentPositionInChunk + i27;
                    this.currentPositionInChunk = i28;
                    this.currentPosition += i27;
                    i17 += i27;
                    i18 -= i27;
                    if (i28 >= bArr2.length) {
                        this.currentPositionInChunk = 0;
                        int i29 = this.currentChunkIndex + 1;
                        this.currentChunkIndex = i29;
                        if (i29 >= this.chunkList.size()) {
                            allocateNextChunk(-1);
                        }
                    }
                } while (i18 > 0);
                int i37 = this.currentPosition;
                if (i37 > this.size) {
                    this.size = i37;
                }
                endWriting();
                return bArr.length;
            }
        }
        throw new java.lang.IllegalStateException("Invalid start position (" + i17 + ") and length (" + i18 + ")");
    }

    public ByteArrayStream(byte[] bArr, boolean z17) {
        this(1024 > bArr.length ? bArr.length : 1024, bArr.length);
        setBytes(bArr, z17);
    }

    private synchronized void setSize(long j17, boolean z17) {
        if (j17 == 0) {
            truncate();
            return;
        }
        if (j17 <= this.maxSize) {
            int i17 = this.size;
            if (j17 > i17) {
                if (i17 == 0) {
                    int i18 = (int) j17;
                    this.chunkList.add(new byte[i18]);
                    this.currentChunkIndex = 0;
                    this.size = i18;
                }
                int i19 = (int) (j17 - this.size);
                int i27 = 0;
                for (int i28 = 0; i28 < this.chunkList.size(); i28++) {
                    i27 += this.chunkList.get(i28).length;
                }
                int i29 = this.size;
                int i37 = i27 - i29;
                if (i37 < i19) {
                    this.size = i29 + i37;
                    int i38 = i19 - i37;
                    allocateNextChunk(i38);
                    if (z17) {
                        this.currentPositionInChunk = i38;
                    }
                } else if (z17) {
                    this.currentPositionInChunk = (this.chunkList.get(r1.size() - 1).length - i37) + i19;
                }
                if (z17) {
                    this.currentChunkIndex = this.chunkList.size() - 1;
                    this.currentPosition = (int) j17;
                }
                this.size = (int) j17;
            }
            if (j17 < this.size) {
                int i39 = 0;
                for (int i47 = 0; i47 < this.chunkList.size(); i47++) {
                    i39 += this.chunkList.get(i47).length;
                    if (i39 >= j17) {
                        for (int size = this.chunkList.size() - 1; size > i47; size--) {
                            this.chunkList.remove(size);
                        }
                        int i48 = this.seekToPosition;
                        if (i48 != -1 && i48 > j17) {
                            this.seekToPosition = (int) j17;
                        } else if (this.currentPosition > j17) {
                            int i49 = (int) j17;
                            this.currentPosition = i49;
                            this.currentPositionInChunk = (i49 - i39) + this.chunkList.get(i47).length;
                            this.currentChunkIndex = i47;
                        }
                        this.size = (int) j17;
                    }
                }
            }
            return;
        }
        throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j17 + "). Maximal size is " + this.maxSize + " bytes");
    }

    public ByteArrayStream(int i17) {
        this(1024, i17);
    }

    public ByteArrayStream(int i17, int i18) {
        this.chunkList = new java.util.ArrayList();
        this.initialSize = i17;
        if (i18 < 0) {
            throw new java.lang.IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        if (i17 >= 0) {
            this.maxSize = i18;
            init();
            return;
        }
        throw new java.lang.IllegalStateException("Initial size of the byte array stream should be >0");
    }
}
