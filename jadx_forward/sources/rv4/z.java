package rv4;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f482096a;

    public z(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f482096a = items;
    }

    /* renamed from: equals */
    public boolean m163228xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv4.z) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482096a, ((rv4.z) obj).f482096a);
    }

    /* renamed from: hashCode */
    public int m163229x8cdac1b() {
        return this.f482096a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163230x9616526c() {
        return "FTSGlobalTeachSettingData(items=" + this.f482096a + ')';
    }
}
