package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class g4 implements t21.i0 {

    /* renamed from: e */
    public t21.h0 f245741e;

    /* renamed from: d */
    public java.lang.String f245740d = "";

    /* renamed from: f */
    public final dn.n f245742f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f4(this);

    public static /* synthetic */ t21.h0 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        t21.h0 h0Var = g4Var.f245741e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return h0Var;
    }

    public static /* synthetic */ java.lang.String g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        java.lang.String str = g4Var.f245740d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return str;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestVideoData", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        if (this.f245740d.equals(str)) {
            t21.o2.Di().p(str, i17, i18, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestVideoData", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        this.f245740d = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoProxy", "%s start http stream[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, str3, str2);
        boolean z17 = false;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sns_ad_download_resource_preferences", 0);
        boolean z18 = sharedPreferences.getBoolean(str, false);
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoProxy", "is already download %s", java.lang.Boolean.valueOf(z18));
            if (z18) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f4) this.f245742f).g(str, 0, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
                return;
            }
        } else if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoProxy", "last download file was deleted");
            sharedPreferences.edit().putBoolean(str, false).commit();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
        Cj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (Cj.f245978h) {
            try {
                if (Cj.f245978h.containsKey(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("%s is already in downloading", str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().i(str, str3, str2, 0, false, -1, true, this.f245742f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        }
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoProxy", "%s, stop stream[%s]", java.lang.Integer.valueOf(hashCode()), str);
        if (this.f245740d.equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().w(str, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIEngineCallback", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        this.f245741e = h0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIEngineCallback", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        boolean o17 = this.f245740d.equals(str) ? t21.o2.Di().o(str, i17, i18) : false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return o17;
    }
}
