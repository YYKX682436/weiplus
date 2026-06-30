package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gt extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt f194264a;

    public gt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt rtVar) {
        this.f194264a = rtVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Bj((ml2.r0) c17, ml2.g5.f409030x, null, 2, 2, null);
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            android.widget.CheckBox d17 = this.f194264a.d();
            int i17 = 0;
            if (d17 != null && d17.isChecked()) {
                i17 = 1;
            }
            r0Var.ak(1, 3, kz5.b1.e(new jz5.l("status", java.lang.String.valueOf(i17))));
        }
    }
}
