package vp;

/* loaded from: classes14.dex */
public final class l0 extends vp.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final wp.a f520344a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(wp.a danmaku) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        this.f520344a = danmaku;
    }

    /* renamed from: equals */
    public boolean m172419xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp.l0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520344a, ((vp.l0) obj).f520344a);
    }

    /* renamed from: hashCode */
    public int m172420x8cdac1b() {
        return this.f520344a.m174283x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m172421x9616526c() {
        return "AddFollowDanmaku(danmaku=" + this.f520344a + ')';
    }
}
