package az0;

/* loaded from: classes5.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16072d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16073e;

    /* renamed from: f, reason: collision with root package name */
    public int f16074f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16075g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f16076h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f16077i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJExportSettings f16078m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(az0.n7 n7Var, az0.b0 b0Var, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16076h = n7Var;
        this.f16077i = b0Var;
        this.f16078m = mJExportSettings;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.y5 y5Var = new az0.y5(this.f16076h, this.f16077i, this.f16078m, continuation);
        y5Var.f16075g = obj;
        return y5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.y5) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        kotlin.jvm.internal.c0 c0Var;
        kotlin.jvm.internal.e0 e0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16074f;
        az0.b0 b0Var = this.f16077i;
        az0.n7 n7Var = this.f16076h;
        com.tencent.maas.instamovie.MJExportSettings mJExportSettings = this.f16078m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f16075g;
            c0Var = new kotlin.jvm.internal.c0();
            e0Var = new kotlin.jvm.internal.e0();
            kotlinx.coroutines.flow.l0 l0Var = new kotlinx.coroutines.flow.l0(az0.n7.b(n7Var, b0Var, mJExportSettings, false), new az0.v5(mJExportSettings, c0Var, null));
            az0.w5 w5Var = new az0.w5(e0Var, kVar);
            this.f16075g = kVar;
            this.f16072d = c0Var;
            this.f16073e = e0Var;
            this.f16074f = 1;
            if (l0Var.a(w5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            e0Var = (kotlin.jvm.internal.e0) this.f16073e;
            c0Var = (kotlin.jvm.internal.c0) this.f16072d;
            kVar = (kotlinx.coroutines.flow.k) this.f16075g;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (c0Var.f310112d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasMovieSessionManager", "retry export");
            kotlinx.coroutines.flow.j b17 = az0.n7.b(n7Var, b0Var, mJExportSettings, true);
            az0.x5 x5Var = new az0.x5(e0Var, kVar);
            this.f16075g = null;
            this.f16072d = null;
            this.f16073e = null;
            this.f16074f = 2;
            if (((v26.g) b17).a(x5Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
