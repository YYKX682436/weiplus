package ck1;

/* loaded from: classes4.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f42362d;

    /* renamed from: e, reason: collision with root package name */
    public int f42363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.s0 f42364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ck1.s0 s0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42364f = s0Var;
        this.f42365g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ck1.p0(this.f42364f, this.f42365g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck1.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.j0 j0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42363e;
        ck1.s0 s0Var = this.f42364f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.lifecycle.j0 j0Var2 = s0Var.f42374e;
                ck1.n0 n0Var = ck1.n0.f42354a;
                java.lang.String str = this.f42365g;
                this.f42362d = j0Var2;
                this.f42363e = 1;
                java.lang.Object a17 = n0Var.a(str, this);
                if (a17 == aVar) {
                    return aVar;
                }
                j0Var = j0Var2;
                obj = a17;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j0Var = (androidx.lifecycle.j0) this.f42362d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            j0Var.setValue(obj);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.UserInfoRevokeViewModel", "<init>, getUsageInfo fail since " + e17);
            s0Var.f42373d.finish();
        }
        return jz5.f0.f302826a;
    }
}
