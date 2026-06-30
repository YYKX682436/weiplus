package be1;

/* loaded from: classes4.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4220x366c91de = 535;

    /* renamed from: NAME */
    public static final java.lang.String f4221x24728b = "getVolume";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetVolume", "invoke JsApiGetVolume!");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetVolume", "component is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetVolume", "fail:context is null");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        if (!(mo50352x76847179 instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetVolume", "fail:context is not Activity");
            lVar.a(i17, o("fail:context is not Activity"));
            return;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) mo50352x76847179.getSystemService("audio");
        if (audioManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetVolume", "fail:manager is null");
            lVar.a(i17, o("fail:manager is null"));
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetVolume", "JsApiGetVolume %d/%d", java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(streamMaxVolume));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("currentVolume", java.lang.Integer.valueOf(streamVolume));
        hashMap.put("maxVolume", java.lang.Integer.valueOf(streamMaxVolume));
        lVar.a(i17, p("ok", hashMap));
    }
}
