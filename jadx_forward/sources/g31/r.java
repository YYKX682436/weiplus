package g31;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349641a;

    /* renamed from: b, reason: collision with root package name */
    public long f349642b;

    /* renamed from: c, reason: collision with root package name */
    public g31.s f349643c;

    /* renamed from: d, reason: collision with root package name */
    public int f349644d;

    public r(java.lang.String username, long j17, g31.s status, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 2) != 0 ? 0L : j17;
        status = (i18 & 4) != 0 ? g31.s.f349645d : status;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f349641a = username;
        this.f349642b = j17;
        this.f349643c = status;
        this.f349644d = i17;
    }

    /* renamed from: equals */
    public boolean m130784xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31.r)) {
            return false;
        }
        g31.r rVar = (g31.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349641a, rVar.f349641a) && this.f349642b == rVar.f349642b && this.f349643c == rVar.f349643c && this.f349644d == rVar.f349644d;
    }

    /* renamed from: hashCode */
    public int m130785x8cdac1b() {
        return (((((this.f349641a.hashCode() * 31) + java.lang.Long.hashCode(this.f349642b)) * 31) + this.f349643c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349644d);
    }

    /* renamed from: toString */
    public java.lang.String m130786x9616526c() {
        return "FetchItem(username=" + this.f349641a + ", updateTime=" + this.f349642b + ", status=" + this.f349643c + ", failedCount=" + this.f349644d + ')';
    }
}
