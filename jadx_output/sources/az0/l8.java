package az0;

/* loaded from: classes5.dex */
public final class l8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(az0.s9 s9Var, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15671e = s9Var;
        this.f15672f = str;
        this.f15673g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.l8(this.f15671e, this.f15672f, this.f15673g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.l8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15670d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.s9 s9Var = this.f15671e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f15898n;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                com.tencent.maas.camstudio.MJCamSession mJCamSession = s9Var.f15897m;
                boolean a17 = az0.s9.a(s9Var);
                java.lang.String str = this.f15672f;
                if (a17 || mJCamSession == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamSession", str + " >> when call is release");
                    readLock.unlock();
                    return null;
                }
                readLock.unlock();
                this.f15670d = 1;
                obj = az0.j.a(str, this.f15673g, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (java.lang.Throwable th6) {
                readLock.unlock();
                throw th6;
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
