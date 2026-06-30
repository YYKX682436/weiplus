package dk2;

/* loaded from: classes14.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314849a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f314850b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f314851c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f314852d;

    public d5(java.lang.String resultCode, java.lang.String resultDesc, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultCode, "resultCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultDesc, "resultDesc");
        this.f314849a = resultCode;
        this.f314850b = resultDesc;
        this.f314851c = str;
        this.f314852d = str2;
    }

    /* renamed from: equals */
    public boolean m124559xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.d5)) {
            return false;
        }
        dk2.d5 d5Var = (dk2.d5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314849a, d5Var.f314849a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314850b, d5Var.f314850b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314851c, d5Var.f314851c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314852d, d5Var.f314852d);
    }

    /* renamed from: hashCode */
    public int m124560x8cdac1b() {
        int hashCode = ((this.f314849a.hashCode() * 31) + this.f314850b.hashCode()) * 31;
        java.lang.String str = this.f314851c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f314852d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m124561x9616526c() {
        return "CtidAuthResult(resultCode=" + this.f314849a + ", resultDesc=" + this.f314850b + ", idCardAuthData=" + this.f314851c + ", certPwdData=" + this.f314852d + ')';
    }
}
