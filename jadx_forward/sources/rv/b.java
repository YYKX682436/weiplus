package rv;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f481358a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f481359b;

    public b(java.lang.String groupName, java.util.List groupActions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupName, "groupName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupActions, "groupActions");
        this.f481358a = groupName;
        this.f481359b = groupActions;
    }

    /* renamed from: equals */
    public boolean m163067xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.b)) {
            return false;
        }
        rv.b bVar = (rv.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481358a, bVar.f481358a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481359b, bVar.f481359b);
    }

    /* renamed from: hashCode */
    public int m163068x8cdac1b() {
        return (this.f481358a.hashCode() * 31) + this.f481359b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163069x9616526c() {
        return "BrandCustomSharePanelActionGroup(groupName=" + this.f481358a + ", groupActions=" + this.f481359b + ')';
    }
}
