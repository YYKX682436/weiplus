package jh2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final jh2.e f381340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381341b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f381342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f381343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f381344e;

    public d(jh2.e errorType, int i17, java.lang.String errorMsg, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorType, "errorType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f381340a = errorType;
        this.f381341b = i17;
        this.f381342c = errorMsg;
        this.f381343d = i18;
        this.f381344e = i19;
    }

    /* renamed from: equals */
    public boolean m140936xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh2.d)) {
            return false;
        }
        jh2.d dVar = (jh2.d) obj;
        return this.f381340a == dVar.f381340a && this.f381341b == dVar.f381341b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381342c, dVar.f381342c) && this.f381343d == dVar.f381343d && this.f381344e == dVar.f381344e;
    }

    /* renamed from: hashCode */
    public int m140937x8cdac1b() {
        return (((((((this.f381340a.hashCode() * 31) + java.lang.Integer.hashCode(this.f381341b)) * 31) + this.f381342c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f381343d)) * 31) + java.lang.Integer.hashCode(this.f381344e);
    }

    /* renamed from: toString */
    public java.lang.String m140938x9616526c() {
        return "SingErrorParams(errorType=" + this.f381340a + ", errorCode=" + this.f381341b + ", errorMsg=" + this.f381342c + ", sampleRate=" + this.f381343d + ", channel=" + this.f381344e + ')';
    }
}
