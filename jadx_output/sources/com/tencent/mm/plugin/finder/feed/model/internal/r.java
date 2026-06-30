package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f108043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(0);
        this.f108043d = baseFeedLoader;
        this.f108044e = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.p0 a17;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f108043d;
        a17 = baseFeedLoader.a();
        a17.fetchPreload(new com.tencent.mm.plugin.finder.feed.model.internal.q(baseFeedLoader, this.f108044e));
        return jz5.f0.f302826a;
    }
}
