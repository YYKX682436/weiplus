package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class t implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f46222d;

    public t(com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment, java.lang.ref.WeakReference weakReference) {
        this.f46222d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = (com.tencent.liteapp.ui.WxaLiteAppFragment) this.f46222d.get();
        if (wxaLiteAppFragment != null) {
            int i17 = com.tencent.liteapp.ui.WxaLiteAppFragment.Q;
            wxaLiteAppFragment.n0();
        }
    }
}
