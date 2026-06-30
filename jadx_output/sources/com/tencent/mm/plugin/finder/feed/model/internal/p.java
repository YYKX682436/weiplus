package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f108039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f108040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, boolean z17) {
        super(1);
        this.f108039d = baseFeedLoader;
        this.f108040e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.feed.model.internal.p0 a17;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f108039d;
        if (iResponse != null) {
            com.tencent.mars.xlog.Log.i(baseFeedLoader.getTAG(), "requestLoadMore hit cache");
            baseFeedLoader.onFetchDone(iResponse);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            boolean z17 = this.f108040e;
            a17 = baseFeedLoader.a();
            a17.fetchLoadMore(baseFeedLoader, z17);
        }
        return f0Var2;
    }
}
