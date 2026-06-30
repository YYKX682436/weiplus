package a82;

/* loaded from: classes12.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1958d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f1960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a82.d0 f1961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o72.e2 f1962h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlinx.coroutines.flow.n2 n2Var, a82.d0 d0Var, o72.e2 e2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1960f = n2Var;
        this.f1961g = d0Var;
        this.f1962h = e2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a82.a0 a0Var = new a82.a0(this.f1960f, this.f1961g, this.f1962h, continuation);
        a0Var.f1959e = obj;
        return a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1958d;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((java.lang.Number) obj).longValue();
            return jz5.f0.f302826a;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        o72.e2 e2Var = this.f1962h;
        a82.d0 d0Var = this.f1961g;
        kotlinx.coroutines.flow.n2 n2Var = this.f1960f;
        if (n2Var != null) {
            a82.z zVar = new a82.z(d0Var, e2Var);
            this.f1958d = 1;
            if (n2Var.a(zVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        v65.h d76 = d0Var.d7();
        java.lang.String field_dataId = e2Var.field_dataId;
        kotlin.jvm.internal.o.f(field_dataId, "field_dataId");
        this.f1958d = 2;
        obj = d76.d(field_dataId, this);
        if (obj == aVar) {
            return aVar;
        }
        ((java.lang.Number) obj).longValue();
        return jz5.f0.f302826a;
    }
}
