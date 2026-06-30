package vi1;

/* loaded from: classes7.dex */
public final class m0 {
    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 a(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            java.lang.String optString = jSONObject.optString("mobile");
            java.lang.String optString2 = jSONObject.optString("show_mobile");
            boolean optBoolean = jSONObject.optBoolean("need_auth", true);
            boolean optBoolean2 = jSONObject.optBoolean("allow_send_sms", true);
            java.lang.String optString3 = jSONObject.optString("encryptedData");
            java.lang.String optString4 = jSONObject.optString("iv");
            boolean optBoolean3 = jSONObject.optBoolean("is_wechat", false);
            boolean optBoolean4 = jSONObject.optBoolean("is_check", false);
            java.lang.String optString5 = jSONObject.optString("cloud_id", "");
            java.lang.String optString6 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(optString, optString2, optString3, optString4, optString5, optBoolean, optBoolean2, optBoolean3, optBoolean4, optString6);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneItem", "jsonStr:%s", jsonStr);
            return null;
        }
    }
}
