package bg2;

/* loaded from: classes3.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20299d;

    /* renamed from: e, reason: collision with root package name */
    public int f20300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f20301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(bg2.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20301f = n2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.m2(this.f20301f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20300e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bg2.n2 n2Var = this.f20301f;
            this.f20299d = n2Var;
            this.f20300e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new bg2.l2(n2Var));
            if (rVar.j() == aVar) {
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
