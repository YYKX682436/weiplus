package n3;

/* loaded from: classes14.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f415927a;

    /* renamed from: b, reason: collision with root package name */
    public float f415928b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.animation.Interpolator f415929c;

    /* renamed from: d, reason: collision with root package name */
    public final long f415930d;

    public r2(int i17, android.view.animation.Interpolator interpolator, long j17) {
        this.f415927a = i17;
        this.f415929c = interpolator;
        this.f415930d = j17;
    }

    public long a() {
        return this.f415930d;
    }

    public float b() {
        android.view.animation.Interpolator interpolator = this.f415929c;
        return interpolator != null ? interpolator.getInterpolation(this.f415928b) : this.f415928b;
    }

    public int c() {
        return this.f415927a;
    }

    public void d(float f17) {
        this.f415928b = f17;
    }
}
