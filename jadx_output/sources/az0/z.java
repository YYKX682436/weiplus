package az0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16092d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f16094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(az0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16094f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.z zVar = new az0.z(this.f16094f, continuation);
        zVar.f16093e = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16092d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        az0.a0 a0Var = this.f16094f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f16093e;
            boolean z17 = a0Var.f15309a.getCurrentState() == 0;
            java.lang.String str = a0Var.f15311c;
            if (z17) {
                com.tencent.mars.xlog.Log.i(str, "cur state is no need to stop");
                return f0Var;
            }
            kotlinx.coroutines.r2 r2Var = a0Var.f15313e;
            if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
                com.tencent.mars.xlog.Log.i(str, "tryStopPlayJob: cancel startPlay job");
                kotlinx.coroutines.r2 r2Var2 = a0Var.f15313e;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
            }
            com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer = a0Var.f15309a;
            boolean z18 = mJMoviePlayer.getCurrentState() == 5;
            com.tencent.mars.xlog.Log.i(str, "stopPlay, curState=" + mJMoviePlayer.getCurrentState());
            if (!z18) {
                return f0Var;
            }
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, null, null, new az0.y(a0Var, null), 3, null);
            this.f16092d = 1;
            obj = ((kotlinx.coroutines.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(a0Var.f15310b, null, null, new az0.s(a0Var, null), 3, null);
            this.f16092d = 2;
            if (((kotlinx.coroutines.c3) d17).C(this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
