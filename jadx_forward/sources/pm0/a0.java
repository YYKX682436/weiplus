package pm0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f438289a;

    /* renamed from: b, reason: collision with root package name */
    public final long f438290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f438291c;

    public a0(java.lang.Object obj, long j17, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        this.f438289a = obj;
        this.f438290b = j17;
        this.f438291c = z17;
    }

    /* renamed from: equals */
    public boolean m158699xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm0.a0)) {
            return false;
        }
        pm0.a0 a0Var = (pm0.a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438289a, a0Var.f438289a) && this.f438290b == a0Var.f438290b && this.f438291c == a0Var.f438291c;
    }

    /* renamed from: hashCode */
    public int m158700x8cdac1b() {
        java.lang.Object obj = this.f438289a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Long.hashCode(this.f438290b)) * 31) + java.lang.Boolean.hashCode(this.f438291c);
    }

    /* renamed from: toString */
    public java.lang.String m158701x9616526c() {
        java.lang.StringBuilder sb6;
        java.lang.String str;
        boolean z17 = this.f438291c;
        long j17 = this.f438290b;
        if (z17) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            str = "ns";
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            str = "ms";
        }
        sb6.append(str);
        return sb6.toString();
    }
}
