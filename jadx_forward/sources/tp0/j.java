package tp0;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f502553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f502554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f502555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f502556d;

    /* renamed from: e, reason: collision with root package name */
    public final int f502557e;

    /* renamed from: f, reason: collision with root package name */
    public final int f502558f;

    public j(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f502553a = i17;
        this.f502554b = i18;
        this.f502555c = i19;
        this.f502556d = i27;
        this.f502557e = i28;
        this.f502558f = i29;
    }

    /* renamed from: equals */
    public boolean m166845xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0.j)) {
            return false;
        }
        tp0.j jVar = (tp0.j) obj;
        return this.f502553a == jVar.f502553a && this.f502554b == jVar.f502554b && this.f502555c == jVar.f502555c && this.f502556d == jVar.f502556d && this.f502557e == jVar.f502557e && this.f502558f == jVar.f502558f;
    }

    /* renamed from: hashCode */
    public int m166846x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f502553a) * 31) + java.lang.Integer.hashCode(this.f502554b)) * 31) + java.lang.Integer.hashCode(this.f502555c)) * 31) + java.lang.Integer.hashCode(this.f502556d)) * 31) + java.lang.Integer.hashCode(this.f502557e)) * 31) + java.lang.Integer.hashCode(this.f502558f);
    }

    /* renamed from: toString */
    public java.lang.String m166847x9616526c() {
        return "CommonCoverViewPositionAndSize(x=" + this.f502553a + ", y=" + this.f502554b + ", width=" + this.f502555c + ", height=" + this.f502556d + ", zIndex=" + this.f502557e + ", hide=" + this.f502558f + ')';
    }
}
