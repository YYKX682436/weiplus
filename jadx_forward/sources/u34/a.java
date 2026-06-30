package u34;

/* loaded from: classes4.dex */
public final class a implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u34.d f505939d;

    public a(u34.d dVar) {
        this.f505939d = dVar;
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PagView onAnimationStart, pagType=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        u34.d dVar = this.f505939d;
        int i17 = dVar.f505946e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PagAnimScene", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        android.animation.Animator.AnimatorListener animatorListener = dVar.f505945d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (animatorListener != null) {
            animatorListener.onAnimationStart(android.animation.ValueAnimator.ofInt(0, 0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PagView onAnimationEnd, pagType=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        u34.d dVar = this.f505939d;
        int i17 = dVar.f505946e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PagAnimScene", sb6.toString());
        try {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c17 = u34.d.c(dVar);
            if (c17 != null) {
                c17.i(this);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c18 = u34.d.c(dVar);
            if (c18 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPagUpdateListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                u34.b bVar = dVar.f505952k;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPagUpdateListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                c18.j(bVar);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c19 = u34.d.c(dVar);
            if (c19 != null) {
                c19.n();
            }
        } catch (java.lang.Exception e17) {
            ca4.q.c("PagAnimScene pag stop", e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PagAnimScene", "PagView onAnimationEnd exp=" + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        dVar.f(27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i18 = dVar.f505951j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i19 = dVar.f505946e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        java.lang.String str = "ad_fullscreen_pag_frame_rate_" + i19;
        p34.o.g(str, java.lang.String.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PagAnimScene", "savePagFrameRate, frameRate=" + i18 + ", pagType=" + i19 + ", key=" + str + ", snsId=" + dVar.f505947f);
        ca4.e0.b("ad_pag_theme_anim_frame_rate", "", i19, i18, dVar.f505947f);
        if (i19 != 1) {
            if (i19 == 2) {
                if (i18 >= 30) {
                    dVar.f(30);
                } else {
                    dVar.f(31);
                }
            }
        } else if (i18 >= 30) {
            dVar.f(28);
        } else {
            dVar.f(29);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        android.animation.Animator.AnimatorListener animatorListener = dVar.f505945d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(android.animation.ValueAnimator.ofInt(0, 0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
    }
}
