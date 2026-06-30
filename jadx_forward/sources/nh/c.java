package nh;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f418600d = jz5.h.a(jz5.i.f384362d, nh.a.f418598d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418601a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418602b;

    /* renamed from: c, reason: collision with root package name */
    public rh.c1 f418603c;

    public c(java.lang.String module) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        this.f418601a = module;
        int andIncrement = ((java.util.concurrent.atomic.AtomicInteger) f418600d.mo141623x754a37bb()).getAndIncrement();
        this.f418602b = andIncrement;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPowerProfiler", "new: " + module + '@' + andIncrement);
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel: ");
        sb6.append(this.f418601a);
        sb6.append('@');
        sb6.append(this.f418602b);
        sb6.append(", hashcode=");
        rh.c1 c1Var = this.f418603c;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPowerProfiler", sb6.toString());
        if (gi.d.e() != null) {
            synchronized (this) {
                rh.c1 c1Var2 = this.f418603c;
                if (c1Var2 != null) {
                    c1Var2.a();
                }
            }
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear: ");
        sb6.append(this.f418601a);
        sb6.append('@');
        sb6.append(this.f418602b);
        sb6.append(", hashcode=");
        rh.c1 c1Var = this.f418603c;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPowerProfiler", sb6.toString());
        if (gi.d.e() != null) {
            synchronized (this) {
                rh.c1 c1Var2 = this.f418603c;
                if (c1Var2 != null) {
                    c1Var2.b();
                }
            }
        }
    }

    public final rh.c1 c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish: ");
        sb6.append(this.f418601a);
        sb6.append('@');
        sb6.append(this.f418602b);
        sb6.append(", hashcode=");
        rh.c1 c1Var = this.f418603c;
        rh.c1 c1Var2 = null;
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPowerProfiler", sb6.toString());
        if (gi.d.e() == null) {
            return null;
        }
        synchronized (this) {
            rh.c1 c1Var3 = this.f418603c;
            if (c1Var3 != null) {
                c1Var3.l();
                c1Var2 = c1Var3;
            }
        }
        return c1Var2;
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPowerProfiler", "start: " + this.f418601a + '@' + this.f418602b);
        if (gi.d.e() != null) {
            synchronized (this) {
                ph.u e17 = gi.d.e();
                rh.c1 c1Var = e17 != null ? new nh.b(this, e17.f435829h).f353554a : null;
                this.f418603c = c1Var;
                if (c1Var != null) {
                    c1Var.I();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCompositors: ");
                sb6.append(this.f418601a);
                sb6.append('@');
                sb6.append(this.f418602b);
                sb6.append(", hashcode=");
                rh.c1 c1Var2 = this.f418603c;
                sb6.append(c1Var2 != null ? java.lang.Integer.valueOf(c1Var2.hashCode()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPowerProfiler", sb6.toString());
            }
        }
    }
}
