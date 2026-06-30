package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class s2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public fp0.t f189842d;

    /* renamed from: e, reason: collision with root package name */
    public eb2.b0 f189843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a f189844f;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a) {
        this.f189844f = c13865x4e81e68a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a = this.f189844f;
        this.f189843e = new eb2.b0(2, c13865x4e81e68a.m56354xfe9224be());
        fp0.t tVar = new fp0.t("FinderFollowTlSingleExecutor");
        tVar.e();
        this.f189842d = tVar;
        c13865x4e81e68a.m56354xfe9224be();
        td2.a aVar = td2.a.f499151d;
        td2.a aVar2 = td2.a.f499151d;
        td2.a aVar3 = td2.a.f499151d;
        td2.a aVar4 = td2.a.f499151d;
        new eb2.w(2);
        new im5.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        im5.c cVar;
        super.mo56312x2efc64();
        eb2.b0 b0Var = this.f189843e;
        if (b0Var != null && (cVar = b0Var.f332251m) != null) {
            cVar.mo10668x2efc64();
        }
        fp0.t tVar = this.f189842d;
        if (tVar != null) {
            tVar.mo129985x6761d4f();
        }
        this.f189842d = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        fp0.t tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o2) || (tVar = this.f189842d) == null) {
            return;
        }
        tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r2(this, obj, this.f189844f, callback), null, 2, null));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        eb2.w wVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            linkedList.addAll(bu2.e0.f106031a.k(9));
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_LBS_SECTION_LASTBUF_STRING_SYNC, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17);
            eb2.b0 b0Var = this.f189843e;
            byte[] bArr = null;
            eb2.w wVar2 = b0Var != null ? b0Var.f332250i : null;
            if (wVar2 != null) {
                wVar2.f332391b = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(h17);
            }
            java.lang.String m56464xb5886c64 = m56464xb5886c64();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLbsLoader load init data from FirstPage, size:");
            sb6.append(linkedList.size());
            sb6.append(", lastBuffer:");
            eb2.b0 b0Var2 = this.f189843e;
            if (b0Var2 != null && (wVar = b0Var2.f332250i) != null && (gVar = wVar.f332391b) != null) {
                bArr = gVar.g();
            }
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(m56464xb5886c64(), th6, "lxl FinderLbsLoader load init data exception", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2(0, 0, "");
        n2Var.m56423xd4b4a5a1(1000);
        n2Var.m56420x2a5f836b(linkedList);
        callback.mo55587xb461ee3d(n2Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o2(2), callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o2(4), callback, false, 4, null);
    }
}
