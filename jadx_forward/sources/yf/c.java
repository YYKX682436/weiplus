package yf;

/* loaded from: classes11.dex */
public final class c implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f542847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f542848b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.b f542849c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f542850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f542851e;

    public c(float f17, int i17, yf.b blendMode, java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendMode, "blendMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f542847a = f17;
        this.f542848b = i17;
        this.f542849c = blendMode;
        this.f542850d = path;
        this.f542851e = str;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "BlusherStickInfo(path='" + this.f542850d + "', pathMd5='" + this.f542851e + "')";
    }

    /* renamed from: equals */
    public boolean m176917xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.c)) {
            return false;
        }
        yf.c cVar = (yf.c) obj;
        return java.lang.Float.compare(this.f542847a, cVar.f542847a) == 0 && this.f542848b == cVar.f542848b && this.f542849c == cVar.f542849c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542850d, cVar.f542850d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542851e, cVar.f542851e);
    }

    /* renamed from: hashCode */
    public int m176918x8cdac1b() {
        int hashCode = ((((((java.lang.Float.hashCode(this.f542847a) * 31) + java.lang.Integer.hashCode(this.f542848b)) * 31) + this.f542849c.hashCode()) * 31) + this.f542850d.hashCode()) * 31;
        java.lang.String str = this.f542851e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m176919x9616526c() {
        return "BlusherStickInfo(alpha=" + this.f542847a + ", faceModel=" + this.f542848b + ", blendMode=" + this.f542849c + ", path=" + this.f542850d + ", pathMd5=" + this.f542851e + ')';
    }
}
