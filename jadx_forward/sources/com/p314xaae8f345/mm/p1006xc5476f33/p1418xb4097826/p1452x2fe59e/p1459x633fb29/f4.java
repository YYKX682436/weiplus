package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class f4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13873x49a30532 f189388d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13873x49a30532 c13873x49a30532) {
        this.f189388d = c13873x49a30532;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.util.List r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f4.b(java.util.List, int, int):java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d4 d4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d4(0, 0, "");
        java.util.List b17 = b(new java.util.ArrayList(), 0, Integer.MAX_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        if (this.f189388d.f189036g) {
            arrayList.add(0, new jo2.d());
        }
        d4Var.m56420x2a5f836b(arrayList);
        return d4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.List j17;
        if (!(iVar instanceof bq.y) || !(fVar instanceof r45.zr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.zr0) fVar).f473849f != 1) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d4 d4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d4(i17, i18, str);
        r45.zr0 zr0Var = (r45.zr0) fVar;
        java.util.LinkedList linkedList = zr0Var.f473847d;
        boolean z18 = linkedList == null || linkedList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13873x49a30532 c13873x49a30532 = this.f189388d;
        if (z18) {
            j17 = kz5.p0.f395529d;
        } else {
            cu2.t tVar = cu2.u.f303974a;
            java.util.LinkedList object = zr0Var.f473847d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object, "object");
            j17 = tVar.j(object, 73728, c13873x49a30532.m56354xfe9224be());
        }
        bq.y yVar = (bq.y) iVar;
        int i19 = yVar.f105071o;
        if ((i19 == 0 || i19 == 2) && j17.isEmpty()) {
            z17 = false;
        }
        if (yVar.f105071o == 0) {
            if (!(j17.isEmpty())) {
                j17 = b(j17, 0, Integer.MAX_VALUE);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        if (c13873x49a30532.f189036g && yVar.f105071o == 0) {
            ((java.util.ArrayList) V0).add(0, new jo2.d());
        }
        d4Var.m56420x2a5f836b(V0);
        if (yVar.f105071o != 2) {
            java.util.List m56409x97891cf7 = d4Var.m56409x97891cf7();
            if (!(m56409x97891cf7 instanceof java.util.List)) {
                m56409x97891cf7 = null;
            }
            if (m56409x97891cf7 != null) {
                cu2.u.f303974a.m(m56409x97891cf7, 73728, "", true);
            }
        }
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf72 = d4Var.m56409x97891cf7();
        sb6.append(m56409x97891cf72 != null ? java.lang.Integer.valueOf(m56409x97891cf72.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        d4Var.m56423xd4b4a5a1(yVar.f105071o);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = zr0Var.f473848e;
        if (gVar != null) {
            byte[] g17 = gVar.g();
            d4Var.m56421x73095078(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(g17, 0, g17.length));
        }
        d4Var.m56419xdac5ee4d(z17);
        return d4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13873x49a30532 c13873x49a30532 = this.f189388d;
        return new bq.y(c13873x49a30532.m56354xfe9224be(), c13873x49a30532.f189033d, c13873x49a30532.m56357x44e5026c(), c13873x49a30532.f189035f, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13873x49a30532 c13873x49a30532 = this.f189388d;
        return new bq.y(c13873x49a30532.m56354xfe9224be(), c13873x49a30532.f189033d, null, c13873x49a30532.f189035f, 0);
    }
}
