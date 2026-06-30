package vp;

/* loaded from: classes14.dex */
public final class k0 extends vp.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final wp.a f520343a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wp.a danmaku) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        this.f520343a = danmaku;
    }

    /* renamed from: equals */
    public boolean m172416xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp.k0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520343a, ((vp.k0) obj).f520343a);
    }

    /* renamed from: hashCode */
    public int m172417x8cdac1b() {
        return this.f520343a.m174283x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m172418x9616526c() {
        return "AddDanmaku(danmaku=" + this.f520343a + ')';
    }
}
