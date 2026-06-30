package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lg1.a f84162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity f84164f;

    public n(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity, lg1.a aVar, android.content.Context context) {
        this.f84164f = keyStepAnalyserDetailActivity;
        this.f84162d = aVar;
        this.f84163e = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        lg1.a aVar = this.f84162d;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (aVar.getWidth() > 0) {
            float width = (com.tencent.mm.ui.dl.d(this.f84163e).x / 2) - (aVar.getWidth() / 2);
            com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = this.f84164f;
            keyStepAnalyserDetailActivity.f84110i = width;
            keyStepAnalyserDetailActivity.f84111m = (((r1.y / 2) - (aVar.getHeight() / 2)) - keyStepAnalyserDetailActivity.findViewById(com.tencent.mm.R.id.gxy).getHeight()) - keyStepAnalyserDetailActivity.findViewById(com.tencent.mm.R.id.f482432ef).getHeight();
            keyStepAnalyserDetailActivity.f84112n = aVar.getWidth() / 2.0f;
            keyStepAnalyserDetailActivity.f84113o = aVar.getHeight() / 2.0f;
            float width2 = r1.x / aVar.getWidth();
            keyStepAnalyserDetailActivity.f84115q = width2;
            keyStepAnalyserDetailActivity.f84114p = width2;
            keyStepAnalyserDetailActivity.f84108g.setTranslationX(keyStepAnalyserDetailActivity.f84110i);
            keyStepAnalyserDetailActivity.f84108g.setTranslationY(keyStepAnalyserDetailActivity.f84111m);
            keyStepAnalyserDetailActivity.f84108g.setPivotX(keyStepAnalyserDetailActivity.f84112n);
            keyStepAnalyserDetailActivity.f84108g.setPivotY(keyStepAnalyserDetailActivity.f84113o);
            keyStepAnalyserDetailActivity.f84108g.setScaleX(keyStepAnalyserDetailActivity.f84114p);
            keyStepAnalyserDetailActivity.f84108g.setScaleY(keyStepAnalyserDetailActivity.f84114p);
            keyStepAnalyserDetailActivity.f84106e.requestLayout();
        }
    }
}
