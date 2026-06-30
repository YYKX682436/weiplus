package e1;

/* loaded from: classes14.dex */
public final class k0 extends e1.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1.g f327810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d1.g rect) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f327810a = rect;
    }

    /* renamed from: equals */
    public boolean m126656xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1.k0) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f327810a, ((e1.k0) obj).f327810a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126657x8cdac1b() {
        return this.f327810a.m123319x8cdac1b();
    }
}
