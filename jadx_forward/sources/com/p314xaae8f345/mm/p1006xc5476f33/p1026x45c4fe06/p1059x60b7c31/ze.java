package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class ze implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f165493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.af f165495d;

    public ze(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.af afVar) {
        this.f165492a = str;
        this.f165493b = e9Var;
        this.f165494c = i17;
        this.f165495d = afVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.tx6 tx6Var = (r45.tx6) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.af afVar = this.f165495d;
        int i17 = this.f165494c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f165493b;
        java.lang.String str = this.f165492a;
        if (tx6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " null response");
            e9Var.a(i17, afVar.o("fail:internal error"));
            return;
        }
        if (tx6Var.f76492x92037252.f458492d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(tx6Var.f76492x92037252.f458492d), tx6Var.f76492x92037252.f458493e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail cgi fail Ret=");
            sb6.append(tx6Var.f76492x92037252.f458492d);
            e9Var.a(i17, afVar.o(sb6.toString()));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " cgi ok, dataSize[" + tx6Var.f468391d.length() + ']');
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(tx6Var.f468391d));
            e9Var.a(i17, afVar.p("ok", hashMap));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " cgi ok but get exception[" + e17 + ']');
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail:internal error ");
            sb7.append(e17);
            e9Var.a(i17, afVar.o(sb7.toString()));
        }
    }
}
