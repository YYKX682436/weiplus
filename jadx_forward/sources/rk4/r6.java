package rk4;

/* loaded from: classes4.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final pi0.l1 f478487a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f478488b;

    public r6(pi0.l1 instance, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instance, "instance");
        this.f478487a = instance;
        this.f478488b = z17;
    }

    /* renamed from: equals */
    public boolean m162640xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk4.r6)) {
            return false;
        }
        rk4.r6 r6Var = (rk4.r6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f478487a, r6Var.f478487a) && this.f478488b == r6Var.f478488b;
    }

    /* renamed from: hashCode */
    public int m162641x8cdac1b() {
        return (this.f478487a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f478488b);
    }

    /* renamed from: toString */
    public java.lang.String m162642x9616526c() {
        return "CachedAppInfo(instance=" + this.f478487a + ", newCreated=" + this.f478488b + ')';
    }
}
