package cn2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f43636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f43637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f43638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cn2.k f43639g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cn2.c0 c0Var, android.view.View view, cn2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43637e = c0Var;
        this.f43638f = view;
        this.f43639g = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cn2.y(this.f43637e, this.f43638f, this.f43639g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f43636d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cn2.c0 c0Var = this.f43637e;
            android.view.View view = this.f43638f;
            cn2.k kVar = this.f43639g;
            cn2.h hVar = kVar.f43562f;
            long j17 = hVar.f43529h;
            int i18 = hVar.f43530i;
            boolean z17 = kVar.f43561e;
            this.f43636d = 1;
            obj = cn2.c0.e(c0Var, view, j17, i18, z17, this);
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
