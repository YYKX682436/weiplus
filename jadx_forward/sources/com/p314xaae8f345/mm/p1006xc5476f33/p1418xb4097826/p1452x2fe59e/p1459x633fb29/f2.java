package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e f189381d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e c13863x5951942e) {
        this.f189381d = c13863x5951942e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g2(0, 0, "");
        java.util.Collection collection = (java.util.List) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e.f188989g.get(this.f189381d.f188990d);
        if (collection == null) {
            collection = new java.util.ArrayList();
        }
        g2Var.m56420x2a5f836b(collection);
        g2Var.m56421x73095078(null);
        return g2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.List list;
        int i19;
        boolean z17;
        java.util.ArrayList arrayList;
        java.util.List m56409x97891cf7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e c13863x5951942e = this.f189381d;
        if (i18 == -4100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
            java.lang.String wxUsername = c13863x5951942e.f188990d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
            r45.nw6 b17 = k8Var.b(wxUsername);
            if (b17 != null) {
                b17.set(3, 0);
            }
        }
        if (!(iVar instanceof bq.n0) || !(fVar instanceof r45.d71)) {
            return null;
        }
        if (i17 == 0 && i18 == 0) {
            yr2.a aVar = yr2.a.f546192a;
            r45.d71 d71Var = (r45.d71) fVar;
            r45.sq2 sq2Var = (r45.sq2) d71Var.m75936x14adae67(8);
            java.util.LinkedList m75941xfb821914 = d71Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLiked_list(...)");
            aVar.b(sq2Var, m75941xfb821914, 3965);
            java.util.LinkedList m75941xfb8219142 = d71Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getLiked_list(...)");
            if (m75941xfb8219142.size() > 0) {
                java.lang.Object obj = m75941xfb8219142.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "onGYNetEnd list:" + m75941xfb8219142.size() + " firstItem:" + pm0.b0.g((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj));
            }
            java.lang.String m56464xb5886c64 = m56464xb5886c64();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd list:");
            sb6.append(m75941xfb8219142.size());
            sb6.append(", continueFlag:");
            sb6.append(d71Var.m75939xb282bd08(3));
            sb6.append(", maxId:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.k0(m75941xfb8219142);
            sb6.append(c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76765xe2f6ac7()) : null);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
            bq.n0 n0Var = (bq.n0) iVar;
            boolean z18 = n0Var.f105030o != 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f105031p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb8219142) {
                if (hc2.o0.C((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            cu2.t tVar = cu2.u.f303974a;
            list = tVar.j(arrayList2, 4, c13863x5951942e.m56354xfe9224be());
            if (z18 && n0Var.f105033r != 1 && n0Var.f105032q) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
                }
                tVar.m(arrayList3, 4, "", z18);
            }
        } else {
            list = null;
        }
        if (i17 != 0 || i18 != 0) {
            i19 = -4100;
            if (i18 != -4100) {
                z17 = true;
            }
            z17 = false;
        } else if (((r45.d71) fVar).m75939xb282bd08(3) == 1) {
            z17 = true;
            i19 = -4100;
        } else {
            i19 = -4100;
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g2 g2Var = i18 != i19 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g2(i17, i18, str) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g2(0, 0, "");
        if (list != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList4.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        g2Var.m56420x2a5f836b(arrayList);
        bq.n0 n0Var2 = (bq.n0) iVar;
        g2Var.m56423xd4b4a5a1(n0Var2.f105030o);
        g2Var.m56421x73095078(((r45.d71) fVar).m75934xbce7f2f(2));
        g2Var.m56419xdac5ee4d(z17);
        if (n0Var2.f105030o == 0 && (m56409x97891cf7 = g2Var.m56409x97891cf7()) != null) {
        }
        return g2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e c13863x5951942e = this.f189381d;
        return new bq.n0(0L, c13863x5951942e.m56357x44e5026c(), 2, c13863x5951942e.f188990d, c13863x5951942e.m56354xfe9224be(), 0, false, 32, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13863x5951942e c13863x5951942e = this.f189381d;
        return new bq.n0(0L, c13863x5951942e.m56357x44e5026c(), 0, c13863x5951942e.f188990d, c13863x5951942e.m56354xfe9224be(), 0, false, 32, null);
    }
}
