package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class d6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13884x43b46631 f189334d;

    public d6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13884x43b46631 c13884x43b46631) {
        this.f189334d = c13884x43b46631;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e6 e6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e6(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13884x43b46631 c13884x43b46631 = this.f189334d;
        e6Var.m56420x2a5f836b(c13884x43b46631.f189110f);
        e6Var.m56421x73095078(c13884x43b46631.f189111g);
        return e6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        nr2.m d17;
        if (!(iVar instanceof bq.n) || !(fVar instanceof r45.yz0)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e6 e6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e6(i17, i18, str);
        r45.yz0 yz0Var = (r45.yz0) fVar;
        e6Var.m56419xdac5ee4d(yz0Var.m75939xb282bd08(3) == 1);
        java.util.LinkedList<r45.uz0> m75941xfb821914 = yz0Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCourse_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.uz0 uz0Var : m75941xfb821914) {
            if (uz0Var.m75939xb282bd08(13) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "skip course invalid ".concat(pm0.v.u(uz0Var.m75942xfb822ef2(0))));
                d17 = null;
            } else {
                d17 = cu2.g0.f303937a.d(uz0Var);
            }
            if (d17 != null) {
                arrayList.add(d17);
            }
        }
        e6Var.m56420x2a5f836b(arrayList);
        java.lang.String m75945x2fec8307 = yz0Var.m75945x2fec8307(4);
        if (m75945x2fec8307 != null) {
            byte[] bytes = m75945x2fec8307.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            e6Var.m56421x73095078(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        }
        e6Var.m56423xd4b4a5a1(((bq.n) iVar).f105029o);
        return e6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13884x43b46631 c13884x43b46631 = this.f189334d;
        return new bq.n(c13884x43b46631.f189108d, c13884x43b46631.m56357x44e5026c(), c13884x43b46631.m56354xfe9224be(), 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13884x43b46631 c13884x43b46631 = this.f189334d;
        return new bq.n(c13884x43b46631.f189108d, null, c13884x43b46631.m56354xfe9224be(), 0);
    }
}
