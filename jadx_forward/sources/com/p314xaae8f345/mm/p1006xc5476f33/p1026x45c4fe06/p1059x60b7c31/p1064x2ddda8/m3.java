package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class m3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n3 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.n24 f161172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 sharedContext, r45.n24 response) {
        super(sharedContext, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sharedContext, "sharedContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f161172e = response;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n3
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h4 h4Var = this.f161072d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 o0Var = h4Var.f161105f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        o0Var.f161193i = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar = h4Var.f161104e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j4 j4Var = h4Var.f161103d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f161172e.f462549e.i());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 o0Var2 = h4Var.f161105f;
        o0Var2.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("queueLength", o0Var2.f161185a);
        jSONObject2.put("wxdataQueueTimestamp", o0Var2.f161186b);
        jSONObject2.put("wxdataDequeueTimestamp", o0Var2.f161187c);
        jSONObject2.put("isConfirm", o0Var2.f161188d);
        jSONObject2.put("beginCGITimestamp", o0Var2.f161189e);
        jSONObject2.put("CGICallbackTimestamp", o0Var2.f161190f);
        jSONObject2.put("beginCGITimestampAfterConfirm", o0Var2.f161191g);
        jSONObject2.put("CGICallbackTimestampAfterConfirm", o0Var2.f161192h);
        jSONObject2.put("wxlibCallbackTimestamp", o0Var2.f161193i);
        jSONObject.put("clientInfo", jSONObject2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = ffVar.f162546b;
        j4Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(ffVar.f162549e, j4Var.u(str, jSONObject));
    }
}
