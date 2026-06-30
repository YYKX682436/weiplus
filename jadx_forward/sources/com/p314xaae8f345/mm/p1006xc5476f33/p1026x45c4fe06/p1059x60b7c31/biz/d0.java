package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/d0;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class d0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null && rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
        java.lang.String str = "";
        java.lang.String string = bundle != null ? bundle.getString("appMsgIds", "") : null;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("bizType", 1)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "SetBizProfileDraftAppMsgIdTask appMsgId " + string + ", bizType " + valueOf);
        rv.y2 y2Var = (rv.y2) i95.n0.c(rv.y2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        int intValue = valueOf.intValue();
        vw.k kVar = ((vw.m) y2Var).f522213d;
        kVar.getClass();
        if (string == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileDraftDataUtil", "setBizProfileDraftAppMsgIdTask id null");
        } else {
            str = string;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("appMsgId", -1);
                long optLong = optJSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, -1L);
                optJSONObject.toString();
                r45.d6 d6Var = new r45.d6();
                d6Var.f453672d = optInt;
                d6Var.f453673e = optLong;
                arrayList.add(d6Var);
            }
        }
        kVar.a(intValue).f(arrayList);
    }
}
