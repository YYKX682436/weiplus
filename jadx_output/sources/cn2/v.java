package cn2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f43620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f43621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f43622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cn2.k f43623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cn2.c0 c0Var, android.view.View view, cn2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43621e = c0Var;
        this.f43622f = view;
        this.f43623g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cn2.v(this.f43621e, this.f43622f, this.f43623g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f43620d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f43623g.f43562f.f43526e;
            this.f43620d = 1;
            obj = this.f43621e.f(this.f43622f, j17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
