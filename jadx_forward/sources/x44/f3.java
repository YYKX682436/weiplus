package x44;

/* loaded from: classes4.dex */
public final class f3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartApkWatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("pkg", "");
        long optLong = data.optLong("duration", 0L);
        if (optString == null || r26.n0.N(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ApkWatcher", "the pkg is empty!!");
            b(g(": the pkg is empty"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartApkWatcher");
            return;
        }
        y44.a aVar = y44.a.f540889d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        x44.s0 s0Var = new x44.s0(env.f524428e);
        synchronized (aVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            if (za4.k.l()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.ApkWatcherManager", "register, but disable register installReceiver");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2101x60b7c31.p2102xb73a0fae.C17726xf6097c20 c17726xf6097c20 = y44.a.f540891f;
                c17726xf6097c20.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRegistered", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
                boolean z17 = c17726xf6097c20.f244262b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRegistered", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
                y44.a.f540890e.put(optString, new y44.c(optString, java.lang.System.currentTimeMillis(), optLong <= 0 ? 300000L : optLong, s0Var));
                if (!z17) {
                    c17726xf6097c20.c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.ApkWatcherManager", "the watcher hasn't be registered, start a delay time");
                    y44.a.f540892g.postDelayed(aVar, 60000L);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.ApkWatcherManager", "register one pkg to watcher, pkg is ".concat(optString));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            }
        }
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.StartApkWatcher");
    }
}
