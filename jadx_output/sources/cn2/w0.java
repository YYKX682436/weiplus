package cn2;

/* loaded from: classes3.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f43629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.y0 f43630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(cn2.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43630e = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cn2.w0(this.f43630e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f43629d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f43629d = 1;
            if (kotlinx.coroutines.k1.b(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cn2.y0 y0Var = this.f43630e;
        yz5.l lVar = y0Var.f43652l;
        java.lang.String str = y0Var.f43651k;
        if (lVar != null && str != null) {
            lVar.invoke(str);
        }
        y0Var.d();
        return jz5.f0.f302826a;
    }
}
