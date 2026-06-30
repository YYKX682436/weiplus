package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81;

/* renamed from: com.tencent.shadow.core.runtime.container.PluginContainerActivityParent */
/* loaded from: classes7.dex */
public class ActivityC25526x77e632a7 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {
    private static final java.lang.String TAG = "WVA.PluginContainerActivityParent";

    /* renamed from: mContentView */
    private volatile android.widget.FrameLayout f46663x92dc1011;

    /* renamed from: mLock */
    private final java.lang.Object f46665x6243b38 = new java.lang.Object();

    /* renamed from: mForceOrientation */
    private int f46664xe47b6c72 = -1;

    /* renamed from: createContentViewIfNeeded */
    private android.widget.FrameLayout m95526x61fea974() {
        android.widget.FrameLayout frameLayout;
        if (this.f46663x92dc1011 != null) {
            return this.f46663x92dc1011;
        }
        synchronized (this.f46665x6243b38) {
            if (this.f46663x92dc1011 == null) {
                this.f46663x92dc1011 = new android.widget.FrameLayout(this);
            }
            frameLayout = this.f46663x92dc1011;
        }
        return frameLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return this.f46664xe47b6c72;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF147381t() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str = "VAS.onCreate: " + this + "; " + getWindow().getCallback();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, str, null);
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo44294xa334195d() {
        return m95526x61fea974();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "VAS.setContentView: " + this, null);
        this.f46663x92dc1011.removeAllViews();
        this.f46663x92dc1011.addView(view, layoutParams);
    }

    /* renamed from: setForceOrientation */
    public void m95527xa389e67(int i17) {
        this.f46664xe47b6c72 = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        java.lang.String str = "VAS.setMMOrientation: " + mo44431x663c095b();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, str, null);
        super.mo50393x3c0b42ee();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        pa1.t tVar;
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "VAS.setRequestedOrientation: " + i17, null);
        m95527xa389e67(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150602b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            tVar = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
            tVar = ((pa1.o) N2).o4();
        }
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.WVAActivityDelegate", "requestOrientationByAppBrand getRenderer is null");
            return;
        }
        ni1.e eVar = (ni1.e) tVar.r(ni1.e.class);
        xi1.o e17 = xi1.o.e(i17);
        if (eVar != null) {
            eVar.f(e17.name());
        }
        if (eVar != null) {
            eVar.d(null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "VAS.setContentView: " + this, null);
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }
}
