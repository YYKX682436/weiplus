package aq;

/* loaded from: classes4.dex */
public final class h0 extends qz5.l implements yz5.p {
    public h0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.h0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aq.h0 h0Var = new aq.h0((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", per Image to set startTimeStamp");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setClsStartPerTimeStamp >> timeStamp: " + currentTimeMillis);
        f65.m.f259898c = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setOCRStartPerTimeStamp >> timeStamp: " + currentTimeMillis);
        f65.m.f259901f = currentTimeMillis;
        return jz5.f0.f302826a;
    }
}
