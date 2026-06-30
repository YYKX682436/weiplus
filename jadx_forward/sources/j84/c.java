package j84;

/* loaded from: classes4.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.f f379707d;

    public c(j84.f fVar) {
        this.f379707d = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$showClickCircle$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        j84.f fVar = this.f379707d;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPeekCircle", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        j84.a aVar = fVar.f379721i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPeekCircle", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        if (aVar != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
            float floatValue = f17 != null ? f17.floatValue() : 0.0f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScale", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            aVar.f379703d = floatValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScale", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnPeekAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        yz5.l lVar = fVar.f379724l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnPeekAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        if (lVar != null) {
            java.lang.Object animatedValue2 = animator.getAnimatedValue();
            java.lang.Float f18 = animatedValue2 instanceof java.lang.Float ? (java.lang.Float) animatedValue2 : null;
            lVar.mo146xb9724478(java.lang.Float.valueOf(f18 != null ? f18.floatValue() : 0.0f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$showClickCircle$1$1");
    }
}
