package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class af extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f33701x366c91de = 313;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f33702x24728b = "verifyPlugin";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (jSONObject == null || !jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            service.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String str = "appId[" + service.mo48798x74292566() + "] callbackId[" + i17 + ']';
        r45.sx6 sx6Var = new r45.sx6();
        sx6Var.f467546d = service.mo48798x74292566();
        sx6Var.f467547e = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) service.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
        if (c0Var != null) {
            c0Var.e1("/cgi-bin/mmbiz-bin/wxaapp/verifyplugin", sx6Var.f467546d, sx6Var, r45.tx6.class).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ze(str, service, i17, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " NULL cgiService");
        service.a(i17, o("fail:internal error"));
    }
}
