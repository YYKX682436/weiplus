package p3;

/* loaded from: classes13.dex */
public abstract class a {
    public static android.view.animation.Interpolator a(float f17, float f18) {
        return new android.view.animation.PathInterpolator(f17, f18);
    }

    public static android.view.animation.Interpolator b(float f17, float f18, float f19, float f27) {
        return new android.view.animation.PathInterpolator(f17, f18, f19, f27);
    }

    public static android.view.animation.Interpolator c(android.graphics.Path path) {
        return new android.view.animation.PathInterpolator(path);
    }
}
