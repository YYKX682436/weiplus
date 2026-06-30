package qu2;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu2.r f448343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f448344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qu2.r rVar, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448343d = rVar;
        this.f448344e = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qu2.q(this.f448343d, this.f448344e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qu2.q qVar = (qu2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        qu2.r rVar = this.f448343d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i17 = 0;
            for (java.lang.Object obj2 : rVar.f448347c) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jSONObject.put(java.lang.String.valueOf(i17), new java.lang.Float(((java.lang.Number) obj2).floatValue()));
                i17 = i18;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("t_version", 2);
            jSONObject2.put("t_bad_case", rVar.f448348d);
            jSONObject2.put("temperatures", jSONObject);
            rVar.b(jSONObject2, this.f448344e);
            ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(rVar.f448345a, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TemperatureCollector", e17.toString());
        }
        return jz5.f0.f384359a;
    }
}
