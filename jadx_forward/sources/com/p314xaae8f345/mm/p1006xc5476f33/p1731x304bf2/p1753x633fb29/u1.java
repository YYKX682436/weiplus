package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes5.dex */
public class u1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.n2 f222017a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f222018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f222019c;

    public u1(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17, int i18) {
        int i19;
        this.f222019c = 0;
        if (fVar == null) {
            this.f222017a = new m53.n2();
            return;
        }
        m53.n2 n2Var = (m53.n2) fVar;
        this.f222017a = n2Var;
        this.f222019c = i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = n2Var.f405456d;
        if (linkedList2 != null) {
            int i27 = i18 + 1;
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a((m53.h) it.next());
                if (a17 != null) {
                    int i28 = this.f222019c;
                    if (i28 != 1) {
                        if (i28 == 2) {
                            a17.f221745o2 = 15;
                            a17.f221746p2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de;
                            i19 = i27 + 1;
                            a17.f221747q2 = i27;
                        }
                        linkedList.add(a17);
                    } else {
                        a17.f221745o2 = 16;
                        a17.f221746p2 = 1601;
                        i19 = i27 + 1;
                        a17.f221747q2 = i27;
                    }
                    i27 = i19;
                    linkedList.add(a17);
                }
            }
        }
        this.f222018b = linkedList;
        r53.n.c(linkedList);
    }
}
