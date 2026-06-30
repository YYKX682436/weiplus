package a03;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f419m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, android.view.ViewGroup viewGroup, a03.h0 h0Var, androidx.lifecycle.o oVar, java.lang.String str, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f414e = context;
        this.f415f = viewGroup;
        this.f416g = h0Var;
        this.f417h = oVar;
        this.f418i = str;
        this.f419m = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a03.e0(this.f414e, this.f415f, this.f416g, this.f417h, this.f418i, this.f419m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f413d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p40.a aVar2 = new p40.a(this.f414e, this.f415f);
            a03.h0 h0Var = this.f416g;
            androidx.lifecycle.o oVar = this.f417h;
            java.lang.String str = this.f418i;
            yz5.a aVar3 = this.f419m;
            this.f413d = 1;
            if (a03.h0.aj(h0Var, aVar2, oVar, str, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
