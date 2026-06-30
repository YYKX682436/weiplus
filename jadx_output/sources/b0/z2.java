package b0;

/* loaded from: classes14.dex */
public final class z2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ float f16621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f16622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16623f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(n0.v2 v2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f16622e = v2Var;
        this.f16623f = e5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float floatValue = ((java.lang.Number) obj2).floatValue();
        b0.z2 z2Var = new b0.z2(this.f16622e, this.f16623f, (kotlin.coroutines.Continuation) obj3);
        z2Var.f16621d = floatValue;
        jz5.f0 f0Var = jz5.f0.f302826a;
        z2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.d(((o1.e) this.f16622e.getValue()).d(), null, null, new b0.y2(this.f16623f, this.f16621d, null), 3, null);
        return jz5.f0.f302826a;
    }
}
