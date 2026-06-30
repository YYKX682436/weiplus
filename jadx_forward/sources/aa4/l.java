package aa4;

/* loaded from: classes4.dex */
public final class l implements fe0.e4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd f84197d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f84198e;

    /* renamed from: f, reason: collision with root package name */
    public float f84199f;

    /* renamed from: g, reason: collision with root package name */
    public v94.i f84200g;

    /* renamed from: h, reason: collision with root package name */
    public int f84201h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84202i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f84203m;

    /* renamed from: n, reason: collision with root package name */
    public long f84204n;

    /* renamed from: o, reason: collision with root package name */
    public int f84205o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f84206p;

    public l(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f84197d = host;
        this.f84201h = 1;
        this.f84202i = pc4.d.f434943a.y();
        this.f84203m = "";
    }

    public static /* synthetic */ void b(aa4.l lVar, android.graphics.Bitmap bitmap, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blurBitmap$default", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if ((i27 & 8) != 0) {
            i19 = 0;
        }
        int i28 = i19;
        if ((i27 & 16) != 0) {
            z17 = true;
        }
        lVar.a(bitmap, i17, i18, i28, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurBitmap$default", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final void a(android.graphics.Bitmap bitmap, int i17, int i18, int i19, boolean z17) {
        int i27;
        int i28 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("xlabeffect");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("pag");
        um5.d dVar = new um5.d();
        um5.p pVar = dVar.f510677e;
        pVar.f510742r.f510746b = 1;
        dVar.b(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clamSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$Companion");
        if (i28 > 1280) {
            i27 = a06.d.a(((1280 * 1.0d) / i28) * i18);
            i28 = 1280;
        } else {
            i27 = i18;
        }
        android.util.Size size = new android.util.Size(i28, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clamSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$Companion");
        int width = size.getWidth();
        int height = size.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        uq5.m d17 = pVar.f510726b.d();
        if (this.f84202i) {
            long j17 = d17.f511802c;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                float f17 = this.f84199f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                float f18 = ((-i19) / 10000.0f) * f17;
                if (j17 != 0) {
                    com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83850x44998370(j17, f18);
                }
            } else if (j17 != 0 && d17.f511792d != 100.0f) {
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83845xa34653c4(j17, 100.0f);
                d17.f511792d = 100.0f;
            }
        }
        dVar.a(new aa4.g(this, bitmap));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u1.f274536a.f274566a;
        if (width > i17) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, i17, bitmap.getHeight(), true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "getCenterCropBitmap(...)");
        } else if (height > i17) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, bitmap.getWidth(), i17, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "getCenterCropBitmap(...)");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return bitmap;
    }

    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHost", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHost", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return this.f84197d;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCdnFileToTargetFile", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        java.lang.String K = ca4.z0.K(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K, "getSnsBigNameWithoutEnc(...)");
        java.lang.String Di = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Di, "getAccSnsPath(...)");
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(Di, str) + K;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverFadeImageView", "move :" + str3 + " to " + str2 + " length:" + com.p314xaae8f345.mm.vfs.w6.k(str3) + " ret:" + com.p314xaae8f345.mm.vfs.w6.x(str3, str2, true));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().J0(this.f84203m, this.f84204n, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCdnFileToTargetFile", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final void f(java.lang.String str, int i17, boolean z17) {
        android.graphics.Bitmap L;
        java.lang.Number valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        android.graphics.Bitmap o17 = ca4.z0.o(str);
        if (ca4.z0.f(o17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverFadeImageView", "return bitmap for decodeFileToBitmap");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o17);
            L = c(o17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        } else {
            L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, 1280, 1280);
            if (L != null) {
                L = c(L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverFadeImageView", "leextest decodeImg fail");
            }
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
            if (a17 != 0) {
                L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(L, a17, 1.0f, 1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        }
        if (L != null) {
            float height = L.getHeight();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            this.f84199f = height;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("centerCropImage", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c0085xa15044fd = this.f84197d;
                int B = i65.a.B(c0085xa15044fd.getContext());
                if (pc4.d.f434943a.y()) {
                    float f17 = B;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                    int i18 = this.f84201h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                    valueOf = java.lang.Float.valueOf(f17 * (i18 == 1 ? 0.9f : 0.45f));
                } else {
                    valueOf = java.lang.Integer.valueOf(i65.a.h(c0085xa15044fd.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aa_));
                }
                float floatValue = valueOf.floatValue() / B;
                jz5.l lVar = floatValue > ((float) L.getHeight()) / ((float) L.getWidth()) ? new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(L, (int) (L.getHeight() / floatValue), L.getHeight(), false), java.lang.Boolean.TRUE) : new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(L, L.getWidth(), (int) (L.getWidth() * floatValue), false), java.lang.Boolean.FALSE);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("centerCropImage", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lVar.f384366d;
                pm0.v.X(new aa4.j(this, L, bitmap));
                if (((java.lang.Boolean) lVar.f384367e).booleanValue()) {
                    b(this, bitmap, bitmap.getWidth(), (int) (bitmap.getWidth() * 1.7777778f), i17, false, 16, null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            int i19 = this.f84201h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (i19 != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                int i27 = this.f84201h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                if (i27 != 2) {
                    a(L, L.getWidth(), (int) (L.getWidth() * 1.7777778f), 0, false);
                }
            }
            if ((L.getHeight() * 1.0f) / L.getWidth() < 1.7777778f) {
                b(this, L, L.getWidth(), (int) (L.getWidth() * 1.7777778f), i17, false, 16, null);
            } else {
                pm0.v.X(new aa4.k(this, L));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if (str != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f84203m + '-' + this.f84204n)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverFadeImageView", "bg image download finish:".concat(str));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(this);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2.f247453g.a(this.f84203m);
                e(str, a17);
                f(a17, this.f84205o, this.f84206p);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }
}
