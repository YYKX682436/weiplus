package jj2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f381507a;

    /* renamed from: b, reason: collision with root package name */
    public int f381508b;

    /* renamed from: c, reason: collision with root package name */
    public float f381509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f381510d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint.Style f381511e;

    public d(int i17, int i18, float f17, int i19, android.graphics.Paint.Style style) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        this.f381507a = i17;
        this.f381508b = i18;
        this.f381509c = f17;
        this.f381510d = i19;
        this.f381511e = style;
    }

    /* renamed from: equals */
    public boolean m141039xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj2.d)) {
            return false;
        }
        jj2.d dVar = (jj2.d) obj;
        return this.f381507a == dVar.f381507a && this.f381508b == dVar.f381508b && java.lang.Float.compare(this.f381509c, dVar.f381509c) == 0 && this.f381510d == dVar.f381510d && this.f381511e == dVar.f381511e;
    }

    /* renamed from: hashCode */
    public int m141040x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f381507a) * 31) + java.lang.Integer.hashCode(this.f381508b)) * 31) + java.lang.Float.hashCode(this.f381509c)) * 31) + java.lang.Integer.hashCode(this.f381510d)) * 31) + this.f381511e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m141041x9616526c() {
        return "AnimateData(strokeWidth=" + this.f381507a + ", circleColor=" + this.f381508b + ", initRadius=" + this.f381509c + ", initAlpha=" + this.f381510d + ", style=" + this.f381511e + ')';
    }
}
