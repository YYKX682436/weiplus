package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.DataConversionUtil */
/* loaded from: classes16.dex */
public class C25456x89cf4a2 {

    /* renamed from: BASE_16BIT */
    private static final float f46170x35474dba = 32768.0f;

    /* renamed from: BASE_32BIT */
    private static final float f46171x3561ab40 = 2.1474836E9f;

    /* renamed from: IS_LITTLE_ENDIAN */
    private static final boolean f46172x6956feaf;

    static {
        f46172x6956feaf = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: byteArray16BitToShortArray */
    public static int m94363x3617e2cf(byte[] bArr, int i17, short[] sArr) {
        m94379xb2b5a64f(bArr, i17);
        m94383x9fcf89ab(sArr, i17 / 2);
        if (i17 % 2 != 0) {
            throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of 2");
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17 && i19 < sArr.length) {
            sArr[i19] = f46172x6956feaf ? m94378xb5ff0348(bArr, i18) : m94377x86b42b04(bArr, i18);
            i18 += 2;
            i19++;
        }
        return i19;
    }

    /* renamed from: byteArray24BitToIntArray */
    public static int m94364xb50992bf(byte[] bArr, int i17, int[] iArr) {
        m94379xb2b5a64f(bArr, i17);
        m94382xe42b0a58(iArr, i17 / 3);
        if (i17 % 3 != 0) {
            throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of 3");
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17 && i19 < iArr.length) {
            iArr[i19] = f46172x6956feaf ? m94374xd3225bf8(bArr, i18) : m94373x6b8f1054(bArr, i18);
            i18 += 3;
            i19++;
        }
        return i19;
    }

    /* renamed from: byteArray32BitToIntArray */
    public static int m94365x4b2969c2(byte[] bArr, int i17, int[] iArr) {
        m94379xb2b5a64f(bArr, i17);
        m94382xe42b0a58(iArr, i17 / 4);
        if (i17 % 4 != 0) {
            throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of 4");
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17 && i19 < iArr.length) {
            iArr[i19] = f46172x6956feaf ? m94376x17a8f97b(bArr, i18) : m94375x996a19b1(bArr, i18);
            i18 += 4;
            i19++;
        }
        return i19;
    }

    /* renamed from: byteArrayToFloatArray */
    public static int m94366x9d93df09(byte[] bArr, int i17, int i18, float[] fArr) {
        m94379xb2b5a64f(bArr, i17);
        m94381xbc217fcb(fArr, i17 / i18);
        m94380x2d4812fe(i17, i18);
        int i19 = 0;
        int i27 = 0;
        while (i19 < i17) {
            fArr[i19 / i18] = i18 == 3 ? m94367xc4d3c795(bArr, i19) : m94370xc4e0f658(bArr, i19);
            i19 += i18;
            i27++;
        }
        return i27;
    }

    /* renamed from: bytesToFloat24bit */
    public static float m94367xc4d3c795(byte[] bArr, int i17) {
        return f46172x6956feaf ? m94369x810f76eb(bArr, i17) : m94368xa1a21241(bArr, i17);
    }

    /* renamed from: bytesToFloat24bitInBigEndian */
    public static float m94368xa1a21241(byte[] bArr, int i17) {
        return m94373x6b8f1054(bArr, i17) / f46171x3561ab40;
    }

    /* renamed from: bytesToFloat24bitInLittleEndian */
    public static float m94369x810f76eb(byte[] bArr, int i17) {
        return m94374xd3225bf8(bArr, i17) / f46171x3561ab40;
    }

    /* renamed from: bytesToFloat32bit */
    public static float m94370xc4e0f658(byte[] bArr, int i17) {
        return f46172x6956feaf ? m94372xc596146e(bArr, i17) : m94371xcf7d1b9e(bArr, i17);
    }

    /* renamed from: bytesToFloat32bitInBigEndian */
    public static float m94371xcf7d1b9e(byte[] bArr, int i17) {
        return m94375x996a19b1(bArr, i17) / f46171x3561ab40;
    }

    /* renamed from: bytesToFloat32bitInLittleEndian */
    public static float m94372xc596146e(byte[] bArr, int i17) {
        return m94376x17a8f97b(bArr, i17) / f46171x3561ab40;
    }

    /* renamed from: bytesToInt24bitInBigEndian */
    public static int m94373x6b8f1054(byte[] bArr, int i17) {
        return ((bArr[i17] & 255) << 24) | ((bArr[i17 + 2] << 8) & 255) | ((bArr[i17 + 1] & 255) << 16);
    }

    /* renamed from: bytesToInt24bitInLittleEndian */
    public static int m94374xd3225bf8(byte[] bArr, int i17) {
        return ((bArr[i17 + 2] & 255) << 24) | ((bArr[i17] << 8) & 255) | ((bArr[i17 + 1] & 255) << 16);
    }

    /* renamed from: bytesToInt32bitInBigEndian */
    public static int m94375x996a19b1(byte[] bArr, int i17) {
        return ((bArr[i17] & 255) << 24) | (bArr[i17 + 3] & 255) | ((bArr[i17 + 2] & 255) << 8) | ((bArr[i17 + 1] & 255) << 16);
    }

    /* renamed from: bytesToInt32bitInLittleEndian */
    public static int m94376x17a8f97b(byte[] bArr, int i17) {
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    /* renamed from: bytesToShort16bitInBigEndian */
    public static short m94377x86b42b04(byte[] bArr, int i17) {
        return (short) (((bArr[i17] & 255) << 8) | (bArr[i17 + 1] & 255));
    }

    /* renamed from: bytesToShort16bitInLittleEndian */
    public static short m94378xb5ff0348(byte[] bArr, int i17) {
        return (short) (((bArr[i17 + 1] & 255) << 8) | (bArr[i17] & 255));
    }

    /* renamed from: checkByteArrayLength */
    private static void m94379xb2b5a64f(byte[] bArr, int i17) {
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("byte Array must not be null or zero length");
        }
        if (i17 <= bArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than byte Array length. param:" + i17 + ", byte array length:" + bArr.length);
    }

    /* renamed from: checkByteArrayProperty */
    private static void m94380x2d4812fe(int i17, int i18) {
        if (i18 <= 4 && i18 >= 3) {
            if (i17 % i18 != 0) {
                throw new java.lang.IllegalArgumentException("length of byteArray must be multiple of bytesPerSample");
            }
        } else {
            throw new java.lang.IllegalArgumentException("bytesPerSample of " + i18 + " is not supported");
        }
    }

    /* renamed from: checkFloatArrayLength */
    private static void m94381xbc217fcb(float[] fArr, int i17) {
        if (fArr == null || fArr.length == 0) {
            throw new java.lang.IllegalArgumentException("float Array must not be null or zero length");
        }
        if (i17 <= fArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than float Array length. param:" + i17 + ", float array length:" + fArr.length);
    }

    /* renamed from: checkIntArrayLength */
    private static void m94382xe42b0a58(int[] iArr, int i17) {
        if (iArr == null || iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("int Array must not be null or zero length");
        }
        if (i17 <= iArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than int Array length. param:" + i17 + ", int array length:" + iArr.length);
    }

    /* renamed from: checkShortArrayLength */
    private static void m94383x9fcf89ab(short[] sArr, int i17) {
        if (sArr == null || sArr.length == 0) {
            throw new java.lang.IllegalArgumentException("short Array must not be null or zero length");
        }
        if (i17 <= sArr.length) {
            return;
        }
        throw new java.lang.IllegalArgumentException("the length param can not larger than short Array length. param:" + i17 + ", short array length:" + sArr.length);
    }

    /* renamed from: floatTo2Bytes */
    public static void m94384xf4099010(float f17, byte[] bArr, int i17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f17 < -1.0f) {
            f17 = -1.0f;
        }
        m94390x2acad230((short) (f17 * f46170x35474dba), bArr, i17);
    }

    /* renamed from: intArrayToByteArray24Bit */
    public static int m94385x14ae8eff(int[] iArr, int i17, byte[] bArr) {
        m94382xe42b0a58(iArr, i17);
        m94379xb2b5a64f(bArr, i17 * 3);
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            m94387x98f69b42(iArr[i18], bArr, i19);
            i18++;
            i19 += 3;
        }
        return i19;
    }

    /* renamed from: intArrayToByteArray32Bit */
    public static int m94386x14bbbdc2(int[] iArr, int i17, byte[] bArr) {
        m94382xe42b0a58(iArr, i17);
        m94379xb2b5a64f(bArr, i17 * 4);
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            m94388x9aab73e1(iArr[i18], bArr, i19);
            i18++;
            i19 += 4;
        }
        return i19;
    }

    /* renamed from: intTo3Bytes */
    public static void m94387x98f69b42(int i17, byte[] bArr, int i18) {
        if (f46172x6956feaf) {
            bArr[i18] = (byte) ((i17 >> 8) & 255);
            bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
            bArr[i18 + 2] = (byte) ((i17 >> 24) & 255);
        } else {
            bArr[i18 + 2] = (byte) ((i17 >> 8) & 255);
            bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
            bArr[i18] = (byte) ((i17 >> 24) & 255);
        }
    }

    /* renamed from: intTo4Bytes */
    public static void m94388x9aab73e1(int i17, byte[] bArr, int i18) {
        if (f46172x6956feaf) {
            bArr[i18] = (byte) (i17 & 255);
            bArr[i18 + 1] = (byte) ((i17 >> 8) & 255);
            bArr[i18 + 2] = (byte) ((i17 >> 16) & 255);
            bArr[i18 + 3] = (byte) ((i17 >> 24) & 255);
            return;
        }
        bArr[i18 + 3] = (byte) (i17 & 255);
        bArr[i18 + 2] = (byte) ((i17 >> 8) & 255);
        bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
        bArr[i18] = (byte) ((i17 >> 24) & 255);
    }

    /* renamed from: shortArrayToByteArray16Bit */
    public static int m94389xadb0bdcf(short[] sArr, int i17, byte[] bArr) {
        m94383x9fcf89ab(sArr, i17);
        m94379xb2b5a64f(bArr, i17 * 2);
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            m94390x2acad230(sArr[i18], bArr, i19);
            i18++;
            i19 += 2;
        }
        return i19;
    }

    /* renamed from: shortTo2Bytes */
    public static void m94390x2acad230(short s17, byte[] bArr, int i17) {
        if (f46172x6956feaf) {
            bArr[i17] = (byte) (s17 & 255);
            bArr[i17 + 1] = (byte) ((s17 >> 8) & 255);
        } else {
            bArr[i17 + 1] = (byte) (s17 & 255);
            bArr[i17] = (byte) ((s17 >> 8) & 255);
        }
    }
}
