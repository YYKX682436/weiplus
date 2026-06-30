package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.BytesTransUtil */
/* loaded from: classes10.dex */
public class C25454xa4fc36bf {

    /* renamed from: instance */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25454xa4fc36bf f46166x21169495;
    private java.lang.String TAG = "BytesTransUtil";

    private C25454xa4fc36bf() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25454xa4fc36bf m94337x9cf0d20b() {
        if (f46166x21169495 == null) {
            f46166x21169495 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25454xa4fc36bf();
        }
        return f46166x21169495;
    }

    /* renamed from: Bytes2Ints */
    public int[] m94338xc746184b(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            byte[] bArr2 = new byte[4];
            for (int i18 = 0; i18 < 4; i18++) {
                bArr2[i18] = bArr[(i17 * 4) + i18];
            }
            iArr[i17] = m94351xb58848b9(bArr2);
            java.lang.System.out.println("2out->" + iArr[i17]);
        }
        return iArr;
    }

    /* renamed from: Bytes2Longs */
    public long[] m94339x21a79470(byte[] bArr) {
        int length = bArr.length / 8;
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            byte[] bArr2 = new byte[8];
            for (int i18 = 0; i18 < 8; i18++) {
                bArr2[i18] = bArr[(i17 * 8) + i18];
            }
            jArr[i17] = m94353xfb822ef2(bArr2);
        }
        return jArr;
    }

    /* renamed from: Bytes2Shorts */
    public short[] m94340x1edadf9e(short[] sArr, byte[] bArr) {
        byte[] bArr2 = new byte[2];
        for (int i17 = 0; i17 < sArr.length; i17++) {
            java.lang.System.arraycopy(bArr, i17 * 2, bArr2, 0, 2);
            sArr[i17] = m94355x75232ac6(bArr2);
        }
        return sArr;
    }

    /* renamed from: Ints2Bytes */
    public byte[] m94341x8cfb06dd(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            byte[] m94345x743b66b5 = m94345x743b66b5(iArr[i17]);
            java.lang.System.out.println("1out->" + iArr[i17]);
            for (int i18 = 0; i18 < 4; i18++) {
                bArr[(i17 * 4) + i18] = m94345x743b66b5[i18];
            }
        }
        return bArr;
    }

    /* renamed from: Longs2Bytes */
    public byte[] m94342xbd579b70(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        for (int i17 = 0; i17 < jArr.length; i17++) {
            byte[] m94347x743b66b5 = m94347x743b66b5(jArr[i17]);
            for (int i18 = 0; i18 < 8; i18++) {
                bArr[(i17 * 8) + i18] = m94347x743b66b5[i18];
            }
        }
        return bArr;
    }

    /* renamed from: Shorts2Bytes */
    public byte[] m94344x1c74c9b0(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        m94343x1c74c9b0(sArr, bArr);
        return bArr;
    }

    /* renamed from: getBytes */
    public byte[] m94350x743b66b5(short s17, boolean z17) {
        byte[] bArr = new byte[2];
        if (z17) {
            for (int i17 = 1; i17 >= 0; i17--) {
                bArr[i17] = (byte) (s17 & 255);
                s17 = (short) (s17 >> 8);
            }
        } else {
            for (int i18 = 0; i18 < 2; i18++) {
                bArr[i18] = (byte) (s17 & 255);
                s17 = (short) (s17 >> 8);
            }
        }
        return bArr;
    }

    /* renamed from: getInt */
    public int m94352xb58848b9(byte[] bArr, boolean z17) {
        if (bArr != null) {
            if (bArr.length > 4) {
                throw new java.lang.IllegalArgumentException("byte array size > 4 !");
            }
            int i17 = 0;
            if (z17) {
                int i18 = 0;
                while (i17 < bArr.length) {
                    i18 = (i18 << 8) | (bArr[i17] & 255);
                    i17++;
                }
                return i18;
            }
            for (int length = bArr.length - 1; length >= 0; length--) {
                i17 = (i17 << 8) | (bArr[length] & 255);
            }
            return i17;
        }
        throw new java.lang.IllegalArgumentException("byte array is null!");
    }

    /* renamed from: getLong */
    public long m94354xfb822ef2(byte[] bArr, boolean z17) {
        if (bArr != null) {
            if (bArr.length > 8) {
                throw new java.lang.IllegalArgumentException("byte array size > 8 !");
            }
            long j17 = 0;
            if (z17) {
                for (byte b17 : bArr) {
                    j17 = (j17 << 8) | (b17 & 255);
                }
            } else {
                for (int length = bArr.length - 1; length >= 0; length--) {
                    j17 = (j17 << 8) | (bArr[length] & 255);
                }
            }
            return j17;
        }
        throw new java.lang.IllegalArgumentException("byte array is null!");
    }

    /* renamed from: getShort */
    public short m94356x75232ac6(byte[] bArr, boolean z17) {
        if (bArr != null) {
            if (bArr.length > 2) {
                throw new java.lang.IllegalArgumentException("byte array size > 2 !");
            }
            int i17 = 0;
            if (z17) {
                short s17 = 0;
                while (i17 < bArr.length) {
                    s17 = (short) (((short) (s17 << 8)) | (bArr[i17] & 255));
                    i17++;
                }
                return s17;
            }
            for (int length = bArr.length - 1; length >= 0; length--) {
                i17 = (short) (((short) (i17 << 8)) | (bArr[length] & 255));
            }
            return i17 == true ? (short) 1 : (short) 0;
        }
        throw new java.lang.IllegalArgumentException("byte array is null!");
    }

    /* renamed from: testCPU */
    public boolean m94357xab369fb6() {
        return java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: Shorts2Bytes */
    public void m94343x1c74c9b0(short[] sArr, byte[] bArr) {
        for (int i17 = 0; i17 < sArr.length; i17++) {
            java.lang.System.arraycopy(m94349x743b66b5(sArr[i17]), 0, bArr, i17 * 2, 2);
        }
    }

    /* renamed from: getBytes */
    public byte[] m94346x743b66b5(int i17, boolean z17) {
        byte[] bArr = new byte[4];
        if (z17) {
            for (int i18 = 3; i18 >= 0; i18--) {
                bArr[i18] = (byte) (i17 & 255);
                i17 >>= 8;
            }
        } else {
            java.lang.System.out.println("1");
            for (int i19 = 0; i19 < 4; i19++) {
                bArr[i19] = (byte) (i17 & 255);
                i17 >>= 8;
            }
        }
        return bArr;
    }

    /* renamed from: getBytes */
    public byte[] m94348x743b66b5(long j17, boolean z17) {
        byte[] bArr = new byte[8];
        if (z17) {
            for (int i17 = 7; i17 >= 0; i17--) {
                bArr[i17] = (byte) (j17 & 255);
                j17 >>= 8;
            }
        } else {
            for (int i18 = 0; i18 < 8; i18++) {
                bArr[i18] = (byte) (j17 & 255);
                j17 >>= 8;
            }
        }
        return bArr;
    }

    /* renamed from: getBytes */
    public byte[] m94345x743b66b5(int i17) {
        return m94346x743b66b5(i17, m94357xab369fb6());
    }

    /* renamed from: getInt */
    public int m94351xb58848b9(byte[] bArr) {
        return m94352xb58848b9(bArr, m94357xab369fb6());
    }

    /* renamed from: getLong */
    public long m94353xfb822ef2(byte[] bArr) {
        return m94354xfb822ef2(bArr, m94357xab369fb6());
    }

    /* renamed from: getShort */
    public short m94355x75232ac6(byte[] bArr) {
        return m94356x75232ac6(bArr, m94357xab369fb6());
    }

    /* renamed from: getBytes */
    public byte[] m94349x743b66b5(short s17) {
        return m94350x743b66b5(s17, m94357xab369fb6());
    }

    /* renamed from: getBytes */
    public byte[] m94347x743b66b5(long j17) {
        return m94348x743b66b5(j17, m94357xab369fb6());
    }
}
