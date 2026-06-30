package oa5;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.WeakHashMap f425387f = new java.util.WeakHashMap(0);

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f425388a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f425389b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Runnable f425390c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f425391d;

    /* renamed from: e, reason: collision with root package name */
    public oa5.a f425392e;

    public static oa5.b b(android.view.View view) {
        java.util.WeakHashMap weakHashMap = f425387f;
        oa5.b bVar = (oa5.b) weakHashMap.get(view);
        if (bVar == null) {
            int intValue = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK).intValue();
            bVar = intValue >= 19 ? new oa5.m(view) : intValue >= 16 ? new oa5.j(view) : new oa5.g(view);
            weakHashMap.put(view, bVar);
        }
        return bVar;
    }

    public abstract oa5.b a(float f17);

    public abstract void c();

    public abstract oa5.b d(float f17);

    public abstract oa5.b e(float f17);

    public abstract oa5.b f(float f17);

    public abstract oa5.b g(long j17);

    public abstract oa5.b h(android.view.animation.Interpolator interpolator);

    public abstract oa5.b i(android.animation.Animator.AnimatorListener animatorListener);

    public abstract oa5.b j(long j17);

    public oa5.b k(oa5.a aVar) {
        this.f425392e = aVar;
        return this;
    }

    public abstract void l();

    public abstract oa5.b m(float f17);

    public abstract oa5.b n(float f17);

    public abstract oa5.b o(java.lang.Runnable runnable);

    public abstract oa5.b p(java.lang.Runnable runnable);
}
