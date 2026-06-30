package i62;

/* loaded from: classes12.dex */
public final class j implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370486d;

    /* renamed from: e, reason: collision with root package name */
    public final long f370487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f370488f;

    /* renamed from: g, reason: collision with root package name */
    public final int f370489g;

    public j(java.lang.String resName, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resName, "resName");
        this.f370486d = resName;
        this.f370487e = j17;
        this.f370488f = i17;
        this.f370489g = i18;
    }

    /* renamed from: equals */
    public boolean m134796xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i62.j)) {
            return false;
        }
        i62.j jVar = (i62.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f370486d, jVar.f370486d) && this.f370487e == jVar.f370487e && this.f370488f == jVar.f370488f && this.f370489g == jVar.f370489g;
    }

    /* renamed from: hashCode */
    public int m134797x8cdac1b() {
        return (((((this.f370486d.hashCode() * 31) + java.lang.Long.hashCode(this.f370487e)) * 31) + java.lang.Integer.hashCode(this.f370488f)) * 31) + java.lang.Integer.hashCode(this.f370489g);
    }

    /* renamed from: toString */
    public java.lang.String m134798x9616526c() {
        return "ReportItem(resName=" + this.f370486d + ", cost=" + this.f370487e + ", resType=" + this.f370488f + ", resId=" + this.f370489g + ')';
    }
}
