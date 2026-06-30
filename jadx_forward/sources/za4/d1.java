package za4;

/* loaded from: classes4.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 f552607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552608e;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, java.lang.String str) {
        this.f552607d = c17902x72cc1771;
        this.f552608e = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0050 -> B:12:0x0066). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f552608e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = this.f552607d;
        q34.b m70103xb6fd7912 = c17902x72cc1771 != null ? c17902x72cc1771.m70103xb6fd7912() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preDownloadAdLandingPagesForAtMsg, preloadConfig=");
        sb6.append(m70103xb6fd7912 == null ? "" : m70103xb6fd7912.m159494x9616526c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", sb6.toString());
        try {
            if (za4.z0.u(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg");
                za4.o0.g().o(str, dm.n.f67493x36901555, m70103xb6fd7912, 2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg, inValidCanvas");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg, exp=" + th6.toString());
        }
        try {
            str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.m70112x77665b99(str);
            if (za4.z0.u(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg for gestureAdXml");
                za4.o0.g().o(str, dm.n.f67493x36901555, m70103xb6fd7912, 3);
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg for gestureAdXml, exp=" + th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$4");
    }
}
