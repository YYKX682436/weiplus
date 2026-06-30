package ai1;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ai1.c f86615a = new ai1.c();

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622, boolean z17) {
        java.lang.String jSONObject;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17;
        java.lang.String string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getSessionIdInner, materialModel: " + c12476xea20f622 + ", remove: " + z17);
        org.json.JSONObject e17 = ai1.d.e(c12476xea20f622);
        if (e17 == null || (jSONObject = e17.toString()) == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a()) == null) {
            return null;
        }
        if (z17) {
            java.lang.String concat = jSONObject.concat("#sessionId");
            string = a17.getString(concat, null);
            a17.remove(concat);
        } else {
            string = a17.getString(jSONObject.concat("#sessionId"), null);
        }
        if (string == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getReporterInner, sessionId: ".concat(string));
        return string;
    }
}
