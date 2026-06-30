package jr0;

/* loaded from: classes12.dex */
public class h implements jr0.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f382865a = new java.util.concurrent.ConcurrentHashMap();

    public boolean a(ri.d0 d0Var) {
        if (!d0Var.f477396e.b().equals("Trace")) {
            return false;
        }
        org.json.JSONObject jSONObject = d0Var.f477395d;
        java.lang.String str = d0Var.f477393b;
        if (str.equalsIgnoreCase("Trace_EvilMethod")) {
            if (!jSONObject.getString("detail").equalsIgnoreCase("NORMAL") || com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("clicfg_normal_report", false)) {
                return false;
            }
            com.p314xaae8f345.mm.p849xbf8d97c1.o.k();
        } else if (str.equalsIgnoreCase("Trace_FPS")) {
            java.lang.String string = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f382865a;
            jr0.g gVar = (jr0.g) concurrentHashMap.get(string);
            if (gVar == null) {
                gVar = new jr0.g(null);
                concurrentHashMap.put(string, gVar);
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - gVar.f382864b;
            int i17 = gVar.f382863a + 1;
            gVar.f382863a = i17;
            if (i17 <= 12 || uptimeMillis > 2400000) {
                return false;
            }
            concurrentHashMap.put(string, new jr0.g(null));
        } else if (!str.equalsIgnoreCase("Trace_StartUp") || j62.e.g().l("clicfg_matrix_startup_report", false, true, true)) {
            return false;
        }
        return true;
    }
}
