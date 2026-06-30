package m44;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404994d;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f404994d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f404994d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter$reportFileAvif$1");
        try {
            java.lang.System.currentTimeMillis();
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                if (m44.a.f404991a.j(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, 3L);
                    java.lang.System.currentTimeMillis();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(2001L, 4L);
                    java.lang.System.currentTimeMillis();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAvifReporter", "reportFileAvif, exp=" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter$reportFileAvif$1");
    }
}
