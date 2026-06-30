package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$$b */
/* loaded from: classes14.dex */
public final /* synthetic */ class RunnableC3724x9cd32bbb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127656d;

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127656d;
        if (!activityC3722x408816c7.E1 || activityC3722x408816c7.C1.getVisibility() == 0) {
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "resetScreenShotView", new java.lang.Object[0]);
            activityC3722x408816c7.E1 = true;
            android.widget.ImageView imageView = activityC3722x408816c7.C1;
            if (imageView != null) {
                imageView.setVisibility(8);
                activityC3722x408816c7.C1.setImageDrawable(null);
            }
            android.graphics.Bitmap bitmap = activityC3722x408816c7.D1;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            activityC3722x408816c7.D1.recycle();
            activityC3722x408816c7.D1 = null;
        }
    }
}
