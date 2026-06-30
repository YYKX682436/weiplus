package az0;

/* loaded from: classes5.dex */
public final class m8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15715g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(az0.s9 s9Var, java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15713e = s9Var;
        this.f15714f = str;
        this.f15715g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.m8(this.f15713e, this.f15714f, this.f15715g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.m8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15712d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.s9 s9Var = this.f15713e;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = s9Var.f15898n;
            kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
            readLock.lock();
            try {
                com.tencent.maas.camstudio.MJCamSession mJCamSession = s9Var.f15897m;
                boolean a17 = az0.s9.a(s9Var);
                java.lang.String str = this.f15714f;
                if (a17 || mJCamSession == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamSession", str + " >> when call is release");
                    return java.lang.Boolean.FALSE;
                }
                readLock.unlock();
                com.tencent.maas.camstudio.MJCamSession mJCamSession2 = s9Var.f15897m;
                if (mJCamSession2 == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f15712d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                this.f15715g.invoke(mJCamSession2, new az0.i(nVar, str, java.lang.System.currentTimeMillis()));
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
