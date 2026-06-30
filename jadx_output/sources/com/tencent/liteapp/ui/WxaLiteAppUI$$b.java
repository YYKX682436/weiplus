package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public final /* synthetic */ class WxaLiteAppUI$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46123d;

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46123d;
        if (!wxaLiteAppUI.E1 || wxaLiteAppUI.C1.getVisibility() == 0) {
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "resetScreenShotView", new java.lang.Object[0]);
            wxaLiteAppUI.E1 = true;
            android.widget.ImageView imageView = wxaLiteAppUI.C1;
            if (imageView != null) {
                imageView.setVisibility(8);
                wxaLiteAppUI.C1.setImageDrawable(null);
            }
            android.graphics.Bitmap bitmap = wxaLiteAppUI.D1;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            wxaLiteAppUI.D1.recycle();
            wxaLiteAppUI.D1 = null;
        }
    }
}
