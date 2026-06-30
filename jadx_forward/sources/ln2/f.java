package ln2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.kv1 f401423a;

    /* renamed from: b, reason: collision with root package name */
    public long f401424b;

    /* renamed from: c, reason: collision with root package name */
    public final long f401425c;

    public f(r45.kv1 gift, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gift, "gift");
        this.f401423a = gift;
        this.f401424b = j17;
        this.f401425c = j18;
    }

    /* renamed from: equals */
    public boolean m146110xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2.f)) {
            return false;
        }
        ln2.f fVar = (ln2.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401423a, fVar.f401423a) && this.f401424b == fVar.f401424b && this.f401425c == fVar.f401425c;
    }

    /* renamed from: hashCode */
    public int m146111x8cdac1b() {
        return (((this.f401423a.hashCode() * 31) + java.lang.Long.hashCode(this.f401424b)) * 31) + java.lang.Long.hashCode(this.f401425c);
    }

    /* renamed from: toString */
    public java.lang.String m146112x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name: ");
        r45.kv1 kv1Var = this.f401423a;
        sb6.append(kv1Var.m75945x2fec8307(8));
        sb6.append(" price: ");
        sb6.append(kv1Var.m75938x746dc8a6(9));
        sb6.append(" target: ");
        sb6.append(this.f401424b);
        sb6.append(" curCount: ");
        sb6.append(this.f401425c);
        return sb6.toString();
    }
}
