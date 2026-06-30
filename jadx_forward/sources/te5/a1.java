package te5;

/* loaded from: classes9.dex */
public final class a1 extends te5.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500142a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String url) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f500142a = url;
    }

    /* renamed from: equals */
    public boolean m166350xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te5.a1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500142a, ((te5.a1) obj).f500142a);
    }

    /* renamed from: hashCode */
    public int m166351x8cdac1b() {
        return this.f500142a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166352x9616526c() {
        return "Success(url=" + this.f500142a + ')';
    }
}
