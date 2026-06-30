package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f108402d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f108403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f108404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.x1 f108406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108407i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f108409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.x1 x1Var, fp0.r rVar, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108404f = finderFeedShareRelativeListLoader;
        this.f108405g = obj;
        this.f108406h = x1Var;
        this.f108407i = rVar;
        this.f108408m = n0Var;
        this.f108409n = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.feed.model.v1 v1Var = new com.tencent.mm.plugin.finder.feed.model.v1(this.f108404f, this.f108405g, this.f108406h, this.f108407i, this.f108408m, this.f108409n, continuation);
        v1Var.f108403e = obj;
        return v1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.model.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f108402d;
        fp0.r rVar = this.f108407i;
        com.tencent.mm.plugin.finder.feed.model.x1 x1Var = this.f108406h;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f108403e;
                yz5.l lVar = this.f108404f.G;
                java.lang.Object obj2 = this.f108405g;
                if (lVar != null) {
                    lVar.invoke(new java.lang.Integer(((db2.t0) obj2).f228162z));
                }
                com.tencent.mars.xlog.Log.i(x1Var.getTAG(), "start request");
                com.tencent.mm.plugin.finder.feed.model.u1 u1Var = new com.tencent.mm.plugin.finder.feed.model.u1(obj2, x1Var);
                oz5.l f11582e = y0Var.getF11582e();
                int i18 = kotlinx.coroutines.r2.O0;
                as2.c cVar = new as2.c(u1Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null, 4, null);
                this.f108402d = 1;
                obj = ay1.l.j(cVar, false, this, 1, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    rVar.b(fp0.u.f265290f);
                    return jz5.f0.f302826a;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
            oz5.l f11582e2 = x1Var.getMainScope().getF11582e();
            com.tencent.mm.plugin.finder.feed.model.t1 t1Var = new com.tencent.mm.plugin.finder.feed.model.t1(this.f108406h, fVar, this.f108405g, this.f108408m, this.f108409n, this.f108404f, null);
            this.f108402d = 2;
            if (kotlinx.coroutines.l.g(f11582e2, t1Var, this) == aVar) {
                return aVar;
            }
            rVar.b(fp0.u.f265290f);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            rVar.b(fp0.u.f265290f);
            throw th6;
        }
    }
}
