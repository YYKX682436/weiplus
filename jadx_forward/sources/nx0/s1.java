package nx0;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.s1 f422755b = new nx0.s1(kz5.p0.f395529d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f422756a;

    public s1(java.util.List groupList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupList, "groupList");
        this.f422756a = groupList;
    }

    /* renamed from: equals */
    public boolean m150269xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.s1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422756a, ((nx0.s1) obj).f422756a);
    }

    /* renamed from: hashCode */
    public int m150270x8cdac1b() {
        return this.f422756a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m150271x9616526c() {
        return "FaceEffectModel(groupList=" + this.f422756a + ')';
    }
}
