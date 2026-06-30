package e94;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 f331911d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5) {
        this.f331911d = c17819x3076c6d5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$1");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5.f245434J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5 = this.f331911d;
        c17819x3076c6d5.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        float f17 = c17819x3076c6d5.A ? -180.0f : 180.0f;
        char c17 = 0;
        int i18 = 0;
        while (i18 < 12) {
            t84.c cVar = (t84.c) c17819x3076c6d5.e(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            float[] fArr = new float[2];
            fArr[c17] = f17;
            fArr[1] = 0.0f;
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar, "rotation", fArr);
            int i19 = i18;
            long j17 = 1500;
            ofFloat2.setDuration(j17);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleX", 0.3f, 1.0f);
            ofFloat3.setDuration(j17);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleY", 0.3f, 1.0f);
            ofFloat4.setDuration(j17);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat3, ofFloat4, ofFloat2);
            if (i19 == 0) {
                ofFloat2.addListener(new e94.j(c17819x3076c6d5));
                ofFloat2.addUpdateListener(new e94.k(c17819x3076c6d5));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet.start();
            i18 = i19 + 1;
            c17 = 0;
        }
        android.animation.ValueAnimator ofFloat5 = android.animation.ValueAnimator.ofFloat(0.3f, 1.0f);
        ofFloat5.setDuration(1500L);
        ofFloat5.addUpdateListener(new e94.i(c17819x3076c6d5));
        ofFloat5.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$1");
    }
}
