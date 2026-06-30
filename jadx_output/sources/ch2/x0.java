package ch2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41490e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ch2.x0 x0Var = new ch2.x0(this.f41490e, continuation);
        x0Var.f41489d = obj;
        return x0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.x0 x0Var = (ch2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f41489d;
        ch2.o2 o2Var = this.f41490e;
        o2Var.N = kotlinx.coroutines.l.d(y0Var, null, null, new ch2.w0(o2Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
