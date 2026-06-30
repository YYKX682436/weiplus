package a13;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f561d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yz5.l lVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f563f = lVar;
        this.f564g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a13.o oVar = new a13.o(this.f563f, this.f564g, continuation);
        oVar.f562e = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a13.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f561d;
        yz5.l lVar = this.f563f;
        java.lang.String str = this.f564g;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f562e;
                this.f561d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                kotlinx.coroutines.l.d(y0Var, null, null, new mx3.r(nVar, null), 3, null);
                obj = nVar.a();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (!booleanValue) {
                z17 = false;
            }
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17))));
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf rsp: " + str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf error: " + str + ' ' + e17.getMessage());
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        }
        return jz5.f0.f302826a;
    }
}
