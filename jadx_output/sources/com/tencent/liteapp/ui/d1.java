package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class d1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f46146d;

    public d1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI, java.lang.ref.WeakReference weakReference) {
        this.f46146d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = (com.tencent.liteapp.ui.WxaLiteAppUI) this.f46146d.get();
        if (wxaLiteAppUI != null) {
            wxaLiteAppUI.S = wxaLiteAppUI.getResources().getConfiguration().orientation == 2;
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "onGlobalLayout activityId=%d size=%d,%d", java.lang.Long.valueOf(wxaLiteAppUI.D), java.lang.Integer.valueOf(wxaLiteAppUI.f46109s.getWidth()), java.lang.Integer.valueOf(wxaLiteAppUI.f46109s.getHeight()));
            wxaLiteAppUI.c7(true, false);
        }
    }
}
