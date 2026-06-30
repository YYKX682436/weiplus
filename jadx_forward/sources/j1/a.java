package j1;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f378623a;

    /* renamed from: b, reason: collision with root package name */
    public int f378624b;

    public a(org.xmlpull.v1.XmlPullParser xmlParser, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlParser, "xmlParser");
        this.f378623a = xmlParser;
        this.f378624b = i17;
    }

    public final d3.d a(android.content.res.TypedArray typedArray, android.content.res.Resources.Theme theme, java.lang.String attrName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typedArray, "typedArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrName, "attrName");
        d3.d c17 = d3.r.c(typedArray, this.f378623a, theme, attrName, i17, i18);
        f(typedArray.getChangingConfigurations());
        return c17;
    }

    public final float b(android.content.res.TypedArray typedArray, java.lang.String attrName, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typedArray, "typedArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrName, "attrName");
        float d17 = d3.r.d(typedArray, this.f378623a, attrName, i17, f17);
        f(typedArray.getChangingConfigurations());
        return d17;
    }

    public final int c(android.content.res.TypedArray typedArray, java.lang.String attrName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typedArray, "typedArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrName, "attrName");
        int e17 = d3.r.e(typedArray, this.f378623a, attrName, i17, i18);
        f(typedArray.getChangingConfigurations());
        return e17;
    }

    public final java.lang.String d(android.content.res.TypedArray typedArray, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typedArray, "typedArray");
        java.lang.String string = typedArray.getString(i17);
        f(typedArray.getChangingConfigurations());
        return string;
    }

    public final android.content.res.TypedArray e(android.content.res.Resources res, android.content.res.Resources.Theme theme, android.util.AttributeSet set, int[] attrs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        android.content.res.TypedArray j17 = d3.r.j(res, theme, set, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "obtainAttributes(\n      …          attrs\n        )");
        f(j17.getChangingConfigurations());
        return j17;
    }

    /* renamed from: equals */
    public boolean m140170xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1.a)) {
            return false;
        }
        j1.a aVar = (j1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378623a, aVar.f378623a) && this.f378624b == aVar.f378624b;
    }

    public final void f(int i17) {
        this.f378624b = i17 | this.f378624b;
    }

    /* renamed from: hashCode */
    public int m140171x8cdac1b() {
        return (this.f378623a.hashCode() * 31) + java.lang.Integer.hashCode(this.f378624b);
    }

    /* renamed from: toString */
    public java.lang.String m140172x9616526c() {
        return "AndroidVectorParser(xmlParser=" + this.f378623a + ", config=" + this.f378624b + ')';
    }
}
