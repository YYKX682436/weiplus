package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e1 f107782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader f107785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107786h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107787i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.finder.feed.model.e1 e1Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107782d = e1Var;
        this.f107783e = y0Var;
        this.f107784f = s3Var;
        this.f107785g = finderFavFeedLoader;
        this.f107786h = lVar;
        this.f107787i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.e1 e1Var = this.f107782d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107783e;
        ym5.s3 s3Var = this.f107784f;
        e1Var.convertOpToReason(y0Var, s3Var);
        this.f107785g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107786h;
        if (lVar != null) {
            lVar.invoke(this.f107787i);
        }
        return jz5.f0.f302826a;
    }
}
