package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.v4 f108390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108393g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108394h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader f108395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.plugin.finder.feed.model.v4 v4Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader) {
        super(0);
        this.f108390d = v4Var;
        this.f108391e = y0Var;
        this.f108392f = s3Var;
        this.f108393g = lVar;
        this.f108394h = iResponse;
        this.f108395i = finderMemberQAFeedLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.v4 v4Var = this.f108390d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108391e;
        ym5.s3 s3Var = this.f108392f;
        v4Var.convertOpToReason(y0Var, s3Var);
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f108394h;
        yz5.l lVar = this.f108393g;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f108395i;
        finderMemberQAFeedLoader.getDispatcher().g(s3Var);
        yz5.l lVar2 = finderMemberQAFeedLoader.f107519n;
        if (lVar2 != null) {
            lVar2.invoke(iResponse);
        }
        return jz5.f0.f302826a;
    }
}
