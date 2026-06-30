package uw0;

/* loaded from: classes5.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513137d;

    public t(uw0.x xVar) {
        this.f513137d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m170643xc24d69b7;
        android.view.View m170643xc24d69b72;
        float m170642x410a6c6e;
        uw0.x xVar = this.f513137d;
        m170643xc24d69b7 = xVar.m170643xc24d69b7();
        if (m170643xc24d69b7.isAttachedToWindow()) {
            m170643xc24d69b72 = xVar.m170643xc24d69b7();
            m170642x410a6c6e = xVar.m170642x410a6c6e();
            m170643xc24d69b72.setTranslationY(m170642x410a6c6e);
            xVar.m170642x410a6c6e();
            float f17 = xVar.f513155y1;
        }
    }
}
