package n0;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f415319a;

    public y2(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f415319a = key;
    }

    /* renamed from: equals */
    public boolean m148756xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0.y2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415319a, ((n0.y2) obj).f415319a);
    }

    /* renamed from: hashCode */
    public int m148757x8cdac1b() {
        return this.f415319a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148758x9616526c() {
        return "OpaqueKey(key=" + this.f415319a + ')';
    }
}
