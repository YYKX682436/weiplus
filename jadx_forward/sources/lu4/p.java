package lu4;

/* loaded from: classes7.dex */
public final class p implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.q f402982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402983e;

    public p(lu4.q qVar, java.lang.String str) {
        this.f402982d = qVar;
        this.f402983e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        lu4.q qVar = this.f402982d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f402964c, "videoPreloadCgi callback " + i17 + '/' + i17 + ' ' + str);
        if (i17 != 0 || i18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errMsg", "fail");
            jSONObject.put("errCode", i18);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            lu4.c.u((lu4.c) qVar.f402963b, this.f402983e, jSONObject2, null, 4, null);
            return 0;
        }
        java.lang.String str2 = qVar.f402964c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        if (fVar instanceof r45.c97) {
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("errMsg", "ok");
        jSONObject3.put("errCode", i18);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        r45.c97 c97Var = fVar2 instanceof r45.c97 ? (r45.c97) fVar2 : null;
        java.lang.String str3 = c97Var != null ? c97Var.f452920d : null;
        if (str3 == null) {
            str3 = "{}";
        }
        try {
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(str3));
        } catch (java.lang.Exception unused) {
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str3);
        }
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        lu4.c.u((lu4.c) qVar.f402963b, this.f402983e, jSONObject4, null, 4, null);
        return 0;
    }
}
