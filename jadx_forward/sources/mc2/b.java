package mc2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final mc2.a f407148c = new mc2.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f407149a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.j03 f407150b;

    public b(int i17, r45.j03 ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        this.f407149a = i17;
        this.f407150b = ext;
    }

    /* renamed from: equals */
    public boolean m147145xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc2.b)) {
            return false;
        }
        mc2.b bVar = (mc2.b) obj;
        return this.f407149a == bVar.f407149a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407150b, bVar.f407150b);
    }

    /* renamed from: hashCode */
    public int m147146x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f407149a) * 31) + this.f407150b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147147x9616526c() {
        return "FinderTipsShowTabExt(tabType=" + this.f407149a + ", ext=" + this.f407150b + ')';
    }
}
