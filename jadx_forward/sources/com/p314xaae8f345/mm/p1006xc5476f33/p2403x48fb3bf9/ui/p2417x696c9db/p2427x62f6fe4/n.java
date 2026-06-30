package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267339d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c) {
        this.f267339d = viewOnClickListenerC19428xb021cc2c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ProgressBar progressBar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267339d;
        android.widget.ProgressBar progressBar2 = viewOnClickListenerC19428xb021cc2c.B;
        if ((progressBar2 != null && progressBar2.getVisibility() == 0) && (progressBar = viewOnClickListenerC19428xb021cc2c.B) != null) {
            progressBar.setVisibility(8);
        }
        if (viewOnClickListenerC19428xb021cc2c.E) {
            return;
        }
        android.view.View view = viewOnClickListenerC19428xb021cc2c.f267251q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$hideLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$hideLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
