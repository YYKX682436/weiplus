package ch2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41285e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ch2.a1 a1Var = new ch2.a1(this.f41285e, continuation);
        a1Var.f41284d = obj;
        return a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.a1 a1Var = (ch2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f41284d;
        ch2.o2 o2Var = this.f41285e;
        o2Var.K = kotlinx.coroutines.l.d(y0Var, null, null, new ch2.z0(o2Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
