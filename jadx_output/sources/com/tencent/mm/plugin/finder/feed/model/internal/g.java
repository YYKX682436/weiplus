package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.h f107992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f107993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f107994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f107997i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.feed.model.internal.h hVar, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, yz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader) {
        super(0);
        this.f107992d = hVar;
        this.f107993e = y0Var;
        this.f107994f = s3Var;
        this.f107995g = lVar;
        this.f107996h = iResponse;
        this.f107997i = baseFeedLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.h hVar = this.f107992d;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f107993e;
        ym5.s3 s3Var = this.f107994f;
        hVar.convertOpToReason(y0Var, s3Var);
        yz5.l lVar = this.f107995g;
        if (lVar != null) {
            lVar.invoke(this.f107996h);
        }
        this.f107997i.getDispatcher().g(s3Var);
        return jz5.f0.f302826a;
    }
}
