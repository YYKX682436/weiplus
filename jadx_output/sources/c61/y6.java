package c61;

/* loaded from: classes3.dex */
public final class y6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f39424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f39427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39428h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(c61.l7 l7Var, android.content.Context context, r45.br2 br2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39425e = l7Var;
        this.f39426f = context;
        this.f39427g = br2Var;
        this.f39428h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.y6(this.f39425e, this.f39426f, this.f39427g, this.f39428h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.y6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f39424d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.l7 l7Var = this.f39425e;
            android.content.Context context = this.f39426f;
            r45.br2 br2Var = this.f39427g;
            java.lang.String str = this.f39428h;
            this.f39424d = 1;
            if (zy2.b6.b9(l7Var, context, br2Var, null, str, false, false, this, 48, null) == aVar) {
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
