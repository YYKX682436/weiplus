package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class p implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f46211d;

    public p(com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, java.lang.ref.WeakReference weakReference) {
        this.f46211d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) this.f46211d.get();
        if (wxaLiteAppBaseView != null) {
            wxaLiteAppBaseView.e();
        }
    }
}
