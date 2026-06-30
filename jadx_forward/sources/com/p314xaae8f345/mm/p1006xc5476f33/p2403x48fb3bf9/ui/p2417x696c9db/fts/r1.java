package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f266131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c f266132g;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c, int i17, int i18, float f17) {
        this.f266132g = activityC19380x649e7d5c;
        this.f266129d = i17;
        this.f266130e = i18;
        this.f266131f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        final int i17 = this.f266129d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        final int i18 = this.f266130e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "showNavBarShadow: 0x%X%X, %.2f", valueOf, java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(this.f266131f));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f266132g;
        android.view.View view = activityC19380x649e7d5c.f265821c5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = activityC19380x649e7d5c.f265821c5;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$19", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        activityC19380x649e7d5c.f265821c5.setBackgroundColor((-16777216) | i18);
        android.animation.ValueAnimator valueAnimator = activityC19380x649e7d5c.I5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int S6 = activityC19380x649e7d5c.S6();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.r1$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r1 r1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r1.this;
                r1Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.ya(r1Var.f266132g, i18, i17, S6, ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.s1(this, S6));
        ofFloat.setDuration((int) (java.lang.Math.max(0.0f, r5) * 1000.0f));
        ofFloat.start();
        activityC19380x649e7d5c.I5 = ofFloat;
        activityC19380x649e7d5c.f265821c5.setOnClickListener(activityC19380x649e7d5c.Q5);
        activityC19380x649e7d5c.E5 = true;
    }
}
