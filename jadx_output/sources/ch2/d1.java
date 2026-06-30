package ch2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41309e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ch2.d1 d1Var = new ch2.d1(this.f41309e, continuation);
        d1Var.f41308d = obj;
        return d1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.d1 d1Var = (ch2.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f41308d;
        ch2.o2 o2Var = this.f41309e;
        o2Var.f41419J = kotlinx.coroutines.l.d(y0Var, null, null, new ch2.c1(o2Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
