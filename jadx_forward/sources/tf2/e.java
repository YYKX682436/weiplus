package tf2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f500447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f500448b;

    public e(int i17, int i18) {
        this.f500447a = i17;
        this.f500448b = i18;
    }

    /* renamed from: equals */
    public boolean m166424xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2.e)) {
            return false;
        }
        tf2.e eVar = (tf2.e) obj;
        return this.f500447a == eVar.f500447a && this.f500448b == eVar.f500448b;
    }

    /* renamed from: hashCode */
    public int m166425x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f500447a) * 31) + java.lang.Integer.hashCode(this.f500448b);
    }

    /* renamed from: toString */
    public java.lang.String m166426x9616526c() {
        return "ShowingPagLocation(marginLeft=" + this.f500447a + ", marginTop=" + this.f500448b + ')';
    }
}
