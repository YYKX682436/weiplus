package aj5;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, aj5.r0 r0Var, java.util.List list, kotlinx.coroutines.flow.i2 i2Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5450e = i2Var;
        this.f5451f = hashMap;
        this.f5452g = r0Var;
        this.f5453h = list;
        this.f5454i = i2Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.j0(this.f5450e, this.f5451f, this.f5452g, this.f5453h, this.f5454i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5449d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.i0 i0Var = new aj5.i0(this.f5451f, this.f5452g, this.f5453h, this.f5454i);
            this.f5449d = 1;
            if (this.f5450e.a(i0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
