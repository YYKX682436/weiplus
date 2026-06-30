package kn0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f391087a;

    public h(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f391087a = name;
    }

    /* renamed from: equals */
    public boolean m143742xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn0.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391087a, ((kn0.h) obj).f391087a);
    }

    /* renamed from: hashCode */
    public int m143743x8cdac1b() {
        return this.f391087a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143744x9616526c() {
        return "LiveRoomJumpInfo(name=" + this.f391087a + ')';
    }
}
