package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.i9 f107919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader f107922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107923h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107924i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(com.tencent.mm.plugin.finder.feed.model.i9 i9Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107919d = i9Var;
        this.f107920e = y0Var;
        this.f107921f = s3Var;
        this.f107922g = finderTopicFeedLoader;
        this.f107923h = lVar;
        this.f107924i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.i9 i9Var = this.f107919d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107920e;
        ym5.s3 s3Var = this.f107921f;
        i9Var.convertOpToReason(y0Var, s3Var);
        this.f107922g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107923h;
        if (lVar != null) {
            lVar.invoke(this.f107924i);
        }
        return jz5.f0.f302826a;
    }
}
