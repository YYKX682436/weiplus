package ap1;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f12737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ap1.w wVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12736e = wVar;
        this.f12737f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ap1.s(this.f12736e, this.f12737f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12735d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f12736e.f12754n;
            if (r2Var == null) {
                kotlin.jvm.internal.o.o("contactHelperInitJob");
                throw null;
            }
            this.f12735d = 1;
            if (r2Var.C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f12737f.invoke();
        return jz5.f0.f302826a;
    }
}
