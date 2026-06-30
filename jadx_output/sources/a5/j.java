package a5;

/* loaded from: classes13.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1398d;

    /* renamed from: e, reason: collision with root package name */
    public int f1399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a5.u f1400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.work.CoroutineWorker f1401g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a5.u uVar, androidx.work.CoroutineWorker coroutineWorker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1400f = uVar;
        this.f1401g = coroutineWorker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a5.j(this.f1400f, this.f1401g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a5.j jVar = (a5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1399e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f1398d = this.f1400f;
            this.f1399e = 1;
            this.f1401g.getClass();
            throw new java.lang.IllegalStateException("Not implemented");
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a5.u uVar = (a5.u) this.f1398d;
        kotlin.ResultKt.throwOnFailure(obj);
        uVar.f1436d.i(obj);
        return jz5.f0.f302826a;
    }
}
