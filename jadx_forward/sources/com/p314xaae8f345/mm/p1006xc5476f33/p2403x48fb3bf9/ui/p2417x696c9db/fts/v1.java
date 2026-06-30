package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f266194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c f266195e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c, float f17) {
        this.f266195e = activityC19380x649e7d5c;
        this.f266194d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "hideNavBarShadow: %.2f", java.lang.Float.valueOf(this.f266194d));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f266195e;
        activityC19380x649e7d5c.E5 = false;
        final float alpha = activityC19380x649e7d5c.f265821c5.getAlpha() * 255.0f;
        final int color = activityC19380x649e7d5c.f265821c5.getBackground() instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) activityC19380x649e7d5c.f265821c5.getBackground()).getColor() & 16777215 : 0;
        android.animation.ValueAnimator valueAnimator = activityC19380x649e7d5c.I5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int S6 = activityC19380x649e7d5c.S6();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.webview.ui.tools.fts.v1$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v1.this;
                v1Var.getClass();
                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.ya(v1Var.f266195e, color, (int) alpha, S6, floatValue);
            }
        });
        ofFloat.setDuration((int) (java.lang.Math.max(0.0f, r0) * 1000.0f));
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.w1(this, color, alpha, S6));
        ofFloat.start();
        activityC19380x649e7d5c.I5 = ofFloat;
    }
}
