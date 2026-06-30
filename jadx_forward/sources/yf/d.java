package yf;

/* loaded from: classes11.dex */
public final class d implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f542860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f542861b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.b f542862c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f542863d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f542864e;

    /* renamed from: f, reason: collision with root package name */
    public final float f542865f;

    public d(float f17, int i17, yf.b blendMode, java.lang.String path, java.lang.String str, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendMode, "blendMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f542860a = f17;
        this.f542861b = i17;
        this.f542862c = blendMode;
        this.f542863d = path;
        this.f542864e = str;
        this.f542865f = f18;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "EyeBrowInfo(path='" + this.f542863d + "', pathMd5='" + this.f542864e + "')";
    }

    /* renamed from: equals */
    public boolean m176923xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.d)) {
            return false;
        }
        yf.d dVar = (yf.d) obj;
        return java.lang.Float.compare(this.f542860a, dVar.f542860a) == 0 && this.f542861b == dVar.f542861b && this.f542862c == dVar.f542862c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542863d, dVar.f542863d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542864e, dVar.f542864e) && java.lang.Float.compare(this.f542865f, dVar.f542865f) == 0;
    }

    /* renamed from: hashCode */
    public int m176924x8cdac1b() {
        int hashCode = ((((((java.lang.Float.hashCode(this.f542860a) * 31) + java.lang.Integer.hashCode(this.f542861b)) * 31) + this.f542862c.hashCode()) * 31) + this.f542863d.hashCode()) * 31;
        java.lang.String str = this.f542864e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Float.hashCode(this.f542865f);
    }

    /* renamed from: toString */
    public java.lang.String m176925x9616526c() {
        return "EyeBrowInfo(alpha=" + this.f542860a + ", faceModel=" + this.f542861b + ", blendMode=" + this.f542862c + ", path=" + this.f542863d + ", pathMd5=" + this.f542864e + ", shrinkRate=" + this.f542865f + ')';
    }
}
