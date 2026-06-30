package az0;

/* loaded from: classes.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16013e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.w4(this.f16013e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.w4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16012d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f16012d = 1;
            obj = this.f16013e.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
