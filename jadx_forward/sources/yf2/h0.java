package yf2;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f543238a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f543239b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f543240c;

    public h0(java.lang.String title, java.lang.String content, java.lang.CharSequence checkboxText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkboxText, "checkboxText");
        this.f543238a = title;
        this.f543239b = content;
        this.f543240c = checkboxText;
    }

    /* renamed from: equals */
    public boolean m176973xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2.h0)) {
            return false;
        }
        yf2.h0 h0Var = (yf2.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543238a, h0Var.f543238a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543239b, h0Var.f543239b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543240c, h0Var.f543240c);
    }

    /* renamed from: hashCode */
    public int m176974x8cdac1b() {
        return (((this.f543238a.hashCode() * 31) + this.f543239b.hashCode()) * 31) + this.f543240c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176975x9616526c() {
        return "LicenseData(title=" + this.f543238a + ", content=" + this.f543239b + ", checkboxText=" + ((java.lang.Object) this.f543240c) + ')';
    }
}
