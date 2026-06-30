package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jn implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn f188654d;

    public jn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar) {
        this.f188654d = rnVar;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.k4 k4Var = (so2.k4) holder.f374658i;
        if (k4Var == null || k4Var.f491988e != 2) {
            return false;
        }
        r45.ub ubVar = (r45.ub) k4Var.f491987d.m75936x14adae67(2);
        if (ubVar != null && ubVar.m75939xb282bd08(0) == 1) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = this.f188654d;
        rl5.r rVar = rnVar.f190464g;
        if (rVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = rnVar.f190464g;
        if (rVar2 != null) {
            rVar2.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pn(rnVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qn(rnVar, k4Var, adapter, i17), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
        throw null;
    }
}
