package nx0;

/* loaded from: classes5.dex */
public final class j2 {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.j2 f422676b = new nx0.j2(kz5.p0.f395529d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f422677a;

    public j2(java.util.List groupList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupList, "groupList");
        this.f422677a = groupList;
    }

    /* renamed from: equals */
    public boolean m150255xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.j2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422677a, ((nx0.j2) obj).f422677a);
    }

    /* renamed from: hashCode */
    public int m150256x8cdac1b() {
        return this.f422677a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150257x9616526c() {
        return "FilterModel(groupList=" + this.f422677a + ')';
    }
}
