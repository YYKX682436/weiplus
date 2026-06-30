package v74;

/* loaded from: classes4.dex */
public final class f1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f515314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f515315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f515316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f515317g;

    public f1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, v74.h1 h1Var) {
        this.f515314d = h0Var;
        this.f515315e = h0Var2;
        this.f515316f = h0Var3;
        this.f515317g = h1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f515314d;
        float ceil = (float) java.lang.Math.ceil(((v74.s) h0Var.f391656d).b() - ((((v74.s) h0Var.f391656d).b() - ((v74.s) h0Var.f391656d).a()) * floatValue));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f515315e;
        android.view.ViewGroup.LayoutParams layoutParams = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) h0Var2.f391656d).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) ceil;
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) h0Var2.f391656d).setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05) this.f515316f.f391656d;
        v74.s sVar = (v74.s) h0Var.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f515317g;
        h1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        int a17 = (h1Var.f515350q - sVar.a()) - h1Var.f515344k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        c17765x7b4a5f05.setTranslationX(a17 * (1 - floatValue));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$1");
    }
}
