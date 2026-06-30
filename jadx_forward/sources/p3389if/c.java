package p3389if;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f69923x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f69924x24728b = "getSkylineInfoSync";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.util.HashMap a17 = p3389if.a.f372540a.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetSkylineInfoSync", "getSkylineInfoSync: " + a17);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        a17.put("errno", 0);
        java.lang.String t17 = t("ok", a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "makeReturnJson(...)");
        return t17;
    }
}
