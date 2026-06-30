package eq1;

/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f337379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f337380b;

    /* renamed from: c, reason: collision with root package name */
    public final long f337381c;

    public o0(long j17, long j18, long j19) {
        this.f337379a = j17;
        this.f337380b = j18;
        this.f337381c = j19;
    }

    /* renamed from: equals */
    public boolean m127988xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq1.o0)) {
            return false;
        }
        eq1.o0 o0Var = (eq1.o0) obj;
        return this.f337379a == o0Var.f337379a && this.f337380b == o0Var.f337380b && this.f337381c == o0Var.f337381c;
    }

    /* renamed from: hashCode */
    public int m127989x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f337379a) * 31) + java.lang.Long.hashCode(this.f337380b)) * 31) + java.lang.Long.hashCode(this.f337381c);
    }

    /* renamed from: toString */
    public java.lang.String m127990x9616526c() {
        return "TripletInfo(mid=" + this.f337379a + ", idx=" + this.f337380b + ", bizUin=" + this.f337381c + ')';
    }
}
