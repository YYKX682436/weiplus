package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class ha extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f107925d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f107926e = new java.lang.ref.WeakReference(null);

    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.tencent.mm.plugin.finder.feed.model.ha r16, db2.l2 r17, com.tencent.mm.modelbase.f r18, com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r19, com.tencent.mm.plugin.finder.feed.model.internal.n0 r20) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.ha.b(com.tencent.mm.plugin.finder.feed.model.ha, db2.l2, com.tencent.mm.modelbase.f, com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) this.f107926e.get();
        if (finderPoiFeedLoader != null) {
            finderPoiFeedLoader.getLastBuffer();
        }
        com.tencent.mm.plugin.finder.feed.model.internal.b0 b0Var = new com.tencent.mm.plugin.finder.feed.model.internal.b0();
        b0Var.setPullType(1000);
        callback.onFetchDone(b0Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) this.f107926e.get();
        if (finderPoiFeedLoader == null) {
            return;
        }
        r45.f96 f96Var = finderPoiFeedLoader.f107535e;
        zy2.o9 o9Var = finderPoiFeedLoader.f107536f;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, finderPoiFeedLoader.getLastBuffer(), finderPoiFeedLoader.f107537g, finderPoiFeedLoader.getContextObj(), finderPoiFeedLoader.f107538h, finderPoiFeedLoader.f107540m, finderPoiFeedLoader.f107541n, finderPoiFeedLoader.f107551x);
        l2Var.f228056w = 2;
        l2Var.l().K(new com.tencent.mm.plugin.finder.feed.model.fa(this, l2Var, finderPoiFeedLoader, callback));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) this.f107926e.get();
        if (finderPoiFeedLoader == null) {
            return;
        }
        r45.f96 f96Var = finderPoiFeedLoader.f107535e;
        zy2.o9 o9Var = finderPoiFeedLoader.f107536f;
        if (f96Var == null || o9Var == null) {
            return;
        }
        db2.l2 l2Var = new db2.l2(f96Var, o9Var, finderPoiFeedLoader.getLastBuffer(), finderPoiFeedLoader.f107537g, finderPoiFeedLoader.getContextObj(), finderPoiFeedLoader.f107538h, finderPoiFeedLoader.f107540m, finderPoiFeedLoader.f107541n, finderPoiFeedLoader.f107551x);
        l2Var.f228056w = 0;
        l2Var.l().K(new com.tencent.mm.plugin.finder.feed.model.ga(this, l2Var, finderPoiFeedLoader, callback));
    }
}
