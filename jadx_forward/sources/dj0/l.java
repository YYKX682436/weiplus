package dj0;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final dj0.l f314390e = new dj0.l(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f314391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f314392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f314393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f314394d;

    public l(int i17, int i18, int i19, int i27) {
        this.f314391a = i17;
        this.f314392b = i18;
        this.f314393c = i19;
        this.f314394d = i27;
    }

    public static dj0.l a(int i17, int i18, int i19, int i27) {
        return (i17 == 0 && i18 == 0 && i19 == 0 && i27 == 0) ? f314390e : new dj0.l(i17, i18, i19, i27);
    }

    public static dj0.l b(android.graphics.Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: equals */
    public boolean m124480xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dj0.l.class != obj.getClass()) {
            return false;
        }
        dj0.l lVar = (dj0.l) obj;
        return this.f314394d == lVar.f314394d && this.f314391a == lVar.f314391a && this.f314393c == lVar.f314393c && this.f314392b == lVar.f314392b;
    }

    /* renamed from: hashCode */
    public int m124481x8cdac1b() {
        return (((((this.f314391a * 31) + this.f314392b) * 31) + this.f314393c) * 31) + this.f314394d;
    }

    /* renamed from: toString */
    public java.lang.String m124482x9616526c() {
        return "Insets{left=" + this.f314391a + ", top=" + this.f314392b + ", right=" + this.f314393c + ", bottom=" + this.f314394d + '}';
    }
}
