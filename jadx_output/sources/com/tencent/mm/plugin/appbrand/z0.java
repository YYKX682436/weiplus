package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class z0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.b1 f92436d;

    public z0(com.tencent.mm.plugin.appbrand.b1 b1Var) {
        this.f92436d = b1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f92436d.f76754a.Q;
        kotlin.jvm.internal.o.d(lifecycleScope);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.appbrand.y0(this.f92436d, null), 2, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }
}
