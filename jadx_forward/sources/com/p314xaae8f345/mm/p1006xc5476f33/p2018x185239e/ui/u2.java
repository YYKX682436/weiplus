package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 f239501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 f239502f;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var2) {
        this.f239500d = h3Var;
        this.f239501e = n2Var;
        this.f239502f = n2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout linearLayout = this.f239501e.f239364g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239500d;
        h3Var.Q(linearLayout, i65.a.b(h3Var.f239268d, 8) + this.f239502f.f239370p.getWidth());
    }
}
