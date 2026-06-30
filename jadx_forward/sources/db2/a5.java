package db2;

/* loaded from: classes2.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f309424a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309425b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f309426c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f309427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309428e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309429f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309430g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.t21 f309431h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.bc1 f309432i;

    public a5(long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, int i17, int i18, java.lang.String str2, r45.t21 newLifeReportInfo, r45.bc1 bc1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        this.f309424a = j17;
        this.f309425b = str;
        this.f309426c = objectNonceId;
        this.f309427d = z17;
        this.f309428e = i17;
        this.f309429f = i18;
        this.f309430g = str2;
        this.f309431h = newLifeReportInfo;
        this.f309432i = bc1Var;
    }

    /* renamed from: equals */
    public boolean m123831xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2.a5)) {
            return false;
        }
        db2.a5 a5Var = (db2.a5) obj;
        return this.f309424a == a5Var.f309424a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309425b, a5Var.f309425b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309426c, a5Var.f309426c) && this.f309427d == a5Var.f309427d && this.f309428e == a5Var.f309428e && this.f309429f == a5Var.f309429f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309430g, a5Var.f309430g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309431h, a5Var.f309431h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309432i, a5Var.f309432i);
    }

    /* renamed from: hashCode */
    public int m123832x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f309424a) * 31;
        java.lang.String str = this.f309425b;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f309426c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f309427d)) * 31) + java.lang.Integer.hashCode(this.f309428e)) * 31) + java.lang.Integer.hashCode(this.f309429f)) * 31;
        java.lang.String str2 = this.f309430g;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f309431h.hashCode()) * 31;
        r45.bc1 bc1Var = this.f309432i;
        return hashCode3 + (bc1Var != null ? bc1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m123833x9616526c() {
        return "FinderFavCGIParams(feedId=" + this.f309424a + ", dupFlag=" + this.f309425b + ", objectNonceId=" + this.f309426c + ", fav=" + this.f309427d + ", scene=" + this.f309428e + ", source=" + this.f309429f + ", memberProviderUsername=" + this.f309430g + ", newLifeReportInfo=" + this.f309431h + ", showMileStoneInfo=" + this.f309432i + ')';
    }
}
