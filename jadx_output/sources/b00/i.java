package b00;

/* loaded from: classes9.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16685g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f16686h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.x8 f16687i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b00.r rVar, android.content.Context context, java.lang.String str, com.tencent.mm.storage.f9 f9Var, bw5.x8 x8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16683e = rVar;
        this.f16684f = context;
        this.f16685g = str;
        this.f16686h = f9Var;
        this.f16687i = x8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b00.i(this.f16683e, this.f16684f, this.f16685g, this.f16686h, this.f16687i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b00.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16682d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b00.r rVar = this.f16683e;
            android.content.Context context = this.f16684f;
            java.lang.String str = this.f16685g;
            com.tencent.mm.storage.f9 f9Var = this.f16686h;
            bw5.x8 x8Var = this.f16687i;
            this.f16682d = 1;
            if (rVar.hj(context, str, f9Var, x8Var, this) == aVar) {
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
