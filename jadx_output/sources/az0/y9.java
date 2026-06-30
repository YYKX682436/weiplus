package az0;

/* loaded from: classes5.dex */
public final class y9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16084f;

    /* renamed from: g, reason: collision with root package name */
    public int f16085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.xb f16087i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamTemplateOverridingParams f16088m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(java.lang.String str, az0.xb xbVar, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16086h = str;
        this.f16087i = xbVar;
        this.f16088m = mJCamTemplateOverridingParams;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.y9(this.f16086h, this.f16087i, this.f16088m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.y9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16085g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginUseTemplateV2 >> ");
            java.lang.String str = this.f16086h;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", sb6.toString());
            az0.xb xbVar = this.f16087i;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = xbVar.f16061m;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (xbVar.P0()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamoSession", "beginUseTemplateV2 >> when call is release");
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("when call is release"))));
                }
                readLock.unlock();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams = this.f16088m;
                this.f16082d = mJCamTemplateOverridingParams;
                this.f16083e = xbVar;
                this.f16084f = str;
                this.f16085g = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                az0.x9 x9Var = new az0.x9(nVar, currentTimeMillis);
                if (mJCamTemplateOverridingParams == null) {
                    com.tencent.maas.camstudio.MJCamoSession mJCamoSession = xbVar.f16060i;
                    if (mJCamoSession != null) {
                        mJCamoSession.f(str, x9Var);
                    }
                } else {
                    com.tencent.maas.camstudio.MJCamoSession mJCamoSession2 = xbVar.f16060i;
                    if (mJCamoSession2 != null) {
                        mJCamoSession2.g(str, mJCamTemplateOverridingParams, x9Var);
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
