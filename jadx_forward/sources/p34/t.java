package p34;

@j95.b
/* loaded from: classes4.dex */
public class t extends i95.w implements p94.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final q80.b0 f433228d = new p34.s(this);

    public void Ai(long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadAdCanvas", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdService", "preloadAdCanvas, canvasId=" + j17 + ", preloadInnerRes=" + z17 + ", preloadProcess=" + z18 + ", procName=" + bm5.f1.a() + ", uxInfo=" + str + ", dynamicInfo=" + str2);
            java.lang.String str3 = "";
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                java.lang.String B = ca4.m0.B(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                str3 = B;
            }
            java.lang.String a17 = n74.d2.a(str3, 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                za4.o0.c(j17, z17, a17, str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69819xde45e479(j17, a17, str2, z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1676, 21);
            if (z18) {
                ca4.m0.A0();
                g0Var.A(1676, 22);
            }
            if (z17) {
                g0Var.A(1676, 23);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdService", "preloadAdCanvas, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadAdCanvas", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdService", "onAccountInitialized, hash=" + hashCode());
        try {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            q80.b0 b0Var = this.f433228d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.m0.f225545b.add(new java.lang.ref.WeakReference(b0Var));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_onAccountInitialized", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountInitialized", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccountReleased", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdService", "onAccountReleased, hash=" + hashCode());
        try {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            q80.b0 b0Var = this.f433228d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.m0.f225545b.iterator();
            while (it.hasNext()) {
                q80.b0 b0Var2 = (q80.b0) ((java.lang.ref.WeakReference) it.next()).get();
                if (b0Var2 == null || b0Var2 == b0Var) {
                    it.remove();
                }
            }
            r34.e.f450531a.e();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_onAccountReleased", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountReleased", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdService", "onCreate, hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    public void wi(android.content.Context context, long j17, java.lang.String str, p94.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdService", "openAdCanvasById, canvasId=" + j17 + ", uxInfo=" + str + ", context=" + context + ", bundle=" + v0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        java.lang.String B = ca4.m0.B(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        ca4.m0.n0(context, j17, B, v0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }
}
