package cl5;

/* loaded from: classes5.dex */
public final class a implements android.view.ViewManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f124507d;

    public a(android.view.WindowManager windowManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowManager, "windowManager");
        this.f124507d = windowManager;
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.ui.yk.c("PushBanner", "addView() called with: view = " + view + ", params = " + layoutParams, new java.lang.Object[0]);
        try {
            this.f124507d.addView(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("PushBanner", "addView: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.mm.ui.yk.c("PushBanner", "removeView() called with: view = " + view, new java.lang.Object[0]);
        try {
            this.f124507d.removeView(view);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("PushBanner", "updateViewLayout: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            this.f124507d.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("PushBanner", "updateViewLayout: ", e17);
        }
    }
}
