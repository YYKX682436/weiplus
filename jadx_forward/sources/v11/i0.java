package v11;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f513937a;

    /* renamed from: b, reason: collision with root package name */
    public final float f513938b;

    /* renamed from: c, reason: collision with root package name */
    public final float f513939c;

    /* renamed from: d, reason: collision with root package name */
    public final float f513940d;

    /* renamed from: e, reason: collision with root package name */
    public final float f513941e;

    /* renamed from: f, reason: collision with root package name */
    public final float f513942f;

    /* renamed from: g, reason: collision with root package name */
    public final float f513943g;

    /* renamed from: h, reason: collision with root package name */
    public final float f513944h;

    /* renamed from: i, reason: collision with root package name */
    public final float f513945i;

    /* renamed from: j, reason: collision with root package name */
    public final float f513946j;

    public i0(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47) {
        this.f513937a = f17;
        this.f513938b = f18;
        this.f513939c = f19;
        this.f513940d = f27;
        this.f513941e = f28;
        this.f513942f = f29;
        this.f513943g = f37;
        this.f513944h = f38;
        this.f513945i = f39;
        this.f513946j = f47;
    }

    /* renamed from: equals */
    public boolean m170902xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.i0)) {
            return false;
        }
        v11.i0 i0Var = (v11.i0) obj;
        return java.lang.Float.compare(this.f513937a, i0Var.f513937a) == 0 && java.lang.Float.compare(this.f513938b, i0Var.f513938b) == 0 && java.lang.Float.compare(this.f513939c, i0Var.f513939c) == 0 && java.lang.Float.compare(this.f513940d, i0Var.f513940d) == 0 && java.lang.Float.compare(this.f513941e, i0Var.f513941e) == 0 && java.lang.Float.compare(this.f513942f, i0Var.f513942f) == 0 && java.lang.Float.compare(this.f513943g, i0Var.f513943g) == 0 && java.lang.Float.compare(this.f513944h, i0Var.f513944h) == 0 && java.lang.Float.compare(this.f513945i, i0Var.f513945i) == 0 && java.lang.Float.compare(this.f513946j, i0Var.f513946j) == 0;
    }

    /* renamed from: hashCode */
    public int m170903x8cdac1b() {
        return (((((((((((((((((java.lang.Float.hashCode(this.f513937a) * 31) + java.lang.Float.hashCode(this.f513938b)) * 31) + java.lang.Float.hashCode(this.f513939c)) * 31) + java.lang.Float.hashCode(this.f513940d)) * 31) + java.lang.Float.hashCode(this.f513941e)) * 31) + java.lang.Float.hashCode(this.f513942f)) * 31) + java.lang.Float.hashCode(this.f513943g)) * 31) + java.lang.Float.hashCode(this.f513944h)) * 31) + java.lang.Float.hashCode(this.f513945i)) * 31) + java.lang.Float.hashCode(this.f513946j);
    }

    /* renamed from: toString */
    public java.lang.String m170904x9616526c() {
        return "NativeMarkdownTextSizeConfig(bodyTextSizeDp=" + this.f513937a + ", h1TextSizeDp=" + this.f513938b + ", h2TextSizeDp=" + this.f513939c + ", h3TextSizeDp=" + this.f513940d + ", h4TextSizeDp=" + this.f513941e + ", h5TextSizeDp=" + this.f513942f + ", h6TextSizeDp=" + this.f513943g + ", codeTextSizeDp=" + this.f513944h + ", inlineCodeTextSizeDp=" + this.f513945i + ", tableHeaderTextSizeDp=" + this.f513946j + ')';
    }
}
