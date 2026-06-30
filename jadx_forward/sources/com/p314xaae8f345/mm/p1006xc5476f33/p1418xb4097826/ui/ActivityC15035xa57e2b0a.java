package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeAnimUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI */
/* loaded from: classes5.dex */
public final class ActivityC15035xa57e2b0a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public static android.graphics.Bitmap f210114e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f210115d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u6(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", "finish");
        int intExtra = getIntent().getIntExtra("KEY_ROUTER_LAUNCHER", -1);
        boolean z17 = true;
        if (intExtra == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", "routeToFindPage");
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        } else if (intExtra != 2) {
            super.finish();
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", "routeToMainPage");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("preferred_tab", 0);
            j45.l.u(this, ".ui.LauncherUI", intent2, null);
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        }
        if (z17) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t6(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityCloseAnimation */
    public void mo50392x5138328b() {
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityOpenAnimation */
    public void mo51655xf502a5b(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initNavigationSwipeBack */
    public boolean mo52921x858d605d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean mo44291x4e2d2008() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: needResetStatusBarColorOnActivityCreate */
    public boolean mo44292x104fd6a5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", "onCreate");
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        com.p314xaae8f345.mm.ui.r0.a(this, false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        if (f210114e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderHomeAnimUI", "onCreate: finderHomeSnapshot is null");
            finish();
            return;
        }
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        m78513xc2a54588.setBackground(new android.graphics.drawable.BitmapDrawable(m78513xc2a54588.getResources(), f210114e));
        m78513xc2a54588.setWillNotDraw(false);
        android.view.View m78513xc2a545882 = m78513xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78513xc2a545882, "getContentView(...)");
        m78513xc2a545882.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.v6(m78513xc2a545882, this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575740h2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", "onDestroy");
        super.onDestroy();
        m78513xc2a54588().removeCallbacks(this.f210115d);
        m78513xc2a54588().setBackground(null);
        f210114e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", "onEnterAnimationComplete");
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        return false;
    }
}
