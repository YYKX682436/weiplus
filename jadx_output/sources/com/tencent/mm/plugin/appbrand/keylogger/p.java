package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class p extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity f84169d;

    public p(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity) {
        this.f84169d = keyStepAnalyserDetailActivity;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = this.f84169d;
        if (keyStepAnalyserDetailActivity.f84108g == null) {
            return true;
        }
        keyStepAnalyserDetailActivity.f84114p = scaleGestureDetector.getScaleFactor() * keyStepAnalyserDetailActivity.f84115q;
        float f17 = keyStepAnalyserDetailActivity.f84114p;
        if (f17 > 5.0f || f17 < 0.1f) {
            return true;
        }
        keyStepAnalyserDetailActivity.f84108g.setTranslationX(keyStepAnalyserDetailActivity.f84110i);
        keyStepAnalyserDetailActivity.f84108g.setTranslationY(keyStepAnalyserDetailActivity.f84111m);
        keyStepAnalyserDetailActivity.f84108g.setPivotX(keyStepAnalyserDetailActivity.f84112n);
        keyStepAnalyserDetailActivity.f84108g.setPivotY(keyStepAnalyserDetailActivity.f84113o);
        keyStepAnalyserDetailActivity.f84108g.setScaleX(keyStepAnalyserDetailActivity.f84114p);
        keyStepAnalyserDetailActivity.f84108g.setScaleY(keyStepAnalyserDetailActivity.f84114p);
        keyStepAnalyserDetailActivity.f84115q = keyStepAnalyserDetailActivity.f84114p;
        return false;
    }
}
