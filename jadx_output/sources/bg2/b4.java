package bg2;

/* loaded from: classes2.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f19941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f19942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(bg2.h4 h4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19942e = h4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.b4(this.f19942e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f19941d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bg2.h4 h4Var = this.f19942e;
            kotlinx.coroutines.flow.j2 j2Var = h4Var.f20139i;
            if (j2Var == null) {
                return jz5.f0.f302826a;
            }
            bg2.a4 a4Var = new bg2.a4(h4Var);
            this.f19941d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(a4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
