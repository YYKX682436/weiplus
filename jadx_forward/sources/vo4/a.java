package vo4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f520128a;

    /* renamed from: b, reason: collision with root package name */
    public int f520129b;

    /* renamed from: c, reason: collision with root package name */
    public int f520130c;

    /* renamed from: d, reason: collision with root package name */
    public int f520131d;

    /* renamed from: e, reason: collision with root package name */
    public int f520132e;

    /* renamed from: f, reason: collision with root package name */
    public int f520133f;

    /* renamed from: g, reason: collision with root package name */
    public int f520134g;

    public a(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f520128a = i17;
        this.f520129b = i18;
        this.f520130c = i19;
        this.f520131d = i27;
        this.f520132e = i28;
        this.f520133f = i29;
        this.f520134g = i37;
    }

    /* renamed from: equals */
    public boolean m172403xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo4.a)) {
            return false;
        }
        vo4.a aVar = (vo4.a) obj;
        return this.f520128a == aVar.f520128a && this.f520129b == aVar.f520129b && this.f520130c == aVar.f520130c && this.f520131d == aVar.f520131d && this.f520132e == aVar.f520132e && this.f520133f == aVar.f520133f && this.f520134g == aVar.f520134g;
    }

    /* renamed from: hashCode */
    public int m172404x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f520128a) * 31) + java.lang.Integer.hashCode(this.f520129b)) * 31) + java.lang.Integer.hashCode(this.f520130c)) * 31) + java.lang.Integer.hashCode(this.f520131d)) * 31) + java.lang.Integer.hashCode(this.f520132e)) * 31) + java.lang.Integer.hashCode(this.f520133f)) * 31) + java.lang.Integer.hashCode(this.f520134g);
    }

    /* renamed from: toString */
    public java.lang.String m172405x9616526c() {
        return "MaterialCacheInfo(width=" + this.f520128a + ", height=" + this.f520129b + ", rotate=" + this.f520130c + ", cropLeft=" + this.f520131d + ", cropTop=" + this.f520132e + ", cropRight=" + this.f520133f + ", cropBottom=" + this.f520134g + ')';
    }
}
