package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ep extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f188198d;

    /* renamed from: e, reason: collision with root package name */
    public int f188199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13786x77595290 f188200f;

    public ep(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13786x77595290 c13786x77595290) {
        this.f188200f = c13786x77595290;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13786x77595290.m56353x743e55cc();
        this.f188198d = m56353x743e55cc != null ? m56353x743e55cc.f189834b : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dp dpVar = (i17 == 0 && i18 == 0) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dp.f188114e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dp.f188115f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13786x77595290 c13786x77595290 = this.f188200f;
        c13786x77595290.getClass();
        c13786x77595290.f187640e = dpVar;
        java.util.ArrayList arrayList = null;
        if (!(fVar instanceof r45.cp3) || i17 != 0 || i18 != 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cp cpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cp(c13786x77595290, i17, i18, str);
        r45.cp3 cp3Var = (r45.cp3) fVar;
        java.util.LinkedList<r45.r03> m75941xfb821914 = cp3Var.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.r03 r03Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r03Var);
                arrayList.add(new so2.d5(r03Var));
            }
        }
        cpVar.m56420x2a5f836b(arrayList);
        cpVar.m56419xdac5ee4d(cp3Var.m75939xb282bd08(3) != 0);
        cpVar.m56422x9a5c5d15(this.f188199e == 0);
        cpVar.m56423xd4b4a5a1(this.f188199e);
        this.f188198d = cp3Var.m75934xbce7f2f(2);
        return cpVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13786x77595290 c13786x77595290 = this.f188200f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13786x77595290.m56353x743e55cc();
        if (m56353x743e55cc == null || (obj = m56353x743e55cc.f189833a) == null) {
            obj = kz5.p0.f395529d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "[fetchInit] ret=" + obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cp cpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cp(c13786x77595290, 0, 0, "");
        cpVar.m56420x2a5f836b(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13786x77595290.m56353x743e55cc();
        cpVar.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        cpVar.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(cpVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f188199e = 2;
        super.mo56024xaef8a235(callback, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        return new bq.x0(db2.t4.f309704a.a(10923), this.f188200f.f187639d, this.f188198d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        db2.t4 t4Var = db2.t4.f309704a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13786x77595290 c13786x77595290 = this.f188200f;
        return new bq.x0(t4Var.b(10923, c13786x77595290.m56354xfe9224be()), c13786x77595290.f187639d, this.f188198d);
    }
}
