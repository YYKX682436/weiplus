package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.m2 f108136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader f108139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108140h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108141i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.finder.feed.model.m2 m2Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f108136d = m2Var;
        this.f108137e = y0Var;
        this.f108138f = s3Var;
        this.f108139g = finderInteractionSearchFeedLoader;
        this.f108140h = lVar;
        this.f108141i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.m2 m2Var = this.f108136d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108137e;
        ym5.s3 s3Var = this.f108138f;
        m2Var.convertOpToReason(y0Var, s3Var);
        this.f108139g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108140h;
        if (lVar != null) {
            lVar.invoke(this.f108141i);
        }
        return jz5.f0.f302826a;
    }
}
