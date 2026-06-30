package n74;

/* loaded from: classes4.dex */
public final class r0 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f416955a;

    public r0(s34.j0 adGamePlayableClickActionInfo, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adGamePlayableClickActionInfo, "adGamePlayableClickActionInfo");
        this.f416955a = j17;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
        try {
            long j17 = this.f416955a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeappPreRenderHelper", "prerender WeApp fail, errCode is " + i17 + ", errMsg is " + str + ", preRenderTimeCost is " + elapsedRealtime);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 18);
            ca4.e0.a("ad_weapp_pre_render", "preRender failed, check error and costTime", i17, (int) elapsedRealtime, str);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWeappPreRenderHelper", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
    }

    @Override // l81.v0
    /* renamed from: onSuccess */
    public void mo50385xe05b4124() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSuccess", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
        try {
            long j17 = this.f416955a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeappPreRenderHelper", "prerender WeApp success! preRenderTimeCost is " + (android.os.SystemClock.elapsedRealtime() - j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1911, 17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWeappPreRenderHelper", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSuccess", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
    }
}
