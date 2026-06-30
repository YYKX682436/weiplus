package c66;

/* loaded from: classes2.dex */
public final class d extends qz5.l implements yz5.p {
    public d(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c66.d(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c66.d dVar = new c66.d((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            int e17 = c01.id.e();
            c66.q qVar = c66.q.f39493a;
            int i17 = e17 - c66.q.f39495c;
            com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "cleanFindTabKaraInfo expireBeforeTime=" + i17);
            ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39504l).getValue()).deleteObjects(ni0.f.f337222e.le(i17));
        } catch (java.lang.Exception unused) {
            c66.q qVar2 = c66.q.f39493a;
            com.tencent.mars.xlog.Log.e("Finder.WCFinderWCDB", "cleanFindTabKaraInfo fail");
        }
        return jz5.f0.f302826a;
    }
}
