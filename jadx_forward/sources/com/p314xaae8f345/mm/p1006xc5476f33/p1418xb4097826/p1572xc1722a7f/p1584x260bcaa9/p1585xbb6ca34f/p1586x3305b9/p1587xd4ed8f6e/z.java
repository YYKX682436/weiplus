package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f203586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f203587e;

    public z(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, gp2.l0 l0Var) {
        this.f203586d = c1163xf1deaba4;
        this.f203587e = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f203586d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4 != null ? c1163xf1deaba4.m7949x5701d990() : null;
        boolean z17 = false;
        if (m7949x5701d990 != null && m7949x5701d990.o()) {
            z17 = true;
        }
        gp2.l0 l0Var = this.f203587e;
        if (z17) {
            m7949x5701d990.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y(l0Var));
        } else if (l0Var != null) {
            l0Var.g();
        }
    }
}
