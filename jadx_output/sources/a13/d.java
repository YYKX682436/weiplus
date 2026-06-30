package a13;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a13.t tVar, boolean z17, boolean z18, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f539d = tVar;
        this.f540e = z17;
        this.f541f = z18;
        this.f542g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a13.d(this.f539d, this.f540e, this.f541f, this.f542g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a13.d dVar = (a13.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        a13.t tVar = this.f539d;
        b13.m mVar = tVar.f577m;
        if (mVar != null) {
            mVar.H0(this.f540e, new a13.c(this.f541f, tVar, this.f542g));
        }
        return jz5.f0.f302826a;
    }
}
