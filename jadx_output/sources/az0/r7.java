package az0;

/* loaded from: classes5.dex */
public final class r7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(az0.s9 s9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15864e = s9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.r7(this.f15864e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.r7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15863d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginAdjustSpatialDesc");
            az0.s9 s9Var = this.f15864e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f15898n;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                if (az0.s9.a(s9Var)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamSession", "beginAdjustSpatialDesc>> when call is release");
                    return null;
                }
                readLock.unlock();
                com.tencent.maas.camstudio.MJCamSession mJCamSession = s9Var.f15897m;
                if (mJCamSession == null) {
                    return null;
                }
                this.f15863d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                mJCamSession.a(new az0.q7(new az0.g(nVar, "1055", java.lang.System.currentTimeMillis())));
                obj = nVar.a();
                pz5.a aVar2 = pz5.a.f359186d;
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
