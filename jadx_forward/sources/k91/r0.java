package k91;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f387290a;

    public r0(java.util.Map loadInfo, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        loadInfo = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : loadInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadInfo, "loadInfo");
        this.f387290a = loadInfo;
    }

    /* renamed from: equals */
    public boolean m142207xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k91.r0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f387290a, ((k91.r0) obj).f387290a);
    }

    /* renamed from: hashCode */
    public int m142208x8cdac1b() {
        return this.f387290a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m142209x9616526c() {
        return "AppBrandPackageLoadInfo(loadInfo=" + this.f387290a + ')';
    }
}
