package xb4;

/* loaded from: classes4.dex */
public class v0 extends xb4.y {

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.AnimatorSet f534528c;

    /* renamed from: d, reason: collision with root package name */
    public final u74.d f534529d;

    public v0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, u74.d dVar, boolean z17) {
        try {
            int i17 = dVar.T.f506664a;
            this.f534533a = abstractActivityC21394xb3d2c0cf;
            this.f534529d = dVar;
            android.view.View view = dVar.f506698z;
            int height = view.getHeight();
            int width = view.getWidth();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(400L);
            int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(this.f534533a);
            int i27 = c17[0];
            int i28 = c17[1];
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "rotation", 0.0f, z17 ? 90 : -90);
            ofFloat2.setDuration(400L);
            float f17 = height != 0 ? (i27 * 1.0f) / height : 1.0f;
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f17);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f17);
            ofFloat3.setDuration(400L);
            ofFloat4.setDuration(400L);
            float f18 = i18 + (width / 2.0f);
            float f19 = i19 + (height / 2.0f);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, (i27 / 2.0f) - f18);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, (i28 / 2.0f) - f19);
            ofFloat5.setDuration(400L);
            ofFloat6.setDuration(400L);
            android.animation.ValueAnimator ofFloat7 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat7.addUpdateListener(new xb4.t0(this, dVar));
            ofFloat7.setDuration(100L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            this.f534528c = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7);
            animatorSet.addListener(new xb4.u0(this, dVar));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAnim.simple_twist", "init exp=" + th6.toString());
            b();
        }
    }

    @Override // xb4.y
    public void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
        android.animation.AnimatorSet animatorSet = this.f534528c;
        if (animatorSet != null && !animatorSet.isStarted()) {
            animatorSet.setStartDelay(j17);
            animatorSet.start();
            fd4.l lVar = this.f534529d.T.f506668e;
            if (lVar instanceof fd4.t) {
                fd4.t tVar = (fd4.t) lVar;
                tVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5 = tVar.f342869q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                if (c17821xa501ffb5 != null && c17821xa501ffb5.getVisibility() == 0) {
                    c17821xa501ffb5.setAlpha(0.0f);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
    }

    public void b() {
        u74.d dVar = this.f534529d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetViewStatus", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.simple_twist", "resetViewStatus");
        try {
            dVar.f506698z.setScaleX(1.0f);
            dVar.f506698z.setScaleY(1.0f);
            android.view.View view = dVar.f506698z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            dVar.f506698z.setRotation(0.0f);
            dVar.f506698z.setTranslationX(0.0f);
            dVar.f506698z.setTranslationY(0.0f);
            android.view.View view2 = dVar.f506675c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = dVar.f506678f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdSimpleTwistClickAnimationNew", "resetViewStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            fd4.l lVar = dVar.T.f506668e;
            if (lVar instanceof fd4.t) {
                fd4.t tVar = (fd4.t) lVar;
                tVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5 = tVar.f342869q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistCoverView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.TwistAdBusiness");
                if (c17821xa501ffb5 != null) {
                    c17821xa501ffb5.setAlpha(1.0f);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAnim.simple_twist", "resetViewStatus exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetViewStatus", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew");
    }
}
