package n16;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f415687a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.g f415688b;

    static {
        n16.c.j(n16.i.f415711f);
    }

    public a(n16.c packageName, n16.g callableName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callableName, "callableName");
        this.f415687a = packageName;
        this.f415688b = callableName;
    }

    /* renamed from: equals */
    public boolean m148877xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n16.a)) {
            return false;
        }
        n16.a aVar = (n16.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415687a, aVar.f415687a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415688b, aVar.f415688b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null);
    }

    /* renamed from: hashCode */
    public int m148878x8cdac1b() {
        return (((((this.f415687a.m148885x8cdac1b() * 31) + 0) * 31) + this.f415688b.m148892x8cdac1b()) * 31) + 0;
    }

    /* renamed from: toString */
    public java.lang.String m148879x9616526c() {
        java.lang.String str = r26.i0.u(this.f415687a.b(), '.', '/', false, 4, null) + "/" + this.f415688b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        return str;
    }
}
