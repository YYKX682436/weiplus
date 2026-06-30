package y44;

/* loaded from: classes4.dex */
public final class a implements y44.d, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final y44.a f540889d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f540890e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2101x60b7c31.p2102xb73a0fae.C17726xf6097c20 f540891f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.os.Handler f540892g;

    static {
        y44.a aVar = new y44.a();
        f540889d = aVar;
        f540890e = new java.util.LinkedHashMap();
        f540891f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2101x60b7c31.p2102xb73a0fae.C17726xf6097c20(aVar);
        f540892g = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final synchronized void a(java.lang.String pkg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkg, "pkg");
        try {
            java.util.Map map = f540890e;
            map.remove(pkg);
            if (map.isEmpty()) {
                f540892g.removeCallbacks(this);
                f540891f.d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.ApkWatcherManager", "the pkg map is empty, unregister watcher!!");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAd.ApkWatcherManager", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.LinkedHashMap) f540890e).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            y44.c cVar = (y44.c) entry.getValue();
            cVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartTime", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartTime", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            long j17 = cVar.f540894b;
            y44.c cVar2 = (y44.c) entry.getValue();
            cVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDelayDuration", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDelayDuration", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            if (j17 + cVar2.f540895c <= currentTimeMillis) {
                it.remove();
            }
        }
        if (f540890e.isEmpty()) {
            f540891f.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.ApkWatcherManager", "the pkg map is empty, unregister watcher in timer !!");
        } else {
            f540892g.postDelayed(this, 60000L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.ApkWatcherManager", "the pkg map is not empty, make new time delay!!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
    }
}
