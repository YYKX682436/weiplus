package az0;

/* loaded from: classes5.dex */
public final class x6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f16049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16049e = n7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.x6(this.f16049e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.x6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16048d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.w6 w6Var = new az0.w6(this.f16049e);
            this.f16048d = 1;
            if (az0.rc.d("223", w6Var, this) == aVar) {
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
