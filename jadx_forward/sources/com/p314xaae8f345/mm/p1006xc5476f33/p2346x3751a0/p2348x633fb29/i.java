package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class i {
    public static int I;

    /* renamed from: J, reason: collision with root package name */
    public static int f258148J;
    public static final int K;
    public static final int L;
    public static final java.lang.String[] M;
    public static final int N;
    public java.lang.String A;
    public final int B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h C;
    public android.view.Surface D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g E;
    public int F;
    public int G;
    public final android.util.Size H;

    /* renamed from: a, reason: collision with root package name */
    public int f258149a;

    /* renamed from: b, reason: collision with root package name */
    public int f258150b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f258151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f258152d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f258153e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f258154f;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f258157i;

    /* renamed from: k, reason: collision with root package name */
    public int f258159k;

    /* renamed from: l, reason: collision with root package name */
    public int f258160l;

    /* renamed from: m, reason: collision with root package name */
    public int f258161m;

    /* renamed from: n, reason: collision with root package name */
    public int f258162n;

    /* renamed from: o, reason: collision with root package name */
    public int f258163o;

    /* renamed from: p, reason: collision with root package name */
    public final int f258164p;

    /* renamed from: q, reason: collision with root package name */
    public int f258165q;

    /* renamed from: r, reason: collision with root package name */
    public int f258166r;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.x f258169u;

    /* renamed from: v, reason: collision with root package name */
    public int f258170v;

    /* renamed from: w, reason: collision with root package name */
    public int f258171w;

    /* renamed from: x, reason: collision with root package name */
    public int f258172x;

    /* renamed from: y, reason: collision with root package name */
    public int f258173y;

    /* renamed from: z, reason: collision with root package name */
    public int f258174z;

    /* renamed from: g, reason: collision with root package name */
    public int f258155g = 8;

    /* renamed from: h, reason: collision with root package name */
    public int f258156h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f258158j = 4;

    /* renamed from: s, reason: collision with root package name */
    public long f258167s = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258168t = null;

    static {
        lp0.b.D();
        K = 18;
        L = 19;
        M = new java.lang.String[]{"OMX.qcom.", "OMX.Exynos.", "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc", "c2.xring", "c2.ln"};
        N = 25;
    }

    public i(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        this.f258149a = 0;
        this.f258150b = 0;
        this.f258151c = "h264";
        this.f258152d = 12000;
        this.f258157i = false;
        this.f258164p = 1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f258169u = null;
        this.f258170v = 0;
        this.f258171w = 8;
        this.f258172x = 0;
        this.f258173y = 0;
        this.f258174z = 0;
        this.A = null;
        this.B = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_VOIP_ForceHardEncode_Int, 0);
        this.C = null;
        this.F = 640;
        this.G = 480;
        android.util.Size k17 = vq4.b0.k();
        this.H = k17;
        this.f258157i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_voip_ignore2007, 0) == 1;
        this.f258159k = i17;
        this.f258160l = i18;
        this.f258165q = i17;
        this.f258166r = i18;
        if (k17 != null) {
            this.f258159k = k17.getWidth();
            this.f258160l = k17.getHeight();
            this.f258165q = k17.getWidth();
            this.f258166r = k17.getHeight();
        }
        this.f258151c = str;
        this.f258161m = i19;
        this.f258162n = i27;
        this.f258163o = i27;
        this.f258164p = i28;
        this.f258152d = 5000;
        I = 0;
        this.C = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h(this);
        this.f258153e = null;
        this.f258171w = 8;
        this.f258170v = 0;
        this.f258172x = 0;
        this.f258149a = 0;
        this.f258150b = 0;
        r45.hv3 hv3Var = new r45.hv3();
        hv3Var.f458000d = 1L;
        hv3Var.f458001e = 24;
        hv3Var.f458002f = 1L;
        hv3Var.f458003g = 24;
        hv3Var.f458004h = 0L;
        hv3Var.f458005i = 0;
        linkedList.add(hv3Var);
        linkedList2.add(0);
        this.f258173y = 0;
        this.f258174z = 0;
    }

    public int a(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, boolean z17) {
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var;
        int i28;
        boolean z18 = this.f258157i;
        int i29 = this.f258152d;
        if (this.C.f258082l != 0 || (g1Var = this.f258168t) == null || g1Var.f258065x == null) {
            i27 = 0;
        } else {
            if (i17 != this.f258165q || i18 != this.f258166r) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "update CapW = " + i17 + ", CapH = " + i18);
                this.f258165q = i17;
                this.f258166r = i18;
            }
            i27 = this.f258168t.f258065x.m72862x64783910(i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = this.f258168t.f258065x;
            int i37 = c18912x54425f62.f38610xc59b1f51;
            int i38 = c18912x54425f62.f38609xc59b1f42;
            if (this.B != 0 && vq4.a0.f520798b > 0 && vq4.a0.f520799c > 0) {
                i37 = vq4.a0.f520798b;
                i38 = vq4.a0.f520799c;
            } else if (this.f258159k != i37 || this.f258160l != i38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "surface update enc size:[%d, %d, %dkbps]", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(this.f258162n));
            }
            if (this.f258159k != i37 || this.f258160l != i38 || this.f258153e == null || this.f258156h != this.f258155g) {
                b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "restart encoder! clipWH:" + i17 + "x" + i18 + ", wh:" + this.f258159k + "x" + this.f258160l + ", mCodecTypePrev: " + this.f258156h + ", mCodecType: " + this.f258155g + ", m_br_kbps: " + this.f258162n);
                this.f258159k = i37;
                this.f258160l = i38;
                try {
                    i28 = c();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "mediacodec init error: " + e17.getMessage());
                    j(2003);
                    i28 = -2003;
                }
                if (i28 >= 0) {
                    this.f258156h = this.f258155g;
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "mediacodec init failed, stop HW encoding! ret: " + i28);
                f();
                return i28;
            }
        }
        wo.i1 i1Var = this.f258153e;
        if (i1Var == null) {
            int i39 = this.f258173y;
            this.f258173y = i39 + 1;
            if (i39 <= 5) {
                return i27;
            }
            j(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57);
            return -2006;
        }
        try {
            this.f258173y = 0;
            java.nio.ByteBuffer[] n17 = i1Var.n();
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int g17 = this.f258153e.g(bufferInfo, i29);
            if (g17 == -2) {
                android.media.MediaFormat o17 = this.f258153e.o();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve: encoder output format changed: " + o17);
                if (o17.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)) {
                    int integer = o17.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63);
                    double d17 = integer;
                    if (d17 > this.f258162n * 1000 * 1.5d && d17 > this.f258163o * 1000 * 1.5d && integer > 2000000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "steve: bitrate NOT match!! real:" + integer + ", target:" + this.f258162n + ", m_br_kbps_prev: " + this.f258163o + ", mBIgnore2007: " + z18);
                        if (!z18) {
                            j(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8);
                            return -2007;
                        }
                        j(12007);
                    }
                }
            }
            while (g17 >= 0) {
                java.nio.ByteBuffer byteBuffer2 = n17[g17];
                int i47 = bufferInfo.size;
                byte[] bArr = new byte[i47];
                byteBuffer2.get(bArr);
                int h17 = h(bArr, bufferInfo.flags, i47);
                if (bufferInfo.flags == 2) {
                    if (this.f258170v != 1 && this.f258169u.b(bArr)) {
                        this.f258172x = this.f258169u.f258445a;
                        this.f258171w = 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:" + this.f258171w + ", checkCodeForBSlice:" + this.f258172x);
                        try {
                            return c();
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "mediacodec reinit error: " + e18.getMessage());
                            j(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111);
                            return -2005;
                        }
                    }
                    if (h17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "send stream error! ret: ", java.lang.Integer.valueOf(h17));
                        return h17;
                    }
                    i27 = bufferInfo.flags;
                    this.f258153e.s(g17, false);
                    g17 = this.f258153e.g(bufferInfo, i29);
                } else {
                    if (this.f258170v != 1 && this.f258169u.c(bArr)) {
                        this.f258172x = this.f258169u.f258445a;
                        this.f258171w = 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:" + this.f258171w + ", checkCodeForBSlice:" + this.f258172x);
                        try {
                            return c();
                        } catch (java.lang.Exception e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "mediacodec reinit error: " + e19.getMessage());
                            j(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111);
                            return -2005;
                        }
                    }
                    int i48 = bufferInfo.flags;
                    if (i48 != 0 && i48 != 1) {
                        j(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve:unknown frame error!!! type:" + bufferInfo.flags + ", len:" + bufferInfo.size);
                        return -2009;
                    }
                    if (h17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "send stream error! ret: ", java.lang.Integer.valueOf(h17));
                        return h17;
                    }
                    I++;
                    i27 = bufferInfo.flags;
                    this.f258153e.s(g17, false);
                    g17 = this.f258153e.g(bufferInfo, i29);
                }
            }
            return i27;
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvcEncoder", e27, "DoMediaCodecEnc error:" + e27.toString(), new java.lang.Object[0]);
            j(2004);
            return -2004;
        }
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258168t;
        if (g1Var == null || (c18912x54425f62 = g1Var.f258065x) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h hVar = this.C;
        if (g1Var != null && c18912x54425f62 != null) {
            byte[] bArr = hVar.f258086p;
            if (c18912x54425f62.m72841x430a65b(N, bArr, bArr.length) >= 0) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(hVar.f258086p);
                wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                hVar.f258071a = wrap.getShort();
                hVar.f258072b = wrap.get();
                hVar.f258073c = wrap.get();
                hVar.f258074d = wrap.get();
                hVar.f258075e = wrap.get();
                hVar.f258076f = wrap.get();
                hVar.f258077g = wrap.get();
                hVar.f258078h = wrap.get();
                hVar.f258079i = wrap.get();
                hVar.f258080j = wrap.get();
                hVar.f258081k = wrap.get();
                hVar.f258082l = wrap.get();
                hVar.f258083m = wrap.get();
                hVar.f258084n = wrap.getShort();
                short s17 = wrap.getShort();
                hVar.f258085o = s17;
                int i17 = hVar.f258084n;
                byte b17 = hVar.f258080j;
                if (1 == (b17 & 1)) {
                    int i18 = b17 >> 1;
                    if (8 == i18) {
                        this.f258155g = 8;
                        this.f258151c = "video/avc";
                    } else if (4 == i18) {
                        this.f258155g = 4;
                        this.f258151c = "video/hevc";
                    }
                    if (this.f258155g != this.f258156h) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "use hw encoder, ENCODING: " + this.f258151c + ", mCodecType: " + this.f258155g + ", mCodecTypePrev: " + this.f258156h);
                        hVar.a();
                    }
                    vq4.a0.f520797a.a(false);
                } else {
                    if (this.f258156h != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "use soft encoder, ENCODING: " + this.f258151c + ", mCodecType: " + this.f258155g + ", mCodecTypePrev: " + this.f258156h);
                        hVar.a();
                    }
                    this.f258156h = 0;
                    vq4.a0.f520797a.a(true);
                }
                int i19 = s17;
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.Z1) {
                    i19 = s17;
                    if (i17 >= 1280 || s17 >= 1280) {
                        i17 = (((i17 >> 1) + 8) / 16) * 16;
                        i19 = (((s17 >> 1) + 8) / 16) * 16;
                    }
                }
                int i27 = i19;
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258347a2) {
                    i27 = i19;
                    if (i17 >= 1920 || i19 >= 1920) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvcEncoder", "error qos param: exp: %dx%d, used: %dx%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.G));
                        i17 = this.F;
                        i27 = this.G;
                    }
                }
                this.F = i17;
                this.G = i27;
                android.util.Size size = this.H;
                if (size != null) {
                    this.F = size.getWidth();
                    this.G = size.getHeight();
                }
                if (this.B == 0) {
                    vq4.a0.f520797a.b(this.F, this.G);
                }
            }
        }
        int i28 = hVar.f258071a;
        if (this.f258151c.equalsIgnoreCase("video/avc")) {
            if (!(this.f258170v == 8)) {
                i28 = (int) (i28 * (((java.lang.Math.max(java.lang.Math.min(this.f258168t.f258065x.S0, 30), 0) * 1.0d) / 100.0d) + 1.0d));
            }
        }
        if (this.f258162n != i28) {
            try {
                if (this.f258153e != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("video-bitrate", i28 * 1000);
                    this.f258153e.v(bundle);
                    gq4.v.wi().f447518s = i28;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "steve: setRates failed:" + e17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve[QoS]: Update BR! frameID: " + I + ", prev_br: " + this.f258162n + ", new_br:" + i28 + ", tuneRatio:" + this.f258168t.f258065x.S0);
            this.f258162n = i28;
        }
        if ((1 == hVar.f258083m && I > 0) || I - f258148J >= (hVar.f258073c & 255)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "anlin-test: Force I Frame! frameID: " + I + ", mPrevMakeIMs: " + this.f258167s + ", lMakeIMs: " + currentTimeMillis + ", mPrevIFrameID: " + f258148J + ", cIPeriod: " + (hVar.f258073c & 255) + ", stQoS.cIReqFlag: " + ((int) hVar.f258083m));
            if (currentTimeMillis - this.f258167s >= 500) {
                d();
                this.f258167s = currentTimeMillis;
                f258148J = I;
            }
        }
        byte b18 = hVar.f258072b;
        if (b18 != this.f258161m) {
            this.f258161m = b18;
        }
        gq4.v.wi().f447519t = this.f258161m;
        this.f258168t.f258067z.E();
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c() {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i.c():int");
    }

    public void d() {
        if (this.f258153e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "make I failed, mediaCodec is null!!!!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve: Sync frame request soon! frameID： " + I);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("request-sync", 0);
        try {
            this.f258153e.v(bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "make I failed, just ignored, exception: " + e17);
        }
    }

    public final void e() {
        try {
            vq4.a0 a0Var = vq4.a0.f520797a;
            vq4.a0.f520801e = false;
            if (this.f258153e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "licaguo, now we call StopEncoder");
                this.f258153e.w();
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g gVar = this.E;
                if (gVar != null) {
                    ((dr4.t1) gVar).a(this.D);
                }
                this.f258153e.y();
                this.f258153e.q();
            }
            this.f258153e = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvcEncoder", e17, "StopEncoder error:" + e17.toString(), new java.lang.Object[0]);
        }
    }

    public void f() {
        try {
            e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", " error:" + e17.toString());
        }
    }

    public final boolean g(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        if (i17 > this.f258171w) {
            return false;
        }
        java.lang.String name = mediaCodecInfo.getName();
        boolean z17 = false;
        for (java.lang.String str2 : M) {
            if (name.startsWith(str2)) {
                try {
                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                        if (codecProfileLevel.profile == i17) {
                            z17 = true;
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("steve : [");
                        sb6.append(name);
                        sb6.append("] supported profiles:");
                        sb6.append(codecProfileLevel.profile);
                        sb6.append(", maxAllowedProfile: ");
                        sb6.append(this.f258171w);
                        sb6.append(", MIME:");
                        try {
                            sb6.append(str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", sb6.toString());
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        return z17;
    }

    public int h(byte[] bArr, int i17, int i18) {
        if (bArr == null || this.f258168t.f258065x == null) {
            return 0;
        }
        int m72860x2bc4e674 = this.f258168t.f258065x.m72860x2bc4e674(bArr, i18, this.f258159k, i17, this.f258151c.equalsIgnoreCase("video/hevc") ? L : K);
        if (m72860x2bc4e674 >= 0) {
            this.f258174z = 0;
            return m72860x2bc4e674;
        }
        d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "licaguo: type = " + i17 + ", length = " + i18 + ", ret = " + m72860x2bc4e674);
        int i19 = this.f258174z;
        this.f258174z = i19 + 1;
        if (i19 <= 5) {
            return 0;
        }
        j(2008);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "steve: hw send error for 5 times!! send ret = -2008");
        return -2008;
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var) {
        this.f258168t = g1Var;
    }

    public final void j(int i17) {
        if (this.f258151c.equalsIgnoreCase("video/hevc")) {
            this.f258150b = i17;
        } else {
            this.f258149a = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "ENCODING: " + this.f258151c + ", encoder error, ErrCode: ", java.lang.Integer.valueOf(i17));
    }

    public final boolean k(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (!fp.h.c(23)) {
            return false;
        }
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                return false;
            }
            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.level = 0;
            codecProfileLevel.profile = 0;
            int length = codecProfileLevelArr.length;
            int i18 = 0;
            while (true) {
                boolean z17 = true;
                if (i18 >= length) {
                    break;
                }
                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i18];
                int i19 = codecProfileLevel2.profile;
                int i27 = codecProfileLevel2.level;
                if (!(i19 == 1 || i19 == 2 || i19 == 8)) {
                    z17 = false;
                } else if (i19 >= codecProfileLevel.profile && i27 >= codecProfileLevel.level && i19 <= i17) {
                    codecProfileLevel.profile = i19;
                    codecProfileLevel.level = i27;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "steve : profile: " + i19 + ", level: " + i27 + ", maxProfile: " + i17 + ", isRecognized:" + z17);
                i18++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvcEncoder", "best profile: " + codecProfileLevel.profile + ", best level: " + codecProfileLevel.level);
            int i28 = codecProfileLevel.profile;
            if (i28 <= 0 || codecProfileLevel.level < 256) {
                return false;
            }
            this.f258154f.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i28);
            this.f258154f.setInteger(ya.b.f77487x44fa364, 256);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvcEncoder", "trySetProfile error: " + e17.getMessage());
            return false;
        }
    }
}
