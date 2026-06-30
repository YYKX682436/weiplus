package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
public final class ExifOutputStream extends java.io.FilterOutputStream {
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final boolean DEBUG = false;
    private static final byte[] IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(androidx.camera.core.impl.utils.ExifAttribute.ASCII);
    private static final int IFD_OFFSET = 8;
    private static final byte START_CODE = 42;
    private static final int STATE_FRAME_HEADER = 1;
    private static final int STATE_JPEG_DATA = 2;
    private static final int STATE_SOI = 0;
    private static final int STREAMBUFFER_SIZE = 65536;
    private static final java.lang.String TAG = "ExifOutputStream";
    private final java.nio.ByteBuffer mBuffer;
    private int mByteToCopy;
    private int mByteToSkip;
    private final androidx.camera.core.impl.utils.ExifData mExifData;
    private final byte[] mSingleByteArray;
    private int mState;

    /* loaded from: classes13.dex */
    public static final class JpegHeader {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        private JpegHeader() {
        }

        public static boolean isSofMarker(short s17) {
            return (s17 < -64 || s17 > -49 || s17 == -60 || s17 == -56 || s17 == -52) ? false : true;
        }
    }

    public ExifOutputStream(java.io.OutputStream outputStream, androidx.camera.core.impl.utils.ExifData exifData) {
        super(new java.io.BufferedOutputStream(outputStream, 65536));
        this.mSingleByteArray = new byte[1];
        this.mBuffer = java.nio.ByteBuffer.allocate(4);
        this.mState = 0;
        this.mExifData = exifData;
    }

    private int requestByteToBuffer(int i17, byte[] bArr, int i18, int i19) {
        int min = java.lang.Math.min(i19, i17 - this.mBuffer.position());
        this.mBuffer.put(bArr, i18, min);
        return min;
    }

    private void writeExifSegment(androidx.camera.core.impl.utils.ByteOrderedDataOutputStream byteOrderedDataOutputStream) {
        androidx.camera.core.impl.utils.ExifTag[][] exifTagArr = androidx.camera.core.impl.utils.ExifData.EXIF_TAGS;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (androidx.camera.core.impl.utils.ExifTag exifTag : androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS) {
            for (int i17 = 0; i17 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i17++) {
                this.mExifData.getAttributes(i17).remove(exifTag.name);
            }
        }
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[1].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[2].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[3].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        for (int i18 = 0; i18 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i18++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it = this.mExifData.getAttributes(i18).entrySet().iterator();
            int i19 = 0;
            while (it.hasNext()) {
                int size = it.next().getValue().size();
                if (size > 4) {
                    i19 += size;
                }
            }
            iArr2[i18] = iArr2[i18] + i19;
        }
        int i27 = 8;
        for (int i28 = 0; i28 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i28++) {
            if (!this.mExifData.getAttributes(i28).isEmpty()) {
                iArr[i28] = i27;
                i27 += (this.mExifData.getAttributes(i28).size() * 12) + 2 + 4 + iArr2[i28];
            }
        }
        int i29 = i27 + 8;
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[1].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(iArr[1], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[2].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(iArr[2], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(androidx.camera.core.impl.utils.ExifData.EXIF_POINTER_TAGS[3].name, androidx.camera.core.impl.utils.ExifAttribute.createULong(iArr[3], this.mExifData.getByteOrder()));
        }
        byteOrderedDataOutputStream.writeUnsignedShort(i29);
        byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        byteOrderedDataOutputStream.writeShort(this.mExifData.getByteOrder() == java.nio.ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream.setByteOrder(this.mExifData.getByteOrder());
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        for (int i37 = 0; i37 < androidx.camera.core.impl.utils.ExifData.EXIF_TAGS.length; i37++) {
            if (!this.mExifData.getAttributes(i37).isEmpty()) {
                byteOrderedDataOutputStream.writeUnsignedShort(this.mExifData.getAttributes(i37).size());
                int size2 = iArr[i37] + 2 + (this.mExifData.getAttributes(i37).size() * 12) + 4;
                for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute> entry : this.mExifData.getAttributes(i37).entrySet()) {
                    androidx.camera.core.impl.utils.ExifTag exifTag2 = androidx.camera.core.impl.utils.ExifData.Builder.sExifTagMapsForWriting.get(i37).get(entry.getKey());
                    m3.h.d(exifTag2, "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.");
                    int i38 = exifTag2.number;
                    androidx.camera.core.impl.utils.ExifAttribute value = entry.getValue();
                    int size3 = value.size();
                    byteOrderedDataOutputStream.writeUnsignedShort(i38);
                    byteOrderedDataOutputStream.writeUnsignedShort(value.format);
                    byteOrderedDataOutputStream.writeInt(value.numberOfComponents);
                    if (size3 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size2);
                        size2 += size3;
                    } else {
                        byteOrderedDataOutputStream.write(value.bytes);
                        if (size3 < 4) {
                            while (size3 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                size3++;
                            }
                        }
                    }
                }
                byteOrderedDataOutputStream.writeUnsignedInt(0L);
                java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> it6 = this.mExifData.getAttributes(i37).entrySet().iterator();
                while (it6.hasNext()) {
                    byte[] bArr = it6.next().getValue().bytes;
                    if (bArr.length > 4) {
                        byteOrderedDataOutputStream.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        byteOrderedDataOutputStream.setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0108, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifOutputStream.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        byte[] bArr = this.mSingleByteArray;
        bArr[0] = (byte) (i17 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
