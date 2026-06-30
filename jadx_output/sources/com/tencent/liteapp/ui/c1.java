package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class c1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46142d;

    public c1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI) {
        this.f46142d = wxaLiteAppUI;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "content view attach to Window", new java.lang.Object[0]);
        this.f46142d.f7();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
