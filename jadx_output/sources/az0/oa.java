package az0;

/* loaded from: classes5.dex */
public final class oa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(az0.xb xbVar, java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15783e = xbVar;
        this.f15784f = str;
        this.f15785g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.oa(this.f15783e, this.f15784f, this.f15785g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.oa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15782d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.xb xbVar = this.f15783e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = xbVar.f16061m;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                boolean P0 = xbVar.P0();
                java.lang.String str = this.f15784f;
                if (P0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamoSession", str + " >> when call is release");
                    return java.lang.Boolean.FALSE;
                }
                readLock.unlock();
                com.tencent.maas.camstudio.MJCamoSession mJCamoSession = xbVar.f16060i;
                if (mJCamoSession == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f15782d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                this.f15785g.invoke(mJCamoSession, new az0.i(nVar, str, java.lang.System.currentTimeMillis()));
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
