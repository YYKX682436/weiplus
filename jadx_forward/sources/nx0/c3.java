package nx0;

/* loaded from: classes5.dex */
public final class c3 {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.c3 f422620b = new nx0.c3(kz5.p0.f395529d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f422621a;

    public c3(java.util.List groupList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupList, "groupList");
        this.f422621a = groupList;
    }

    /* renamed from: equals */
    public boolean m150238xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.c3) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422621a, ((nx0.c3) obj).f422621a);
    }

    /* renamed from: hashCode */
    public int m150239x8cdac1b() {
        return this.f422621a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150240x9616526c() {
        return "MakeupModel(groupList=" + this.f422621a + ')';
    }
}
