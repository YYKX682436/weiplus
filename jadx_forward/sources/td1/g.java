package td1;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f499136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499137e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f499136d = lVar;
        this.f499137e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a c12223x7fb6c59a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12223x7fb6c59a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component = this.f499136d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("requestId", this.f499137e);
        jSONObject.put("recentUsageInfo", new org.json.JSONArray(c12223x7fb6c59a.f164444d));
        int i17 = c12223x7fb6c59a.f164445e;
        jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i17);
        java.lang.String str = c12223x7fb6c59a.f164446f;
        java.lang.String jSONObject2 = jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, str).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("******errorCode=");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        sb6.append(i17);
        sb6.append("\nerrorMsg=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnGetRecentUsageListResultEvent", sb6.toString());
        td1.i iVar = new td1.i(null);
        iVar.u(component);
        iVar.f163907f = jSONObject2;
        iVar.m();
    }
}
