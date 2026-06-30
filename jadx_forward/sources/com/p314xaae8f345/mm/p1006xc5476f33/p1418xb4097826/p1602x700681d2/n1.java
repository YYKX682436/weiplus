package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class n1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 f203908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f203909b;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var, boolean z17) {
        this.f203908a = s1Var;
        this.f203909b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f203908a.f203970q = ((r45.aa1) fVar.f152151d).m75934xbce7f2f(2);
        if (this.f203909b) {
            this.f203908a.p(((r45.aa1) fVar.f152151d).m75939xb282bd08(3) == 1);
        } else {
            this.f203908a.q(((r45.aa1) fVar.f152151d).m75939xb282bd08(3) == 1);
        }
        java.util.LinkedList m75941xfb821914 = ((r45.aa1) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.dm2 m76806xdef68064 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next).m76806xdef68064();
            if ((m76806xdef68064 != null ? (r45.vx0) m76806xdef68064.m75936x14adae67(0) : null) != null) {
                arrayList.add(next);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var = this.f203908a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1(h90Var.a(c19792x256d2725, 64));
            z1Var.f204042e = s1Var.h().f203814a;
            z1Var.f204041d = false;
            arrayList2.add(z1Var);
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        kz5.h0.B(V0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.m1(this.f203908a));
        if (this.f203909b) {
            int size = this.f203908a.f203955b.f203829a.size();
            this.f203908a.f203955b.f203829a.addAll(V0);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f203908a.f203959f;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.m8153xd399a4d9(size, ((java.util.ArrayList) V0).size());
        } else {
            this.f203908a.f203955b.f203829a.addAll(0, V0);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f203908a.f203959f;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf2.m8146xced61ae5();
        }
        this.f203908a.g(this.f203909b, ((java.util.ArrayList) V0).size());
        return jz5.f0.f384359a;
    }
}
