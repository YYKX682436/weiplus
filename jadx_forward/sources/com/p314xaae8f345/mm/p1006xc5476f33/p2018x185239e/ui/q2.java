package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 f239428e;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var) {
        this.f239427d = h3Var;
        this.f239428e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var = this.f239428e;
        android.widget.LinearLayout linearLayout = n2Var.f239364g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239427d;
        h3Var.Q(linearLayout, i65.a.b(h3Var.f239268d, 8) + n2Var.f239370p.getWidth());
    }
}
