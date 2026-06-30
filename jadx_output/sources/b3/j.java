package b3;

/* loaded from: classes13.dex */
public abstract class j {
    public static java.lang.String a(android.content.Context context) {
        return context.getAttributionTag();
    }

    public static android.view.Display b(android.content.Context context) {
        try {
            return context.getDisplay();
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Objects.toString(context);
            return ((android.hardware.display.DisplayManager) context.getSystemService(android.hardware.display.DisplayManager.class)).getDisplay(0);
        }
    }
}
