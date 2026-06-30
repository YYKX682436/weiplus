package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class m7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 f191830a;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 activityC13983x9b040529) {
        this.f191830a = activityC13983x9b040529;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76184x8010e5e4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 activityC13983x9b040529 = this.f191830a;
        if (i17 == 0 && fVar.f152149b == 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList<r45.l82> m75941xfb821914 = ((r45.xu1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRoom_manager_list(...)");
            for (r45.l82 l82Var : m75941xfb821914) {
                r45.ty1 ty1Var = new r45.ty1();
                ty1Var.set(0, l82Var.m75945x2fec8307(0));
                ty1Var.set(2, java.lang.Integer.valueOf(l82Var.m75939xb282bd08(1)));
                java.lang.String str = null;
                if (l82Var.m75939xb282bd08(1) == 2) {
                    r45.xn1 xn1Var = (r45.xn1) l82Var.m75936x14adae67(2);
                    if (xn1Var != null) {
                        m76184x8010e5e4 = xn1Var.m75945x2fec8307(6);
                    }
                    m76184x8010e5e4 = null;
                } else {
                    r45.xn1 xn1Var2 = (r45.xn1) l82Var.m75936x14adae67(2);
                    if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
                        m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
                    }
                    m76184x8010e5e4 = null;
                }
                ty1Var.set(1, m76184x8010e5e4);
                ty1Var.set(3, 0);
                r45.xn1 xn1Var3 = (r45.xn1) l82Var.m75936x14adae67(2);
                if (xn1Var3 != null && (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) != null) {
                    str = c19782x23db1cfa2.m76175x6d346f39();
                }
                int i18 = 4;
                ty1Var.set(4, str);
                r45.xn1 xn1Var4 = (r45.xn1) l82Var.m75936x14adae67(2);
                if (xn1Var4 != null) {
                    i18 = xn1Var4.m75939xb282bd08(7);
                }
                ty1Var.set(5, java.lang.Integer.valueOf(i18));
                linkedList.add(ty1Var);
            }
            activityC13983x9b040529.f190857w = ((r45.xu1) fVar.f152151d).m75939xb282bd08(2);
            java.util.LinkedList linkedList2 = activityC13983x9b040529.f190858x;
            linkedList2.clear();
            linkedList2.addAll(((r45.xu1) fVar.f152151d).m75941xfb821914(1));
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.k7(activityC13983x9b040529, linkedList));
        } else {
            db5.t7.g(activityC13983x9b040529.mo55332x76847179(), activityC13983x9b040529.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dte));
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l7(activityC13983x9b040529));
        }
        return jz5.f0.f384359a;
    }
}
