package p3389if;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69921x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f69922x24728b = "getSkylineInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        java.util.HashMap a17 = p3389if.a.f372540a.a(yVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetSkylineInfo", "getSkylineInfo: " + a17);
        if (yVar != null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            a17.put("errno", 0);
            yVar.a(i17, t("ok", a17));
        }
    }
}
