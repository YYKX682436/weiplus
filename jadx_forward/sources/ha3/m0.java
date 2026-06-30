package ha3;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f361433a;

    /* renamed from: b, reason: collision with root package name */
    public double f361434b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f361435c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f361436d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f361437e;

    public m0(int i17, double d17, java.lang.String fileName, java.lang.String filePath, java.util.Map map, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        d17 = (i18 & 2) != 0 ? 0.0d : d17;
        fileName = (i18 & 4) != 0 ? "" : fileName;
        filePath = (i18 & 8) != 0 ? "" : filePath;
        map = (i18 & 16) != 0 ? null : map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f361433a = i17;
        this.f361434b = d17;
        this.f361435c = fileName;
        this.f361436d = filePath;
        this.f361437e = map;
    }

    /* renamed from: equals */
    public boolean m133098xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha3.m0)) {
            return false;
        }
        ha3.m0 m0Var = (ha3.m0) obj;
        return this.f361433a == m0Var.f361433a && java.lang.Double.compare(this.f361434b, m0Var.f361434b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361435c, m0Var.f361435c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361436d, m0Var.f361436d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361437e, m0Var.f361437e);
    }

    /* renamed from: hashCode */
    public int m133099x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f361433a) * 31) + java.lang.Double.hashCode(this.f361434b)) * 31) + this.f361435c.hashCode()) * 31) + this.f361436d.hashCode()) * 31;
        java.util.Map map = this.f361437e;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m133100x9616526c() {
        return "M3U8SegmentInfo(sequenceNumber=" + this.f361433a + ", duration=" + this.f361434b + ", fileName=" + this.f361435c + ", filePath=" + this.f361436d + ", dicXKeyParams=" + this.f361437e + ')';
    }
}
