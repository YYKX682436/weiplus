package gu0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357208d;

    public g(hu0.a0 a0Var) {
        this.f357208d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f357208d;
        int R6 = a0Var.R6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onEditPanelOpenStart: estimatedHeightPx=" + R6);
        a0Var.f366547m = hu0.p.f366579e;
        a0Var.f366548n = R6;
        android.view.View view = a0Var.f366545h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "onEditPanelOpenStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "onEditPanelOpenStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setEnabled(false);
        }
        android.widget.FrameLayout frameLayout = a0Var.f366544g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        a0Var.V6(a0Var.f366549o, 1.0f, R6);
    }
}
