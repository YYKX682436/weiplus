package vd1;

/* loaded from: classes.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77284x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f77285x24728b = "kvReport";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiKvReport", f77285x24728b);
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        int optInt = jSONObject.optInt("logId");
        java.lang.String optString = jSONObject.optString("logStr");
        if (optInt <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            lVar.a(i17, o("fail:logId error or logStr null"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiKvReport", "%s %s", java.lang.Integer.valueOf(optInt), optString);
        jx3.f.INSTANCE.mo68478xbd3cda5f(optInt, optString);
        lVar.a(i17, o("ok"));
    }
}
