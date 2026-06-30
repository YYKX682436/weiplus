package c66;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {
    public c(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c66.c(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c66.c cVar = new c66.c((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            c66.q.f39493a.d().deleteObjects(ni0.d.f337210g.le(c01.id.e()));
        } catch (java.lang.Exception unused) {
            c66.q qVar = c66.q.f39493a;
            com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "cleanExpiredLocalBackupCache fail");
        }
        return jz5.f0.f302826a;
    }
}
