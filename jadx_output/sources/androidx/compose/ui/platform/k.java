package androidx.compose.ui.platform;

/* loaded from: classes13.dex */
public final class k implements androidx.compose.ui.platform.i {
    public k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
    }
}
