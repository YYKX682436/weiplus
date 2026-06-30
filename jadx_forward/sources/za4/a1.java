package za4;

/* loaded from: classes4.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g5 f552593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f552595f;

    public a1(r45.g5 g5Var, java.lang.String str, boolean z17) {
        this.f552593d = g5Var;
        this.f552594e = str;
        this.f552595f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        q34.b bVar;
        boolean z17 = this.f552595f;
        r45.g5 g5Var = this.f552593d;
        java.lang.String str2 = this.f552594e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$1");
        try {
            str = ca4.z0.t0(g5Var.f456418d.f455609d.Id);
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        try {
            bVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(x51.j1.g(g5Var.f456419e)).m70103xb6fd7912();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesPreDownloadResHelper", "parse adInfo exp=" + th6.toString());
            bVar = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preDownloadAdLandingPages, preloadConfig=");
        sb6.append(bVar == null ? "null" : bVar.m159494x9616526c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", sb6.toString());
        try {
            if (new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4(str2).m70146xae00c4ba() && za4.z0.u(str2)) {
                int i17 = z17 ? 6 : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages, scene=" + i17 + ", snsId=" + str);
                za4.o0.g().o(str2, dm.n.f67493x36901555, bVar, i17);
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages, exp=" + th7.toString() + ", snsId=" + str);
        }
        try {
            java.lang.String m70112x77665b99 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.m70112x77665b99(str2);
            if (za4.z0.u(m70112x77665b99)) {
                int i18 = z17 ? 7 : 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages for gestureAdXml, scene=" + i18 + ", snsId=" + str);
                za4.o0.g().o(m70112x77665b99, dm.n.f67493x36901555, bVar, i18);
            }
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages for gestureAdXml, exp=" + th8.toString() + ", snsId=" + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$1");
    }
}
