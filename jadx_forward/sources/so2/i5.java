package so2;

/* loaded from: classes9.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f491956a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f491957b;

    public i5(java.lang.String lightUrl, java.lang.String darkUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lightUrl, "lightUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(darkUrl, "darkUrl");
        this.f491956a = lightUrl;
        this.f491957b = darkUrl;
    }

    /* renamed from: equals */
    public boolean m164900xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.i5)) {
            return false;
        }
        so2.i5 i5Var = (so2.i5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491956a, i5Var.f491956a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491957b, i5Var.f491957b);
    }

    /* renamed from: hashCode */
    public int m164901x8cdac1b() {
        return (this.f491956a.hashCode() * 31) + this.f491957b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164902x9616526c() {
        return "PreviewIcon(lightUrl=" + this.f491956a + ", darkUrl=" + this.f491957b + ')';
    }
}
