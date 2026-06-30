package az0;

/* loaded from: classes5.dex */
public final class oc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f15789f;

    /* renamed from: g, reason: collision with root package name */
    public int f15790g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15791h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15792i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15793m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15794n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(yz5.p pVar, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15792i = pVar;
        this.f15793m = str;
        this.f15794n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.oc ocVar = new az0.oc(this.f15792i, this.f15793m, this.f15794n, continuation);
        ocVar.f15791h = obj;
        return ocVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.oc) create((u26.r0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        u26.r0 r0Var;
        com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo;
        long j17;
        kotlinx.coroutines.r rVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15790g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r0Var = (u26.r0) this.f15791h;
            java.lang.String str = this.f15793m;
            yz5.l lVar = this.f15794n;
            this.f15791h = r0Var;
            yz5.p pVar = this.f15792i;
            this.f15787d = pVar;
            this.f15788e = str;
            this.f15789f = lVar;
            this.f15790g = 1;
            kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar2.k();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo2 = (com.tencent.maas.instamovie.MJAsyncTaskInfo) pVar.invoke(new az0.lc(r0Var, str), new az0.mc(rVar2, str, currentTimeMillis));
            if ((mJAsyncTaskInfo2 != null ? mJAsyncTaskInfo2.f48104a : null) == null || !rVar2.n()) {
                mJAsyncTaskInfo = mJAsyncTaskInfo2;
                j17 = currentTimeMillis;
                rVar = rVar2;
            } else {
                bz0.b bVar = bz0.b.f36724a;
                com.tencent.maas.instamovie.base.MJError error = mJAsyncTaskInfo2.f48104a;
                kotlin.jvm.internal.o.f(error, "error");
                mJAsyncTaskInfo = mJAsyncTaskInfo2;
                j17 = currentTimeMillis;
                rVar = rVar2;
                bz0.b.b(bVar, str, error, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new az0.p7(mJAsyncTaskInfo.f48104a))));
            }
            rVar.m(new az0.kc(str, j17, lVar, mJAsyncTaskInfo));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            r0Var = (u26.r0) this.f15791h;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        u26.q0 q0Var = (u26.q0) r0Var;
        q0Var.getClass();
        u26.x0.a(q0Var, null, 1, null);
        az0.nc ncVar = new az0.nc(this.f15793m);
        this.f15791h = null;
        this.f15787d = null;
        this.f15788e = null;
        this.f15789f = null;
        this.f15790g = 2;
        if (u26.p0.a(r0Var, ncVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
