package az0;

/* loaded from: classes5.dex */
public final class hc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15541d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15542e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f15543f;

    /* renamed from: g, reason: collision with root package name */
    public int f15544g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15546i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15547m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15548n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(yz5.l lVar, java.lang.String str, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15546i = lVar;
        this.f15547m = str;
        this.f15548n = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.hc hcVar = new az0.hc(this.f15546i, this.f15547m, this.f15548n, continuation);
        hcVar.f15545h = obj;
        return hcVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.hc) create((u26.r0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        u26.r0 r0Var;
        com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo;
        kotlinx.coroutines.r rVar;
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15544g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r0Var = (u26.r0) this.f15545h;
            java.lang.String str = this.f15547m;
            yz5.l lVar2 = this.f15548n;
            this.f15545h = r0Var;
            yz5.l lVar3 = this.f15546i;
            this.f15541d = lVar3;
            this.f15542e = str;
            this.f15543f = lVar2;
            this.f15544g = 1;
            kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar2.k();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo2 = (com.tencent.maas.instamovie.MJAsyncTaskInfo) lVar3.invoke(new az0.fc(r0Var, str));
            com.tencent.maas.instamovie.base.MJError mJError = mJAsyncTaskInfo2.f48104a;
            bz0.b bVar = bz0.b.f36724a;
            if (mJError == null || !rVar2.n()) {
                mJAsyncTaskInfo = mJAsyncTaskInfo2;
                rVar = rVar2;
                lVar = lVar2;
                rVar.s(f0Var, null);
                bz0.b.d(bVar, str, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 4, null);
            } else {
                com.tencent.maas.instamovie.base.MJError error = mJAsyncTaskInfo2.f48104a;
                kotlin.jvm.internal.o.f(error, "error");
                mJAsyncTaskInfo = mJAsyncTaskInfo2;
                rVar = rVar2;
                lVar = lVar2;
                bz0.b.b(bVar, str, error, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new az0.p7(error))));
            }
            rVar.m(new az0.ec(str, currentTimeMillis, lVar, mJAsyncTaskInfo));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0Var = (u26.r0) this.f15545h;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        u26.q0 q0Var = (u26.q0) r0Var;
        q0Var.getClass();
        u26.x0.a(q0Var, null, 1, null);
        az0.gc gcVar = new az0.gc(this.f15547m);
        this.f15545h = null;
        this.f15541d = null;
        this.f15542e = null;
        this.f15543f = null;
        this.f15544g = 2;
        return u26.p0.a(r0Var, gcVar, this) == aVar ? aVar : f0Var;
    }
}
