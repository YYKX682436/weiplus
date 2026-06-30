package a5;

/* loaded from: classes13.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.work.CoroutineWorker f1405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.work.CoroutineWorker coroutineWorker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1405e = coroutineWorker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a5.k(this.f1405e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1404d;
        androidx.work.CoroutineWorker coroutineWorker = this.f1405e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.f1404d = 1;
                obj = coroutineWorker.h(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            coroutineWorker.f12456m.i((a5.y) obj);
        } catch (java.lang.Throwable th6) {
            coroutineWorker.f12456m.j(th6);
        }
        return jz5.f0.f302826a;
    }
}
