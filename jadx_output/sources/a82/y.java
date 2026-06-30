package a82;

/* loaded from: classes12.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.d0 f2233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f2234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a82.d0 d0Var, o72.e2 e2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2233e = d0Var;
        this.f2234f = e2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.y(this.f2233e, this.f2234f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2232d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v65.h d76 = this.f2233e.d7();
            java.lang.String field_dataId = this.f2234f.field_dataId;
            kotlin.jvm.internal.o.f(field_dataId, "field_dataId");
            this.f2232d = 1;
            if (d76.d(field_dataId, this) == aVar) {
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
