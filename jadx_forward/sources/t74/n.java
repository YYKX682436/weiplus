package t74;

/* loaded from: classes4.dex */
public final class n extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f497730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f497731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f497732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f497733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f497734i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f497735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f497736n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f497737o;

    public n(t74.w1 w1Var, android.view.View view, android.view.View view2, int i17, android.view.View view3, float f17, android.view.View view4, android.view.View view5, float f18) {
        this.f497729d = w1Var;
        this.f497730e = view;
        this.f497731f = view2;
        this.f497732g = i17;
        this.f497733h = view3;
        this.f497734i = f17;
        this.f497735m = view4;
        this.f497736n = view5;
        this.f497737o = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        t74.w1 w1Var = this.f497729d;
        if (t74.w1.l0(w1Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "doFlipCardAnim onAnimationEnd, shouldInterceptAction");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1");
            return;
        }
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            R.d();
        }
        android.view.View view = this.f497730e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f497731f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$doFlipCardAnim$o1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f497732g;
        t74.w1.i0(w1Var, i17);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce O = t74.w1.O(w1Var);
        if (O != null) {
            O.m78922x7d600aec(t74.w1.N(w1Var));
        }
        if (i17 == 0) {
            w1Var.L0();
            t74.i2 R2 = t74.w1.R(w1Var);
            if (R2 != null) {
                R2.c(0);
            }
            if (t74.w1.Y(w1Var)) {
                t74.i2 R3 = t74.w1.R(w1Var);
                if (R3 != null) {
                    R3.e(1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H = t74.w1.H(w1Var);
                if (H != null) {
                    H.M(0, false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H2 = t74.w1.H(w1Var);
                if (H2 != null) {
                    H2.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 1);
                }
            }
        } else {
            t74.i2 R4 = t74.w1.R(w1Var);
            if (R4 != null) {
                R4.c(1);
            }
            if (t74.w1.Z(w1Var)) {
                t74.i2 R5 = t74.w1.R(w1Var);
                if (R5 != null) {
                    R5.e(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W = t74.w1.W(w1Var);
                if (W != null) {
                    W.M(0, false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W2 = t74.w1.W(w1Var);
                if (W2 != null) {
                    W2.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 1);
                }
            }
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        float f17 = this.f497734i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f497733h, "rotationY", -f17, 0.0f);
        android.view.View view3 = this.f497735m;
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view3, "rotationY", -f17, 0.0f);
        float f18 = this.f497737o;
        ofFloat2.addUpdateListener(new t74.l(view3, f18, w1Var));
        float[] fArr = {-f17, 0.0f};
        android.view.View view4 = this.f497736n;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view4, "rotationY", fArr);
        ofFloat3.addUpdateListener(new t74.m(view4, f18, w1Var));
        animatorSet.addListener(new t74.k(w1Var, i17));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1");
    }
}
