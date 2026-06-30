package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class AppBrandAdUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f74925m = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.o6 f74926e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f74927f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ad.ui.e f74928g;

    /* renamed from: h, reason: collision with root package name */
    public i81.q f74929h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f74930i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.6
        {
            this.__eventId = -838435681;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent appBrandCloseAppBrandAdUIEvent) {
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent appBrandCloseAppBrandAdUIEvent2 = appBrandCloseAppBrandAdUIEvent;
            com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.this.f74926e;
            if (o6Var == null || com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f74803n) || !com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.this.f74926e.f74803n.equalsIgnoreCase(appBrandCloseAppBrandAdUIEvent2.f74936g.f74951a)) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "receive close splash ad event, finish");
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.this.finish();
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.this.overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
            return true;
        }
    };

    public final void O6() {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        android.view.View decorView = getWindow().getDecorView();
        decorView.requestApplyInsets();
        if (getResources().getConfiguration().orientation == 2) {
            com.tencent.mm.plugin.appbrand.ui.na.g(this, true);
            i81.q qVar = this.f74929h;
            if (qVar != null) {
                qVar.setBarTopMargin(0);
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            decorView.setSystemUiVisibility(1296);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        i81.q qVar2 = this.f74929h;
        if (qVar2 == null || (o6Var = this.f74926e) == null) {
            return;
        }
        qVar2.setBarTopMargin(o6Var.getWindowAndroid().getStatusBar() != null ? this.f74926e.getWindowAndroid().getStatusBar().f454702a : 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (isFinishing()) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        O6();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        vj5.o.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        this.f74927f = frameLayout;
        frameLayout.setBackgroundColor(0);
        setContentView(this.f74927f);
        java.lang.String stringExtra = getIntent().getStringExtra("appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onCreate, appId is null");
            finish();
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(stringExtra);
        this.f74926e = b17;
        if (b17 == null || b17.L0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onCreate, runtime is null");
            finish();
            return;
        }
        if (this.f74926e.C0() != null) {
            this.f74926e.C0().M1();
        }
        i81.q qVar = new i81.q(this, this.f74926e);
        this.f74929h = qVar;
        this.f74926e.f74818y = qVar;
        qVar.b();
        this.f74929h.setActionBarFullscreenMode(true);
        i81.b bVar = this.f74929h.f289608g;
        if (bVar != null) {
            bVar.f289521d.m(true);
        }
        i81.b bVar2 = this.f74929h.f289608g;
        if (bVar2 != null) {
            bVar2.a(true, al1.h0.PageConfig);
        }
        i81.b bVar3 = this.f74929h.f289608g;
        if (bVar3 != null) {
            al1.b bVar4 = bVar3.f289521d;
            bVar4.f5738o.setVisibility(0);
            bVar4.requestLayout();
        }
        this.f74929h.setTitle(getResources().getString(com.tencent.mm.R.string.f490037j5));
        if (com.tencent.mm.ui.bk.C()) {
            this.f74929h.setBackgroundColor(-16777216);
            this.f74929h.setForegroundStyle(false);
        } else {
            this.f74929h.setBackgroundColor(-1);
            this.f74929h.setForegroundStyle(true);
        }
        this.f74929h.setBackButtonClickListener(new com.tencent.mm.plugin.appbrand.ad.ui.f(this));
        this.f74929h.setCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.ad.ui.g(this));
        this.f74929h.setOptionButtonClickListener(new com.tencent.mm.plugin.appbrand.ad.ui.h(this));
        this.f74929h.setOnHideListener(new com.tencent.mm.plugin.appbrand.ad.ui.i(this));
        i81.j.c(this.f74929h);
        i81.q qVar2 = this.f74929h;
        qVar2.getClass();
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            qVar2.setVisibility(0);
            qVar2.bringToFront();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new i81.k(qVar2));
        }
        i81.q qVar3 = this.f74929h;
        if (qVar3 != null && qVar3.getContentContainer() != null) {
            this.f74929h.getContentContainer().addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$a
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
                    int i39 = com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.f74925m;
                    final com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI = com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.this;
                    appBrandAdUI.getClass();
                    java.util.Map map = i81.j.f289592a;
                    if ((i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) ? false : true) {
                        final int height = appBrandAdUI.f74929h.getContentContainer().getHeight();
                        final int width = appBrandAdUI.f74929h.getContentContainer().getWidth();
                        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandAdUI.f74926e;
                        if (o6Var != null) {
                            o6Var.D2.d(new com.tencent.mm.plugin.appbrand.pc() { // from class: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$b
                                @Override // com.tencent.mm.plugin.appbrand.pc
                                public final void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
                                    int i47 = com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.f74925m;
                                    com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI appBrandAdUI2 = com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI.this;
                                    appBrandAdUI2.getClass();
                                    com.tencent.mm.plugin.appbrand.ad.jsapi.s sVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.s();
                                    sVar.f74924i = "menu";
                                    sVar.x(appBrandAdUI2.f74926e.C0(), c0Var, new int[]{width, height});
                                }
                            });
                        }
                    }
                }
            });
        }
        this.f74927f.addView(this.f74929h, new android.view.ViewGroup.LayoutParams(-1, -1));
        O6();
        this.f74930i.alive();
        this.f74926e.D2.d(new com.tencent.mm.plugin.appbrand.ad.ui.j(this));
        overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onDestroy");
        com.tencent.mm.sdk.event.IListener iListener = this.f74930i;
        if (iListener != null) {
            iListener.dead();
            this.f74930i = null;
        }
        com.tencent.mm.plugin.appbrand.ad.ui.e eVar = this.f74928g;
        if (eVar != null) {
            try {
                eVar.f74943b.u();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdActionSheet", "hide exception = %s", e17);
            }
        }
        i81.q qVar = this.f74929h;
        if (qVar != null) {
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                qVar.a(false, "menu", null);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new i81.l(qVar, false, "menu", null));
            }
            if (this.f74929h.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f74929h.getParent()).removeView(this.f74929h);
            }
            this.f74929h = null;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f74926e;
        if (o6Var != null) {
            o6Var.f74818y = null;
            if (o6Var.C0() != null) {
                this.f74926e.C0().M1();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onPause");
        com.tencent.mm.plugin.appbrand.ad.ui.e eVar = this.f74928g;
        if (eVar != null) {
            try {
                eVar.f74943b.u();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdActionSheet", "hide exception = %s", e17);
            }
        }
        if (this.f74926e != null) {
            com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.k();
            kVar.f74914i = "menu";
            kVar.x(this.f74926e.C0());
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onResume");
        if (this.f74926e != null) {
            com.tencent.mm.plugin.appbrand.ad.jsapi.m mVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.m();
            mVar.f74918i = "menu";
            mVar.x(this.f74926e.C0());
        }
    }
}
