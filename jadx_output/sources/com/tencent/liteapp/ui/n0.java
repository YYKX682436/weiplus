package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46206e;

    public n0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, int i17) {
        this.f46206e = wxaLiteAppTransparentUI;
        this.f46205d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46206e;
        if (i17 == 26) {
            int i18 = com.tencent.liteapp.ui.WxaLiteAppTransparentUI.f46083z1;
            wxaLiteAppTransparentUI.getClass();
            kd.c.e("WxaLiteApp.WxaLiteAppTransparentUI", "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        int i19 = this.f46205d;
        wxaLiteAppTransparentUI.f46086p = i19;
        if (i19 == 0) {
            wxaLiteAppTransparentUI.setRequestedOrientation(1);
            return;
        }
        if (i19 == 1) {
            if (android.provider.Settings.System.getInt(wxaLiteAppTransparentUI.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                wxaLiteAppTransparentUI.setRequestedOrientation(10);
                return;
            } else {
                wxaLiteAppTransparentUI.setRequestedOrientation(1);
                return;
            }
        }
        if (i19 == 2) {
            wxaLiteAppTransparentUI.setRequestedOrientation(1);
        } else if (i19 == 3) {
            wxaLiteAppTransparentUI.setRequestedOrientation(6);
        }
    }
}
