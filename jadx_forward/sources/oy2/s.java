package oy2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f431534a;

    public s(java.lang.String webUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webUrl, "webUrl");
        this.f431534a = webUrl;
    }

    /* renamed from: equals */
    public boolean m157423xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy2.s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431534a, ((oy2.s) obj).f431534a);
    }

    /* renamed from: hashCode */
    public int m157424x8cdac1b() {
        return this.f431534a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157425x9616526c() {
        return "DebugInfo(webUrl=" + this.f431534a + ')';
    }
}
