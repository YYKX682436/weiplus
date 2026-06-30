package ay1;

/* loaded from: classes2.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay1.l f15200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f15201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ay1.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15200d = lVar;
        this.f15201e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ay1.b(this.f15200d, this.f15201e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ay1.b bVar = (ay1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ay1.m mVar = (ay1.m) this.f15201e.invoke();
        ay1.l lVar = this.f15200d;
        lVar.getClass();
        kotlin.jvm.internal.o.g(mVar, "<set-?>");
        lVar.f15226b = mVar;
        return jz5.f0.f302826a;
    }
}
