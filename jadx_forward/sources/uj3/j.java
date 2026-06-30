package uj3;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f509821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f509822b;

    public j(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f509821a = name;
        this.f509822b = i17;
    }

    /* renamed from: equals */
    public boolean m168122xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3.j)) {
            return false;
        }
        uj3.j jVar = (uj3.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509821a, jVar.f509821a) && this.f509822b == jVar.f509822b;
    }

    /* renamed from: hashCode */
    public int m168123x8cdac1b() {
        return (this.f509821a.hashCode() * 31) + java.lang.Integer.hashCode(this.f509822b);
    }

    /* renamed from: toString */
    public java.lang.String m168124x9616526c() {
        return "MoreItem(name=" + this.f509821a + ", func=" + this.f509822b + ')';
    }
}
