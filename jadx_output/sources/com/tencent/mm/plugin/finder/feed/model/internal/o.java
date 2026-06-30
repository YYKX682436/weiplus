package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f108038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader) {
        super(0);
        this.f108038d = baseFeedLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.p0 a17;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f108038d;
        a17 = baseFeedLoader.a();
        a17.fetchInit(baseFeedLoader);
        return jz5.f0.f302826a;
    }
}
