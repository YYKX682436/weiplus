package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f108035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f108035d = baseFeedLoader;
        this.f108036e = obj;
        this.f108037f = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.feed.model.internal.p0 a17;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f108035d;
        if (iResponse != null) {
            com.tencent.mars.xlog.Log.i(baseFeedLoader.getTAG(), "request hit cache");
            baseFeedLoader.onFetchDone(iResponse);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.Object obj2 = this.f108036e;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var = this.f108037f;
            a17 = baseFeedLoader.a();
            com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(a17, obj2, n0Var, false, 4, null);
        }
        return f0Var2;
    }
}
