package x0;

/* loaded from: classes14.dex */
public abstract class m {

    /* renamed from: e, reason: collision with root package name */
    public static final x0.l f532440e = new x0.l(null);

    /* renamed from: a, reason: collision with root package name */
    public x0.s f532441a;

    /* renamed from: b, reason: collision with root package name */
    public int f532442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f532443c;

    /* renamed from: d, reason: collision with root package name */
    public int f532444d;

    public m(int i17, x0.s sVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18;
        int a17;
        this.f532441a = sVar;
        this.f532442b = i17;
        if (i17 != 0) {
            x0.s invalid = e();
            n0.c5 c5Var = x0.z.f532495a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalid, "invalid");
            int[] iArr = invalid.f532476g;
            if (iArr != null) {
                i17 = iArr[0];
            } else {
                long j17 = invalid.f532474e;
                int i19 = invalid.f532475f;
                if (j17 != 0) {
                    a17 = x0.t.a(j17);
                } else {
                    long j18 = invalid.f532473d;
                    if (j18 != 0) {
                        i19 += 64;
                        a17 = x0.t.a(j18);
                    }
                }
                i17 = a17 + i19;
            }
            synchronized (x0.z.f532496b) {
                i18 = x0.z.f532499e.a(i17);
            }
        } else {
            i18 = -1;
        }
        this.f532444d = i18;
    }

    public final void a() {
        synchronized (x0.z.f532496b) {
            b();
            n();
        }
    }

    public void b() {
        x0.z.f532497c = x0.z.f532497c.e(d());
    }

    public abstract void c();

    public int d() {
        return this.f532442b;
    }

    public x0.s e() {
        return this.f532441a;
    }

    public abstract yz5.l f();

    public abstract boolean g();

    public abstract yz5.l h();

    public x0.m i() {
        n0.c5 c5Var = x0.z.f532495a;
        x0.m mVar = (x0.m) c5Var.a();
        c5Var.b(this);
        return mVar;
    }

    public abstract void j(x0.m mVar);

    public abstract void k(x0.m mVar);

    public abstract void l();

    public abstract void m(x0.z0 z0Var);

    public void n() {
        int i17 = this.f532444d;
        if (i17 >= 0) {
            x0.z.s(i17);
            this.f532444d = -1;
        }
    }

    public void o(x0.m mVar) {
        x0.z.f532495a.b(mVar);
    }

    public void p(int i17) {
        this.f532442b = i17;
    }

    public void q(x0.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<set-?>");
        this.f532441a = sVar;
    }

    public abstract x0.m r(yz5.l lVar);
}
