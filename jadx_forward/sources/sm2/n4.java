package sm2;

/* loaded from: classes3.dex */
public final class n4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491122d;

    public n4(sm2.o4 o4Var) {
        this.f491122d = o4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var;
        sm2.o4 o4Var = this.f491122d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = o4Var.f491155l;
        boolean z17 = false;
        if (khVar != null && khVar.w0() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar2 = o4Var.f491155l;
            if (khVar2 != null) {
                khVar2.v1(((mm2.e1) o4Var.c(mm2.e1.class)).f410521r.m75939xb282bd08(4));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar3 = o4Var.f491155l;
            if (khVar3 != null) {
                khVar3.w1();
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z18 = ((mm2.e1) o4Var.c(mm2.e1.class)).b7() && ((mm2.c1) o4Var.c(mm2.c1.class)).T1 >= 0 && ((om2.l) o4Var.c(om2.l.class)).f427876h;
            if (zl2.r4.f555483a.f2(o4Var.f101142a)) {
                linkedList.add(new jz5.l(6, null));
                linkedList.add(new jz5.l(3, null));
            } else if (((mm2.e1) o4Var.c(mm2.e1.class)).t7()) {
                linkedList.add(new jz5.l(3, null));
            } else {
                jz5.l lVar = new jz5.l(2, null);
                jz5.l lVar2 = new jz5.l(1, null);
                jz5.l lVar3 = new jz5.l(3, null);
                jz5.l lVar4 = new jz5.l(4, null);
                if (mm2.g0.Q6((mm2.g0) o4Var.c(mm2.g0.class), null, 1, null)) {
                    linkedList.add(lVar2);
                } else {
                    linkedList.add(lVar);
                }
                linkedList.add(lVar3);
                if (((mm2.c1) o4Var.c(mm2.c1.class)).f410395p3 && ((mm2.c1) o4Var.c(mm2.c1.class)).m7()) {
                    linkedList.add(lVar4);
                }
                if (z18) {
                    linkedList.add(new jz5.l(7, null));
                    if (linkedList.size() >= 4) {
                        linkedList.remove(lVar);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar4 = o4Var.f491155l;
            if (khVar4 != null) {
                khVar4.A1(linkedList, true, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var2 = o4Var.f491172y;
        if ((v6Var2 != null && v6Var2.w0() == 0) && (v6Var = o4Var.f491172y) != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u6(v6Var, ((mm2.c1) o4Var.c(mm2.c1.class)).J1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t8 t8Var2 = o4Var.U;
        if (t8Var2 != null && t8Var2.w0() == 0) {
            z17 = true;
        }
        if (z17 && (t8Var = o4Var.U) != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p8(t8Var));
        }
        return true;
    }
}
