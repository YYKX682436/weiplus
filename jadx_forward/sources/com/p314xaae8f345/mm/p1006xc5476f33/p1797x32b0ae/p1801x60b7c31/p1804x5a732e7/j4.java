package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class j4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenWeClawChatPage", "invoke sendTextMessage, appId=%s, data=%s", str, jSONObject);
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenWeClawChatPage", "LiteAppJsApiOpenWeClawChatPage fail, username is empty");
            this.f224976f.a("username is empty");
        } else {
            ((c01.k7) c01.n8.a()).b(optString, 12, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i4(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenWeClawChatPage", "get contact");
        }
    }
}
