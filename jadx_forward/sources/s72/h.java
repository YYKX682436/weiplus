package s72;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f485579a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f485580b;

    /* renamed from: c, reason: collision with root package name */
    public int f485581c;

    /* renamed from: d, reason: collision with root package name */
    public int f485582d;

    public h(int i17, java.lang.String xmlContent, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlContent, "xmlContent");
        this.f485579a = i17;
        this.f485580b = xmlContent;
        this.f485581c = i18;
        this.f485582d = i19;
    }

    /* renamed from: equals */
    public boolean m164050xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s72.h)) {
            return false;
        }
        s72.h hVar = (s72.h) obj;
        return this.f485579a == hVar.f485579a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f485580b, hVar.f485580b) && this.f485581c == hVar.f485581c && this.f485582d == hVar.f485582d;
    }

    /* renamed from: hashCode */
    public int m164051x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f485579a) * 31) + this.f485580b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f485581c)) * 31) + java.lang.Integer.hashCode(this.f485582d);
    }

    /* renamed from: toString */
    public java.lang.String m164052x9616526c() {
        return "ErrorInfo(count=" + this.f485579a + ", xmlContent=" + this.f485580b + ", errorType=" + this.f485581c + ", errorCode=" + this.f485582d + ')';
    }
}
