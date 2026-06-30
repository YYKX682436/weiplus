package or2;

/* loaded from: classes10.dex */
public abstract class k {
    public static final int a(android.view.Window window) {
        float refreshRate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.Display display = window.getContext().getDisplay();
            refreshRate = display != null ? display.getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        return a06.d.b(refreshRate);
    }
}
