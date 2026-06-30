package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI */
/* loaded from: classes7.dex */
public class ActivityC11550x40c70d1d extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f156458m = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f156459e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f156460f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e f156461g;

    /* renamed from: h, reason: collision with root package name */
    public i81.q f156462h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f156463i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.C11557xfc29262b>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.6
        {
            this.f39173x3fe91575 = -838435681;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.C11557xfc29262b c11557xfc29262b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.C11557xfc29262b c11557xfc29262b2 = c11557xfc29262b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.this.f156459e;
            if (o6Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f156336n) || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.this.f156459e.f156336n.equalsIgnoreCase(c11557xfc29262b2.f156469g.f156484a)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "receive close splash ad event, finish");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.this.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.this.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
            return true;
        }
    };

    public final void O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        android.view.View decorView = getWindow().getDecorView();
        decorView.requestApplyInsets();
        if (getResources().getConfiguration().orientation == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.g(this, true);
            i81.q qVar = this.f156462h;
            if (qVar != null) {
                qVar.m134918x1b5b3612(0);
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            decorView.setSystemUiVisibility(1296);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        i81.q qVar2 = this.f156462h;
        if (qVar2 == null || (o6Var = this.f156459e) == null) {
            return;
        }
        qVar2.m134918x1b5b3612(o6Var.mo48803xee5260a9().mo51615x8408480b() != null ? this.f156459e.mo48803xee5260a9().mo51615x8408480b().f536235a : 0);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (isFinishing()) {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        O6();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        vj5.o.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        this.f156460f = frameLayout;
        frameLayout.setBackgroundColor(0);
        setContentView(this.f156460f);
        java.lang.String stringExtra = getIntent().getStringExtra("appId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onCreate, appId is null");
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(stringExtra);
        this.f156459e = b17;
        if (b17 == null || b17.L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onCreate, runtime is null");
            finish();
            return;
        }
        if (this.f156459e.C0() != null) {
            this.f156459e.C0().M1();
        }
        i81.q qVar = new i81.q(this, this.f156459e);
        this.f156462h = qVar;
        this.f156459e.f156351y = qVar;
        qVar.b();
        this.f156462h.m134916x65c88099(true);
        i81.b bVar = this.f156462h.f371141g;
        if (bVar != null) {
            bVar.f371054d.m(true);
        }
        i81.b bVar2 = this.f156462h.f371141g;
        if (bVar2 != null) {
            bVar2.a(true, al1.h0.PageConfig);
        }
        i81.b bVar3 = this.f156462h.f371141g;
        if (bVar3 != null) {
            al1.b bVar4 = bVar3.f371054d;
            bVar4.f87271o.setVisibility(0);
            bVar4.requestLayout();
        }
        this.f156462h.m134923x53bfe316(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571570j5));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f156462h.setBackgroundColor(-16777216);
            this.f156462h.m134920xf5e6816c(false);
        } else {
            this.f156462h.setBackgroundColor(-1);
            this.f156462h.m134920xf5e6816c(true);
        }
        this.f156462h.m134917x1ae0b121(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.f(this));
        this.f156462h.m134919x262881b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.g(this));
        this.f156462h.m134922x9b5ddf53(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.h(this));
        this.f156462h.m134921x9d906497(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.i(this));
        i81.j.c(this.f156462h);
        i81.q qVar2 = this.f156462h;
        qVar2.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            qVar2.setVisibility(0);
            qVar2.bringToFront();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i81.k(qVar2));
        }
        i81.q qVar3 = this.f156462h;
        if (qVar3 != null && qVar3.m134913xda5977e() != null) {
            this.f156462h.m134913xda5977e().addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$a
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
                    int i39 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.f156458m;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.this;
                    activityC11550x40c70d1d.getClass();
                    java.util.Map map = i81.j.f371125a;
                    if ((i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) ? false : true) {
                        final int height = activityC11550x40c70d1d.f156462h.m134913xda5977e().getHeight();
                        final int width = activityC11550x40c70d1d.f156462h.m134913xda5977e().getWidth();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = activityC11550x40c70d1d.f156459e;
                        if (o6Var != null) {
                            o6Var.D2.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc() { // from class: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$b
                                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pc
                                public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, jz5.l lVar, java.lang.String str) {
                                    int i47 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.f156458m;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d activityC11550x40c70d1d2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.this;
                                    activityC11550x40c70d1d2.getClass();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.s();
                                    sVar.f156457i = "menu";
                                    sVar.x(activityC11550x40c70d1d2.f156459e.C0(), c0Var, new int[]{width, height});
                                }
                            });
                        }
                    }
                }
            });
        }
        this.f156460f.addView(this.f156462h, new android.view.ViewGroup.LayoutParams(-1, -1));
        O6();
        this.f156463i.mo48813x58998cd();
        this.f156459e.D2.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.j(this));
        overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onDestroy");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f156463i;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
            this.f156463i = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e eVar = this.f156461g;
        if (eVar != null) {
            try {
                eVar.f156476b.u();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdActionSheet", "hide exception = %s", e17);
            }
        }
        i81.q qVar = this.f156462h;
        if (qVar != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                qVar.a(false, "menu", null);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i81.l(qVar, false, "menu", null));
            }
            if (this.f156462h.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f156462h.getParent()).removeView(this.f156462h);
            }
            this.f156462h = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f156459e;
        if (o6Var != null) {
            o6Var.f156351y = null;
            if (o6Var.C0() != null) {
                this.f156459e.C0().M1();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.e eVar = this.f156461g;
        if (eVar != null) {
            try {
                eVar.f156476b.u();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdActionSheet", "hide exception = %s", e17);
            }
        }
        if (this.f156459e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k();
            kVar.f156447i = "menu";
            kVar.x(this.f156459e.C0());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onResume");
        if (this.f156459e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.m();
            mVar.f156451i = "menu";
            mVar.x(this.f156459e.C0());
        }
    }
}
