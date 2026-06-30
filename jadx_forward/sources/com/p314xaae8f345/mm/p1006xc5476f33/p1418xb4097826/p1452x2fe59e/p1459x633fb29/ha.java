package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class ha extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f189458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f189459e = new java.lang.ref.WeakReference(null);

    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ha r16, db2.l2 r17, com.p314xaae8f345.mm.p944x882e457a.f r18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 r19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 r20) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ha.b(com.tencent.mm.plugin.finder.feed.model.ha, db2.l2, com.tencent.mm.modelbase.f, com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) this.f189459e.get();
        if (c13879x1453fa95 != null) {
            c13879x1453fa95.m56357x44e5026c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b0();
        b0Var.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(b0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) this.f189459e.get();
        if (c13879x1453fa95 == null) {
            return;
        }
        r45.f96 f96Var = c13879x1453fa95.f189068e;
        zy2.o9 o9Var = c13879x1453fa95.f189069f;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, c13879x1453fa95.m56357x44e5026c(), c13879x1453fa95.f189070g, c13879x1453fa95.m56354xfe9224be(), c13879x1453fa95.f189071h, c13879x1453fa95.f189073m, c13879x1453fa95.f189074n, c13879x1453fa95.f189084x);
        l2Var.f309589w = 2;
        l2Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.fa(this, l2Var, c13879x1453fa95, callback));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) this.f189459e.get();
        if (c13879x1453fa95 == null) {
            return;
        }
        r45.f96 f96Var = c13879x1453fa95.f189068e;
        zy2.o9 o9Var = c13879x1453fa95.f189069f;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, c13879x1453fa95.m56357x44e5026c(), c13879x1453fa95.f189070g, c13879x1453fa95.m56354xfe9224be(), c13879x1453fa95.f189071h, c13879x1453fa95.f189073m, c13879x1453fa95.f189074n, c13879x1453fa95.f189084x);
        l2Var.f309589w = 0;
        l2Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ga(this, l2Var, c13879x1453fa95, callback));
    }
}
