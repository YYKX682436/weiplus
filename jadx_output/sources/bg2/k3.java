package bg2;

/* loaded from: classes2.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(long j17, bg2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20245e = j17;
        this.f20246f = z3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.k3(this.f20245e, this.f20246f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20244d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f20244d = 1;
            if (kotlinx.coroutines.k1.b(this.f20245e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bg2.z3 z3Var = this.f20246f;
        android.view.ViewGroup viewGroup = z3Var.f20692m;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        z3Var.f20705z = true;
        return jz5.f0.f302826a;
    }
}
