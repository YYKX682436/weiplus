package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.x1 f108351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f108352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f108355h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f108356i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.finder.feed.model.x1 x1Var, com.tencent.mm.modelbase.f fVar, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, long j17, com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108351d = x1Var;
        this.f108352e = fVar;
        this.f108353f = obj;
        this.f108354g = n0Var;
        this.f108355h = j17;
        this.f108356i = finderFeedShareRelativeListLoader;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.t1(this.f108351d, this.f108352e, this.f108353f, this.f108354g, this.f108355h, this.f108356i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.model.t1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.x1 x1Var = this.f108351d;
        com.tencent.mm.modelbase.f fVar = this.f108352e;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        java.lang.Object obj2 = this.f108353f;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd = x1Var.dealOnSceneEnd(i17, i18, str, (com.tencent.mm.modelbase.i) obj2, fVar.f70618d);
        if (dealOnSceneEnd != null) {
            this.f108354g.onFetchDone(dealOnSceneEnd);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f108355h;
        boolean z17 = fVar.f70615a == 0 && fVar.f70616b == 0;
        yz5.q qVar = this.f108356i.H;
        if (qVar == null) {
            return null;
        }
        qVar.invoke(new java.lang.Integer(((db2.t0) obj2).f228162z), new java.lang.Integer((int) currentTimeMillis), java.lang.Boolean.valueOf(z17));
        return jz5.f0.f302826a;
    }
}
