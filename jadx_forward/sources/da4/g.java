package da4;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f309314d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ da4.h f309315e;

    public g(da4.h hVar, da4.e eVar) {
        this.f309315e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        try {
            da4.h hVar = this.f309315e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            hVar.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (da4.h.a(this.f309315e)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this, 300000L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "there are some watcher info, the timer is going on");
            } else {
                da4.h.b(this.f309315e);
                this.f309314d = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "the timer is end!");
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ApkInstalledWatcherManager", "there is something wrong in timer run function");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
    }
}
