package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes5.dex */
public final class p4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4 f207708d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4();

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f207709e;

    /* renamed from: f, reason: collision with root package name */
    public static zy2.za f207710f;

    static {
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f207709e = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Gf).mo141623x754a37bb()).r()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.d().q(6218, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = f207709e;
        sb6.append(z17);
        sb6.append(" errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSessionStatusUpdater", sb6.toString());
        if (z17) {
            return;
        }
        if (i17 == 0 && i18 == 0 && (m1Var instanceof db2.z5)) {
            zy2.za zaVar = f207710f;
            if (zaVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((db2.z5) m1Var).f309796g.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMsgSessionResponse");
                java.util.LinkedList m75941xfb821914 = ((r45.t81) fVar).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSessionProfileList(...)");
                ((com.p314xaae8f345.mm.ui.ti) zaVar).a(m75941xfb821914);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = ((db2.z5) m1Var).f309796g.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMsgSessionResponse");
            java.util.LinkedList<r45.vi2> m75941xfb8219142 = ((r45.t81) fVar2).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getSessionProfileList(...)");
            for (r45.vi2 vi2Var : m75941xfb8219142) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSessionStatusUpdater", "sessionId:" + vi2Var.m75945x2fec8307(1) + " , reject:" + vi2Var.m75939xb282bd08(2) + ", enableAction:" + vi2Var.m75939xb282bd08(3) + ", followFlag:" + vi2Var.m75939xb282bd08(5) + "  disable_sendmsg_need_follow:" + vi2Var.m75933x41a8a7f2(6));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
                java.lang.String m75945x2fec8307 = vi2Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                pk6.W0(m75945x2fec8307, vi2Var.m75939xb282bd08(2), vi2Var.m75939xb282bd08(3), vi2Var.m75939xb282bd08(5), vi2Var.m75933x41a8a7f2(6));
            }
        }
        f207710f = null;
    }
}
