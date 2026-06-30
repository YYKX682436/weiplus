package ru5;

/* loaded from: classes10.dex */
public class g {

    /* renamed from: i, reason: collision with root package name */
    public static final ru5.j f481330i = new ru5.b();

    /* renamed from: j, reason: collision with root package name */
    public static final ru5.j f481331j = new ru5.l();

    /* renamed from: k, reason: collision with root package name */
    public static final ru5.f f481332k = new ru5.f();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f481333a;

    /* renamed from: b, reason: collision with root package name */
    public ru5.j f481334b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ru5.a f481335c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ru5.g f481336d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ru5.g f481337e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f481338f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f481339g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f481340h = new java.util.concurrent.atomic.AtomicBoolean(false);

    public g() {
    }

    public static ru5.g b() {
        return new ru5.g(f481332k);
    }

    public final void a() {
        if (this.f481339g) {
            synchronized (this.f481338f) {
                if (this.f481339g) {
                    this.f481338f.notifyAll();
                }
            }
        }
    }

    public void c(ru5.a aVar) {
        if (aVar == null) {
            a();
            return;
        }
        ru5.e eVar = new ru5.e(this, aVar);
        if (this.f481333a != null) {
            ru5.j jVar = this.f481334b;
            if (jVar == null) {
                eVar.run();
            } else {
                jVar.execute(eVar);
            }
        }
    }

    public ru5.a d() {
        return null;
    }

    public ru5.j e() {
        return this.f481334b;
    }

    public ru5.g f(ru5.a aVar) {
        java.util.Objects.requireNonNull(aVar);
        ru5.g gVar = new ru5.g();
        gVar.f481334b = e();
        gVar.f481336d = null;
        this.f481337e = gVar;
        this.f481335c = aVar;
        this.f481340h.compareAndSet(false, true);
        c(aVar);
        return gVar;
    }

    public java.lang.Object g() {
        try {
            if (this.f481333a == null) {
                synchronized (this.f481338f) {
                    if (this.f481333a == null) {
                        this.f481339g = true;
                        this.f481338f.wait();
                        this.f481339g = false;
                    }
                }
            }
        } catch (java.lang.InterruptedException unused) {
        }
        return this.f481333a;
    }

    public g(java.lang.Object obj) {
        this.f481333a = obj;
    }
}
