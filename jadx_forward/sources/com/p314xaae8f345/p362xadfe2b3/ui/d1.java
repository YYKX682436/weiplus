package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class d1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f127679d;

    public d1(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, java.lang.ref.WeakReference weakReference) {
        this.f127679d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = (com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7) this.f127679d.get();
        if (activityC3722x408816c7 != null) {
            activityC3722x408816c7.S = activityC3722x408816c7.getResources().getConfiguration().orientation == 2;
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "onGlobalLayout activityId=%d size=%d,%d", java.lang.Long.valueOf(activityC3722x408816c7.D), java.lang.Integer.valueOf(activityC3722x408816c7.f127642s.getWidth()), java.lang.Integer.valueOf(activityC3722x408816c7.f127642s.getHeight()));
            activityC3722x408816c7.c7(true, false);
        }
    }
}
