package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class w8 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f90310d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90311e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f90312f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f90313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f90312f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f90313g = new com.tencent.mm.plugin.appbrand.ui.v8(this);
    }

    public final void O6() {
        if (getActivity().isDestroyed() || getActivity().isFinishing()) {
            return;
        }
        this.f90310d = true;
        this.f90312f.postDelayed(this.f90313g, 433L);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var;
        com.tencent.mm.plugin.appbrand.task.e1 e1Var = com.tencent.mm.plugin.appbrand.task.e1.f89016a;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        e1Var.a((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) activity, "onBackPressed(mEatBackPressed:" + this.f90311e + ')');
        if (this.f90311e) {
            return true;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        com.tencent.mm.plugin.appbrand.hc q76 = ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) activity2).q7();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime2 = q76.getActiveRuntime();
        com.tencent.mm.plugin.appbrand.o6 o6Var = activeRuntime2 instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) activeRuntime2 : null;
        if (o6Var != null) {
            if (!o6Var.Q0()) {
                o6Var = null;
            }
            if (o6Var != null && (l0Var = o6Var.H2) != null && (f0Var = l0Var.f91198d) != null) {
                f0Var.T(11);
            }
        }
        ze.l lVar = q76 instanceof ze.l ? (ze.l) q76 : null;
        if (lVar == null) {
            return false;
        }
        if (!lVar.a0() && (activeRuntime = lVar.getActiveRuntime()) != null) {
            try {
                activeRuntime.Z0();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeContainer", "onBackPressed e = %s", e17);
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.z4(lVar, e17));
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        O6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f90312f.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onEnterAnimationComplete() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f90312f;
        java.lang.Runnable runnable = this.f90313g;
        n3Var.removeCallbacks(runnable);
        ((com.tencent.mm.plugin.appbrand.ui.v8) runnable).run();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        O6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        if (this.f90310d) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f90312f;
        java.lang.Runnable runnable = this.f90313g;
        n3Var.removeCallbacks(runnable);
        ((com.tencent.mm.plugin.appbrand.ui.v8) runnable).run();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        this.f90312f.removeCallbacks(this.f90313g);
        this.f90311e = true;
        this.f90310d = false;
    }
}
