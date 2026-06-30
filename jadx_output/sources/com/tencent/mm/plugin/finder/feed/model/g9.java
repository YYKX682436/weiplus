package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.i9 f107889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader f107892g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107893h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107894i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.tencent.mm.plugin.finder.feed.model.i9 i9Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107889d = i9Var;
        this.f107890e = y0Var;
        this.f107891f = s3Var;
        this.f107892g = finderTopicFeedLoader;
        this.f107893h = lVar;
        this.f107894i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.i9 i9Var = this.f107889d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107890e;
        ym5.s3 s3Var = this.f107891f;
        i9Var.convertOpToReason(y0Var, s3Var);
        com.tencent.mm.plugin.finder.feed.model.internal.j0.f(this.f107892g.getDispatcher(), s3Var, false, 2, null);
        yz5.l lVar = this.f107893h;
        if (lVar != null) {
            lVar.invoke(this.f107894i);
        }
        return jz5.f0.f302826a;
    }
}
