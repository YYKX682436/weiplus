package a2;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a2.l f82306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82308c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82310e;

    /* renamed from: f, reason: collision with root package name */
    public final float f82311f;

    /* renamed from: g, reason: collision with root package name */
    public final float f82312g;

    public m(a2.l paragraph, int i17, int i18, int i19, int i27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraph, "paragraph");
        this.f82306a = paragraph;
        this.f82307b = i17;
        this.f82308c = i18;
        this.f82309d = i19;
        this.f82310e = i27;
        this.f82311f = f17;
        this.f82312g = f18;
    }

    public final d1.g a(d1.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        return gVar.d(d1.f.a(0.0f, this.f82311f));
    }

    public final int b(int i17) {
        int i18 = this.f82308c;
        int i19 = this.f82307b;
        return e06.p.f(i17, i19, i18) - i19;
    }

    /* renamed from: equals */
    public boolean m369xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.m)) {
            return false;
        }
        a2.m mVar = (a2.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82306a, mVar.f82306a) && this.f82307b == mVar.f82307b && this.f82308c == mVar.f82308c && this.f82309d == mVar.f82309d && this.f82310e == mVar.f82310e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f82311f), java.lang.Float.valueOf(mVar.f82311f)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f82312g), java.lang.Float.valueOf(mVar.f82312g));
    }

    /* renamed from: hashCode */
    public int m370x8cdac1b() {
        return (((((((((((this.f82306a.hashCode() * 31) + java.lang.Integer.hashCode(this.f82307b)) * 31) + java.lang.Integer.hashCode(this.f82308c)) * 31) + java.lang.Integer.hashCode(this.f82309d)) * 31) + java.lang.Integer.hashCode(this.f82310e)) * 31) + java.lang.Float.hashCode(this.f82311f)) * 31) + java.lang.Float.hashCode(this.f82312g);
    }

    /* renamed from: toString */
    public java.lang.String m371x9616526c() {
        return "ParagraphInfo(paragraph=" + this.f82306a + ", startIndex=" + this.f82307b + ", endIndex=" + this.f82308c + ", startLineIndex=" + this.f82309d + ", endLineIndex=" + this.f82310e + ", top=" + this.f82311f + ", bottom=" + this.f82312g + ')';
    }
}
