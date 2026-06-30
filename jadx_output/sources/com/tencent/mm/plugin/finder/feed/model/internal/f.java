package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.h f107983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f107986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107987h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107988i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.feed.model.internal.h hVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f107983d = hVar;
        this.f107984e = y0Var;
        this.f107985f = s3Var;
        this.f107986g = baseFeedLoader;
        this.f107987h = lVar;
        this.f107988i = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.h hVar = this.f107983d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107984e;
        ym5.s3 s3Var = this.f107985f;
        hVar.convertOpToReason(y0Var, s3Var);
        com.tencent.mm.plugin.finder.feed.model.internal.j0.f(this.f107986g.getDispatcher(), s3Var, false, 2, null);
        yz5.l lVar = this.f107987h;
        if (lVar != null) {
            lVar.invoke(this.f107988i);
        }
        return jz5.f0.f302826a;
    }
}
