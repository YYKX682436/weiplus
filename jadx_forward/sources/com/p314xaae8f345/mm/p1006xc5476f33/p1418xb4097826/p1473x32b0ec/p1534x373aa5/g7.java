package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class g7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 f197859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var) {
        super(1);
        this.f197859d = k7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.h32 noticeInfo = (r45.h32) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k7 k7Var = this.f197859d;
        yz5.l lVar = k7Var.P;
        if (lVar != null) {
            lVar.mo146xb9724478(noticeInfo);
        }
        k7Var.s(true);
        bm2.x5 x5Var = k7Var.Q;
        if (x5Var != null) {
            java.util.LinkedList linkedList = x5Var.f103965f;
            if (linkedList != null) {
                linkedList.clear();
            }
            x5Var.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
