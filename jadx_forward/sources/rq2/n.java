package rq2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq2.b f480377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f480379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rq2.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480377d = bVar;
        this.f480378e = i17;
        this.f480379f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rq2.n(this.f480377d, this.f480378e, this.f480379f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rq2.n nVar = (rq2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71 c6784x711efb71 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71();
        rq2.d dVar = rq2.d.f480349a;
        c6784x711efb71.f141163m = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
        c6784x711efb71.f141164n = c6784x711efb71.b("networkType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        c6784x711efb71.f141166p = this.f480377d.f480347d;
        c6784x711efb71.f141165o = this.f480378e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("reddot_type", new java.lang.Integer(this.f480379f ? 2 : 1));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6784x711efb71.f141169s = c6784x711efb71.b("opMsg", r26.i0.t(jSONObject2, ",", ";", false), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareStateReporter", "reportSquareRedILog：\n " + c6784x711efb71.n());
        c6784x711efb71.k();
        return jz5.f0.f384359a;
    }
}
