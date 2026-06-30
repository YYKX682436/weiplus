package aa4;

/* loaded from: classes4.dex */
public final class l implements fe0.e4, com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.AppCompatImageView f2664d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f2665e;

    /* renamed from: f, reason: collision with root package name */
    public float f2666f;

    /* renamed from: g, reason: collision with root package name */
    public v94.i f2667g;

    /* renamed from: h, reason: collision with root package name */
    public int f2668h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2669i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f2670m;

    /* renamed from: n, reason: collision with root package name */
    public long f2671n;

    /* renamed from: o, reason: collision with root package name */
    public int f2672o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2673p;

    public l(androidx.appcompat.widget.AppCompatImageView host) {
        kotlin.jvm.internal.o.g(host, "host");
        this.f2664d = host;
        this.f2668h = 1;
        this.f2669i = pc4.d.f353410a.y();
        this.f2670m = "";
    }

    public static /* synthetic */ void b(aa4.l lVar, android.graphics.Bitmap bitmap, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blurBitmap$default", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if ((i27 & 8) != 0) {
            i19 = 0;
        }
        int i28 = i19;
        if ((i27 & 16) != 0) {
            z17 = true;
        }
        lVar.a(bitmap, i17, i18, i28, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurBitmap$default", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final void a(android.graphics.Bitmap bitmap, int i17, int i18, int i19, boolean z17) {
        int i27;
        int i28 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("xlabeffect");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("pag");
        um5.d dVar = new um5.d();
        um5.p pVar = dVar.f429144e;
        pVar.f429209r.f429213b = 1;
        dVar.b(bitmap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clamSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$Companion");
        if (i28 > 1280) {
            i27 = a06.d.a(((1280 * 1.0d) / i28) * i18);
            i28 = 1280;
        } else {
            i27 = i18;
        }
        android.util.Size size = new android.util.Size(i28, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clamSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate$Companion");
        int width = size.getWidth();
        int height = size.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        uq5.m d17 = pVar.f429193b.d();
        if (this.f2669i) {
            long j17 = d17.f430269c;
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                float f17 = this.f2666f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                float f18 = ((-i19) / 10000.0f) * f17;
                if (j17 != 0) {
                    com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.nSetGradientBlurEffectContentOffset(j17, f18);
                }
            } else if (j17 != 0 && d17.f430259d != 100.0f) {
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.nSetGradientBlurContentOffsetPercent(j17, 100.0f);
                d17.f430259d = 100.0f;
            }
        }
        dVar.a(new aa4.g(this, bitmap));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z17 = com.tencent.mm.sdk.platformtools.l1.f192817a;
        int i17 = com.tencent.mm.sdk.platformtools.u1.f193003a.f193033a;
        if (width > i17) {
            bitmap = com.tencent.mm.sdk.platformtools.x.k0(bitmap, i17, bitmap.getHeight(), true);
            kotlin.jvm.internal.o.f(bitmap, "getCenterCropBitmap(...)");
        } else if (height > i17) {
            bitmap = com.tencent.mm.sdk.platformtools.x.k0(bitmap, bitmap.getWidth(), i17, true);
            kotlin.jvm.internal.o.f(bitmap, "getCenterCropBitmap(...)");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatBitmap", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return bitmap;
    }

    public final androidx.appcompat.widget.AppCompatImageView d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHost", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHost", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return this.f2664d;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCdnFileToTargetFile", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        java.lang.String K = ca4.z0.K(str);
        kotlin.jvm.internal.o.f(K, "getSnsBigNameWithoutEnc(...)");
        java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
        kotlin.jvm.internal.o.f(Di, "getAccSnsPath(...)");
        java.lang.String str3 = com.tencent.mm.plugin.sns.model.f6.d(Di, str) + K;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverFadeImageView", "move :" + str3 + " to " + str2 + " length:" + com.tencent.mm.vfs.w6.k(str3) + " ret:" + com.tencent.mm.vfs.w6.x(str3, str2, true));
        com.tencent.mm.plugin.sns.model.l4.Bj().J0(this.f2670m, this.f2671n, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCdnFileToTargetFile", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final void f(java.lang.String str, int i17, boolean z17) {
        android.graphics.Bitmap L;
        java.lang.Number valueOf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        android.graphics.Bitmap o17 = ca4.z0.o(str);
        if (ca4.z0.f(o17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverFadeImageView", "return bitmap for decodeFileToBitmap");
            kotlin.jvm.internal.o.d(o17);
            L = c(o17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        } else {
            L = com.tencent.mm.sdk.platformtools.x.L(str, 1280, 1280);
            if (L != null) {
                L = c(L);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverFadeImageView", "leextest decodeImg fail");
            }
            int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
            if (a17 != 0) {
                L = com.tencent.mm.sdk.platformtools.x.z0(L, a17, 1.0f, 1.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeImg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        }
        if (L != null) {
            float height = L.getHeight();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            this.f2666f = height;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("centerCropImage", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.f2664d;
                int B = i65.a.B(appCompatImageView.getContext());
                if (pc4.d.f353410a.y()) {
                    float f17 = B;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                    int i18 = this.f2668h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                    valueOf = java.lang.Float.valueOf(f17 * (i18 == 1 ? 0.9f : 0.45f));
                } else {
                    valueOf = java.lang.Integer.valueOf(i65.a.h(appCompatImageView.getContext(), com.tencent.mm.R.dimen.aa_));
                }
                float floatValue = valueOf.floatValue() / B;
                jz5.l lVar = floatValue > ((float) L.getHeight()) / ((float) L.getWidth()) ? new jz5.l(com.tencent.mm.sdk.platformtools.x.k0(L, (int) (L.getHeight() / floatValue), L.getHeight(), false), java.lang.Boolean.TRUE) : new jz5.l(com.tencent.mm.sdk.platformtools.x.k0(L, L.getWidth(), (int) (L.getWidth() * floatValue), false), java.lang.Boolean.FALSE);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("centerCropImage", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lVar.f302833d;
                pm0.v.X(new aa4.j(this, L, bitmap));
                if (((java.lang.Boolean) lVar.f302834e).booleanValue()) {
                    b(this, bitmap, bitmap.getWidth(), (int) (bitmap.getWidth() * 1.7777778f), i17, false, 16, null);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            int i19 = this.f2668h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (i19 != 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                int i27 = this.f2668h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        if (str != null) {
            if (kotlin.jvm.internal.o.b(str, this.f2670m + '-' + this.f2671n)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverFadeImageView", "bg image download finish:".concat(str));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                java.lang.String a17 = com.tencent.mm.plugin.sns.storage.a2.f165920g.a(this.f2670m);
                e(str, a17);
                f(a17, this.f2672o, this.f2673p);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }
}
