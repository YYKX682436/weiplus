package yq5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f546124a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f546125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f546126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f546127d;

    public c(long j17, java.lang.String mimeType, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        this.f546124a = j17;
        this.f546125b = mimeType;
        int i17 = zq5.g.f556599c;
        this.f546126c = (int) (j17 >> 32);
        this.f546127d = zq5.g.b(j17);
    }

    public final java.lang.String a() {
        return "(" + this.f546126c + 'x' + this.f546127d + ",'" + this.f546125b + "')";
    }

    /* renamed from: equals */
    public boolean m177517xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.c)) {
            return false;
        }
        yq5.c cVar = (yq5.c) obj;
        return zq5.g.a(this.f546124a, cVar.f546124a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546125b, cVar.f546125b);
    }

    /* renamed from: hashCode */
    public int m177518x8cdac1b() {
        int i17 = zq5.g.f556599c;
        return (java.lang.Long.hashCode(this.f546124a) * 31) + this.f546125b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177519x9616526c() {
        return "ImageInfo(size=" + this.f546126c + 'x' + this.f546127d + ", mimeType='" + this.f546125b + "')";
    }
}
