package y;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final z0.d f539982a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f539983b;

    /* renamed from: c, reason: collision with root package name */
    public final z.k0 f539984c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f539985d;

    public u(z0.d alignment, yz5.l size, z.k0 animationSpec, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        this.f539982a = alignment;
        this.f539983b = size;
        this.f539984c = animationSpec;
        this.f539985d = z17;
    }

    /* renamed from: equals */
    public boolean m176234xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.u)) {
            return false;
        }
        y.u uVar = (y.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539982a, uVar.f539982a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539983b, uVar.f539983b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539984c, uVar.f539984c) && this.f539985d == uVar.f539985d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m176235x8cdac1b() {
        int hashCode = ((((this.f539982a.hashCode() * 31) + this.f539983b.hashCode()) * 31) + this.f539984c.hashCode()) * 31;
        boolean z17 = this.f539985d;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    /* renamed from: toString */
    public java.lang.String m176236x9616526c() {
        return "ChangeSize(alignment=" + this.f539982a + ", size=" + this.f539983b + ", animationSpec=" + this.f539984c + ", clip=" + this.f539985d + ')';
    }
}
