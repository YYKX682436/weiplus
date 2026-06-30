package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f174865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174866f;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var, boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f174866f = q0Var;
        this.f174864d = z17;
        this.f174865e = animatorListenerAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174866f.f174879d;
        if (nVar != null) {
            nVar.h(this.f174864d, this.f174865e);
        }
    }
}
