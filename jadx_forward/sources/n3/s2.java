package n3;

/* loaded from: classes14.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final n3.r2 f415939a;

    public s2(int i17, android.view.animation.Interpolator interpolator, long j17) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.f415939a = new n3.q2(new android.view.WindowInsetsAnimation(i17, interpolator, j17));
        } else {
            this.f415939a = new n3.o2(i17, interpolator, j17);
        }
    }

    public int a() {
        return this.f415939a.c();
    }

    public s2(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.f415939a = new n3.q2(windowInsetsAnimation);
        }
    }
}
