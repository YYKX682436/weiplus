package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes3.dex */
public class m3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f266055d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f266058g;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, int i17, android.view.View view) {
        this.f266058g = activityC19391xc941d0e;
        this.f266056e = i17;
        this.f266057f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        float intValue = num.intValue();
        int i17 = this.f266056e;
        float f17 = intValue / i17;
        if (f17 <= 0.18d && !this.f266055d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd x:value:%d, originalWidth:%d， progress:%f", java.lang.Integer.valueOf(num.intValue()), java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17));
            this.f266055d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e = this.f266058g;
            if (activityC19391xc941d0e.V4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd ljd x:finish");
                activityC19391xc941d0e.V4 = false;
                activityC19391xc941d0e.ia();
                activityC19391xc941d0e.finish();
            }
        }
        android.view.View view = this.f266057f;
        view.getLayoutParams().width = num.intValue();
        view.requestLayout();
    }
}
