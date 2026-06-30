package br4;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static br4.e f23717e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f23718a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public is0.c f23719b = null;

    /* renamed from: c, reason: collision with root package name */
    public wq4.l0 f23720c;

    /* renamed from: d, reason: collision with root package name */
    public br4.d f23721d;

    public static br4.e b() {
        if (f23717e == null) {
            f23717e = new br4.e();
        }
        return f23717e;
    }

    public synchronized wq4.l0 a() {
        this.f23719b = is0.b.b(false, 14L);
        this.f23720c = new wq4.l0(this.f23719b.f294395e);
        this.f23719b.close();
        this.f23719b = null;
        return this.f23720c;
    }
}
