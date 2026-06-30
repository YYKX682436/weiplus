package n81;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f417139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417140b;

    /* renamed from: c, reason: collision with root package name */
    public final long f417141c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f417142d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f417143e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f417144f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f417145g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f417146h;

    public d(java.lang.String appId, int i17, long j17, java.util.List paths, java.util.Map taggedPaths, yz5.a cacheSizeBlock, yz5.a taggedCacheSizeBlock, yz5.a cleanBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taggedPaths, "taggedPaths");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheSizeBlock, "cacheSizeBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taggedCacheSizeBlock, "taggedCacheSizeBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cleanBlock, "cleanBlock");
        this.f417139a = appId;
        this.f417140b = i17;
        this.f417141c = j17;
        this.f417142d = paths;
        this.f417143e = taggedPaths;
        this.f417144f = cacheSizeBlock;
        this.f417145g = taggedCacheSizeBlock;
        this.f417146h = cleanBlock;
    }

    /* renamed from: equals */
    public boolean m149212xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n81.d)) {
            return false;
        }
        n81.d dVar = (n81.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417139a, dVar.f417139a) && this.f417140b == dVar.f417140b && this.f417141c == dVar.f417141c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417142d, dVar.f417142d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417143e, dVar.f417143e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417144f, dVar.f417144f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417145g, dVar.f417145g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417146h, dVar.f417146h);
    }

    /* renamed from: hashCode */
    public int m149213x8cdac1b() {
        return (((((((((((((this.f417139a.hashCode() * 31) + java.lang.Integer.hashCode(this.f417140b)) * 31) + java.lang.Long.hashCode(this.f417141c)) * 31) + this.f417142d.hashCode()) * 31) + this.f417143e.hashCode()) * 31) + this.f417144f.hashCode()) * 31) + this.f417145g.hashCode()) * 31) + this.f417146h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149214x9616526c() {
        return "AppBrandSweeperInfo(appId=" + this.f417139a + ", appTypeFlag=" + this.f417140b + ", lastLaunchTime=" + this.f417141c + ", paths=" + this.f417142d + ", taggedPaths=" + this.f417143e + ", cacheSizeBlock=" + this.f417144f + ", taggedCacheSizeBlock=" + this.f417145g + ", cleanBlock=" + this.f417146h + ')';
    }
}
