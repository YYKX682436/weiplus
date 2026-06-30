package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.animation.Animation f92981a;

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.Animator f92982b;

    public p0(android.view.animation.Animation animation) {
        this.f92981a = animation;
        this.f92982b = null;
        if (animation == null) {
            throw new java.lang.IllegalStateException("Animation cannot be null");
        }
    }

    public p0(android.animation.Animator animator) {
        this.f92981a = null;
        this.f92982b = animator;
        if (animator == null) {
            throw new java.lang.IllegalStateException("Animator cannot be null");
        }
    }
}
