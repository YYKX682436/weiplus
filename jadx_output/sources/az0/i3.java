package az0;

/* loaded from: classes5.dex */
public final class i3 extends qz5.l implements yz5.p {
    public i3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.i3(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new az0.i3((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "new material manager on thread: " + java.lang.Thread.currentThread().getName());
        com.tencent.maas.material.MJMaterialManager l17 = az0.i5.f15557a.q().l(new android.os.Handler(android.os.Looper.getMainLooper()));
        kotlin.jvm.internal.o.f(l17, "newMaterialManager(...)");
        return new az0.k5(l17);
    }
}
