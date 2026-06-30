package bg2;

/* loaded from: classes2.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f20667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f20668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(bg2.z3 z3Var, r45.kr0 kr0Var, r45.y23 y23Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20666e = z3Var;
        this.f20667f = kr0Var;
        this.f20668g = y23Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.y3(this.f20666e, this.f20667f, this.f20668g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.y3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20665d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f20665d = 1;
            if (bg2.z3.Y6(this.f20666e, this.f20667f, this.f20668g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
