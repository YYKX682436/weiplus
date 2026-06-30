package nx0;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f422659a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f422660b;

    public h2(java.lang.String name, java.util.List itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f422659a = name;
        this.f422660b = itemList;
    }

    /* renamed from: equals */
    public boolean m150246xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.h2)) {
            return false;
        }
        nx0.h2 h2Var = (nx0.h2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422659a, h2Var.f422659a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422660b, h2Var.f422660b);
    }

    /* renamed from: hashCode */
    public int m150247x8cdac1b() {
        return (this.f422659a.hashCode() * 31) + this.f422660b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150248x9616526c() {
        return "FilterGroup(name=" + this.f422659a + ", itemList=" + this.f422660b + ')';
    }
}
