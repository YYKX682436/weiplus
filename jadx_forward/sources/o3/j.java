package o3;

/* loaded from: classes14.dex */
public abstract class j {
    public static void a(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static java.lang.CharSequence b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static long c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    public static boolean d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    public static boolean e(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void f(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z17) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z17);
    }

    public static void g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    public static void h(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void i(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, long j17) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(java.time.Duration.ofMillis(j17));
    }

    public static void j(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, boolean z17) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z17);
    }

    public static void k(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z17) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z17);
    }
}
