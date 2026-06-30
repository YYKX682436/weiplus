package lu4;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f402984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f402986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lu4.v f402988h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402989i;

    public u(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, java.util.Map map, java.lang.String str2, lu4.v vVar, java.lang.String str3) {
        this.f402984d = h0Var;
        this.f402985e = str;
        this.f402986f = map;
        this.f402987g = str2;
        this.f402988h = vVar;
        this.f402989i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String upperCase = ((java.lang.String) this.f402984d.f391656d).toUpperCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(upperCase, "POST");
        java.lang.String str = this.f402987g;
        java.util.Map map = this.f402986f;
        java.lang.String str2 = this.f402985e;
        hy4.e f17 = b17 ? hy4.f.f(str2, map, str) : hy4.f.e(str2, map, str);
        lu4.v vVar = this.f402988h;
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(vVar.f402964c, "request response is null, return");
            lu4.c.u((lu4.c) vVar.f402963b, this.f402989i, "fail:response is null", null, 4, null);
            return;
        }
        java.lang.String str3 = vVar.f402964c;
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(f17.f367630a);
        java.util.Map header = f17.f367631b;
        objArr[1] = java.lang.Integer.valueOf(header != null ? ((java.util.HashMap) header).size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "request response statusCode:%d, header.size:%d", objArr);
        java.lang.String str4 = vVar.f402964c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("statusCode", f17.f367630a);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, f17.f367632c);
        if (header != null) {
            if (header != null && (!((java.util.HashMap) header).isEmpty())) {
                z17 = true;
            }
            if (z17) {
                hy4.f.g(header);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
                jSONObject.put("header", new org.json.JSONObject(kz5.c1.s(header)));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f402964c, "request success");
        lu4.c cVar = (lu4.c) vVar.f402963b;
        java.lang.String str5 = this.f402989i;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        lu4.c.u(cVar, str5, jSONObject2, null, 4, null);
    }
}
