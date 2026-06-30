package n54;

/* loaded from: classes14.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 f416691d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0) {
        this.f416691d = c17742x250976b0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0 = this.f416691d;
        n54.t m69459xa7b6a504 = c17742x250976b0.m69459xa7b6a504();
        if (m69459xa7b6a504 != null) {
            m69459xa7b6a504.b(c17742x250976b0.getTranslationY());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$2");
    }
}
