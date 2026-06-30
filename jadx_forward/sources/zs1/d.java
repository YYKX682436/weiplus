package zs1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f556769a;

    public d(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f556769a = url;
    }

    /* renamed from: equals */
    public boolean m179372xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs1.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556769a, ((zs1.d) obj).f556769a);
    }

    /* renamed from: hashCode */
    public int m179373x8cdac1b() {
        return this.f556769a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179374x9616526c() {
        return "PrefetchRes(url=" + this.f556769a + ')';
    }
}
