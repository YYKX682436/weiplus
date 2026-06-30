package or0;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f428974a;

    /* renamed from: b, reason: collision with root package name */
    public long f428975b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f428976c;

    /* renamed from: d, reason: collision with root package name */
    public long f428977d;

    public d(long j17, long j18, long j19, java.lang.String str, long j27, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j27 = (i17 & 16) != 0 ? 0L : j27;
        this.f428974a = j17;
        this.f428975b = j18;
        this.f428976c = str;
        this.f428977d = j27;
    }

    /* renamed from: equals */
    public boolean m152134xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or0.d)) {
            return false;
        }
        or0.d dVar = (or0.d) obj;
        return this.f428974a == dVar.f428974a && this.f428975b == dVar.f428975b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f428976c, dVar.f428976c) && this.f428977d == dVar.f428977d;
    }

    /* renamed from: hashCode */
    public int m152135x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f428974a) * 31) + java.lang.Long.hashCode(this.f428975b)) * 31) + java.lang.Long.hashCode(1000L)) * 31;
        java.lang.String str = this.f428976c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f428977d);
    }

    /* renamed from: toString */
    public java.lang.String m152136x9616526c() {
        return "CameraAnalyseStruct(startTime=" + this.f428974a + ", count=" + this.f428975b + ", interval=1000, tag=" + this.f428976c + ", average=" + this.f428977d + ')';
    }
}
