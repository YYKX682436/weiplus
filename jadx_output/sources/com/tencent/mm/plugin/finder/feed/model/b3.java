package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.c3 f107717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader f107720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107721h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107722i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.plugin.finder.feed.model.c3 c3Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107717d = c3Var;
        this.f107718e = y0Var;
        this.f107719f = s3Var;
        this.f107720g = finderLbsStreamFeedLoader;
        this.f107721h = lVar;
        this.f107722i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.c3 c3Var = this.f107717d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107718e;
        ym5.s3 s3Var = this.f107719f;
        c3Var.convertOpToReason(y0Var, s3Var);
        this.f107720g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107721h;
        if (lVar != null) {
            lVar.invoke(this.f107722i);
        }
        return jz5.f0.f302826a;
    }
}
