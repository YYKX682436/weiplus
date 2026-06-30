package nk2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f419501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f419502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f419503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f419504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f419505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419506i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f419507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419508n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f419509o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f419510p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f419511q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, long j18, long j19, float f17, java.lang.String str, org.json.JSONArray jSONArray, java.lang.String str2, int i17, int i18, int i19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f419502e = j17;
        this.f419503f = j18;
        this.f419504g = j19;
        this.f419505h = f17;
        this.f419506i = str;
        this.f419507m = jSONArray;
        this.f419508n = str2;
        this.f419509o = i17;
        this.f419510p = i18;
        this.f419511q = i19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nk2.g(this.f419502e, this.f419503f, this.f419504g, this.f419505h, this.f419506i, this.f419507m, this.f419508n, this.f419509o, this.f419510p, this.f419511q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f419501d;
        long j17 = this.f419502e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = s26.a.f483901f;
            long e17 = s26.a.e(s26.c.f(j17, s26.d.f483905g));
            this.f419501d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(e17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y / 1024.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePerformanceReportTools", "#recordExitLive exit" + j17 + "SecondsMemoryPss=" + f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveId", this.f419503f);
        jSONObject.put("lengthOfStay", this.f419504g);
        jSONObject.put("exitMomentMemoryPss", new java.lang.Float(this.f419505h));
        nk2.c cVar = nk2.c.f419493a;
        jSONObject.put("afterLiveActivities", kz5.n0.g0(nk2.c.f419494b, "-", null, null, 0, null, null, 62, null));
        jSONObject.put("commentScene", this.f419506i);
        jSONObject.put("recordActions", this.f419507m);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (r0Var == null || (str = new java.lang.Integer(r0Var.f409408p).toString()) == null) {
            str = "";
        }
        jSONObject.put("exitType", str);
        jSONObject.put(this.f419508n, new java.lang.Float(f17));
        jSONObject.put("liveIndex", this.f419509o);
        jSONObject.put("liveIndexV2", this.f419510p);
        jSONObject.put("liveGroupIndex", this.f419511q);
        ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(ts5.a.f503257f, jSONObject);
        return jz5.f0.f384359a;
    }
}
