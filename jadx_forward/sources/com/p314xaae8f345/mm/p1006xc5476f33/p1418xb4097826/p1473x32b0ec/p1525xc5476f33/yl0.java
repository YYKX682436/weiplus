package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class yl0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 f196747d;

    public yl0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        this.f196747d = km0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.zv1 zv1Var = (r45.zv1) obj;
        if (zl2.r4.F1(this.f196747d.S0())) {
            this.f196747d.u1(true);
            return;
        }
        if (zv1Var == null || !zv1Var.m75933x41a8a7f2(0)) {
            pm0.v.d0(this.f196747d.f194818v, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xl0.f196637d);
            this.f196747d.u1(false);
            return;
        }
        java.util.LinkedList linkedList = this.f196747d.f194818v;
        pm0.v.d0(linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fm0.f194103d);
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0(zv1Var));
        if (this.f196747d.f194814r < this.f196747d.f194818v.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var = this.f196747d;
            java.lang.Object obj2 = km0Var.f194818v.get(km0Var.f194814r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            km0Var.w1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) obj2, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0 = this.f196747d.Y0();
        if (Y0 != null && Y0.m57703xa7d505b7()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var2 = this.f196747d;
        if (km0Var2.f194817u) {
            km0Var2.f194817u = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0.t1(km0Var2);
        }
        this.f196747d.K0(0);
    }
}
