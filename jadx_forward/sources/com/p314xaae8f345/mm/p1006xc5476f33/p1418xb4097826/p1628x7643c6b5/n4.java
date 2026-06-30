package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes5.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4 f207692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4 p4Var) {
        super(1);
        this.f207692d = p4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.t81 resp = (r45.t81) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f207692d.getClass();
        zy2.za zaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4.f207710f;
        if (zaVar != null) {
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSessionProfileList(...)");
            ((com.p314xaae8f345.mm.ui.ti) zaVar).a(m75941xfb821914);
        }
        java.util.LinkedList<r45.vi2> m75941xfb8219142 = resp.m75941xfb821914(1);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4.f207710f = null;
        return jz5.f0.f384359a;
    }
}
