package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class z extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, android.os.Handler handler) {
        super(handler);
        this.f46243a = wxaLiteAppTransparentUI;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46243a;
        if (wxaLiteAppTransparentUI.f46086p == 1) {
            if (android.provider.Settings.System.getInt(wxaLiteAppTransparentUI.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                wxaLiteAppTransparentUI.setRequestedOrientation(10);
            } else {
                wxaLiteAppTransparentUI.setRequestedOrientation(1);
            }
        }
    }
}
