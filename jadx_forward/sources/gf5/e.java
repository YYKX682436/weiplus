package gf5;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f352921a;

    /* renamed from: b, reason: collision with root package name */
    public final double f352922b;

    public e(gf5.z tokenType, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        this.f352921a = tokenType;
        this.f352922b = d17;
    }

    /* renamed from: equals */
    public boolean m131463xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.e)) {
            return false;
        }
        gf5.e eVar = (gf5.e) obj;
        return this.f352921a == eVar.f352921a && java.lang.Double.compare(this.f352922b, eVar.f352922b) == 0;
    }

    /* renamed from: hashCode */
    public int m131464x8cdac1b() {
        return (this.f352921a.hashCode() * 31) + java.lang.Double.hashCode(this.f352922b);
    }

    /* renamed from: toString */
    public java.lang.String m131465x9616526c() {
        return "DetectionTokenWeightEntry(tokenType=" + this.f352921a + ", weight=" + this.f352922b + ')';
    }
}
