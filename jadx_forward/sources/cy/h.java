package cy;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final cy.h f306199a = new cy.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f306200b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f306201c;

    public final void a() {
        if (f306201c) {
            return;
        }
        synchronized (this) {
            if (f306201c) {
                return;
            }
            f306201c = true;
            try {
                dy.a aVar = dy.a.f326055a;
                java.util.Map map = f306200b;
                if (map.containsKey("map")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatbotCardSceneRegistry", "scene \"map\" re-registered, overriding previous builder");
                }
                map.put("map", aVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotCardSceneRegistry", "registerScene: map (total=" + map.size() + ')');
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatbotCardSceneRegistry", "registerAll failed: " + th6);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatbotCardSceneRegistry", "ensureInitialized: " + f306200b.size() + " scenes");
        }
    }
}
