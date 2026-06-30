package a03;

/* loaded from: classes8.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a03.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a03.f0(this.f421e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f420d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f420d = 1;
            if (a03.h0.Zi(this.f421e, this) == aVar) {
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
