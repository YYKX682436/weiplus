package ui1;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f509563a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f509564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f509565c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f509566d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f509567e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f509568f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f509569g;

    public b0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f509563a = str;
        this.f509564b = str2;
        this.f509565c = i17;
        this.f509566d = str3;
        this.f509567e = str4;
        this.f509568f = str5;
        this.f509569g = str6;
    }

    /* renamed from: equals */
    public boolean m168078xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui1.b0)) {
            return false;
        }
        ui1.b0 b0Var = (ui1.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509563a, b0Var.f509563a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509564b, b0Var.f509564b) && this.f509565c == b0Var.f509565c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509566d, b0Var.f509566d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509567e, b0Var.f509567e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509568f, b0Var.f509568f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509569g, b0Var.f509569g);
    }

    /* renamed from: hashCode */
    public int m168079x8cdac1b() {
        java.lang.String str = this.f509563a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f509564b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f509565c)) * 31;
        java.lang.String str3 = this.f509566d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f509567e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f509568f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f509569g;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m168080x9616526c() {
        return "ScopeInfo(Scope=" + this.f509563a + ", Desc=" + this.f509564b + ", AuthState=" + this.f509565c + ", ext_desc=" + this.f509566d + ", auth_desc=" + this.f509567e + ", sub_desc=" + this.f509568f + ", auth_wording=" + this.f509569g + ')';
    }
}
