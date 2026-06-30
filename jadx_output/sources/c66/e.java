package c66;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {
    public e(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c66.e(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c66.e eVar = new c66.e((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            int e17 = c01.id.e();
            c66.q qVar = c66.q.f39493a;
            ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39502j).getValue()).deleteObjects(ni0.c.f337203e.le(e17 - c66.q.f39494b));
        } catch (java.lang.Exception unused) {
            c66.q qVar2 = c66.q.f39493a;
            com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "cleanExpiredLocalBackupCache fail");
        }
        return jz5.f0.f302826a;
    }
}
