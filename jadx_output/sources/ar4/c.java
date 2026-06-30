package ar4;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static rh0.b0 f13402b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13403c;

    /* renamed from: a, reason: collision with root package name */
    public static final ar4.c f13401a = new ar4.c();

    /* renamed from: d, reason: collision with root package name */
    public static org.json.JSONArray f13404d = new org.json.JSONArray();

    public static void a(ar4.c cVar, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        java.lang.Boolean bool;
        gq4.a aVar;
        boolean z17;
        xq4.a aVar2;
        cVar.getClass();
        try {
            org.json.JSONArray jSONArray = f13404d;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("action", i17);
            com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
            if (Bi == null || (aVar = Bi.f176559b) == null) {
                bool = null;
            } else {
                dr4.p1 p1Var = ((com.tencent.mm.plugin.voip.model.d0) aVar).f176375f;
                if (p1Var != null && (aVar2 = p1Var.f242704c) != null) {
                    z17 = ((zq4.b) aVar2).f475041a;
                    bool = java.lang.Boolean.valueOf(z17);
                }
                z17 = false;
                bool = java.lang.Boolean.valueOf(z17);
            }
            jSONObject.put("isFront", bool);
            jSONObject.put("timeStamp", java.lang.System.currentTimeMillis());
            org.json.JSONArray put = jSONArray.put(jSONObject);
            kotlin.jvm.internal.o.f(put, "put(...)");
            f13404d = put;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VirtualBackgroundFilter", "recordAction fail: " + e17.getLocalizedMessage());
        }
    }

    public final void b(rh0.b0 mode) {
        kotlin.jvm.internal.o.g(mode, "mode");
        com.tencent.mars.xlog.Log.i("MicroMsg.VirtualBackgroundFilter", "setSegmentBgBlur: " + mode);
        a(this, 1, null, 2, null);
        f13402b = mode;
    }
}
