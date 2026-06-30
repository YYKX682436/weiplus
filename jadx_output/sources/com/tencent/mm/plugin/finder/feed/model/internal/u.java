package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.x f108048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f108049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.feed.model.internal.x xVar, com.tencent.mm.modelbase.f fVar, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(0);
        this.f108048d = xVar;
        this.f108049e = fVar;
        this.f108050f = obj;
        this.f108051g = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.x xVar = this.f108048d;
        com.tencent.mm.modelbase.f fVar = this.f108049e;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd = xVar.dealOnSceneEnd(fVar.f70615a, fVar.f70616b, fVar.f70617c, (com.tencent.mm.modelbase.i) this.f108050f, fVar.f70618d);
        if (dealOnSceneEnd != null) {
            this.f108051g.onFetchDone(dealOnSceneEnd);
        }
        return jz5.f0.f302826a;
    }
}
