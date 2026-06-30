package p0;

/* loaded from: classes16.dex */
public final class h extends j75.b {

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f431879k;

    public h(java.util.List excludeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeList, "excludeList");
        this.f431879k = excludeList;
    }

    /* renamed from: equals */
    public boolean m157521xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431879k, ((p0.h) obj).f431879k);
    }

    /* renamed from: hashCode */
    public int m157522x8cdac1b() {
        return this.f431879k.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157523x9616526c() {
        return "UpdateExcludeListAction(excludeList=" + this.f431879k + ')';
    }
}
