package ls5;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ls5.d f402651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, java.lang.String str, ls5.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f402649d = i17;
        this.f402650e = str;
        this.f402651f = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ls5.b(this.f402649d, this.f402650e, this.f402651f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ls5.b bVar = (ls5.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f c6516x7962e81f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f();
        c6516x7962e81f.f138678e = this.f402649d;
        org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.v(this.f402650e, ";", ",", false, 4, null));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ls5.d dVar = this.f402651f;
        jSONObject.put("leak_time", (currentTimeMillis - dVar.f402657d) / 1000);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        c6516x7962e81f.p(t17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f402654a, "checkLeakDetailReport leakJson: ".concat(t17));
        c6516x7962e81f.k();
        dVar.f402656c = "";
        dVar.f402657d = 0L;
        return jz5.f0.f384359a;
    }
}
