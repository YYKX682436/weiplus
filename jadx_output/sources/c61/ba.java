package c61;

/* loaded from: classes10.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f38899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f38900e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f38901f;

    /* renamed from: g, reason: collision with root package name */
    public int f38902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.h0 f38903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f38905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f38906n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(kv.h0 h0Var, java.lang.String str, kotlin.jvm.internal.c0 c0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f38903h = h0Var;
        this.f38904i = str;
        this.f38905m = c0Var;
        this.f38906n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.ba(this.f38903h, this.f38904i, this.f38905m, this.f38906n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ba) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f38902g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kv.h0 h0Var = this.f38903h;
            this.f38899d = h0Var;
            java.lang.String str = this.f38904i;
            this.f38900e = str;
            kotlin.jvm.internal.c0 c0Var = this.f38905m;
            this.f38901f = c0Var;
            this.f38902g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            ((com.tencent.mm.modelavatar.m0) h0Var).a(str, new c61.z9(c0Var, str, this.f38906n, rVar));
            rVar.m(new c61.aa(c0Var));
            obj = rVar.j();
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
