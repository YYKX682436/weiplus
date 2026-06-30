package cb1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jv5 f121785a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.i7 f121786b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f121787c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.pw6 f121788d;

    public i(r45.jv5 jv5Var, r45.i7 i7Var, java.lang.String applyWording, r45.pw6 pw6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applyWording, "applyWording");
        this.f121785a = jv5Var;
        this.f121786b = i7Var;
        this.f121787c = applyWording;
        this.f121788d = pw6Var;
    }

    /* renamed from: equals */
    public boolean m14599xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1.i)) {
            return false;
        }
        cb1.i iVar = (cb1.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f121785a, iVar.f121785a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f121786b, iVar.f121786b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f121787c, iVar.f121787c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f121788d, iVar.f121788d);
    }

    /* renamed from: hashCode */
    public int m14600x8cdac1b() {
        r45.jv5 jv5Var = this.f121785a;
        int hashCode = (jv5Var == null ? 0 : jv5Var.hashCode()) * 31;
        r45.i7 i7Var = this.f121786b;
        int hashCode2 = (((hashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31) + this.f121787c.hashCode()) * 31;
        r45.pw6 pw6Var = this.f121788d;
        return hashCode2 + (pw6Var != null ? pw6Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m14601x9616526c() {
        return "Info(scopeInfo=" + this.f121785a + ", alertPrivacyInfo=" + this.f121786b + ", applyWording=" + this.f121787c + ", privacyProtectInfo=" + this.f121788d + ')';
    }
}
