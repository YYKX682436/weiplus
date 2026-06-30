package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f127732d;

    public l0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, java.lang.ref.WeakReference weakReference) {
        this.f127732d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = (com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133) this.f127732d.get();
        if (activityC3721x69b5f133 != null) {
            activityC3721x69b5f133.K = activityC3721x69b5f133.getResources().getConfiguration().orientation == 2;
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onGlobalLayout activityId=%d size=%d,%d", java.lang.Long.valueOf(activityC3721x69b5f133.C), java.lang.Integer.valueOf(activityC3721x69b5f133.f127623r.getWidth()), java.lang.Integer.valueOf(activityC3721x69b5f133.f127623r.getHeight()));
            activityC3721x69b5f133.S6(true, false);
        }
    }
}
