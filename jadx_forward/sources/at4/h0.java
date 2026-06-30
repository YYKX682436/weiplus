package at4;

/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f95398a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f95399b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f95400c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f95401d;

    public h0(java.lang.String title, java.lang.String wording, java.lang.String cancelBtn, java.lang.String confirmBtn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelBtn, "cancelBtn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmBtn, "confirmBtn");
        this.f95398a = title;
        this.f95399b = wording;
        this.f95400c = cancelBtn;
        this.f95401d = confirmBtn;
    }

    /* renamed from: equals */
    public boolean m9019xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at4.h0)) {
            return false;
        }
        at4.h0 h0Var = (at4.h0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95398a, h0Var.f95398a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95399b, h0Var.f95399b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95400c, h0Var.f95400c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95401d, h0Var.f95401d);
    }

    /* renamed from: hashCode */
    public int m9020x8cdac1b() {
        return (((((this.f95398a.hashCode() * 31) + this.f95399b.hashCode()) * 31) + this.f95400c.hashCode()) * 31) + this.f95401d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9021x9616526c() {
        return "HalfPageDialog(title=" + this.f95398a + ", wording=" + this.f95399b + ", cancelBtn=" + this.f95400c + ", confirmBtn=" + this.f95401d + ')';
    }
}
