package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class y0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.z0 f91260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.c0 f91261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f91262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f91263g;

    public y0(com.tencent.mm.plugin.appbrand.widget.halfscreen.z0 z0Var, com.tencent.mm.plugin.appbrand.widget.c0 c0Var, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17) {
        this.f91260d = z0Var;
        this.f91261e = c0Var;
        this.f91262f = animatorListenerAdapter;
        this.f91263g = z17;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.appbrand.widget.halfscreen.z0 z0Var = this.f91260d;
        z0Var.f91266b.Z(this.f91261e, this.f91262f, this.f91263g);
        com.tencent.mm.plugin.appbrand.widget.q qVar = z0Var.f91265a.f74810s;
        if (qVar != null) {
            qVar.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }
}
