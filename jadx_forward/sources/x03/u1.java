package x03;

/* loaded from: classes11.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f532679a;

    /* renamed from: b, reason: collision with root package name */
    public double f532680b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f532681c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f532682d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f532683e;

    public u1(int i17, double d17, java.lang.String fileName, java.lang.String filePath, java.util.Map map, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        d17 = (i18 & 2) != 0 ? 0.0d : d17;
        fileName = (i18 & 4) != 0 ? "" : fileName;
        filePath = (i18 & 8) != 0 ? "" : filePath;
        map = (i18 & 16) != 0 ? null : map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f532679a = i17;
        this.f532680b = d17;
        this.f532681c = fileName;
        this.f532682d = filePath;
        this.f532683e = map;
    }

    /* renamed from: equals */
    public boolean m174791xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x03.u1)) {
            return false;
        }
        x03.u1 u1Var = (x03.u1) obj;
        return this.f532679a == u1Var.f532679a && java.lang.Double.compare(this.f532680b, u1Var.f532680b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532681c, u1Var.f532681c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532682d, u1Var.f532682d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532683e, u1Var.f532683e);
    }

    /* renamed from: hashCode */
    public int m174792x8cdac1b() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f532679a) * 31) + java.lang.Double.hashCode(this.f532680b)) * 31) + this.f532681c.hashCode()) * 31) + this.f532682d.hashCode()) * 31;
        java.util.Map map = this.f532683e;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m174793x9616526c() {
        return "M3U8SegmentInfo(sequenceNumber=" + this.f532679a + ", duration=" + this.f532680b + ", fileName=" + this.f532681c + ", filePath=" + this.f532682d + ", dicXKeyParams=" + this.f532683e + ')';
    }
}
