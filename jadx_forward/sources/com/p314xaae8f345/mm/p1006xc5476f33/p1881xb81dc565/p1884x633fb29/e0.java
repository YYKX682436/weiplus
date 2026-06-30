package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class e0 extends java.lang.Thread {

    /* renamed from: v, reason: collision with root package name */
    public static byte[] f231447v;

    /* renamed from: w, reason: collision with root package name */
    public static byte[] f231448w;

    /* renamed from: x, reason: collision with root package name */
    public static byte[] f231449x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f231450y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f231451z;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f231453e;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.d0 f231466u;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f231454f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f231456h = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231459n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f231460o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f231461p = {0, 0, 0, 1};

    /* renamed from: q, reason: collision with root package name */
    public int f231462q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f231463r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f231464s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f231465t = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f231457i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f231458m = true;

    /* renamed from: d, reason: collision with root package name */
    public wo.i1 f231452d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f231455g = false;

    static {
        lp0.b.D();
        f231447v = null;
        f231448w = null;
        f231449x = null;
        f231450y = 640;
        f231451z = 480;
    }

    public e0(android.view.Surface surface) {
        if (surface != null) {
            this.f231453e = surface;
        }
    }

    public int a() {
        this.f231460o++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MeidaCodec[HWDec]", "[HW]:DecFrmError: I Req mIReqFlag = " + this.f231459n + ", mIsHWDecEnable = " + this.f231457i + ", mHWErrorDecFrmCount = " + this.f231460o);
        if (this.f231457i && this.f231460o <= 10) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.put((byte) 1);
            this.f231459n = true;
            return 1;
        }
        int i17 = this.f231455g ? 16 : 8;
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(6);
        allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate2.putShort((short) 0);
        allocate2.putShort((short) i17);
        allocate2.putShort((short) 0);
        this.f231457i = false;
        this.f231458m = false;
        this.f231460o = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MeidaCodec[HWDec]", "[HW]: ErrFrm > threshold, end HWDec!!");
        return 0;
    }

    public final long b(byte[] bArr) {
        long c17 = c(bArr);
        long j17 = (1 + c17) >> 1;
        return c17 % 2 == 0 ? -j17 : j17;
    }

    public final long c(byte[] bArr) {
        int i17;
        long j17 = 0;
        long j18 = 0;
        while (true) {
            i17 = this.f231463r;
            if (i17 >= (this.f231462q << 3) || (bArr[i17 >> 3] & (128 >> (i17 & 7))) != 0) {
                break;
            }
            j18++;
            this.f231463r = i17 + 1;
        }
        this.f231463r = i17 + 1;
        for (int i18 = 0; i18 < j18; i18++) {
            j17 <<= 1;
            int i19 = this.f231463r;
            if ((bArr[i19 >> 3] & (128 >> (i19 & 7))) != 0) {
                j17++;
            }
            this.f231463r = i19 + 1;
        }
        return ((1 << ((int) j18)) - 1) + j17;
    }

    public java.lang.String d(byte[] bArr) {
        java.lang.String str = "";
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            str = str + hexString;
        }
        return str;
    }

    public boolean e(byte[] bArr, int i17) {
        this.f231463r = 0;
        f(1L, bArr);
        f(2L, bArr);
        if (f(5L, bArr) != 7) {
            return false;
        }
        long f17 = f(8L, bArr);
        f(1L, bArr);
        f(1L, bArr);
        f(1L, bArr);
        f(1L, bArr);
        f(4L, bArr);
        f(8L, bArr);
        c(bArr);
        if (f17 == 100 || f17 == 110 || f17 == 122 || f17 == 144) {
            if (c(bArr) == 3) {
                f(1L, bArr);
            }
            c(bArr);
            c(bArr);
            f(1L, bArr);
            long[] jArr = new long[8];
            if (f(1L, bArr) != 0) {
                for (int i18 = 0; i18 < 8; i18++) {
                    jArr[i18] = f(1L, bArr);
                }
            }
        }
        c(bArr);
        long c17 = c(bArr);
        if (c17 == 0) {
            c(bArr);
        } else if (c17 == 1) {
            f(1L, bArr);
            b(bArr);
            b(bArr);
            int c18 = (int) c(bArr);
            long[] jArr2 = new long[c18];
            for (int i19 = 0; i19 < c18; i19++) {
                jArr2[i19] = b(bArr);
            }
        }
        c(bArr);
        f(1L, bArr);
        int c19 = ((int) (c(bArr) + 1)) * 16;
        int c27 = ((int) (c(bArr) + 1)) * 16;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MeidaCodec[HWDec]", "newWidth[%d], newHeight[%d]", java.lang.Integer.valueOf(c19), java.lang.Integer.valueOf(c27));
        if (c19 == this.f231464s && c27 == this.f231465t) {
            return true;
        }
        this.f231464s = c19;
        this.f231465t = c27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.d0 d0Var = this.f231466u;
        if (d0Var == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.m3) d0Var).f231579a;
        b3Var.f231427g = c19;
        b3Var.f231428h = c27;
        return true;
    }

    public final long f(long j17, byte[] bArr) {
        long j18 = 0;
        int i17 = 0;
        while (true) {
            boolean z17 = ((long) i17) < j17;
            int i18 = this.f231463r;
            if (!z17 || !(i18 < (this.f231462q << 3))) {
                return j18;
            }
            j18 <<= 1;
            if ((bArr[i18 >> 3] & (128 >> (i18 & 7))) != 0) {
                j18++;
            }
            this.f231463r = i18 + 1;
            i17++;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        wo.i1 i1Var;
        while (!java.lang.Thread.interrupted() && this.f231457i) {
            if (this.f231452d != null && this.f231456h && this.f231458m) {
                try {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int g17 = this.f231452d.g(bufferInfo, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (g17 != -3) {
                        if (g17 == -2) {
                            android.media.MediaFormat o17 = this.f231452d.o();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MeidaCodec[HWDec]", "DECODER_THREAD:: New format : " + o17);
                            o17.getInteger("width");
                            o17.getInteger("height");
                        } else if (g17 != -1) {
                            if (bufferInfo.size > 0) {
                                java.lang.System.currentTimeMillis();
                                this.f231452d.s(g17, true);
                                java.lang.System.currentTimeMillis();
                            } else {
                                this.f231452d.s(g17, false);
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    this.f231457i = false;
                    a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MeidaCodec[HWDec]", " dequeueOutputBuffer/releaseOutputBuffer error:" + e17.toString());
                }
            } else {
                try {
                    java.lang.Thread.sleep(20L);
                } catch (java.lang.InterruptedException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MeidaCodec[HWDec]", " error:" + e18.toString());
                }
            }
        }
        if (this.f231457i || (i1Var = this.f231452d) == null) {
            return;
        }
        try {
            i1Var.y();
            this.f231452d.q();
            this.f231452d = null;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MeidaCodec[HWDec]", " decoder stop  error:" + e19.toString());
        }
    }
}
