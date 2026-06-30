package ai4;

/* loaded from: classes11.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5201d;

    public v(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ai4.v vVar = new ai4.v(continuation);
        vVar.f5201d = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ai4.v vVar = (ai4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f5201d;
        ai4.b0 b0Var = ai4.b0.f5123a;
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: statusDataJob start");
        ai4.b0 b0Var2 = ai4.b0.f5123a;
        ai4.b0.a(b0Var2, y0Var, ai4.a.f5113d, new ai4.u(null));
        ai4.b0.a(b0Var2, y0Var, ai4.a.f5114e, new ai4.t(null));
        return jz5.f0.f302826a;
    }
}
