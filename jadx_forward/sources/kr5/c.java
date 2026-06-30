package kr5;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    public static kr5.c f393058f;

    /* renamed from: b, reason: collision with root package name */
    public kr5.g f393060b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f393061c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f393059a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public int f393062d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final sr5.c f393063e = new sr5.c(new kr5.b(this), 15L);

    public static kr5.c c() {
        if (f393058f == null) {
            synchronized (kr5.c.class) {
                if (f393058f == null) {
                    f393058f = new kr5.c();
                }
            }
        }
        return f393058f;
    }

    public final java.util.List a() {
        return "Https".equals(this.f393060b.f393087i) ? new java.util.ArrayList(java.util.Arrays.asList(kr5.d.f393065b)) : new java.util.ArrayList(java.util.Arrays.asList(kr5.d.f393067d));
    }

    public java.lang.String b() {
        if (this.f393059a.get() >= 3) {
            if (this.f393062d >= this.f393061c.size() - 1) {
                this.f393062d = 0;
                tr5.b.d(0);
            } else {
                this.f393062d++;
            }
            this.f393059a.set(0);
            or5.b.a("IP Changed：" + ((java.lang.String) this.f393061c.get(this.f393062d)), new java.lang.Object[0]);
        }
        return (java.lang.String) this.f393061c.get(this.f393062d);
    }

    public void d() {
        if ("Https".equals(this.f393060b.f393087i) || !kr5.p.f393104b.f393095q) {
            return;
        }
        sr5.c cVar = this.f393063e;
        java.util.Timer timer = cVar.f493401a;
        if (timer != null) {
            timer.cancel();
        }
        java.util.Timer timer2 = new java.util.Timer();
        cVar.f493401a = timer2;
        timer2.schedule(new sr5.b(cVar), cVar.f493402b.longValue());
    }

    public void e(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f393061c = list;
        or5.b.a("dns servers Ips: " + this.f393061c, new java.lang.Object[0]);
        this.f393062d = 0;
        this.f393059a.set(0);
    }
}
