package n85;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f417237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417238b;

    public e(java.util.ArrayList flipItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flipItem, "flipItem");
        this.f417237a = flipItem;
        this.f417238b = i17;
    }

    /* renamed from: equals */
    public boolean m149251xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85.e)) {
            return false;
        }
        n85.e eVar = (n85.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417237a, eVar.f417237a) && this.f417238b == eVar.f417238b;
    }

    /* renamed from: hashCode */
    public int m149252x8cdac1b() {
        return (this.f417237a.hashCode() * 31) + java.lang.Integer.hashCode(this.f417238b);
    }

    /* renamed from: toString */
    public java.lang.String m149253x9616526c() {
        return "GalleryData(flipItem=" + this.f417237a + ", position=" + this.f417238b + ')';
    }
}
