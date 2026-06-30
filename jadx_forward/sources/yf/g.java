package yf;

/* loaded from: classes11.dex */
public final class g implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f542883a;

    /* renamed from: b, reason: collision with root package name */
    public final float f542884b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f542885c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f542886d;

    public g(int i17, float f17, java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f542883a = i17;
        this.f542884b = f17;
        this.f542885c = path;
        this.f542886d = str;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "FaceContourInfo(path='" + this.f542885c + "', pathMd5='" + this.f542886d + "')";
    }

    /* renamed from: equals */
    public boolean m176932xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.g)) {
            return false;
        }
        yf.g gVar = (yf.g) obj;
        return this.f542883a == gVar.f542883a && java.lang.Float.compare(this.f542884b, gVar.f542884b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542885c, gVar.f542885c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542886d, gVar.f542886d);
    }

    /* renamed from: hashCode */
    public int m176933x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f542883a) * 31) + java.lang.Float.hashCode(this.f542884b)) * 31) + this.f542885c.hashCode()) * 31;
        java.lang.String str = this.f542886d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m176934x9616526c() {
        return "FaceContourInfo(faceModel=" + this.f542883a + ", alpha=" + this.f542884b + ", path=" + this.f542885c + ", pathMd5=" + this.f542886d + ')';
    }
}
