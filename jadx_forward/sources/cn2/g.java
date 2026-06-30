package cn2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f125049a;

    /* renamed from: b, reason: collision with root package name */
    public final long f125050b;

    /* renamed from: c, reason: collision with root package name */
    public final long f125051c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f125052d;

    public g(long j17, long j18, long j19, java.lang.Object obj, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 200L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        j19 = (i17 & 4) != 0 ? 5000L : j19;
        obj = (i17 & 8) != 0 ? null : obj;
        this.f125049a = j17;
        this.f125050b = j18;
        this.f125051c = j19;
        this.f125052d = obj;
    }

    /* renamed from: equals */
    public boolean m15336xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.g)) {
            return false;
        }
        cn2.g gVar = (cn2.g) obj;
        return this.f125049a == gVar.f125049a && this.f125050b == gVar.f125050b && this.f125051c == gVar.f125051c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125052d, gVar.f125052d);
    }

    /* renamed from: hashCode */
    public int m15337x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f125049a) * 31) + java.lang.Long.hashCode(this.f125050b)) * 31) + java.lang.Long.hashCode(this.f125051c)) * 31;
        java.lang.Object obj = this.f125052d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m15338x9616526c() {
        return "FloatCoverConfig(floatCoverTranslationDuration=" + this.f125049a + ", floatCoverTranslationDelay=" + this.f125050b + ", floatCoverDuration=" + this.f125051c + ", replaceImg=" + this.f125052d + ')';
    }
}
