package jq4;

/* loaded from: classes5.dex */
public final class d0 implements android.view.ViewManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f382669d;

    public d0(android.view.WindowManager windowManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowManager, "windowManager");
        this.f382669d = windowManager;
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "addView() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f382669d.addView(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoipBaseFloatCardManager", "addView: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "removeView() called with: view = " + view);
        try {
            this.f382669d.removeView(view);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoipBaseFloatCardManager", "updateViewLayout: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "updateViewLayout() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f382669d.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoipBaseFloatCardManager", "updateViewLayout: ", e17);
        }
    }
}
