package androidx.core.widget;

/* loaded from: classes15.dex */
public abstract class x {
    public static int a(android.widget.TextView textView) {
        return textView.getAutoSizeMaxTextSize();
    }

    public static int b(android.widget.TextView textView) {
        return textView.getAutoSizeMinTextSize();
    }

    public static int c(android.widget.TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static int[] d(android.widget.TextView textView) {
        return textView.getAutoSizeTextAvailableSizes();
    }

    public static int e(android.widget.TextView textView) {
        return textView.getAutoSizeTextType();
    }

    public static void f(android.widget.TextView textView, int i17, int i18, int i19, int i27) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i17, i18, i19, i27);
    }

    public static void g(android.widget.TextView textView, int[] iArr, int i17) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i17);
    }

    public static void h(android.widget.TextView textView, int i17) {
        textView.setAutoSizeTextTypeWithDefaults(i17);
    }
}
