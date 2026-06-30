package b0;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b0.e f16265a = new b0.e();

    public final android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public final float b(android.widget.EdgeEffect edgeEffect) {
        kotlin.jvm.internal.o.g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(android.widget.EdgeEffect edgeEffect, float f17, float f18) {
        kotlin.jvm.internal.o.g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f17, f18);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f17, f18);
            return 0.0f;
        }
    }
}
