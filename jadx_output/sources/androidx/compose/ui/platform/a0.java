package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class a0 {
    public static final void a(android.view.accessibility.AccessibilityEvent event, int i17, int i18) {
        kotlin.jvm.internal.o.g(event, "event");
        event.setScrollDeltaX(i17);
        event.setScrollDeltaY(i18);
    }
}
