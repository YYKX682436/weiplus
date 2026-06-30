package az0;

/* loaded from: classes5.dex */
public final class q9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(az0.s9 s9Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15844e = s9Var;
        this.f15845f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.q9(this.f15844e, this.f15845f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.q9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15843d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "stopRecording");
            az0.s9 s9Var = this.f15844e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f15898n;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (az0.s9.a(s9Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "stopRecording>> when main call is release");
                    return null;
                }
                readLock.unlock();
                com.tencent.maas.camstudio.MJCamSession mJCamSession = s9Var.f15897m;
                if (mJCamSession == null) {
                    return null;
                }
                az0.p9 p9Var = new az0.p9(this.f15845f);
                this.f15843d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                p9Var.invoke(mJCamSession, new az0.g(nVar, "1034", java.lang.System.currentTimeMillis()));
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
