package sw0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f494947a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f494948b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f494949c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f494950d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f494951e;

    public b(java.lang.String text, java.lang.String materialID, java.lang.String colorID, java.lang.String fontName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorID, "colorID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontName, "fontName");
        this.f494947a = text;
        this.f494948b = materialID;
        this.f494949c = colorID;
        this.f494950d = fontName;
        this.f494951e = str;
    }

    public static sw0.b a(sw0.b bVar, java.lang.String text, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            text = bVar.f494947a;
        }
        if ((i17 & 2) != 0) {
            str = bVar.f494948b;
        }
        java.lang.String materialID = str;
        if ((i17 & 4) != 0) {
            str2 = bVar.f494949c;
        }
        java.lang.String colorID = str2;
        if ((i17 & 8) != 0) {
            str3 = bVar.f494950d;
        }
        java.lang.String fontName = str3;
        if ((i17 & 16) != 0) {
            str4 = bVar.f494951e;
        }
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorID, "colorID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontName, "fontName");
        return new sw0.b(text, materialID, colorID, fontName, str4);
    }

    /* renamed from: equals */
    public boolean m165391xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.b)) {
            return false;
        }
        sw0.b bVar = (sw0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494947a, bVar.f494947a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494948b, bVar.f494948b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494949c, bVar.f494949c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494950d, bVar.f494950d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494951e, bVar.f494951e);
    }

    /* renamed from: hashCode */
    public int m165392x8cdac1b() {
        int hashCode = ((((((this.f494947a.hashCode() * 31) + this.f494948b.hashCode()) * 31) + this.f494949c.hashCode()) * 31) + this.f494950d.hashCode()) * 31;
        java.lang.String str = this.f494951e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m165393x9616526c() {
        return "TextData(text=" + this.f494947a + ", materialID=" + this.f494948b + ", colorID=" + this.f494949c + ", fontName=" + this.f494950d + ", animID=" + this.f494951e + ')';
    }
}
