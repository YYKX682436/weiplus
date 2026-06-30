package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class j0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46192d;

    public j0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI) {
        this.f46192d = wxaLiteAppTransparentUI;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "content view attach to Window", new java.lang.Object[0]);
        int i17 = com.tencent.liteapp.ui.WxaLiteAppTransparentUI.f46083z1;
        this.f46192d.U6();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
