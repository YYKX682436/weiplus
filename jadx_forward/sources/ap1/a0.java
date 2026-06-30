package ap1;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94133a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94134b;

    /* renamed from: c, reason: collision with root package name */
    public final long f94135c;

    public a0(java.lang.String username, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f94133a = username;
        this.f94134b = j17;
        this.f94135c = j18;
    }

    /* renamed from: equals */
    public boolean m8746xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1.a0)) {
            return false;
        }
        ap1.a0 a0Var = (ap1.a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94133a, a0Var.f94133a) && this.f94134b == a0Var.f94134b && this.f94135c == a0Var.f94135c;
    }

    /* renamed from: hashCode */
    public int m8747x8cdac1b() {
        return (((this.f94133a.hashCode() * 31) + java.lang.Long.hashCode(this.f94134b)) * 31) + java.lang.Long.hashCode(this.f94135c);
    }

    /* renamed from: toString */
    public java.lang.String m8748x9616526c() {
        return "ContactInfo(username=" + this.f94133a + ", lastMsgTime=" + this.f94134b + ", size=" + this.f94135c + ')';
    }
}
