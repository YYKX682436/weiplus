package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class b5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f210468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 f210469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ro4 f210470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(r45.ix0 ix0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var, r45.ro4 ro4Var) {
        super(0);
        this.f210468d = ix0Var;
        this.f210469e = d5Var;
        this.f210470f = ro4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.et2 et2Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        g92.b bVar;
        m92.b j37;
        r45.dt2 dt2Var;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj2;
        int m75939xb282bd08 = this.f210468d.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var = this.f210469e;
        r45.ro4 ro4Var = this.f210470f;
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) d5Var.f210585b).h("reference_" + ro4Var.m75939xb282bd08(1));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
            if (c21541x1c1b08fe != null) {
                boolean z17 = ro4Var.m75939xb282bd08(0) == 1;
                c21541x1c1b08fe.O(z17);
                ya2.b2 b17 = ya2.h.f542017a.b(d5Var.f210586c);
                int m75939xb282bd082 = ro4Var.m75939xb282bd08(1);
                int m75939xb282bd083 = ro4Var.m75939xb282bd08(0);
                if (b17 != null) {
                    r45.et2 et2Var2 = b17.f69337x3eb82f07;
                    if (et2Var2 == null || (m75941xfb8219142 = et2Var2.m75941xfb821914(0)) == null) {
                        dt2Var = null;
                    } else {
                        java.util.Iterator it = m75941xfb8219142.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((r45.dt2) obj2).m75939xb282bd08(0) == m75939xb282bd082) {
                                break;
                            }
                        }
                        dt2Var = (r45.dt2) obj2;
                    }
                    if (dt2Var != null) {
                        dt2Var.set(2, java.lang.Integer.valueOf(m75939xb282bd083));
                        ya2.h.f542017a.o(b17);
                    }
                }
                if (ro4Var.m75939xb282bd08(1) == 2) {
                    if (b17 != null) {
                        long j17 = b17.f69298x75e87a18;
                        b17.f69298x75e87a18 = z17 ? (-17) & j17 : 16 | j17;
                        ya2.h.f542017a.o(b17);
                    }
                } else if (ro4Var.m75939xb282bd08(1) == 1 && (j37 = g92.a.j3((bVar = g92.b.f351302e), d5Var.f210586c, false, 2, null)) != null) {
                    java.lang.String username = d5Var.f210586c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                    int i17 = j37.f68698x26b1b2e8;
                    int i18 = z17 ? i17 & (-257) : i17 | 256;
                    m92.c cVar = new m92.c(username);
                    cVar.f68698x26b1b2e8 = i18;
                    bVar.C(cVar, m92.j.f406530o);
                }
            }
        } else {
            ya2.b2 b18 = ya2.h.f542017a.b(d5Var.f210586c);
            if (b18 != null && (et2Var = b18.f69337x3eb82f07) != null && (m75941xfb821914 = et2Var.m75941xfb821914(0)) != null) {
                java.util.Iterator it6 = m75941xfb821914.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((r45.dt2) obj).m75939xb282bd08(0) == ro4Var.m75939xb282bd08(1)) {
                        break;
                    }
                }
                r45.dt2 dt2Var2 = (r45.dt2) obj;
                if (dt2Var2 != null) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) d5Var.f210585b).h("reference_" + ro4Var.m75939xb282bd08(1));
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
                    if (c21541x1c1b08fe2 != null) {
                        c21541x1c1b08fe2.O(dt2Var2.m75939xb282bd08(2) == 1);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
