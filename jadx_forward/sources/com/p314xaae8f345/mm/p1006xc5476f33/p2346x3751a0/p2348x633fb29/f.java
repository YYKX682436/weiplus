package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class f extends java.lang.Thread {
    public static final int A;
    public static final int B;

    /* renamed from: x, reason: collision with root package name */
    public static byte[] f258009x;

    /* renamed from: y, reason: collision with root package name */
    public static byte[] f258010y;

    /* renamed from: z, reason: collision with root package name */
    public static byte[] f258011z;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f258013e;

    /* renamed from: w, reason: collision with root package name */
    public boolean f258028w;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f258014f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f258016h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f258017i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f258018m = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f258021p = true;

    /* renamed from: q, reason: collision with root package name */
    public int f258022q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f258023r = false;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258024s = null;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f258025t = {0, 0, 0, 1};

    /* renamed from: n, reason: collision with root package name */
    public boolean f258019n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f258020o = true;

    /* renamed from: d, reason: collision with root package name */
    public wo.i1 f258012d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f258015g = false;

    /* renamed from: u, reason: collision with root package name */
    public int f258026u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f258027v = 0;

    static {
        lp0.b.D();
        f258009x = null;
        f258010y = null;
        f258011z = null;
        A = 640;
        B = 480;
    }

    public f(android.view.Surface surface) {
        this.f258028w = false;
        this.f258028w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_voip_setpriority, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcDecoder", "mSetPriorityFlag: " + this.f258028w);
        if (surface != null) {
            this.f258013e = surface;
        }
    }

    public int a() {
        this.f258022q++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcDecoder", "[HW]:DecFrmError: I Req mIReqFlag = " + this.f258021p + ", mIsHWDecEnable = " + this.f258019n + ", mHWErrorDecFrmCount = " + this.f258022q);
        if (!this.f258019n || this.f258022q > 64) {
            if (this.f258015g) {
                this.f258016h = true;
                this.f258024s.b(4, true, false);
            } else {
                this.f258017i = true;
                this.f258024s.b(8, true, false);
            }
            if (this.f258016h && this.f258017i) {
                this.f258020o = false;
            }
            if (this.f258015g) {
                this.f258027v |= 64;
            } else {
                this.f258026u |= 64;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcDecoder", "[HW]: ErrFrm > threshold, end HWDec!!");
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.put((byte) 1);
        this.f258024s.f258065x.m72841x430a65b(28, allocate.array(), 1);
        this.f258021p = true;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0351, code lost:
    
        if (r2 != 39) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0365, code lost:
    
        r2 = 'P';
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0362, code lost:
    
        if (r3 != 6) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(byte[] r22, int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.f.b(byte[], int, boolean, boolean):int");
    }

    public void c() {
        if (this.f258012d != null) {
            this.f258018m = false;
        }
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
        return d(bArr).indexOf(d(new byte[]{0, 0, 3}), i17) != -1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        wo.i1 i1Var;
        while (!java.lang.Thread.interrupted() && this.f258019n) {
            if (this.f258012d != null && this.f258018m && this.f258020o) {
                try {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int g17 = this.f258012d.g(bufferInfo, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    if (g17 != -3) {
                        if (g17 == -2) {
                            android.media.MediaFormat o17 = this.f258012d.o();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcDecoder", "DECODER_THREAD:: New format : " + o17);
                            int integer = o17.getInteger("width");
                            int integer2 = o17.getInteger("height");
                            vq4.b0 b0Var = vq4.b0.f520803a;
                            if (o17.containsKey("crop-left") && o17.containsKey("crop-right")) {
                                integer = (o17.getInteger("crop-right") + 1) - o17.getInteger("crop-left");
                            }
                            if (o17.containsKey("crop-top") && o17.containsKey("crop-bottom")) {
                                integer2 = (o17.getInteger("crop-bottom") + 1) - o17.getInteger("crop-top");
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258024s;
                            if (g1Var != null) {
                                g1Var.U.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.p0(g1Var, integer2, integer));
                            }
                        } else if (g17 != -1) {
                            if (bufferInfo.size > 0) {
                                java.lang.System.currentTimeMillis();
                                this.f258012d.s(g17, true);
                                java.lang.System.currentTimeMillis();
                            } else {
                                this.f258012d.s(g17, false);
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    if (this.f258015g) {
                        this.f258027v |= 128;
                    } else {
                        this.f258026u |= 128;
                    }
                    a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcDecoder", " dequeueOutputBuffer/releaseOutputBuffer error:" + e17.toString());
                }
            } else {
                try {
                    java.lang.Thread.sleep(20L);
                } catch (java.lang.InterruptedException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcDecoder", " error:" + e18.toString());
                }
            }
        }
        if (this.f258019n || (i1Var = this.f258012d) == null) {
            return;
        }
        try {
            i1Var.y();
            this.f258012d.q();
            this.f258012d = null;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcDecoder", " decoder stop  error:" + e19.toString());
        }
    }
}
