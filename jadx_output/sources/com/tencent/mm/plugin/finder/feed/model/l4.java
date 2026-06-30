package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m4 f108147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader f108150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108152i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.finder.feed.model.m4 m4Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108147d = m4Var;
        this.f108148e = y0Var;
        this.f108149f = s3Var;
        this.f108150g = finderMemberFeedLoader;
        this.f108151h = lVar;
        this.f108152i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.m4 m4Var = this.f108147d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108148e;
        ym5.s3 s3Var = this.f108149f;
        m4Var.convertOpToReason(y0Var, s3Var);
        this.f108150g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108151h;
        if (lVar != null) {
            lVar.invoke(this.f108152i);
        }
        return jz5.f0.f302826a;
    }
}
