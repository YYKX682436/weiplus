package androidx.core.widget;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.EdgeEffect f11102a;

    public i(android.content.Context context) {
        this.f11102a = new android.widget.EdgeEffect(context);
    }

    public static float a(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.h.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float d(android.widget.EdgeEffect edgeEffect, float f17, float f18) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.h.c(edgeEffect, f17, f18);
        }
        androidx.core.widget.g.a(edgeEffect, f17, f18);
        return f17;
    }

    public boolean b() {
        return this.f11102a.isFinished();
    }

    public boolean c(float f17) {
        this.f11102a.onPull(f17);
        return true;
    }

    public boolean e() {
        android.widget.EdgeEffect edgeEffect = this.f11102a;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
