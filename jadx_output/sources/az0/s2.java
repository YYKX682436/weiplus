package az0;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j2 f15880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(kotlinx.coroutines.flow.j2 j2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15880e = j2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.s2(this.f15880e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15879d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.l2 l2Var = az0.l2.f15656a;
            this.f15879d = 1;
            obj = l2Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            return f0Var;
        }
        ((kotlinx.coroutines.flow.h3) this.f15880e).k(java.lang.Boolean.TRUE);
        return f0Var;
    }
}
