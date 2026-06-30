package ma1;

/* loaded from: classes.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f72807x366c91de = 668;

    /* renamed from: NAME */
    public static final java.lang.String f72808x24728b = "isGameRecorderSupported";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderSupport", "hy: trigger call whether is support screen recording");
        java.util.HashMap hashMap = new java.util.HashMap(2);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hashMap.put("isVolumeSupported", bool);
        hashMap.put("isAtempoSupported", bool);
        hashMap.put("isFrameSupported", bool);
        hashMap.put("isSoundSupported", bool);
        return p("ok", hashMap);
    }
}
