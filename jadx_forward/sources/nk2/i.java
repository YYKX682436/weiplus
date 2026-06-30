package nk2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419524d;

    /* renamed from: e, reason: collision with root package name */
    public int f419525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f419526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419527g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f419528h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f419529i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f419530m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f419531n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f419532o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f419533p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, java.lang.String str, long j18, long j19, int i17, int i18, int i19, org.json.JSONArray jSONArray, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f419526f = j17;
        this.f419527g = str;
        this.f419528h = j18;
        this.f419529i = j19;
        this.f419530m = i17;
        this.f419531n = i18;
        this.f419532o = i19;
        this.f419533p = jSONArray;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nk2.i(this.f419526f, this.f419527g, this.f419528h, this.f419529i, this.f419530m, this.f419531n, this.f419532o, this.f419533p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ts5.d dVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f419525e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ts5.d wi6 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f503265d, ts5.a.f503259h);
            wi6.mo149996x68ac462();
            int i18 = s26.a.f483901f;
            long e17 = s26.a.e(s26.c.f(this.f419526f, s26.d.f483905g));
            this.f419524d = wi6;
            this.f419525e = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(e17, this) == aVar) {
                return aVar;
            }
            dVar = wi6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (ts5.d) this.f419524d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("commentScene", this.f419527g);
        linkedHashMap.put("liveId", new java.lang.Long(this.f419528h));
        linkedHashMap.put("lengthOfStay", new java.lang.Long(this.f419529i));
        linkedHashMap.put("liveIndex", new java.lang.Integer(this.f419530m));
        linkedHashMap.put("liveIndexV2", new java.lang.Integer(this.f419531n));
        linkedHashMap.put("liveGroupIndex", new java.lang.Integer(this.f419532o));
        nk2.c cVar = nk2.c.f419493a;
        linkedHashMap.put("afterLiveActivities", kz5.n0.g0(nk2.c.f419494b, "-", null, null, 0, null, null, 62, null));
        linkedHashMap.put("recordActions", this.f419533p);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        if (r0Var == null || (str = new java.lang.Integer(r0Var.f409408p).toString()) == null) {
            str = "";
        }
        linkedHashMap.put("exitType", str);
        dVar.a(linkedHashMap);
        return jz5.f0.f384359a;
    }
}
