package be1;

/* loaded from: classes4.dex */
public class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4238x366c91de = 534;

    /* renamed from: NAME */
    public static final java.lang.String f4239x24728b = "setVolume";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetVolume", "invoke JsApiSetVolume!");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetVolume", "fail:component is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetVolume", "fail:context is null");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        if (!(mo50352x76847179 instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetVolume", "fail:context is not Activity");
            lVar.a(i17, o("fail:context is not Activity"));
            return;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) mo50352x76847179.getSystemService("audio");
        if (audioManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetVolume", "fail:manager is null");
            lVar.a(i17, o("fail:manager is null"));
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int optInt = jSONObject.optInt("value", streamVolume);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetVolume", "JsApiSetVolume value:%d, current:%d, max:%d", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(streamMaxVolume));
        if (optInt < 0) {
            streamMaxVolume = 0;
        } else if (optInt <= streamMaxVolume) {
            streamMaxVolume = optInt;
        }
        if (streamMaxVolume == streamVolume) {
            lVar.a(i17, o("fail:volume does not change"));
        } else {
            to.a.c(audioManager, 3, streamMaxVolume, 0);
            lVar.a(i17, o("ok"));
        }
    }
}
