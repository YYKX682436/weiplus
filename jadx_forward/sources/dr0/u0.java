package dr0;

/* loaded from: classes12.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f324091a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Throwable f324092b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f324093c;

    public u0(java.util.List keys, java.lang.Throwable th6, java.util.Map extra, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        keys = (i17 & 1) != 0 ? kz5.p0.f395529d : keys;
        th6 = (i17 & 2) != 0 ? null : th6;
        extra = (i17 & 4) != 0 ? new java.util.LinkedHashMap() : extra;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        this.f324091a = keys;
        this.f324092b = th6;
        this.f324093c = extra;
    }

    /* renamed from: equals */
    public boolean m125955xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0.u0)) {
            return false;
        }
        dr0.u0 u0Var = (dr0.u0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f324091a, u0Var.f324091a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f324092b, u0Var.f324092b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f324093c, u0Var.f324093c);
    }

    /* renamed from: hashCode */
    public int m125956x8cdac1b() {
        int hashCode = this.f324091a.hashCode() * 31;
        java.lang.Throwable th6 = this.f324092b;
        return ((hashCode + (th6 == null ? 0 : th6.hashCode())) * 31) + this.f324093c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m125957x9616526c() {
        return "Args(keys=" + this.f324091a + ", stack=" + this.f324092b + ", extra=" + this.f324093c + ')';
    }
}
