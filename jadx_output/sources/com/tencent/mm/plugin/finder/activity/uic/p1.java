package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f101936d;

    /* renamed from: e, reason: collision with root package name */
    public int f101937e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC f101939g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101939g = finderActivityTabUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.activity.uic.p1 p1Var = new com.tencent.mm.plugin.finder.activity.uic.p1(this.f101939g, continuation);
        p1Var.f101938f = obj;
        return p1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.activity.uic.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f101937e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f101938f;
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            com.tencent.mars.xlog.Log.i("FinderActivityTabUIC", "CgiFutureTask");
            long c17 = c01.id.c();
            com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC = this.f101939g;
            com.tencent.mm.plugin.finder.activity.uic.o1 o1Var = new com.tencent.mm.plugin.finder.activity.uic.o1(finderActivityTabUIC);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            u92.e eVar = new u92.e(o1Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), finderActivityTabUIC.getActivity(), null, 8, null);
            this.f101938f = c0Var2;
            this.f101936d = c17;
            this.f101937e = 1;
            obj = ay1.l.k(eVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            j17 = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f101936d;
            c0Var = (kotlin.jvm.internal.c0) this.f101938f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderActivityTabUIC", "CgiFutureTask:" + (c01.id.c() - j17));
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC2 = this.f101939g;
        pf5.e.launchUI$default(finderActivityTabUIC2, null, null, new com.tencent.mm.plugin.finder.activity.uic.n1((com.tencent.mm.modelbase.f) obj, finderActivityTabUIC2, c0Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
