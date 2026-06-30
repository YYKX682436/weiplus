package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class am0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 f193439d;

    public am0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        this.f193439d = km0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        dk2.z7 z7Var = (dk2.z7) obj;
        if (zl2.r4.F1(this.f193439d.S0())) {
            this.f193439d.u1(true);
            return;
        }
        if (z7Var == null || !z7Var.f315958b) {
            pm0.v.d0(this.f193439d.f194818v, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zl0.f196890d);
            this.f193439d.u1(false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var = this.f193439d;
        r45.c04 c04Var = z7Var.f315957a;
        java.util.LinkedList linkedList = km0Var.f194818v;
        pm0.v.d0(linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gm0.f194248d);
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0(c04Var));
        if (this.f193439d.f194814r < this.f193439d.f194818v.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var2 = this.f193439d;
            java.lang.Object obj2 = km0Var2.f194818v.get(km0Var2.f194814r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            km0Var2.w1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) obj2, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0 = this.f193439d.Y0();
        if (Y0 != null && Y0.m57703xa7d505b7()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var3 = this.f193439d;
        if (km0Var3.f194817u) {
            km0Var3.f194817u = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0.t1(km0Var3);
        }
        this.f193439d.K0(0);
    }
}
