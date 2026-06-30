package a13;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a13.t tVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f559e = tVar;
        this.f560f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a13.n(this.f559e, this.f560f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a13.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f558d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.voip.model.f2 f2Var = this.f559e.f579o;
                java.lang.String str = this.f560f;
                this.f558d = 1;
                f2Var.getClass();
                obj = mx3.f0.b(str, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            vx3.i iVar = (vx3.i) obj;
            if (iVar.f441296m != vx3.g.f441280g) {
                c13.b0.f37860d.m(iVar);
            } else {
                c13.b0.f37860d.m(null);
            }
        } catch (java.lang.Exception unused) {
            c13.b0.f37860d.m(null);
        }
        return jz5.f0.f302826a;
    }
}
