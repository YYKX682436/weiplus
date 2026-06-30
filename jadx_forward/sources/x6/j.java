package x6;

/* loaded from: classes13.dex */
public final class j implements x6.q {

    /* renamed from: a, reason: collision with root package name */
    public final x6.k f533687a;

    /* renamed from: b, reason: collision with root package name */
    public int f533688b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f533689c;

    public j(x6.k kVar) {
        this.f533687a = kVar;
    }

    @Override // x6.q
    public void a() {
        this.f533687a.c(this);
    }

    /* renamed from: equals */
    public boolean m175055xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof x6.j)) {
            return false;
        }
        x6.j jVar = (x6.j) obj;
        return this.f533688b == jVar.f533688b && this.f533689c == jVar.f533689c;
    }

    /* renamed from: hashCode */
    public int m175056x8cdac1b() {
        int i17 = this.f533688b * 31;
        java.lang.Class cls = this.f533689c;
        return i17 + (cls != null ? cls.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175057x9616526c() {
        return "Key{size=" + this.f533688b + "array=" + this.f533689c + '}';
    }
}
