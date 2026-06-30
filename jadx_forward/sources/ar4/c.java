package ar4;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static rh0.b0 f94935b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f94936c;

    /* renamed from: a, reason: collision with root package name */
    public static final ar4.c f94934a = new ar4.c();

    /* renamed from: d, reason: collision with root package name */
    public static org.json.JSONArray f94937d = new org.json.JSONArray();

    public static void a(ar4.c cVar, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        java.lang.Boolean bool;
        gq4.a aVar;
        boolean z17;
        xq4.a aVar2;
        cVar.getClass();
        try {
            org.json.JSONArray jSONArray = f94937d;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("action", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
            if (Bi == null || (aVar = Bi.f258092b) == null) {
                bool = null;
            } else {
                dr4.p1 p1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar).f257908f;
                if (p1Var != null && (aVar2 = p1Var.f324237c) != null) {
                    z17 = ((zq4.b) aVar2).f556574a;
                    bool = java.lang.Boolean.valueOf(z17);
                }
                z17 = false;
                bool = java.lang.Boolean.valueOf(z17);
            }
            jSONObject.put("isFront", bool);
            jSONObject.put("timeStamp", java.lang.System.currentTimeMillis());
            org.json.JSONArray put = jSONArray.put(jSONObject);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(put, "put(...)");
            f94937d = put;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VirtualBackgroundFilter", "recordAction fail: " + e17.getLocalizedMessage());
        }
    }

    public final void b(rh0.b0 mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VirtualBackgroundFilter", "setSegmentBgBlur: " + mode);
        a(this, 1, null, 2, null);
        f94935b = mode;
    }
}
