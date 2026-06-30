package ty2;

/* loaded from: classes5.dex */
public final class f implements ty2.c {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f504598a;

    public f(yz5.l showTypesFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showTypesFilter, "showTypesFilter");
        this.f504598a = showTypesFilter;
    }

    /* renamed from: equals */
    public boolean m167218xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty2.f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504598a, ((ty2.f) obj).f504598a);
    }

    /* renamed from: hashCode */
    public int m167219x8cdac1b() {
        return this.f504598a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167220x9616526c() {
        return "Config(showTypesFilter=" + this.f504598a + ')';
    }
}
