package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class i3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.e0 f203258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203259b;

    public i3(vp2.e0 e0Var, in5.s0 s0Var) {
        this.f203258a = e0Var;
        this.f203259b = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.h32 h32Var = (r45.h32) this.f203258a.f520450d.m75936x14adae67(0);
        int i17 = h32Var != null ? h32Var.m75939xb282bd08(1) == 0 ? 0 : 1 : -1;
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        in5.s0 s0Var = this.f203259b;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context2);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context3);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
        lVarArr[3] = new jz5.l("live_square_notice_action_type", java.lang.Integer.valueOf(i17));
        return kz5.c1.k(lVarArr);
    }
}
