package dz4;

/* loaded from: classes8.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final o72.r2 f326693a;

    /* renamed from: b, reason: collision with root package name */
    public final long f326694b;

    public a2(o72.r2 favItemInfo, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItemInfo, "favItemInfo");
        this.f326693a = favItemInfo;
        this.f326694b = j17;
    }

    /* renamed from: equals */
    public boolean m126483xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.a2)) {
            return false;
        }
        dz4.a2 a2Var = (dz4.a2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326693a, a2Var.f326693a) && this.f326694b == a2Var.f326694b;
    }

    /* renamed from: hashCode */
    public int m126484x8cdac1b() {
        return (this.f326693a.hashCode() * 31) + java.lang.Long.hashCode(this.f326694b);
    }

    /* renamed from: toString */
    public java.lang.String m126485x9616526c() {
        return "ForwardData(favItemInfo=" + this.f326693a + ", localId=" + this.f326694b + ')';
    }
}
