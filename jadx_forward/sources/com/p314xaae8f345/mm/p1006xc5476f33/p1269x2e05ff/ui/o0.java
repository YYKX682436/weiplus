package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f174869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f174870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174871g;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var, boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f174871g = q0Var;
        this.f174868d = z17;
        this.f174869e = z18;
        this.f174870f = animatorListenerAdapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174871g.f174879d;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f174870f;
            if (c12929x567537a0 != null) {
                boolean z17 = this.f174868d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "resume FloatBallView, animation:%s", java.lang.Boolean.valueOf(z17));
                nVar.f174851c.m0(z17, this.f174869e, animatorListenerAdapter);
            }
            if (nVar.f174852d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "quickHide FloatMenuView");
                nVar.f174852d.c(animatorListenerAdapter);
            }
        }
    }
}
