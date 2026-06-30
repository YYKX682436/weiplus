package ey2;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f338960a;

    public l2(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f338960a = key;
        new java.util.LinkedList();
    }

    /* renamed from: equals */
    public boolean m128347xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.l2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338960a, ((ey2.l2) obj).f338960a);
    }

    /* renamed from: hashCode */
    public int m128348x8cdac1b() {
        return this.f338960a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128349x9616526c() {
        return "Cache(key=" + this.f338960a + ')';
    }
}
