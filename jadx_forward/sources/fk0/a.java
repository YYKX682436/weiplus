package fk0;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344793b;

    /* renamed from: c, reason: collision with root package name */
    public final float f344794c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344795d;

    /* renamed from: e, reason: collision with root package name */
    public final float f344796e;

    public a(java.lang.String ocrText, int i17, float f17, int i18, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrText, "ocrText");
        this.f344792a = ocrText;
        this.f344793b = i17;
        this.f344794c = f17;
        this.f344795d = i18;
        this.f344796e = f18;
    }

    /* renamed from: equals */
    public boolean m129616xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk0.a)) {
            return false;
        }
        fk0.a aVar = (fk0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f344792a, aVar.f344792a) && this.f344793b == aVar.f344793b && java.lang.Float.compare(this.f344794c, aVar.f344794c) == 0 && this.f344795d == aVar.f344795d && java.lang.Float.compare(this.f344796e, aVar.f344796e) == 0;
    }

    /* renamed from: hashCode */
    public int m129617x8cdac1b() {
        return (((((((this.f344792a.hashCode() * 31) + java.lang.Integer.hashCode(this.f344793b)) * 31) + java.lang.Float.hashCode(this.f344794c)) * 31) + java.lang.Integer.hashCode(this.f344795d)) * 31) + java.lang.Float.hashCode(this.f344796e);
    }

    /* renamed from: toString */
    public java.lang.String m129618x9616526c() {
        return "ScanCodeOcrResult{result.length: " + this.f344792a.length() + ", color: " + this.f344793b + ", colorScore: " + this.f344794c + ", cls: " + this.f344795d + ", clsScore: " + this.f344796e + '}';
    }
}
