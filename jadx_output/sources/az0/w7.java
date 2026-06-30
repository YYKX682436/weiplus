package az0;

/* loaded from: classes5.dex */
public final class w7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16017d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16018e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16019f;

    /* renamed from: g, reason: collision with root package name */
    public int f16020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16021h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f16022i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamTemplateOverridingParams f16023m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(java.lang.String str, az0.s9 s9Var, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16021h = str;
        this.f16022i = s9Var;
        this.f16023m = mJCamTemplateOverridingParams;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.w7(this.f16021h, this.f16022i, this.f16023m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.w7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16020g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginUseTemplateV2 >> ");
            java.lang.String str = this.f16021h;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", sb6.toString());
            az0.s9 s9Var = this.f16022i;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f15898n;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (az0.s9.a(s9Var)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamSession", "beginUseTemplateV2 >> when call is release");
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("when call is release"))));
                }
                readLock.unlock();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams = this.f16023m;
                this.f16017d = mJCamTemplateOverridingParams;
                this.f16018e = s9Var;
                this.f16019f = str;
                this.f16020g = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                az0.v7 v7Var = new az0.v7(nVar, currentTimeMillis);
                if (mJCamTemplateOverridingParams == null) {
                    com.tencent.maas.camstudio.MJCamSession mJCamSession = s9Var.f15897m;
                    if (mJCamSession != null) {
                        mJCamSession.f(str, v7Var);
                    }
                } else {
                    com.tencent.maas.camstudio.MJCamSession mJCamSession2 = s9Var.f15897m;
                    if (mJCamSession2 != null) {
                        mJCamSession2.g(str, mJCamTemplateOverridingParams, v7Var);
                    }
                }
                obj = nVar.a();
                if (obj == aVar) {
                    return aVar;
                }
            } finally {
                readLock.unlock();
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
