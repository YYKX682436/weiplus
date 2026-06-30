package ck1;

/* loaded from: classes4.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck1.s0 f42370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.t0 f42371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ck1.s0 s0Var, ck1.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42370e = s0Var;
        this.f42371f = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ck1.r0(this.f42370e, this.f42371f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck1.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42369d;
        ck1.t0 t0Var = this.f42371f;
        ck1.s0 s0Var = this.f42370e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                s0Var.f42378i.setValue(ck1.o0.f42356d);
                r45.vf7 vf7Var = t0Var.f42382b;
                if (vf7Var != null) {
                    ck1.n0 n0Var = ck1.n0.f42354a;
                    java.lang.String str = t0Var.f42381a.f388193d;
                    java.lang.String str2 = vf7Var.f388193d;
                    java.lang.String str3 = t0Var.f42383c.f378979d;
                    this.f42369d = 1;
                    if (n0Var.d(str, str2, str3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    ck1.n0 n0Var2 = ck1.n0.f42354a;
                    java.lang.String str4 = t0Var.f42381a.f388193d;
                    java.lang.String str5 = t0Var.f42383c.f378979d;
                    this.f42369d = 2;
                    if (n0Var2.c(str4, str5, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1 && i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            t0Var.f42383c.f378981f = 7;
            androidx.lifecycle.j0 j0Var = s0Var.f42374e;
            j0Var.setValue(j0Var.getValue());
            s0Var.f42378i.setValue(ck1.o0.f42357e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onRevokeBtnClick, revoke fail since " + e17);
            s0Var.f42378i.setValue(ck1.o0.f42358f);
        }
        return jz5.f0.f302826a;
    }
}
