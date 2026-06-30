package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class s implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppFragment f46220d;

    public s(com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment) {
        this.f46220d = wxaLiteAppFragment;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "content view attach to Window", new java.lang.Object[0]);
        int i17 = com.tencent.liteapp.ui.WxaLiteAppFragment.Q;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f46220d;
        if (wxaLiteAppFragment.f46067t != null) {
            wxaLiteAppFragment.f46067t.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.liteapp.ui.t(wxaLiteAppFragment, new java.lang.ref.WeakReference(wxaLiteAppFragment)));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
