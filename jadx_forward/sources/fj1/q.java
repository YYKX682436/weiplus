package fj1;

/* loaded from: classes7.dex */
public interface q {
    static java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("appId");
            return u46.l.r(string, "CARD_") ? u46.l.s(string, 5) : string;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameMBJsApiWrapper", "extraAppIdFromPrivateData get exception:%s", e17);
            return null;
        }
    }

    static lc3.a0 c(jc1.d dVar) {
        try {
            return (lc3.a0) new lc3.a0().put("errno", dVar.f380436a).put("errMsg", dVar.f380437b);
        } catch (java.lang.Exception unused) {
            return new lc3.a0();
        }
    }
}
