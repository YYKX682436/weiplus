package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.j5 f107937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f107940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107941h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107942i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.plugin.finder.feed.model.j5 j5Var, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107937d = j5Var;
        this.f107938e = y0Var;
        this.f107939f = s3Var;
        this.f107940g = finderPoiFeedLoader;
        this.f107941h = lVar;
        this.f107942i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.j5 j5Var = this.f107937d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107938e;
        ym5.s3 s3Var = this.f107939f;
        j5Var.convertOpToReason(y0Var, s3Var);
        this.f107940g.getDispatcher().g(s3Var);
        yz5.l lVar = this.f107941h;
        if (lVar != null) {
            lVar.invoke(this.f107942i);
        }
        return jz5.f0.f302826a;
    }
}
