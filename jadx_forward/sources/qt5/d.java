package qt5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f448210a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f448211b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Throwable f448212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f448213d;

    public d(int i17, java.lang.String errMsg, java.lang.Throwable th6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f448210a = i17;
        this.f448211b = errMsg;
        this.f448212c = th6;
    }

    public final java.lang.String a() {
        java.lang.Throwable th6;
        if (this.f448210a == 0 || (th6 = this.f448212c) == null) {
            return "";
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* renamed from: equals */
    public boolean m160887xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt5.d)) {
            return false;
        }
        qt5.d dVar = (qt5.d) obj;
        return this.f448210a == dVar.f448210a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448211b, dVar.f448211b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448212c, dVar.f448212c);
    }

    /* renamed from: hashCode */
    public int m160888x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f448210a) * 31) + this.f448211b.hashCode()) * 31;
        java.lang.Throwable th6 = this.f448212c;
        return hashCode + (th6 == null ? 0 : th6.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m160889x9616526c() {
        return "CameraErrorInfo(errCode=" + this.f448210a + ", errMsg=" + this.f448211b + ", err=" + this.f448212c + ')';
    }
}
