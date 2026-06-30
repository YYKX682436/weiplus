package lw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f403064a;

    /* renamed from: b, reason: collision with root package name */
    public final long f403065b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f403066c;

    public d(java.lang.String materialID, long j17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        this.f403064a = materialID;
        this.f403065b = j17;
        this.f403066c = str;
    }

    /* renamed from: equals */
    public boolean m146404xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw0.d)) {
            return false;
        }
        lw0.d dVar = (lw0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403064a, dVar.f403064a) && this.f403065b == dVar.f403065b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403066c, dVar.f403066c);
    }

    /* renamed from: hashCode */
    public int m146405x8cdac1b() {
        int hashCode = ((this.f403064a.hashCode() * 31) + java.lang.Long.hashCode(this.f403065b)) * 31;
        java.lang.String str = this.f403066c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m146406x9616526c() {
        return "WhenWhereData(materialID=" + this.f403064a + ", timestamp=" + this.f403065b + ", location=" + this.f403066c + ')';
    }
}
