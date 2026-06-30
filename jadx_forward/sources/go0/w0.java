package go0;

/* loaded from: classes14.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f355423a;

    /* renamed from: b, reason: collision with root package name */
    public int f355424b;

    /* renamed from: c, reason: collision with root package name */
    public int f355425c;

    /* renamed from: d, reason: collision with root package name */
    public int f355426d;

    /* renamed from: e, reason: collision with root package name */
    public int f355427e;

    /* renamed from: f, reason: collision with root package name */
    public int f355428f;

    public w0(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f355423a = i17;
        this.f355424b = i18;
        this.f355425c = i19;
        this.f355426d = i27;
        this.f355427e = i28;
        this.f355428f = i29;
    }

    /* renamed from: equals */
    public boolean m131930xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go0.w0)) {
            return false;
        }
        go0.w0 w0Var = (go0.w0) obj;
        return this.f355423a == w0Var.f355423a && this.f355424b == w0Var.f355424b && this.f355425c == w0Var.f355425c && this.f355426d == w0Var.f355426d && this.f355427e == w0Var.f355427e && this.f355428f == w0Var.f355428f;
    }

    /* renamed from: hashCode */
    public int m131931x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f355423a) * 31) + java.lang.Integer.hashCode(this.f355424b)) * 31) + java.lang.Integer.hashCode(this.f355425c)) * 31) + java.lang.Integer.hashCode(this.f355426d)) * 31) + java.lang.Integer.hashCode(this.f355427e)) * 31) + java.lang.Integer.hashCode(this.f355428f);
    }

    /* renamed from: toString */
    public java.lang.String m131932x9616526c() {
        return "ViewPortMeta(posX=" + this.f355423a + ", posY=" + this.f355424b + ", drawWidth=" + this.f355425c + ", drawHeight=" + this.f355426d + ", textureWidth=" + this.f355427e + ", textureHeight=" + this.f355428f + ')';
    }
}
