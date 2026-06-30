package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.PcmConvertionUtil */
/* loaded from: classes16.dex */
public class C25459x1a0f9271 {
    /* renamed from: checkArrayLength */
    private static void m94393xcece8077(int[] iArr, int i17) {
        if (iArr != null && iArr.length != 0) {
            if (i17 <= iArr.length) {
                return;
            }
            throw new java.lang.IllegalArgumentException("the length param can not larger than int Array length. param:" + i17 + ", int array length:" + iArr.length);
        }
        throw new java.lang.IllegalArgumentException("int Array must not be null or zero length");
    }

    /* renamed from: checkBufferLength */
    private static void m94395xd4b6786e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e) {
        if (c25321xe86c292e == null || c25321xe86c292e.f45535x93fb68 == null || c25321xe86c292e.f45534x719ec861 <= 0) {
            throw new java.lang.IllegalArgumentException("bufferInfo must not be null or zero length");
        }
    }

    /* renamed from: convertBitDepth24To16 */
    private static void m94396x85283d0b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, int i17) {
        m94395xd4b6786e(c25321xe86c292e);
        if (c25321xe86c292e2 == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (i17 != 3) {
            throw new java.lang.IllegalArgumentException("origin bit depth must be 3");
        }
        int i18 = c25321xe86c292e.f45534x719ec861;
        c25321xe86c292e2.m93672xa33fd238(i18);
        int i19 = 0;
        for (int i27 = 0; i27 < i18; i27++) {
            if (i27 % 3 != 0) {
                c25321xe86c292e2.f45536x5448625c[i19] = c25321xe86c292e.f45535x93fb68[i27];
                i19++;
            }
        }
        c25321xe86c292e2.m93669xd483512b(c25321xe86c292e2.f45536x5448625c, i19);
        c25321xe86c292e2.f45534x719ec861 = i19;
    }

    /* renamed from: convertBitDepth32To16 */
    private static void m94397x86c0e6a8(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, int i17) {
        m94395xd4b6786e(c25321xe86c292e);
        if (c25321xe86c292e2 == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (i17 != 4) {
            throw new java.lang.IllegalArgumentException("origin bit depth must be 4");
        }
        int i18 = c25321xe86c292e.f45534x719ec861;
        c25321xe86c292e2.m93672xa33fd238(i18);
        int i19 = 0;
        for (int i27 = 0; i27 < i18; i27 += 4) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94384xf4099010(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94372xc596146e(c25321xe86c292e.f45535x93fb68, i27), c25321xe86c292e2.f45536x5448625c, i19);
            i19 += 2;
        }
        c25321xe86c292e2.m93669xd483512b(c25321xe86c292e2.f45536x5448625c, i19);
        c25321xe86c292e2.f45534x719ec861 = i19;
    }

    /* renamed from: convertBitDepthTo16 */
    public static void m94398x8f850609(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, int i17) {
        if (i17 == 2) {
            m94395xd4b6786e(c25321xe86c292e);
            c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
        } else if (i17 == 3) {
            m94396x85283d0b(c25321xe86c292e, c25321xe86c292e2, i17);
        } else if (i17 == 4) {
            m94397x86c0e6a8(c25321xe86c292e, c25321xe86c292e2, i17);
        } else {
            throw new java.lang.IllegalArgumentException("not support originBitDepth, originBitDepth=" + i17);
        }
    }

    /* renamed from: convertByteBufferToFloatBuffer */
    public static void m94399x58bba86(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a, int i17) {
        m94395xd4b6786e(c25321xe86c292e);
        if (c25328x90bcc06a == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("bit depth must not be zero");
        }
        c25328x90bcc06a.m93791xa70ee360(c25321xe86c292e.f45534x719ec861 / i17);
        int i18 = c25321xe86c292e.f45534x719ec861;
        c25328x90bcc06a.f45599x719ec861 = i18 / i17;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94366x9d93df09(c25321xe86c292e.f45535x93fb68, i18, i17, c25328x90bcc06a.f45601x9a84e548);
        c25328x90bcc06a.m93789xbc193699(c25328x90bcc06a.f45601x9a84e548, c25328x90bcc06a.f45599x719ec861);
    }

    /* renamed from: interpolateIn16Bit */
    private static void m94400x95ea3e62(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, long j17, long j18) {
        int i17 = c25321xe86c292e.f45534x719ec861 / 2;
        float f17 = i17;
        int round = java.lang.Math.round(((1.0f * f17) / ((float) j17)) * ((float) j18));
        short[] sArr = new short[i17];
        short[] sArr2 = new short[round];
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94363x3617e2cf(c25321xe86c292e.f45535x93fb68, c25321xe86c292e.f45534x719ec861, sArr);
        m94404xfd99789c(sArr, i17, sArr2, round, round / f17);
        int i18 = round * 2;
        byte[] bArr = new byte[i18];
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94389xadb0bdcf(sArr2, round, bArr);
        c25321xe86c292e2.m93669xd483512b(bArr, i18);
    }

    /* renamed from: interpolateIn24Bit */
    private static void m94401x95f76d25(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, long j17, long j18) {
        int i17 = c25321xe86c292e.f45534x719ec861 / 3;
        float f17 = i17;
        int round = java.lang.Math.round(((1.0f * f17) / ((float) j17)) * ((float) j18));
        int[] iArr = new int[i17];
        int[] iArr2 = new int[round];
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94364xb50992bf(c25321xe86c292e.f45535x93fb68, c25321xe86c292e.f45534x719ec861, iArr);
        m94403xfd99789c(iArr, i17, iArr2, round, round / f17);
        int i18 = round * 3;
        byte[] bArr = new byte[i18];
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94385x14ae8eff(iArr2, round, bArr);
        c25321xe86c292e2.m93669xd483512b(bArr, i18);
    }

    /* renamed from: interpolateIn32Bit */
    private static void m94402x96049be8(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, long j17, long j18) {
        int i17 = c25321xe86c292e.f45534x719ec861 / 4;
        float f17 = i17;
        int round = java.lang.Math.round(((1.0f * f17) / ((float) j17)) * ((float) j18));
        int[] iArr = new int[i17];
        int[] iArr2 = new int[round];
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94365x4b2969c2(c25321xe86c292e.f45535x93fb68, c25321xe86c292e.f45534x719ec861, iArr);
        m94403xfd99789c(iArr, i17, iArr2, round, round / f17);
        int i18 = round * 4;
        byte[] bArr = new byte[i18];
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25456x89cf4a2.m94386x14bbbdc2(iArr2, round, bArr);
        c25321xe86c292e2.m93669xd483512b(bArr, i18);
    }

    /* renamed from: linearInterpolate */
    private static void m94403xfd99789c(int[] iArr, int i17, int[] iArr2, int i18, float f17) {
        m94393xcece8077(iArr, i17);
        m94393xcece8077(iArr2, i18);
        for (int i19 = 0; i19 < i18; i19++) {
            float f18 = i19 / f17;
            int i27 = (int) f18;
            int i28 = i27 + 1;
            if (i28 >= i17) {
                i28 = i17 - 1;
            }
            int i29 = iArr[i28];
            iArr2[i19] = (int) (((i29 - r4) * (f18 - i27)) + iArr[i27]);
        }
    }

    /* renamed from: reSample */
    public static void m94405xb447bdbd(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, long j17, long j18, int i17) {
        m94395xd4b6786e(c25321xe86c292e);
        if (c25321xe86c292e2 == null) {
            throw new java.lang.IllegalArgumentException("BufferInfo dest must not be null");
        }
        if (j17 == j18 || j18 <= 0 || j17 <= 0) {
            c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
            return;
        }
        if (i17 == 2) {
            m94400x95ea3e62(c25321xe86c292e, c25321xe86c292e2, j17, j18);
            return;
        }
        if (i17 == 3) {
            m94401x95f76d25(c25321xe86c292e, c25321xe86c292e2, j17, j18);
        } else if (i17 != 4) {
            c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
        } else {
            m94402x96049be8(c25321xe86c292e, c25321xe86c292e2, j17, j18);
        }
    }

    /* renamed from: checkArrayLength */
    private static void m94394xcece8077(short[] sArr, int i17) {
        if (sArr != null && sArr.length != 0) {
            if (i17 <= sArr.length) {
                return;
            }
            throw new java.lang.IllegalArgumentException("the length param can not larger than short Array length. param:" + i17 + ", short array length:" + sArr.length);
        }
        throw new java.lang.IllegalArgumentException("short Array must not be null or zero length");
    }

    /* renamed from: linearInterpolate */
    private static void m94404xfd99789c(short[] sArr, int i17, short[] sArr2, int i18, float f17) {
        m94394xcece8077(sArr, i17);
        m94394xcece8077(sArr2, i18);
        for (int i19 = 0; i19 < i18; i19++) {
            int i27 = (int) (i19 / f17);
            int i28 = i27 + 1;
            if (i28 >= i17) {
                i28 = i17 - 1;
            }
            short s17 = sArr[i28];
            short s18 = sArr[i27];
            sArr2[i19] = (short) (((s17 - s18) * (r1 - i27)) + s18);
        }
    }
}
