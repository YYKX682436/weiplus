package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class cm0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 f193710d;

    public cm0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        this.f193710d = km0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.pm1 pm1Var = (r45.pm1) obj;
        if (zl2.r4.F1(this.f193710d.S0())) {
            this.f193710d.u1(true);
            return;
        }
        if (pm1Var != null) {
            java.util.LinkedList m75941xfb821914 = pm1Var.m75941xfb821914(0);
            if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
                java.util.LinkedList linkedList = this.f193710d.f194818v;
                pm0.v.d0(linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.em0.f193969d);
                java.util.LinkedList<r45.gh6> m75941xfb8219142 = pm1Var.m75941xfb821914(0);
                if (m75941xfb8219142 != null) {
                    for (r45.gh6 gh6Var : m75941xfb8219142) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gh6Var);
                        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0(gh6Var));
                    }
                }
                if (this.f193710d.f194814r < this.f193710d.f194818v.size()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var = this.f193710d;
                    java.lang.Object obj2 = km0Var.f194818v.get(km0Var.f194814r);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    km0Var.w1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) obj2, false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0 = this.f193710d.Y0();
                if (Y0 != null && Y0.m57703xa7d505b7()) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var2 = this.f193710d;
                if (km0Var2.f194817u) {
                    km0Var2.f194817u = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0.t1(km0Var2);
                }
                this.f193710d.K0(0);
                return;
            }
        }
        pm0.v.d0(this.f193710d.f194818v, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bm0.f193584d);
        this.f193710d.u1(false);
    }
}
