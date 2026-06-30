package gm2;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f355003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f355004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f355005c;

    /* renamed from: d, reason: collision with root package name */
    public final int f355006d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355007e;

    /* renamed from: f, reason: collision with root package name */
    public final int f355008f;

    /* renamed from: g, reason: collision with root package name */
    public final float f355009g;

    /* renamed from: h, reason: collision with root package name */
    public final int f355010h;

    /* renamed from: i, reason: collision with root package name */
    public final int f355011i;

    public s1(android.graphics.Bitmap swipeBitmap, int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(swipeBitmap, "swipeBitmap");
        this.f355003a = swipeBitmap;
        this.f355004b = i17;
        this.f355005c = i18;
        this.f355006d = i19;
        this.f355007e = i27;
        this.f355008f = i28;
        this.f355009g = f17;
        this.f355010h = i29;
        this.f355011i = i37;
    }

    /* renamed from: equals */
    public boolean m131849xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.s1)) {
            return false;
        }
        gm2.s1 s1Var = (gm2.s1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355003a, s1Var.f355003a) && this.f355004b == s1Var.f355004b && this.f355005c == s1Var.f355005c && this.f355006d == s1Var.f355006d && this.f355007e == s1Var.f355007e && this.f355008f == s1Var.f355008f && java.lang.Float.compare(this.f355009g, s1Var.f355009g) == 0 && this.f355010h == s1Var.f355010h && this.f355011i == s1Var.f355011i;
    }

    /* renamed from: hashCode */
    public int m131850x8cdac1b() {
        return (((((((((((((((this.f355003a.hashCode() * 31) + java.lang.Integer.hashCode(this.f355004b)) * 31) + java.lang.Integer.hashCode(this.f355005c)) * 31) + java.lang.Integer.hashCode(this.f355006d)) * 31) + java.lang.Integer.hashCode(this.f355007e)) * 31) + java.lang.Integer.hashCode(this.f355008f)) * 31) + java.lang.Float.hashCode(this.f355009g)) * 31) + java.lang.Integer.hashCode(this.f355010h)) * 31) + java.lang.Integer.hashCode(this.f355011i);
    }

    /* renamed from: toString */
    public java.lang.String m131851x9616526c() {
        return "HightLevelAnimParam(swipeBitmap=" + this.f355003a + ", bg1Light=" + this.f355004b + ", bg2Light=" + this.f355005c + ", bg1Dark=" + this.f355006d + ", bg2Dark=" + this.f355007e + ", borderColor=" + this.f355008f + ", borderWidth=" + this.f355009g + ", lightBgMask=" + this.f355010h + ", darkBgMask=" + this.f355011i + ')';
    }
}
