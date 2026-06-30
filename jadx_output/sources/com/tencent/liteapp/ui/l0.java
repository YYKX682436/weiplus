package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f46199d;

    public l0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, java.lang.ref.WeakReference weakReference) {
        this.f46199d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = (com.tencent.liteapp.ui.WxaLiteAppTransparentUI) this.f46199d.get();
        if (wxaLiteAppTransparentUI != null) {
            wxaLiteAppTransparentUI.K = wxaLiteAppTransparentUI.getResources().getConfiguration().orientation == 2;
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onGlobalLayout activityId=%d size=%d,%d", java.lang.Long.valueOf(wxaLiteAppTransparentUI.C), java.lang.Integer.valueOf(wxaLiteAppTransparentUI.f46090r.getWidth()), java.lang.Integer.valueOf(wxaLiteAppTransparentUI.f46090r.getHeight()));
            wxaLiteAppTransparentUI.S6(true, false);
        }
    }
}
