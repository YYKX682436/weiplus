package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes3.dex */
public class o3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f266102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f266103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f266104g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f266105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f266106i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f266107m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f266108n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f266109o;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29, int i17) {
        this.f266109o = activityC19391xc941d0e;
        this.f266101d = view;
        this.f266102e = f17;
        this.f266103f = f18;
        this.f266104g = f19;
        this.f266105h = f27;
        this.f266106i = f28;
        this.f266107m = f29;
        this.f266108n = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f266101d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$13", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$13", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = this.f266102e;
        android.view.View view2 = this.f266101d;
        view2.setScaleX(f17);
        view2.setScaleY(this.f266103f);
        view2.setX(this.f266104g);
        view2.setY(this.f266105h);
        view2.setTranslationX(this.f266106i);
        view2.setTranslationY(this.f266107m);
        view2.getLayoutParams().width = this.f266108n;
        view2.requestLayout();
        view2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n3(this), 300L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e = this.f266109o;
        if (activityC19391xc941d0e.V4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd ljd x:finish2");
            activityC19391xc941d0e.V4 = false;
            activityC19391xc941d0e.ia();
            activityC19391xc941d0e.finish();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
