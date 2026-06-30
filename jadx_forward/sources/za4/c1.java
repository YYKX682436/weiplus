package za4;

/* loaded from: classes4.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552606d;

    public c1(java.lang.String str) {
        this.f552606d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$3");
        java.lang.String str = this.f552606d;
        if (za4.z0.u(str) || a84.o0.a(str, dm.n.f67493x36901555)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForMsg");
            za4.o0.g().o(str, dm.n.f67493x36901555, null, 5);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForMsg, invalid canvas");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$3");
    }
}
