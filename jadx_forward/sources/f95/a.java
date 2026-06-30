package f95;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f342066a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f342067b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f342068c;

    public a(java.lang.String sql, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        this.f342066a = sql;
        this.f342067b = z17;
        this.f342068c = z18;
    }

    /* renamed from: equals */
    public boolean m129235xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f95.a)) {
            return false;
        }
        f95.a aVar = (f95.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342066a, aVar.f342066a) && this.f342067b == aVar.f342067b && this.f342068c == aVar.f342068c;
    }

    /* renamed from: hashCode */
    public int m129236x8cdac1b() {
        return (((this.f342066a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f342067b)) * 31) + java.lang.Boolean.hashCode(this.f342068c);
    }

    /* renamed from: toString */
    public java.lang.String m129237x9616526c() {
        return "SQLInfo(sql=" + this.f342066a + ", isMainThread=" + this.f342067b + ", isReported=" + this.f342068c + ')';
    }
}
