package fq0;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346996a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f346997b;

    public r(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f346996a = appId;
        int m130015x8cdac1b = m130015x8cdac1b();
        r26.a.a(16);
        this.f346997b = jz5.h0.b(m130015x8cdac1b & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2, 16);
    }

    /* renamed from: equals */
    public boolean m130014xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq0.r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346996a, ((fq0.r) obj).f346996a);
    }

    /* renamed from: hashCode */
    public int m130015x8cdac1b() {
        return this.f346996a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130016x9616526c() {
        return "MagicSclAppContext(appId=" + this.f346996a + ')';
    }
}
