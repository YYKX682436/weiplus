package ck2;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.dn f42428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f42429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f42430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ck2.o oVar, df2.dn dnVar, r45.f02 f02Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42427e = oVar;
        this.f42428f = dnVar;
        this.f42429g = f02Var;
        this.f42430h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ck2.m(this.f42427e, this.f42428f, this.f42429g, this.f42430h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42426d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.ln lnVar = (df2.ln) this.f42427e.controller(df2.ln.class);
            if (lnVar != null) {
                df2.dn dnVar = this.f42428f;
                r45.f02 f02Var = this.f42429g;
                boolean z17 = pm0.v.z(f02Var.f373881g, 1);
                yz5.l lVar = this.f42430h;
                this.f42426d = 1;
                if (lnVar.b7(dnVar, f02Var, z17, true, lVar, this) == aVar) {
                    return aVar;
                }
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
