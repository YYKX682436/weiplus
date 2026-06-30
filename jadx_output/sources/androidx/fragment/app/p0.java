package androidx.fragment.app;

/* loaded from: classes14.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.animation.Animation f11448a;

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.Animator f11449b;

    public p0(android.view.animation.Animation animation) {
        this.f11448a = animation;
        this.f11449b = null;
        if (animation == null) {
            throw new java.lang.IllegalStateException("Animation cannot be null");
        }
    }

    public p0(android.animation.Animator animator) {
        this.f11448a = null;
        this.f11449b = animator;
        if (animator == null) {
            throw new java.lang.IllegalStateException("Animator cannot be null");
        }
    }
}
