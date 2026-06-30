package ax4;

/* loaded from: classes.dex */
public class b extends qw4.a {
    @Override // nw4.q2
    public boolean a(nw4.k kVar, nw4.y2 y2Var) {
        org.json.JSONObject jSONObject = y2Var.f341014d;
        if (jSONObject == null) {
            return false;
        }
        java.lang.String preload = ((com.tencent.mm.plugin.appbrand.preload.IAppBrandBatchPreloadController) i95.n0.c(com.tencent.mm.plugin.appbrand.preload.IAppBrandBatchPreloadController.class)).preload(jSONObject, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(preload)) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":error", null);
        } else {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":" + preload, null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 366;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.j4.NAME;
    }
}
