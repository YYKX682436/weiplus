package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class i1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 f203856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f203857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f203858c;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var, yz5.l lVar, long j17) {
        this.f203856a = s1Var;
        this.f203857b = lVar;
        this.f203858c = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFirstDataWithRel enterType=");
        r45.vx0 vx0Var = this.f203856a.h().f203818e;
        sb6.append(vx0Var != null ? java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(10)) : null);
        sb6.append(" list=[");
        java.util.LinkedList m75941xfb821914 = ((r45.aa1) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        sb6.append(kz5.n0.g0(m75941xfb821914, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.f1.f203835d, 31, null));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListDrawerPresenter", sb6.toString());
        this.f203856a.f203970q = ((r45.aa1) fVar.f152151d).m75934xbce7f2f(2);
        this.f203856a.p(((r45.aa1) fVar.f152151d).m75939xb282bd08(3) == 1);
        java.util.LinkedList m75941xfb8219142 = ((r45.aa1) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : m75941xfb8219142) {
            r45.dm2 m76806xdef68064 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2).m76806xdef68064();
            if ((m76806xdef68064 != null ? (r45.vx0) m76806xdef68064.m75936x14adae67(0) : null) != null) {
                arrayList.add(obj2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var = this.f203856a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1(h90Var.a(c19792x256d2725, 64));
            z1Var.f204042e = s1Var.h().f203814a;
            if (z1Var.mo2128x1ed62e84() == s1Var.h().f203814a) {
                z1Var.f204041d = true;
            }
            arrayList2.add(z1Var);
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        kz5.h0.B(V0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.g1(this.f203856a));
        if (this.f203857b == null) {
            this.f203856a.f203955b.f203829a.addAll(V0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203856a.f203958e;
            if (l0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                throw null;
            }
            l0Var.v();
            if (this.f203856a.f203955b.f203829a.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var2 = this.f203856a.f203958e;
                if (l0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                    throw null;
                }
                l0Var2.A();
            } else {
                this.f203856a.r(true);
            }
        } else {
            this.f203856a.f203955b.f203829a.clear();
            this.f203856a.f203955b.f203829a.addAll(V0);
            this.f203856a.r(false);
            if (((java.util.ArrayList) V0).isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var2 = this.f203856a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var3 = s1Var2.f203958e;
                if (l0Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallBack");
                    throw null;
                }
                l0Var3.B(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.h1(s1Var2, this.f203858c, this.f203857b));
                this.f203857b.mo146xb9724478(java.lang.Boolean.FALSE);
            } else {
                this.f203857b.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f384359a;
    }
}
