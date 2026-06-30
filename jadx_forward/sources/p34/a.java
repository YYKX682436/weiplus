package p34;

@j95.b
/* loaded from: classes.dex */
public final class a extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWrapperFeatureService", "onAccountInitialized, hash is " + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccountReleased", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWrapperFeatureService", "onAccountReleased, hash is " + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountReleased", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p94.g0 g0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        try {
            boolean z17 = true;
            if (ca4.m0.u0(e42.c0.clicfg_sns_ad_service_created_when_wx_start, 1) != 1) {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWrapperFeatureService", "onCreate, hash is " + hashCode() + ", snsAdServiceCreatedNow is " + z17);
            if (z17 && (g0Var = (p94.g0) i95.n0.c(p94.g0.class)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWrapperFeatureService", "init snsAdService in adWrapperFeatureService, hash is " + g0Var.hashCode());
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWrapperFeatureService", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.AdWrapperFeatureService");
    }
}
