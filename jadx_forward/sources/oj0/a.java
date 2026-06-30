package oj0;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f427254a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427255b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427256c;

    public a(int i17, java.lang.String name, java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        this.f427254a = i17;
        this.f427255b = name;
        this.f427256c = fileName;
    }

    /* renamed from: equals */
    public boolean m151478xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj0.a)) {
            return false;
        }
        oj0.a aVar = (oj0.a) obj;
        return this.f427254a == aVar.f427254a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427255b, aVar.f427255b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427256c, aVar.f427256c);
    }

    /* renamed from: hashCode */
    public int m151479x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f427254a) * 31) + this.f427255b.hashCode()) * 31) + this.f427256c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151480x9616526c() {
        return "FilterInfo(type=" + this.f427254a + ", name=" + this.f427255b + ", fileName=" + this.f427256c + ')';
    }
}
