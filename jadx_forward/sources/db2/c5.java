package db2;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f309460a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309461b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f309462c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f309463d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309464e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309465f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309466g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f309467h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309468i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.bc1 f309469j;

    public c5(long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, boolean z18, int i17, int i18, java.lang.String str2, java.lang.String str3, r45.bc1 bc1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        this.f309460a = j17;
        this.f309461b = str;
        this.f309462c = objectNonceId;
        this.f309463d = z17;
        this.f309464e = z18;
        this.f309465f = i17;
        this.f309466g = i18;
        this.f309467h = str2;
        this.f309468i = str3;
        this.f309469j = bc1Var;
    }

    /* renamed from: equals */
    public boolean m123837xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2.c5)) {
            return false;
        }
        db2.c5 c5Var = (db2.c5) obj;
        return this.f309460a == c5Var.f309460a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309461b, c5Var.f309461b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309462c, c5Var.f309462c) && this.f309463d == c5Var.f309463d && this.f309464e == c5Var.f309464e && this.f309465f == c5Var.f309465f && this.f309466g == c5Var.f309466g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309467h, c5Var.f309467h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309468i, c5Var.f309468i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f309469j, c5Var.f309469j);
    }

    /* renamed from: hashCode */
    public int m123838x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f309460a) * 31;
        java.lang.String str = this.f309461b;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f309462c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f309463d)) * 31) + java.lang.Boolean.hashCode(this.f309464e)) * 31) + java.lang.Integer.hashCode(this.f309465f)) * 31) + java.lang.Integer.hashCode(this.f309466g)) * 31;
        java.lang.String str2 = this.f309467h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f309468i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r45.bc1 bc1Var = this.f309469j;
        return hashCode4 + (bc1Var != null ? bc1Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m123839x9616526c() {
        return "FinderLikeCGIParams(feedId=" + this.f309460a + ", dupFlag=" + this.f309461b + ", objectNonceId=" + this.f309462c + ", like=" + this.f309463d + ", isPrivate=" + this.f309464e + ", scene=" + this.f309465f + ", source=" + this.f309466g + ", exportID=" + this.f309467h + ", newLifeSearchClickId=" + this.f309468i + ", showMileStoneInfo=" + this.f309469j + ')';
    }
}
