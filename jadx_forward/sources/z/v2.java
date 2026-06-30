package z;

/* loaded from: classes13.dex */
public final class v2 implements z.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f550393a;

    /* renamed from: b, reason: collision with root package name */
    public final int f550394b;

    /* renamed from: c, reason: collision with root package name */
    public final z.h0 f550395c;

    public v2(int i17, int i18, z.h0 easing) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(easing, "easing");
        this.f550393a = i17;
        this.f550394b = i18;
        this.f550395c = easing;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(converter, "converter");
        return new z.e4(this.f550393a, this.f550394b, this.f550395c);
    }

    /* renamed from: equals */
    public boolean m178194xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof z.v2)) {
            return false;
        }
        z.v2 v2Var = (z.v2) obj;
        return v2Var.f550393a == this.f550393a && v2Var.f550394b == this.f550394b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v2Var.f550395c, this.f550395c);
    }

    /* renamed from: hashCode */
    public int m178195x8cdac1b() {
        return (((this.f550393a * 31) + this.f550395c.hashCode()) * 31) + this.f550394b;
    }

    @Override // z.g0, z.p
    public z.x3 a(z.w2 converter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(converter, "converter");
        return new z.e4(this.f550393a, this.f550394b, this.f550395c);
    }

    public /* synthetic */ v2(int i17, int i18, z.h0 h0Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? 300 : i17, (i19 & 2) != 0 ? 0 : i18, (i19 & 4) != 0 ? z.j0.f550237a : h0Var);
    }
}
