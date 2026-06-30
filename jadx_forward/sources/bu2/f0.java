package bu2;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f106037a;

    /* renamed from: b, reason: collision with root package name */
    public bq.z1 f106038b;

    /* renamed from: c, reason: collision with root package name */
    public r45.s13 f106039c;

    /* renamed from: d, reason: collision with root package name */
    public r45.nb1 f106040d;

    public f0(long j17, bq.z1 z1Var, r45.s13 s13Var, r45.nb1 nb1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? java.lang.System.currentTimeMillis() : j17;
        z1Var = (i17 & 2) != 0 ? null : z1Var;
        s13Var = (i17 & 4) != 0 ? null : s13Var;
        nb1Var = (i17 & 8) != 0 ? null : nb1Var;
        this.f106037a = j17;
        this.f106038b = z1Var;
        this.f106039c = s13Var;
        this.f106040d = nb1Var;
    }

    public final bq.z1 a() {
        return this.f106038b;
    }

    /* renamed from: equals */
    public boolean m11287xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.f0)) {
            return false;
        }
        bu2.f0 f0Var = (bu2.f0) obj;
        return this.f106037a == f0Var.f106037a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106038b, f0Var.f106038b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106039c, f0Var.f106039c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106040d, f0Var.f106040d);
    }

    /* renamed from: hashCode */
    public int m11288x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f106037a) * 31;
        bq.z1 z1Var = this.f106038b;
        int hashCode2 = (hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        r45.s13 s13Var = this.f106039c;
        int hashCode3 = (hashCode2 + (s13Var == null ? 0 : s13Var.hashCode())) * 31;
        r45.nb1 nb1Var = this.f106040d;
        return hashCode3 + (nb1Var != null ? nb1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m11289x9616526c() {
        return "CacheData(cacheTime=" + this.f106037a + ", userPage=" + this.f106038b + ", pageHeader=" + this.f106039c + ", homePage=" + this.f106040d + ')';
    }
}
