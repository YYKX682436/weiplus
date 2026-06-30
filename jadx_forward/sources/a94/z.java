package a94;

/* loaded from: classes4.dex */
public class z extends a94.a0 {

    /* renamed from: i, reason: collision with root package name */
    public long f84002i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f84003m;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17813xcafdcab6 c17813xcafdcab6, int i17, int i18) {
        super(i17, i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f84002i = android.os.SystemClock.elapsedRealtime();
        this.f84003m = new java.lang.ref.WeakReference(c17813xcafdcab6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onShake, init, hash=" + hashCode());
    }

    @Override // a94.a0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onRelease");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
    }

    @Override // a94.a0
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17813xcafdcab6 c17813xcafdcab6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17813xcafdcab6) this.f84003m.get();
        if (c17813xcafdcab6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeRandomEncoreView", "onShake， shakeView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        android.content.Context context = c17813xcafdcab6.getContext();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeRandomEncoreView", "onShake， context==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeRandomEncoreView", "onShake, ui finished");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        long j17 = this.f84002i;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime < 600) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onShake, too short, delay=" + elapsedRealtime + ", hash=" + hashCode());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
            return;
        }
        this.f84002i = android.os.SystemClock.elapsedRealtime();
        ca4.z0.I0(new long[]{0, 80});
        c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeRandomEncoreView", "onShake succ, hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        a94.x xVar = c17813xcafdcab6.f245387i;
        if (xVar != null) {
            xVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeRandomEncoreView$SensorListener");
    }
}
