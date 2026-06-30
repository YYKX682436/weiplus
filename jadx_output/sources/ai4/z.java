package ai4;

/* loaded from: classes11.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5205d;

    public z(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ai4.z zVar = new ai4.z(continuation);
        zVar.f5205d = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ai4.z zVar = (ai4.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f5205d;
        ai4.b0 b0Var = ai4.b0.f5123a;
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: msgDataJob start");
        ai4.b0 b0Var2 = ai4.b0.f5123a;
        ai4.b0.a(b0Var2, y0Var, ai4.a.f5115f, new ai4.y(null));
        ai4.b0.a(b0Var2, y0Var, ai4.a.f5116g, new ai4.x(null));
        ai4.b0.a(b0Var2, y0Var, ai4.a.f5117h, new ai4.w(null));
        return jz5.f0.f302826a;
    }
}
