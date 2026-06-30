package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class na extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f108567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f108568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(com.tencent.mm.plugin.finder.feed.oa oaVar, java.util.ArrayList arrayList) {
        super(0);
        this.f108567d = oaVar;
        this.f108568e = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f108567d;
        gaVar.m(oaVar.f108627m, oaVar.f107155d);
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader) oaVar.f107156e;
        int i17 = com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader.B;
        finderTimelineFeedLoader.g(this.f108568e, null, null, false);
        return jz5.f0.f302826a;
    }
}
