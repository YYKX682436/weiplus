package a82;

/* loaded from: classes11.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f2137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2140h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2141i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2143n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2144o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o72.o4 f2145p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o72.n4 f2146q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(a82.u1 u1Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, o72.o4 o4Var, o72.n4 n4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2137e = u1Var;
        this.f2138f = j17;
        this.f2139g = str;
        this.f2140h = str2;
        this.f2141i = str3;
        this.f2142m = i17;
        this.f2143n = str4;
        this.f2144o = str5;
        this.f2145p = o4Var;
        this.f2146q = n4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.q1(this.f2137e, this.f2138f, this.f2139g, this.f2140h, this.f2141i, this.f2142m, this.f2143n, this.f2144o, this.f2145p, this.f2146q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2136d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            a82.u1 u1Var = this.f2137e;
            long j17 = this.f2138f;
            java.lang.String str = this.f2139g;
            java.lang.String str2 = this.f2140h;
            java.lang.String str3 = this.f2141i;
            int i18 = this.f2142m;
            java.lang.String str4 = this.f2143n;
            java.lang.String str5 = this.f2144o;
            o72.o4 o4Var = this.f2145p;
            this.f2136d = 1;
            obj = u1Var.Bi(j17, str, str2, str3, i18, str4, str5, o4Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        o72.p4 p4Var = (o72.p4) obj;
        o72.n4 n4Var = this.f2146q;
        if (n4Var != null) {
            zf0.g gVar = (zf0.g) n4Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", gVar.f472414a.id() + " download fav file path: " + gVar.f472415b + " resultcode:" + p4Var.f343438a + ",resultmsg: " + p4Var.f343439b);
            int i19 = p4Var.f343438a;
            java.util.Map map = gVar.f472416c;
            if (map != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download_fav_");
                vf0.o2 o2Var = gVar.f472418e;
                sb6.append(o2Var.name());
                sb6.append("_result");
                map.put(sb6.toString(), java.lang.Integer.valueOf(i19));
                map.put("download_fav_" + o2Var.name() + "_cost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - gVar.f472419f));
            }
            boolean z17 = i19 == 0 || i19 == 1;
            kotlinx.coroutines.q qVar = gVar.f472417d;
            try {
                if (z17) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(0));
                } else {
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(i19)));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return jz5.f0.f302826a;
    }
}
