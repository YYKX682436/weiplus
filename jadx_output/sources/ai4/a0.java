package ai4;

/* loaded from: classes11.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5121e = z17;
        this.f5122f = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ai4.a0 a0Var = new ai4.a0(this.f5121e, this.f5122f, continuation);
        a0Var.f5120d = obj;
        return a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ai4.a0 a0Var = (ai4.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f5120d;
        ai4.b0 b0Var = ai4.b0.f5123a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transferToAffDB: start taskRetryNum=");
        sb6.append(ai4.b0.f5128f);
        sb6.append(", maxTryCount:");
        ai4.b0 b0Var2 = ai4.b0.f5123a;
        sb6.append(b0Var2.e());
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        ai4.b0.f5124b.A(b0Var2.d(), ai4.b0.f5128f + 1);
        if (!this.f5121e) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ai4.v(null), 3, null);
        }
        if (!this.f5122f) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ai4.z(null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
