package tm2;

/* loaded from: classes3.dex */
public final class r2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502109d;

    public r2(tm2.s2 s2Var) {
        this.f502109d = s2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var;
        tm2.s2 s2Var = this.f502109d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = s2Var.f502130l;
        boolean z17 = false;
        if (khVar != null && khVar.w0() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar2 = s2Var.f502130l;
            if (khVar2 != null) {
                khVar2.v1(((mm2.e1) s2Var.c(mm2.e1.class)).f410521r.m75939xb282bd08(4));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar3 = s2Var.f502130l;
            if (khVar3 != null) {
                khVar3.w1();
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z18 = ((mm2.e1) s2Var.c(mm2.e1.class)).b7() && ((mm2.c1) s2Var.c(mm2.c1.class)).T1 > 0 && ((om2.l) s2Var.c(om2.l.class)).f427876h;
            if (zl2.r4.f555483a.f2(s2Var.f101142a)) {
                linkedList.add(new jz5.l(6, null));
                linkedList.add(new jz5.l(3, null));
            } else if (((mm2.e1) s2Var.c(mm2.e1.class)).t7()) {
                linkedList.add(new jz5.l(3, null));
            } else {
                if (mm2.g0.Q6((mm2.g0) s2Var.c(mm2.g0.class), null, 1, null)) {
                    linkedList.add(new jz5.l(1, null));
                } else if (!z18) {
                    linkedList.add(new jz5.l(2, null));
                }
                if (((mm2.c1) s2Var.c(mm2.c1.class)).f410395p3 && ((mm2.c1) s2Var.c(mm2.c1.class)).m7()) {
                    linkedList.add(new jz5.l(4, null));
                }
                linkedList.add(new jz5.l(3, null));
                if (z18) {
                    linkedList.add(new jz5.l(7, null));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar4 = s2Var.f502130l;
            if (khVar4 != null) {
                khVar4.A1(linkedList, true, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var2 = s2Var.f502147y;
        if (v6Var2 != null && v6Var2.w0() == 0) {
            z17 = true;
        }
        if (z17 && (v6Var = s2Var.f502147y) != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u6(v6Var, ((mm2.c1) s2Var.c(mm2.c1.class)).J1));
        }
        return true;
    }
}
