package n85;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f417239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f417240b;

    /* renamed from: c, reason: collision with root package name */
    public final long f417241c;

    /* renamed from: d, reason: collision with root package name */
    public final long f417242d;

    public h(java.util.List data, boolean z17, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f417239a = data;
        this.f417240b = z17;
        this.f417241c = j17;
        this.f417242d = j18;
    }

    /* renamed from: equals */
    public boolean m149254xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85.h)) {
            return false;
        }
        n85.h hVar = (n85.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417239a, hVar.f417239a) && this.f417240b == hVar.f417240b && this.f417241c == hVar.f417241c && this.f417242d == hVar.f417242d;
    }

    /* renamed from: hashCode */
    public int m149255x8cdac1b() {
        return (((((this.f417239a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f417240b)) * 31) + java.lang.Long.hashCode(this.f417241c)) * 31) + java.lang.Long.hashCode(this.f417242d);
    }

    /* renamed from: toString */
    public java.lang.String m149256x9616526c() {
        return "PageDataWrapper(data=" + this.f417239a + ", hasMore=" + this.f417240b + ", minFeedId=" + this.f417241c + ", maxFeedId=" + this.f417242d + ')';
    }
}
