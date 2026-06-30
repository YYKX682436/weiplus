package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final java.lang.String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final java.nio.charset.Charset ASCII = java.nio.charset.StandardCharsets.US_ASCII;
    static final java.lang.String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    public ExifAttribute(int i17, int i18, byte[] bArr) {
        this(i17, i18, -1L, bArr);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createByte(java.lang.String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new androidx.camera.core.impl.utils.ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(ASCII);
        return new androidx.camera.core.impl.utils.ExifAttribute(1, bytes.length, bytes);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createDouble(double[] dArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d17 : dArr) {
            wrap.putDouble(d17);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(12, dArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSLong(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i17 : iArr) {
            wrap.putInt(i17);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(9, iArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSRational(androidx.camera.core.impl.utils.LongRational[] longRationalArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (androidx.camera.core.impl.utils.LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(10, longRationalArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createString(java.lang.String str) {
        byte[] bytes = (str + (char) 0).getBytes(ASCII);
        return new androidx.camera.core.impl.utils.ExifAttribute(2, bytes.length, bytes);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createULong(long[] jArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j17 : jArr) {
            wrap.putInt((int) j17);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(4, jArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createURational(androidx.camera.core.impl.utils.LongRational[] longRationalArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (androidx.camera.core.impl.utils.LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(5, longRationalArr.length, wrap.array());
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createUShort(int[] iArr, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i17 : iArr) {
            wrap.putShort((short) i17);
        }
        return new androidx.camera.core.impl.utils.ExifAttribute(3, iArr.length, wrap.array());
    }

    public double getDoubleValue(java.nio.ByteOrder byteOrder) {
        java.lang.Object value = getValue(byteOrder);
        if (value == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
        }
        if (value instanceof java.lang.String) {
            return java.lang.Double.parseDouble((java.lang.String) value);
        }
        if (value instanceof long[]) {
            if (((long[]) value).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (value instanceof int[]) {
            if (((int[]) value).length == 1) {
                return r5[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(value instanceof androidx.camera.core.impl.utils.LongRational[])) {
            throw new java.lang.NumberFormatException("Couldn't find a double value");
        }
        androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) value;
        if (longRationalArr.length == 1) {
            return longRationalArr[0].toDouble();
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    public int getIntValue(java.nio.ByteOrder byteOrder) {
        java.lang.Object value = getValue(byteOrder);
        if (value == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (value instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(value instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) value;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    public java.lang.String getStringValue(java.nio.ByteOrder byteOrder) {
        java.lang.Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof java.lang.String) {
            return (java.lang.String) value;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i17 < jArr.length) {
                sb6.append(jArr[i17]);
                i17++;
                if (i17 != jArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i17 < iArr.length) {
                sb6.append(iArr[i17]);
                i17++;
                if (i17 != iArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i17 < dArr.length) {
                sb6.append(dArr[i17]);
                i17++;
                if (i17 != dArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }
        if (!(value instanceof androidx.camera.core.impl.utils.LongRational[])) {
            return null;
        }
        androidx.camera.core.impl.utils.LongRational[] longRationalArr = (androidx.camera.core.impl.utils.LongRational[]) value;
        while (i17 < longRationalArr.length) {
            sb6.append(longRationalArr[i17].getNumerator());
            sb6.append('/');
            sb6.append(longRationalArr[i17].getDenominator());
            i17++;
            if (i17 != longRationalArr.length) {
                sb6.append(",");
            }
        }
        return sb6.toString();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:168:0x0198 */
    /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getValue(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifAttribute.getValue(java.nio.ByteOrder):java.lang.Object");
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }

    public java.lang.String toString() {
        return "(" + IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
    }

    public ExifAttribute(int i17, int i18, long j17, byte[] bArr) {
        this.format = i17;
        this.numberOfComponents = i18;
        this.bytesOffset = j17;
        this.bytes = bArr;
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createDouble(double d17, java.nio.ByteOrder byteOrder) {
        return createDouble(new double[]{d17}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSLong(int i17, java.nio.ByteOrder byteOrder) {
        return createSLong(new int[]{i17}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createULong(long j17, java.nio.ByteOrder byteOrder) {
        return createULong(new long[]{j17}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createUShort(int i17, java.nio.ByteOrder byteOrder) {
        return createUShort(new int[]{i17}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createSRational(androidx.camera.core.impl.utils.LongRational longRational, java.nio.ByteOrder byteOrder) {
        return createSRational(new androidx.camera.core.impl.utils.LongRational[]{longRational}, byteOrder);
    }

    public static androidx.camera.core.impl.utils.ExifAttribute createURational(androidx.camera.core.impl.utils.LongRational longRational, java.nio.ByteOrder byteOrder) {
        return createURational(new androidx.camera.core.impl.utils.LongRational[]{longRational}, byteOrder);
    }
}
