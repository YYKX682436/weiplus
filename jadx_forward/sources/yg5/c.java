package yg5;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f543873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f543874b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f543875c;

    public c(java.lang.String uniqueId, java.lang.CharSequence name, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f543873a = uniqueId;
        this.f543874b = name;
        this.f543875c = z17;
    }

    /* renamed from: equals */
    public boolean m177161xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg5.c)) {
            return false;
        }
        yg5.c cVar = (yg5.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543873a, cVar.f543873a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543874b, cVar.f543874b) && this.f543875c == cVar.f543875c;
    }

    /* renamed from: hashCode */
    public int m177162x8cdac1b() {
        return (((this.f543873a.hashCode() * 31) + this.f543874b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f543875c);
    }

    /* renamed from: toString */
    public java.lang.String m177163x9616526c() {
        return "Option(uniqueId=" + this.f543873a + ", name=" + ((java.lang.Object) this.f543874b) + ", defaultSelected=" + this.f543875c + ')';
    }
}
