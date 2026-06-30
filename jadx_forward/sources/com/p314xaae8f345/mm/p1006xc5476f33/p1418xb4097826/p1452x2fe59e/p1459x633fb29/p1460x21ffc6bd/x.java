package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public abstract class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: lifeCycleKeeper */
    private im5.c f35744x9a6a2edc = new im5.c();

    /* renamed from: workerScope */
    private final p3325xe03a0797.p3326xc267989b.y0 f35746x39dc7976 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);

    /* renamed from: mainScope */
    private final p3325xe03a0797.p3326xc267989b.y0 f35745xf058f41b = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        this.f35744x9a6a2edc = new im5.c();
    }

    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        this.f35744x9a6a2edc.mo10668x2efc64();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f35746x39dc7976, null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f35745xf058f41b, null, 1, null);
    }

    /* renamed from: dealOnSceneEnd */
    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p944x882e457a.i)) {
            return;
        }
        pq5.g f17 = ((com.p314xaae8f345.mm.p944x882e457a.i) obj).l().f(this.f35744x9a6a2edc);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.v(this, obj, callback);
        f17.K(new gm5.a(vVar) { // from class: com.tencent.mm.plugin.finder.feed.model.internal.w

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.l f189595a;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vVar, "function");
                this.f189595a = vVar;
            }

            @Override // gm5.a
            /* renamed from: call */
            public final /* synthetic */ java.lang.Object mo1059x2e7a5e(java.lang.Object obj2) {
                return this.f189595a.mo146xb9724478(obj2);
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (mo56472x42a6f7e5() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, mo56472x42a6f7e5(), callback, false, 4, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e = mo982xf5b0f48e();
        mo982xf5b0f48e.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(mo982xf5b0f48e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, mo984xd7029bba(), callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchPreload */
    public void mo56463x5a77d9ef(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, mo985x5db54b1a(), callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, mo985x5db54b1a(), callback, false, 4, null);
    }

    /* renamed from: genInitCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo56472x42a6f7e5() {
        return null;
    }

    /* renamed from: genLoadMoreCgi */
    public abstract com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba();

    /* renamed from: genRefreshCgi */
    public abstract com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a();

    /* renamed from: getLifeCycleKeeper */
    public final im5.c m56473x7ecc00a6() {
        return this.f35744x9a6a2edc;
    }

    /* renamed from: getMainScope */
    public final p3325xe03a0797.p3326xc267989b.y0 m56474xefc66565() {
        return this.f35745xf058f41b;
    }

    /* renamed from: getWorkerScope */
    public final p3325xe03a0797.p3326xc267989b.y0 m56475x13b2c040() {
        return this.f35746x39dc7976;
    }

    /* renamed from: setLifeCycleKeeper */
    public final void m56476xb5a29a1a(im5.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.f35744x9a6a2edc = cVar;
    }
}
