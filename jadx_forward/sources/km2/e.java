package km2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f390623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f390624b;

    public e(java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f390623a = path;
        this.f390624b = i17;
    }

    /* renamed from: equals */
    public boolean m143656xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.e)) {
            return false;
        }
        km2.e eVar = (km2.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390623a, eVar.f390623a) && this.f390624b == eVar.f390624b;
    }

    /* renamed from: hashCode */
    public int m143657x8cdac1b() {
        return (this.f390623a.hashCode() * 31) + java.lang.Integer.hashCode(this.f390624b);
    }

    /* renamed from: toString */
    public java.lang.String m143658x9616526c() {
        return "LocalSelectCache(path=" + this.f390623a + ", updateTime=" + this.f390624b + ')';
    }
}
