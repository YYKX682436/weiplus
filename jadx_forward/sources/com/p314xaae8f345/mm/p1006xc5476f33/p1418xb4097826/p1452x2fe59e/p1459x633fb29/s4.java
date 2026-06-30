package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class s4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 f189861d;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401) {
        this.f189861d = c13875x75a8b401;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t4 t4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t4(0, 0, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401 = this.f189861d;
        java.util.List m56498x2ace505d = m56498x2ace505d(arrayList, c13875x75a8b401.f189045d, 0, Integer.MAX_VALUE);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = m56498x2ace505d.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        if (c13875x75a8b401.f189049h) {
            arrayList2.add(0, new jo2.d());
        }
        t4Var.m56420x2a5f836b(arrayList2);
        return t4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        boolean z17;
        java.lang.String str2;
        if (!(iVar instanceof bq.b1) || !(fVar instanceof r45.hg2)) {
            return null;
        }
        if (i17 == 0 && i18 == 0) {
            r45.ig2 ig2Var = ((r45.hg2) fVar).f457666d;
            z17 = ig2Var != null ? ig2Var.f458547e : false;
        } else {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t4 t4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t4(i17, i18, str);
        r45.hg2 hg2Var = (r45.hg2) fVar;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> objects = hg2Var.f457667e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(objects, "objects");
        java.util.List arrayList = new java.util.ArrayList(kz5.d0.q(objects, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : objects) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 73728));
        }
        bq.b1 b1Var = (bq.b1) iVar;
        int i19 = b1Var.f105011o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401 = this.f189861d;
        if (i19 == 0) {
            arrayList = m56498x2ace505d(arrayList, c13875x75a8b401.f189046e, 0, Integer.MAX_VALUE);
        }
        int i27 = b1Var.f105011o;
        if ((i27 == 0 || i27 == 2) && arrayList.isEmpty()) {
            z17 = false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        if (c13875x75a8b401.f189049h && b1Var.f105011o == 0) {
            ((java.util.ArrayList) V0).add(0, new jo2.d());
        }
        t4Var.m56420x2a5f836b(V0);
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList objects2 = hg2Var.f457667e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(objects2, "objects");
        tVar.j(objects2, 73728, c13875x75a8b401.m56354xfe9224be());
        if (b1Var.f105011o != 2) {
            java.util.List m56409x97891cf7 = t4Var.m56409x97891cf7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56409x97891cf7, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
            tVar.m(m56409x97891cf7, 73728, "", true);
        }
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf72 = t4Var.m56409x97891cf7();
        sb6.append(m56409x97891cf72 != null ? java.lang.Integer.valueOf(m56409x97891cf72.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        t4Var.m56423xd4b4a5a1(b1Var.f105011o);
        r45.ig2 ig2Var2 = hg2Var.f457666d;
        if (ig2Var2 != null && (str2 = ig2Var2.f458546d) != null) {
            byte[] bytes = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            t4Var.m56421x73095078(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        }
        t4Var.m56419xdac5ee4d(z17);
        return t4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        byte[] bArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401 = this.f189861d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m56357x44e5026c = c13875x75a8b401.m56357x44e5026c();
        return new bq.b1(c13875x75a8b401.m56354xfe9224be(), c13875x75a8b401.f189045d, c13875x75a8b401.f189046e, (m56357x44e5026c == null || (bArr = m56357x44e5026c.f273689a) == null) ? null : new java.lang.String(bArr, r26.c.f450398a), c13875x75a8b401.f189047f, 0L, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401 = this.f189861d;
        return new bq.b1(c13875x75a8b401.m56354xfe9224be(), c13875x75a8b401.f189045d, c13875x75a8b401.f189046e, null, c13875x75a8b401.f189047f, c13875x75a8b401.f189048g, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[SYNTHETIC] */
    /* renamed from: mergeLocalData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m56498x2ace505d(java.util.List r9, java.lang.String r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s4.m56498x2ace505d(java.util.List, java.lang.String, int, int):java.util.List");
    }
}
