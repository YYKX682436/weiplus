package za4;

/* loaded from: classes4.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552600e;

    public b1(java.lang.String str, java.lang.String str2) {
        this.f552599d = str;
        this.f552600e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$2");
        java.lang.String str = this.f552599d;
        boolean u17 = za4.z0.u(str);
        java.lang.String str2 = this.f552600e;
        if (u17 || a84.o0.a(str, dm.n.f67493x36901555)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForSnsObject, snsId=" + str2);
            za4.o0.g().o(str, dm.n.f67493x36901555, null, 4);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForSnsObject, invalid canvas, snsId=" + str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$2");
    }
}
