package a94;

/* loaded from: classes4.dex */
public class y extends a94.a0 {

    /* renamed from: i, reason: collision with root package name */
    public long f84000i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f84001m;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6, int i17, int i18) {
        super(i17, i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f84000i = android.os.SystemClock.elapsedRealtime();
        this.f84001m = new java.lang.ref.WeakReference(c17812x947672b6);
    }

    @Override // a94.a0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "onRelease");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRelease", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
    }

    @Override // a94.a0
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6) this.f84001m.get();
        if (c17812x947672b6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeCoverView", "onShake， shakeCoverView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        android.content.Context context = c17812x947672b6.getContext();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeCoverView", "onShake， context==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCoverView", "onShake, ui finished");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        long j17 = this.f84000i;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "onShake, too short, delay=" + elapsedRealtime);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
            return;
        }
        this.f84000i = android.os.SystemClock.elapsedRealtime();
        ca4.z0.I0(new long[]{0, 80});
        c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "onShake succ");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        a94.x xVar = c17812x947672b6.B;
        if (xVar != null) {
            xVar.a();
        }
        c17812x947672b6.f245379x = true;
        a94.m.b(c17812x947672b6.f245368m, 1, c17812x947672b6.f245373r);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$SensorListener");
    }
}
