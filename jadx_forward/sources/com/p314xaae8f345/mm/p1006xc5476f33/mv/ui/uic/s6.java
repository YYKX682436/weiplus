package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 f232975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f232976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f232977f;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var, long j17, long j18) {
        this.f232975d = t6Var;
        this.f232976e = j17;
        this.f232977f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var = this.f232975d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6) kz5.n0.a0(t6Var.f232993e, t6Var.f232996h);
        if (l6Var != null) {
            if (l6Var.f232809e != null) {
                t6Var.O6().m8148xed6e4d18(t6Var.f232996h + t6Var.O6().a0(), 2);
            }
            l6Var.f232812h = ((float) this.f232976e) / ((float) this.f232977f);
            t6Var.O6().m8148xed6e4d18(t6Var.f232996h + t6Var.O6().a0(), 2);
        }
    }
}
