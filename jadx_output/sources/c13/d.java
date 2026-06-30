package c13;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f37873d;

    public d(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c13.d(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new c13.d((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f37873d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.w wVar = c13.b0.f37864h;
            if (wVar != null) {
                this.f37873d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                if (wVar.f354738d == null) {
                    nVar.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
                }
                io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = wVar.f354738d;
                if (basicMessageChannel != null) {
                    basicMessageChannel.send("engine_exit", new pi0.v(nVar));
                }
                java.lang.Object a17 = nVar.a();
                if (a17 != aVar) {
                    a17 = f0Var;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c13.b0.f37864h = null;
        return f0Var;
    }
}
