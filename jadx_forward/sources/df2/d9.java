package df2;

/* loaded from: classes3.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f311488a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f311489b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f311490c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f311491d;

    /* renamed from: e, reason: collision with root package name */
    public final int f311492e;

    /* renamed from: f, reason: collision with root package name */
    public final int f311493f;

    public d9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i17, int i18) {
        this.f311488a = str;
        this.f311489b = str2;
        this.f311490c = str3;
        this.f311491d = num;
        this.f311492e = i17;
        this.f311493f = i18;
    }

    /* renamed from: equals */
    public boolean m124184xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.d9)) {
            return false;
        }
        df2.d9 d9Var = (df2.d9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311488a, d9Var.f311488a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311489b, d9Var.f311489b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311490c, d9Var.f311490c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311491d, d9Var.f311491d) && this.f311492e == d9Var.f311492e && this.f311493f == d9Var.f311493f;
    }

    /* renamed from: hashCode */
    public int m124185x8cdac1b() {
        java.lang.String str = this.f311488a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f311489b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f311490c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f311491d;
        return ((((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f311492e)) * 31) + java.lang.Integer.hashCode(this.f311493f);
    }

    /* renamed from: toString */
    public java.lang.String m124186x9616526c() {
        return "GuideBubbleInfo(title=" + this.f311488a + ", desc=" + this.f311489b + ", btnText=" + this.f311490c + ", btnIconResId=" + this.f311491d + ", btnBgRes=" + this.f311492e + ", btnTextColorRes=" + this.f311493f + ')';
    }

    public /* synthetic */ d9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, str3, num, (i19 & 16) != 0 ? com.p314xaae8f345.mm.R.C30861xcebc809e.csa : i17, (i19 & 32) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96 : i18);
    }
}
