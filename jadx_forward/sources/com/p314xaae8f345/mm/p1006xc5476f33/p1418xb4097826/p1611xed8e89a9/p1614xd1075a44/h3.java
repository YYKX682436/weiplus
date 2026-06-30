package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class h3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f206100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(r45.j32 j32Var) {
        super(1);
        this.f206100d = j32Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd couponCallback = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(couponCallback, "couponCallback");
        r45.ov2 ov2Var = couponCallback.f213422a;
        r45.l1 l1Var = (r45.l1) ov2Var.m75936x14adae67(19);
        if (l1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.b(l1Var);
        }
        java.util.LinkedList m75941xfb821914 = this.f206100d.m75941xfb821914(0);
        java.lang.String str = couponCallback.f213423b;
        if (m75941xfb821914 != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.h32) obj2).m75945x2fec8307(4), str)) {
                    break;
                }
            }
            r45.h32 h32Var = (r45.h32) obj2;
            if (h32Var != null) {
                r45.l1 l1Var2 = (r45.l1) ov2Var.m75936x14adae67(19);
                if (l1Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a.b(l1Var2);
                }
                zl2.t.f(h32Var, ov2Var);
            }
        }
        zl2.g gVar = zl2.g.f555303a;
        java.lang.String m75945x2fec8307 = ov2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        gVar.c(m75945x2fec8307, str, true);
        return jz5.f0.f384359a;
    }
}
