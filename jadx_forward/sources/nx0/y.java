package nx0;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.y f422797b = new nx0.y(kz5.p0.f395529d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f422798a;

    public y(java.util.List groupList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupList, "groupList");
        this.f422798a = groupList;
    }

    /* renamed from: equals */
    public boolean m150276xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422798a, ((nx0.y) obj).f422798a);
    }

    /* renamed from: hashCode */
    public int m150277x8cdac1b() {
        return this.f422798a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150278x9616526c() {
        return "BeautyModel(groupList=" + this.f422798a + ')';
    }
}
