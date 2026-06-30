package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class y0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1 f191448a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1 d1Var) {
        this.f191448a = d1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.j51 j51Var = (r45.j51) fVar.f152151d;
        if (fVar.f152148a != 0 || fVar.f152149b != 0 || j51Var == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2(false, new java.util.ArrayList());
        }
        this.f191448a.f191363q = j51Var.m75939xb282bd08(5) == 1;
        this.f191448a.f191362p = j51Var.m75934xbce7f2f(3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreImageComment after lastBuffer ");
        if (this.f191448a.f191362p == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f191448a.f191362p;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageFlowViewModel", sb6.toString());
        java.util.LinkedList m75941xfb821914 = j51Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCommentInfo(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : m75941xfb821914) {
            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj2).m76062x928789b6() == 2) {
                arrayList.add(obj2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.d1 d1Var = this.f191448a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            long m59251x5db1b11 = d1Var.O6().m59251x5db1b11();
            java.lang.String m59229xb5af1dd5 = d1Var.O6().m59229xb5af1dd5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = m59251x5db1b11;
            yj0Var.f68957xec748fc6 = m59229xb5af1dd5;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, c19781xd1c47b87);
            yj0Var.n1(0L);
            arrayList2.add(new so2.y0(yj0Var));
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2(true, kz5.n0.V0(arrayList2));
    }
}
