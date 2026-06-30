package v74;

/* loaded from: classes4.dex */
public final class g1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f515330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f515331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f515332g;

    public g1(v74.h1 h1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f515330e = h1Var;
        this.f515331f = h0Var;
        this.f515332g = h0Var2;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "onAnimationEnd, isCanceled=" + this.f121239d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f515330e;
        h1Var.f515345l = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (this.f121239d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
            return;
        }
        android.view.View a17 = v74.h1.a(h1Var);
        if (a17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f515331f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05) h0Var.f391656d;
        if (c17765x7b4a5f05 != null) {
            c17765x7b4a5f05.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f052 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05) h0Var.f391656d;
        if (c17765x7b4a5f052 != null) {
            c17765x7b4a5f052.setTranslationX(0.0f);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f515332g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) h0Var2.f391656d;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) h0Var2.f391656d;
        if (c22646x1e9ca552 != null) {
            c22646x1e9ca552.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        h1Var.f(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        h1Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOnAnimEndAction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        yz5.a aVar = h1Var.f515343j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOnAnimEndAction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f121239d = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashCardLogic", "onAnimationStart");
        android.view.View a17 = v74.h1.a(this.f515330e);
        if (a17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05) this.f515331f.f391656d;
        if (c17765x7b4a5f05 != null) {
            c17765x7b4a5f05.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) this.f515332g.f391656d;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
    }
}
