package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class q4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f89949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.r4 f89950e;

    public q4(com.tencent.mm.plugin.appbrand.ui.r4 r4Var, android.view.ViewParent viewParent) {
        this.f89950e = r4Var;
        this.f89949d = viewParent;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f89950e.f89978e.post(new com.tencent.mm.plugin.appbrand.ui.p4(this));
    }
}
