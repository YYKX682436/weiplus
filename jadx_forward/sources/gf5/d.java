package gf5;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f352919a;

    /* renamed from: b, reason: collision with root package name */
    public final double f352920b;

    public d(gf5.z tokenType, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        this.f352919a = tokenType;
        this.f352920b = d17;
    }

    /* renamed from: equals */
    public boolean m131460xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.d)) {
            return false;
        }
        gf5.d dVar = (gf5.d) obj;
        return this.f352919a == dVar.f352919a && java.lang.Double.compare(this.f352920b, dVar.f352920b) == 0;
    }

    /* renamed from: hashCode */
    public int m131461x8cdac1b() {
        return (this.f352919a.hashCode() * 31) + java.lang.Double.hashCode(this.f352920b);
    }

    /* renamed from: toString */
    public java.lang.String m131462x9616526c() {
        return "DetectionTokenCountBonusEntry(tokenType=" + this.f352919a + ", weight=" + this.f352920b + ')';
    }
}
