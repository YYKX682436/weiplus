package n0;

/* loaded from: classes14.dex */
public abstract class q4 implements x0.z0, x0.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.r4 f415221d;

    /* renamed from: e, reason: collision with root package name */
    public n0.p4 f415222e;

    public q4(java.lang.Object obj, n0.r4 policy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        this.f415221d = policy;
        this.f415222e = new n0.p4(obj);
    }

    @Override // x0.z0
    public x0.a1 d(x0.a1 previous, x0.a1 current, x0.a1 applied) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previous, "previous");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applied, "applied");
        n0.p4 p4Var = (n0.p4) previous;
        n0.p4 p4Var2 = (n0.p4) current;
        n0.p4 p4Var3 = (n0.p4) applied;
        java.lang.Object obj = p4Var2.f415205c;
        java.lang.Object obj2 = p4Var3.f415205c;
        n0.r4 r4Var = this.f415221d;
        if (r4Var.a(obj, obj2)) {
            return current;
        }
        java.lang.Object b17 = r4Var.b(p4Var.f415205c, p4Var2.f415205c, p4Var3.f415205c);
        if (b17 == null) {
            return null;
        }
        x0.a1 b18 = p4Var3.b();
        ((n0.p4) b18).f415205c = b17;
        return b18;
    }

    @Override // x0.z0
    public void e(x0.a1 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f415222e = (n0.p4) value;
    }

    @Override // x0.z0
    public x0.a1 g() {
        return this.f415222e;
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        return ((n0.p4) x0.z.q(this.f415222e, this)).f415205c;
    }

    @Override // n0.v2
    /* renamed from: setValue */
    public void mo148714x53d8522f(java.lang.Object obj) {
        x0.m i17;
        n0.p4 p4Var = (n0.p4) x0.z.h(this.f415222e, x0.z.i());
        if (this.f415221d.a(p4Var.f415205c, obj)) {
            return;
        }
        n0.p4 p4Var2 = this.f415222e;
        synchronized (x0.z.f532496b) {
            i17 = x0.z.i();
            ((n0.p4) x0.z.n(p4Var2, this, i17, p4Var)).f415205c = obj;
        }
        x0.z.m(i17, this);
    }

    /* renamed from: toString */
    public java.lang.String m148749x9616526c() {
        return "MutableState(value=" + ((n0.p4) x0.z.h(this.f415222e, x0.z.i())).f415205c + ")@" + hashCode();
    }
}
