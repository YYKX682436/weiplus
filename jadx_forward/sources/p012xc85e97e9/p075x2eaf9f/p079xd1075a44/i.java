package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.EdgeEffect f92635a;

    public i(android.content.Context context) {
        this.f92635a = new android.widget.EdgeEffect(context);
    }

    public static float a(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p012xc85e97e9.p075x2eaf9f.p079xd1075a44.h.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float d(android.widget.EdgeEffect edgeEffect, float f17, float f18) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return p012xc85e97e9.p075x2eaf9f.p079xd1075a44.h.c(edgeEffect, f17, f18);
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.g.a(edgeEffect, f17, f18);
        return f17;
    }

    public boolean b() {
        return this.f92635a.isFinished();
    }

    public boolean c(float f17) {
        this.f92635a.onPull(f17);
        return true;
    }

    public boolean e() {
        android.widget.EdgeEffect edgeEffect = this.f92635a;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
