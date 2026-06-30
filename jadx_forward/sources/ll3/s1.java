package ll3;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400767a;

    /* renamed from: b, reason: collision with root package name */
    public final long f400768b;

    /* renamed from: c, reason: collision with root package name */
    public final long f400769c;

    public s1(java.lang.String content, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f400767a = content;
        this.f400768b = j17;
        this.f400769c = j18;
    }

    /* renamed from: equals */
    public boolean m145939xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll3.s1)) {
            return false;
        }
        ll3.s1 s1Var = (ll3.s1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400767a, s1Var.f400767a) && this.f400768b == s1Var.f400768b && this.f400769c == s1Var.f400769c;
    }

    /* renamed from: hashCode */
    public int m145940x8cdac1b() {
        return (((this.f400767a.hashCode() * 31) + java.lang.Long.hashCode(this.f400768b)) * 31) + java.lang.Long.hashCode(this.f400769c);
    }

    /* renamed from: toString */
    public java.lang.String m145941x9616526c() {
        return "MusicLrcLine(content=" + this.f400767a + ", startTime=" + this.f400768b + ", endTime=" + this.f400769c + ')';
    }
}
