package b92;

/* loaded from: classes.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f18431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f18432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(java.util.ArrayList arrayList, b92.m2 m2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18431d = arrayList;
        this.f18432e = m2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b92.g2(this.f18431d, this.f18432e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b92.g2 g2Var = (b92.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        b92.m2 m2Var = this.f18432e;
        this.f18431d.addAll(m2Var.f18483f);
        m2Var.f18483f.clear();
        return jz5.f0.f302826a;
    }
}
