package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class d3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 f189324d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 c13867x8e7f7db8) {
        this.f189324d = c13867x8e7f7db8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3(0, 0, "", 0, 0, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 c13867x8e7f7db8 = this.f189324d;
        if (c13867x8e7f7db8.f189005d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13867x8e7f7db8.m56353x743e55cc();
            e3Var.m56420x2a5f836b(m56353x743e55cc != null ? m56353x743e55cc.f189833a : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13867x8e7f7db8.m56353x743e55cc();
            e3Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        } else {
            e3Var.m56420x2a5f836b(bu2.d0.i(bu2.e0.f106031a, 2, null, 2, null));
        }
        return e3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.List list;
        java.util.ArrayList arrayList;
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
            boolean z17 = n0Var.f105030o != 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f105031p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb8219142) {
                if (hc2.o0.C((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            cu2.t tVar = cu2.u.f303974a;
            java.util.List j17 = tVar.j(arrayList2, 4, this.f189324d.m56354xfe9224be());
            if (z17 && n0Var.f105033r != 1 && n0Var.f105032q) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(j17, 10));
                java.util.Iterator it = ((java.util.ArrayList) j17).iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
                }
                tVar.m(arrayList3, 4, "", z17);
            }
            list = j17;
        } else {
            list = null;
        }
        boolean z18 = (i17 == 0 && i18 == 0 && ((r45.d71) fVar).m75939xb282bd08(3) != 1) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3(i17, i18, str, 0, 0, 16, null);
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()));
            }
        } else {
            arrayList = null;
        }
        e3Var.m56420x2a5f836b(arrayList);
        e3Var.m56423xd4b4a5a1(((bq.n0) iVar).f105030o);
        r45.d71 d71Var2 = (r45.d71) fVar;
        e3Var.m56421x73095078(d71Var2.m75934xbce7f2f(2));
        e3Var.m56419xdac5ee4d(z18);
        e3Var.f189355a = d71Var2.m75939xb282bd08(4);
        return e3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 c13867x8e7f7db8 = this.f189324d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) c13867x8e7f7db8.m56390x6aa252d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
        return new bq.n0((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : feedObject2.m76765xe2f6ac7(), c13867x8e7f7db8.m56357x44e5026c(), 2, null, c13867x8e7f7db8.m56354xfe9224be(), 0, false, 104, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 c13867x8e7f7db8 = this.f189324d;
        return new bq.n0(0L, c13867x8e7f7db8.m56357x44e5026c(), 1, null, c13867x8e7f7db8.m56354xfe9224be(), 0, false, 104, null);
    }
}
