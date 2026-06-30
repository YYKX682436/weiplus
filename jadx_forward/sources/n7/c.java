package n7;

/* loaded from: classes13.dex */
public abstract class c implements n7.h {

    /* renamed from: d, reason: collision with root package name */
    public final int f416760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f416761e;

    /* renamed from: f, reason: collision with root package name */
    public m7.b f416762f;

    public c() {
        if (!q7.p.f(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f416760d = Integer.MIN_VALUE;
        this.f416761e = Integer.MIN_VALUE;
    }

    @Override // n7.h
    public final m7.b a() {
        return this.f416762f;
    }

    @Override // n7.h
    public final void d(m7.b bVar) {
        this.f416762f = bVar;
    }

    @Override // n7.h
    public final void e(n7.g gVar) {
    }

    @Override // n7.h
    public final void f(n7.g gVar) {
        ((m7.h) gVar).l(this.f416760d, this.f416761e);
    }

    @Override // n7.h
    public void g(android.graphics.drawable.Drawable drawable) {
    }

    @Override // n7.h
    public void h(android.graphics.drawable.Drawable drawable) {
    }

    @Override // j7.k
    /* renamed from: onDestroy */
    public void mo15461xac79a11b() {
    }

    @Override // j7.k
    /* renamed from: onStart */
    public void mo15462xb05099c3() {
    }

    @Override // j7.k
    /* renamed from: onStop */
    public void mo15463xc39f8281() {
    }
}
