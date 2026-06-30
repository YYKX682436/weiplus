package e3;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final e3.d f328576e = new e3.d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f328577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f328578b;

    /* renamed from: c, reason: collision with root package name */
    public final int f328579c;

    /* renamed from: d, reason: collision with root package name */
    public final int f328580d;

    public d(int i17, int i18, int i19, int i27) {
        this.f328577a = i17;
        this.f328578b = i18;
        this.f328579c = i19;
        this.f328580d = i27;
    }

    public static e3.d a(e3.d dVar, e3.d dVar2) {
        return b(java.lang.Math.max(dVar.f328577a, dVar2.f328577a), java.lang.Math.max(dVar.f328578b, dVar2.f328578b), java.lang.Math.max(dVar.f328579c, dVar2.f328579c), java.lang.Math.max(dVar.f328580d, dVar2.f328580d));
    }

    public static e3.d b(int i17, int i18, int i19, int i27) {
        return (i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) ? f328576e : new e3.d(i17, i18, i19, i27);
    }

    public static e3.d c(e3.d dVar, e3.d dVar2) {
        return b(dVar.f328577a - dVar2.f328577a, dVar.f328578b - dVar2.f328578b, dVar.f328579c - dVar2.f328579c, dVar.f328580d - dVar2.f328580d);
    }

    public static e3.d d(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets e() {
        return e3.c.a(this.f328577a, this.f328578b, this.f328579c, this.f328580d);
    }

    /* renamed from: equals */
    public boolean m126834xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e3.d.class != obj.getClass()) {
            return false;
        }
        e3.d dVar = (e3.d) obj;
        return this.f328580d == dVar.f328580d && this.f328577a == dVar.f328577a && this.f328579c == dVar.f328579c && this.f328578b == dVar.f328578b;
    }

    /* renamed from: hashCode */
    public int m126835x8cdac1b() {
        return (((((this.f328577a * 31) + this.f328578b) * 31) + this.f328579c) * 31) + this.f328580d;
    }

    /* renamed from: toString */
    public java.lang.String m126836x9616526c() {
        return "Insets{left=" + this.f328577a + ", top=" + this.f328578b + ", right=" + this.f328579c + ", bottom=" + this.f328580d + '}';
    }
}
