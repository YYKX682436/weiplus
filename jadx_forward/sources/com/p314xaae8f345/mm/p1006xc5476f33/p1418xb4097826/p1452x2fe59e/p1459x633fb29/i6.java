package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class i6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 f189476d;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91) {
        this.f189476d = c13885xb1569e91;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91 = this.f189476d;
        java.lang.String str = c13885xb1569e91.f189113d;
        if (str == null) {
            str = "";
        }
        java.util.ArrayList c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91.c(c13885xb1569e91, arrayList, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "callInit size:" + c17.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h6 h6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h6(0, 0, "", false, 8, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.k0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80) it.next()));
        }
        h6Var.m56420x2a5f836b(arrayList2);
        h6Var.m56421x73095078(null);
        h6Var.m56419xdac5ee4d(true);
        return h6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.ArrayList d17;
        if (!(iVar instanceof bq.o0) || !(fVar instanceof r45.l81)) {
            return null;
        }
        boolean z17 = false;
        boolean z18 = (i17 == 0 && i18 == 0 && ((r45.l81) fVar).f460757f == 0) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h6 h6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h6(i17, i18, str, false, 8, null);
        r45.l81 l81Var = (r45.l81) fVar;
        h6Var.m56419xdac5ee4d(l81Var.f460757f == 1);
        h6Var.m56421x73095078(l81Var.f460756e);
        bq.o0 o0Var = (bq.o0) iVar;
        h6Var.m56423xd4b4a5a1(o0Var.f105034o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209490u).mo141623x754a37bb()).r()).intValue() == 0) {
            h6Var.m56419xdac5ee4d(false);
            d17 = new java.util.ArrayList();
        } else {
            cu2.o oVar = cu2.o.f303963a;
            java.util.LinkedList object = l81Var.f460755d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object, "object");
            d17 = oVar.d(object);
            z17 = z18;
        }
        int i19 = o0Var.f105034o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91 = this.f189476d;
        if (i19 == 1) {
            java.lang.String str2 = c13885xb1569e91.f189113d;
            if (str2 == null) {
                str2 = "";
            }
            d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91.c(c13885xb1569e91, d17, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91.d(c13885xb1569e91, z17, d17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            arrayList.add(new so2.k0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80) it.next()));
        }
        h6Var.m56420x2a5f836b(arrayList);
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.incrementList size:");
        java.util.List m56409x97891cf7 = h6Var.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91 = this.f189476d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xy2.c.f(c13885xb1569e91.m56354xfe9224be()), c13885xb1569e91.f189113d)) {
            return new bq.o0(c13885xb1569e91.f189113d, c13885xb1569e91.m56357x44e5026c(), 2, c13885xb1569e91.m56354xfe9224be());
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13885xb1569e91 c13885xb1569e91 = this.f189476d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xy2.c.f(c13885xb1569e91.m56354xfe9224be()), c13885xb1569e91.f189113d)) {
            return new bq.o0(c13885xb1569e91.f189113d, null, 1, c13885xb1569e91.m56354xfe9224be());
        }
        return null;
    }
}
