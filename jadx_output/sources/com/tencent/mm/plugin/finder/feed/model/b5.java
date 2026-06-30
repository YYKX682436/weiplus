package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.c5 f107725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader f107728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107729h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107730i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.plugin.finder.feed.model.c5 c5Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107725d = c5Var;
        this.f107726e = y0Var;
        this.f107727f = s3Var;
        this.f107728g = finderMixAllFeedLoader;
        this.f107729h = lVar;
        this.f107730i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.c5 c5Var = this.f107725d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107726e;
        ym5.s3 s3Var = this.f107727f;
        c5Var.convertOpToReason(y0Var, s3Var);
        this.f107728g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107729h;
        if (lVar != null) {
            lVar.invoke(this.f107730i);
        }
        return jz5.f0.f302826a;
    }
}
