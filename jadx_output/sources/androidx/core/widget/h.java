package androidx.core.widget;

/* loaded from: classes14.dex */
public abstract class h {
    public static android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static float b(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(android.widget.EdgeEffect edgeEffect, float f17, float f18) {
        try {
            return edgeEffect.onPullDistance(f17, f18);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f17, f18);
            return 0.0f;
        }
    }
}
