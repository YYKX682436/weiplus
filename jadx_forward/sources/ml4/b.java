package ml4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ml4.b f409940a = new ml4.b();

    /* renamed from: b, reason: collision with root package name */
    public static org.json.JSONObject f409941b = new org.json.JSONObject();

    public final void a() {
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20775xbdbd26f1());
        if (f17 == null || r26.n0.N(f17)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayerConfig", "updateConfig config " + f17);
        try {
            f409941b = new org.json.JSONObject(f17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingPlayerConfig", "updateConfig ex " + e17.getMessage());
        }
    }
}
