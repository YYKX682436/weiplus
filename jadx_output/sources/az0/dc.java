package az0;

/* loaded from: classes5.dex */
public final class dc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15416d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15417e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f15418f;

    /* renamed from: g, reason: collision with root package name */
    public int f15419g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15421i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15422m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f15423n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15424o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(yz5.p pVar, java.lang.String str, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15421i = pVar;
        this.f15422m = str;
        this.f15423n = z17;
        this.f15424o = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.dc dcVar = new az0.dc(this.f15421i, this.f15422m, this.f15423n, this.f15424o, continuation);
        dcVar.f15420h = obj;
        return dcVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.dc) create((u26.r0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        u26.r0 r0Var;
        com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo;
        long j17;
        kotlinx.coroutines.r rVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15419g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r0Var = (u26.r0) this.f15420h;
            java.lang.String str = this.f15422m;
            yz5.l lVar = this.f15424o;
            this.f15420h = r0Var;
            yz5.p pVar = this.f15421i;
            this.f15416d = pVar;
            this.f15417e = str;
            this.f15418f = lVar;
            this.f15419g = 1;
            kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar2.k();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.maas.instamovie.MJAsyncTaskInfo mJAsyncTaskInfo2 = (com.tencent.maas.instamovie.MJAsyncTaskInfo) pVar.invoke(new az0.ac(r0Var, str, this.f15423n, rVar2), new az0.bc(rVar2, str, currentTimeMillis));
            if ((mJAsyncTaskInfo2 != null ? mJAsyncTaskInfo2.f48104a : null) == null || !rVar2.n()) {
                mJAsyncTaskInfo = mJAsyncTaskInfo2;
                j17 = currentTimeMillis;
                rVar = rVar2;
            } else {
                com.tencent.mars.xlog.Log.e("MaasFuncUtils", str + " call error");
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
            rVar.m(new az0.zb(str, j17, lVar, mJAsyncTaskInfo));
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
            r0Var = (u26.r0) this.f15420h;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        u26.q0 q0Var = (u26.q0) r0Var;
        q0Var.getClass();
        u26.x0.a(q0Var, null, 1, null);
        az0.cc ccVar = new az0.cc(this.f15422m);
        this.f15420h = null;
        this.f15416d = null;
        this.f15417e = null;
        this.f15418f = null;
        this.f15419g = 2;
        if (u26.p0.a(r0Var, ccVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
