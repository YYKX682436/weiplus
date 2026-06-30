package az0;

/* loaded from: classes5.dex */
public final class a3 extends qz5.l implements yz5.p {
    public a3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.a3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        az0.a3 a3Var = new az0.a3((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (az0.i5.f15560d == az0.x2.f16040g) {
            az0.i5.d(az0.i5.f15557a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "awaitRelease - not in RELEASING state");
        }
        return jz5.f0.f302826a;
    }
}
