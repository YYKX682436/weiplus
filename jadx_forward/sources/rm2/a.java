package rm2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f478962a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f478963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f478964c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f478965d;

    public a(java.lang.String title, java.lang.String desc, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f478962a = title;
        this.f478963b = desc;
        this.f478964c = i17;
        this.f478965d = z17;
    }

    /* renamed from: equals */
    public boolean m162724xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm2.a)) {
            return false;
        }
        rm2.a aVar = (rm2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f478962a, aVar.f478962a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f478963b, aVar.f478963b) && this.f478964c == aVar.f478964c && this.f478965d == aVar.f478965d;
    }

    /* renamed from: hashCode */
    public int m162725x8cdac1b() {
        return (((((this.f478962a.hashCode() * 31) + this.f478963b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f478964c)) * 31) + java.lang.Boolean.hashCode(this.f478965d);
    }

    /* renamed from: toString */
    public java.lang.String m162726x9616526c() {
        return "title:" + this.f478962a + "-:desc:" + this.f478963b + "-type:" + this.f478964c + "-choose:" + this.f478965d;
    }
}
