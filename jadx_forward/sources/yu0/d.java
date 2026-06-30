package yu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f547317a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f547318b;

    public d(java.lang.String groupID, java.util.List tasks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupID, "groupID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tasks, "tasks");
        this.f547317a = groupID;
        this.f547318b = tasks;
    }

    /* renamed from: equals */
    public boolean m177664xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.d)) {
            return false;
        }
        yu0.d dVar = (yu0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547317a, dVar.f547317a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547318b, dVar.f547318b);
    }

    /* renamed from: hashCode */
    public int m177665x8cdac1b() {
        return (this.f547317a.hashCode() * 31) + this.f547318b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177666x9616526c() {
        return "AudioTaskGroup(groupID=" + this.f547317a + ", tasks=" + this.f547318b + ')';
    }
}
