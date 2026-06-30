package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.x1 f108264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.model.x1 x1Var) {
        super(1);
        this.f108263d = baseFinderFeed;
        this.f108264e = x1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        long id6 = finderObject.getId();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108263d;
        boolean z17 = id6 == baseFinderFeed.getItemId();
        if (z17) {
            this.f108264e.b(baseFinderFeed, finderObject);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
