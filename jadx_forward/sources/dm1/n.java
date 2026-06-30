package dm1;

/* loaded from: classes5.dex */
public final class n implements android.view.ViewManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f323193d;

    public n(android.view.WindowManager windowManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowManager, "windowManager");
        this.f323193d = windowManager;
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WindowManagerProxy", "addView() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f323193d.addView(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WMPFVoip.WindowManagerProxy", "addView: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WindowManagerProxy", "removeView() called with: view = " + view);
        try {
            this.f323193d.removeView(view);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f323193d.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout: ", e17);
        }
    }
}
