package br4;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static br4.e f105250e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f105251a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public is0.c f105252b = null;

    /* renamed from: c, reason: collision with root package name */
    public wq4.l0 f105253c;

    /* renamed from: d, reason: collision with root package name */
    public br4.d f105254d;

    public static br4.e b() {
        if (f105250e == null) {
            f105250e = new br4.e();
        }
        return f105250e;
    }

    public synchronized wq4.l0 a() {
        this.f105252b = is0.b.b(false, 14L);
        this.f105253c = new wq4.l0(this.f105252b.f375928e);
        this.f105252b.close();
        this.f105252b = null;
        return this.f105253c;
    }
}
