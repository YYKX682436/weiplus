package ai1;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ai1.c f5082a = new ai1.c();

    public final java.lang.String a(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel, boolean z17) {
        java.lang.String jSONObject;
        com.tencent.mm.sdk.platformtools.o4 a17;
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getSessionIdInner, materialModel: " + materialModel + ", remove: " + z17);
        org.json.JSONObject e17 = ai1.d.e(materialModel);
        if (e17 == null || (jSONObject = e17.toString()) == null || (a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a()) == null) {
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
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getReporterInner, sessionId: ".concat(string));
        return string;
    }
}
