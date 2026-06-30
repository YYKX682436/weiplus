package vf0;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f517689a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f517691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f517692d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f517693e;

    public f(boolean z17, java.lang.String targetPath, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        this.f517689a = z17;
        this.f517690b = targetPath;
        this.f517691c = i17;
        this.f517692d = i18;
        this.f517693e = str;
    }

    /* renamed from: equals */
    public boolean m171740xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.f)) {
            return false;
        }
        vf0.f fVar = (vf0.f) obj;
        return this.f517689a == fVar.f517689a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517690b, fVar.f517690b) && this.f517691c == fVar.f517691c && this.f517692d == fVar.f517692d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517693e, fVar.f517693e);
    }

    /* renamed from: hashCode */
    public int m171741x8cdac1b() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f517689a) * 31) + this.f517690b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f517691c)) * 31) + java.lang.Integer.hashCode(this.f517692d)) * 31;
        java.lang.String str = this.f517693e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m171742x9616526c() {
        return "CompressExecuteResult(success=" + this.f517689a + ", targetPath=" + this.f517690b + ", duration=" + this.f517691c + ", errorCode=" + this.f517692d + ", errorMsg=" + this.f517693e + ')';
    }
}
