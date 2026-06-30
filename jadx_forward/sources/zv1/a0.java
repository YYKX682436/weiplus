package zv1;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: h, reason: collision with root package name */
    public static final zv1.z f557783h = new zv1.z(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f557784i = jz5.h.b(zv1.y.f557926d);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13102xd224c9f f557785a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f557786b;

    /* renamed from: c, reason: collision with root package name */
    public final zv1.e0 f557787c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f557788d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f557789e;

    /* renamed from: f, reason: collision with root package name */
    public final zv1.s f557790f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f557791g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13102xd224c9f trigger, java.util.Set cacheTypes, zv1.e0 threshold, boolean z17, boolean z18, zv1.s config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "trigger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheTypes, "cacheTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threshold, "threshold");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f557785a = trigger;
        this.f557786b = cacheTypes;
        this.f557787c = threshold;
        this.f557788d = z17;
        this.f557789e = z18;
        this.f557790f = config;
        int andIncrement = ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) f557784i).mo141623x754a37bb()).getAndIncrement();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(trigger.name());
        sb6.append('@');
        sb6.append(andIncrement);
        sb6.append('|');
        sb6.append(kk.v.a(gm0.j1.b().h()));
        sb6.append('_');
        long j17 = 1000000;
        sb6.append(threshold.f557823a / j17);
        sb6.append('|');
        sb6.append(threshold.f557824b / j17);
        this.f557791g = sb6.toString();
    }

    /* renamed from: equals */
    public boolean m179720xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.a0)) {
            return false;
        }
        zv1.a0 a0Var = (zv1.a0) obj;
        return this.f557785a == a0Var.f557785a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557786b, a0Var.f557786b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557787c, a0Var.f557787c) && this.f557788d == a0Var.f557788d && this.f557789e == a0Var.f557789e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557790f, a0Var.f557790f);
    }

    /* renamed from: hashCode */
    public int m179721x8cdac1b() {
        return (((((((((this.f557785a.hashCode() * 31) + this.f557786b.hashCode()) * 31) + this.f557787c.m179738x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f557788d)) * 31) + java.lang.Boolean.hashCode(this.f557789e)) * 31) + this.f557790f.m179767x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m179722x9616526c() {
        return "CleanCacheParams(trigger=" + this.f557785a + ", cacheTypes=" + this.f557786b + ", threshold=" + this.f557787c + ", forceClean=" + this.f557788d + ", dryRun=" + this.f557789e + ", config=" + this.f557790f + ')';
    }
}
