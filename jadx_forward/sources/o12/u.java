package o12;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f423716a;

    /* renamed from: b, reason: collision with root package name */
    public final o12.y f423717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f423718c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f423719d;

    /* renamed from: e, reason: collision with root package name */
    public final float f423720e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f423721f;

    /* renamed from: g, reason: collision with root package name */
    public float f423722g;

    /* renamed from: h, reason: collision with root package name */
    public float f423723h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f423724i;

    public u(java.lang.String text, o12.y style, int i17, android.graphics.Rect bounds, float f17, android.graphics.Rect viewBounds, float f18, float f19, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewBounds, "viewBounds");
        this.f423716a = text;
        this.f423717b = style;
        this.f423718c = i17;
        this.f423719d = bounds;
        this.f423720e = f17;
        this.f423721f = viewBounds;
        this.f423722g = f18;
        this.f423723h = f19;
        this.f423724i = z17;
    }

    public static o12.u a(o12.u uVar, java.lang.String str, o12.y yVar, int i17, android.graphics.Rect rect, float f17, android.graphics.Rect rect2, float f18, float f19, boolean z17, int i18, java.lang.Object obj) {
        java.lang.String text = (i18 & 1) != 0 ? uVar.f423716a : str;
        o12.y style = (i18 & 2) != 0 ? uVar.f423717b : yVar;
        int i19 = (i18 & 4) != 0 ? uVar.f423718c : i17;
        android.graphics.Rect bounds = (i18 & 8) != 0 ? uVar.f423719d : rect;
        float f27 = (i18 & 16) != 0 ? uVar.f423720e : f17;
        android.graphics.Rect viewBounds = (i18 & 32) != 0 ? uVar.f423721f : rect2;
        float f28 = (i18 & 64) != 0 ? uVar.f423722g : f18;
        float f29 = (i18 & 128) != 0 ? uVar.f423723h : f19;
        boolean z18 = (i18 & 256) != 0 ? uVar.f423724i : z17;
        uVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewBounds, "viewBounds");
        return new o12.u(text, style, i19, bounds, f27, viewBounds, f28, f29, z18);
    }

    /* renamed from: equals */
    public boolean m150422xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o12.u)) {
            return false;
        }
        o12.u uVar = (o12.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423716a, uVar.f423716a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423717b, uVar.f423717b) && this.f423718c == uVar.f423718c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423719d, uVar.f423719d) && java.lang.Float.compare(this.f423720e, uVar.f423720e) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423721f, uVar.f423721f) && java.lang.Float.compare(this.f423722g, uVar.f423722g) == 0 && java.lang.Float.compare(this.f423723h, uVar.f423723h) == 0 && this.f423724i == uVar.f423724i;
    }

    /* renamed from: hashCode */
    public int m150423x8cdac1b() {
        return (((((((((((((((this.f423716a.hashCode() * 31) + this.f423717b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f423718c)) * 31) + this.f423719d.hashCode()) * 31) + java.lang.Float.hashCode(this.f423720e)) * 31) + this.f423721f.hashCode()) * 31) + java.lang.Float.hashCode(this.f423722g)) * 31) + java.lang.Float.hashCode(this.f423723h)) * 31) + java.lang.Boolean.hashCode(this.f423724i);
    }

    /* renamed from: toString */
    public java.lang.String m150424x9616526c() {
        return "TextDecoration(text=" + this.f423716a + ", style=" + this.f423717b + ", color=" + this.f423718c + ", bounds=" + this.f423719d + ", viewRatio=" + this.f423720e + ", viewBounds=" + this.f423721f + ", scale=" + this.f423722g + ", rotation=" + this.f423723h + ", positioned=" + this.f423724i + ')';
    }
}
