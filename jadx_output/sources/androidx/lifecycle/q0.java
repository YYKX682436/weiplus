package androidx.lifecycle;

/* loaded from: classes13.dex */
public class q0 implements androidx.lifecycle.y {

    /* renamed from: o, reason: collision with root package name */
    public static final androidx.lifecycle.q0 f11640o = new androidx.lifecycle.q0();

    /* renamed from: h, reason: collision with root package name */
    public android.os.Handler f11645h;

    /* renamed from: d, reason: collision with root package name */
    public int f11641d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f11642e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11643f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11644g = true;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.b0 f11646i = new androidx.lifecycle.b0(this, true);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f11647m = new androidx.lifecycle.m0(this);

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.r0 f11648n = new androidx.lifecycle.n0(this);

    public void a() {
        int i17 = this.f11642e + 1;
        this.f11642e = i17;
        if (i17 == 1) {
            if (!this.f11643f) {
                this.f11645h.removeCallbacks(this.f11647m);
            } else {
                this.f11646i.f(androidx.lifecycle.m.ON_RESUME);
                this.f11643f = false;
            }
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f11646i;
    }
}
