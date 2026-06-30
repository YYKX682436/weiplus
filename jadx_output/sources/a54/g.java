package a54;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f1601a = kz5.c0.i("136", "146", "147");

    public static final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpUseMMLandingPage", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageUtils");
        if (ca4.m0.d0() && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdLandingPageRunInMp()) == 1) {
            com.tencent.mars.xlog.Log.w("AdLandingPageUtils", "isExpUseMMLandingPage, debugCfg==1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpUseMMLandingPage", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageUtils");
            return true;
        }
        int u07 = ca4.m0.u0(e42.d0.clicfg_ad_use_mp_landingpage, 0);
        com.tencent.mars.xlog.Log.i("AdLandingPageUtils", "isExpUseMMLandingPage, expValue=" + u07);
        boolean z17 = u07 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpUseMMLandingPage", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageUtils");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.content.Context r25, android.content.Intent r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a54.g.b(android.content.Context, android.content.Intent, java.lang.String):void");
    }
}
