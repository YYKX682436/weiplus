package b0;

/* loaded from: classes14.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0.p1 f98004a = new b0.p1();

    public final android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return android.os.Build.VERSION.SDK_INT >= 31 ? b0.e.f97798a.a(context, attributeSet) : new android.widget.EdgeEffect(context);
    }

    public final float b(android.widget.EdgeEffect edgeEffect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return b0.e.f97798a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final float c(android.widget.EdgeEffect edgeEffect, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edgeEffect, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return b0.e.f97798a.c(edgeEffect, f17, f18);
        }
        edgeEffect.onPull(f17, f18);
        return f17;
    }
}
