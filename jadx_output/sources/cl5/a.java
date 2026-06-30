package cl5;

/* loaded from: classes5.dex */
public final class a implements android.view.ViewManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f42974d;

    public a(android.view.WindowManager windowManager) {
        kotlin.jvm.internal.o.g(windowManager, "windowManager");
        this.f42974d = windowManager;
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.ui.yk.c("PushBanner", "addView() called with: view = " + view + ", params = " + layoutParams, new java.lang.Object[0]);
        try {
            this.f42974d.addView(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("PushBanner", "addView: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mm.ui.yk.c("PushBanner", "removeView() called with: view = " + view, new java.lang.Object[0]);
        try {
            this.f42974d.removeView(view);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("PushBanner", "updateViewLayout: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            this.f42974d.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("PushBanner", "updateViewLayout: ", e17);
        }
    }
}
