package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.g3 f107849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader f107852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.finder.feed.model.g3 g3Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107849d = g3Var;
        this.f107850e = y0Var;
        this.f107851f = s3Var;
        this.f107852g = finderLikedFeedLoader;
        this.f107853h = lVar;
        this.f107854i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.g3 g3Var = this.f107849d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107850e;
        ym5.s3 s3Var = this.f107851f;
        g3Var.convertOpToReason(y0Var, s3Var);
        this.f107852g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107853h;
        if (lVar != null) {
            lVar.invoke(this.f107854i);
        }
        return jz5.f0.f302826a;
    }
}
