package sg0;

/* loaded from: classes8.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 f489266a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5 f489267b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19208x67b272aa f489268c;

    /* renamed from: d, reason: collision with root package name */
    public final zc.b0 f489269d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 flutterPlugin, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5 flutterFinderVideoPlayerPlugin, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19208x67b272aa flutterFinderLivePlayerPlugin, zc.b0 flutterLiteApiPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPlugin, "flutterPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterFinderVideoPlayerPlugin, "flutterFinderVideoPlayerPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterFinderLivePlayerPlugin, "flutterFinderLivePlayerPlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterLiteApiPlugin, "flutterLiteApiPlugin");
        this.f489266a = flutterPlugin;
        this.f489267b = flutterFinderVideoPlayerPlugin;
        this.f489268c = flutterFinderLivePlayerPlugin;
        this.f489269d = flutterLiteApiPlugin;
    }

    /* renamed from: equals */
    public boolean m164470xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg0.j2)) {
            return false;
        }
        sg0.j2 j2Var = (sg0.j2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489266a, j2Var.f489266a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489267b, j2Var.f489267b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489268c, j2Var.f489268c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489269d, j2Var.f489269d);
    }

    /* renamed from: hashCode */
    public int m164471x8cdac1b() {
        return (((((this.f489266a.hashCode() * 31) + this.f489267b.hashCode()) * 31) + this.f489268c.hashCode()) * 31) + this.f489269d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164472x9616526c() {
        return "SearchResultFlutterPlugins(flutterPlugin=" + this.f489266a + ", flutterFinderVideoPlayerPlugin=" + this.f489267b + ", flutterFinderLivePlayerPlugin=" + this.f489268c + ", flutterLiteApiPlugin=" + this.f489269d + ')';
    }
}
