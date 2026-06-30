package zm4;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f555709a;

    public a(java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        list = (i17 & 1) != 0 ? new java.util.ArrayList() : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f555709a = list;
    }

    /* renamed from: equals */
    public boolean m179166xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm4.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555709a, ((zm4.a) obj).f555709a);
    }

    /* renamed from: hashCode */
    public int m179167x8cdac1b() {
        return this.f555709a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179168x9616526c() {
        return "AllTabRedDotInfo(list=" + this.f555709a + ')';
    }
}
