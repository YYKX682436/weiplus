package hf2;

/* loaded from: classes10.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Point f362693a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f362694b;

    public r2(android.graphics.Point pos, android.util.Size size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pos, "pos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        this.f362693a = pos;
        this.f362694b = size;
    }

    /* renamed from: equals */
    public boolean m133477xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2.r2)) {
            return false;
        }
        hf2.r2 r2Var = (hf2.r2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362693a, r2Var.f362693a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362694b, r2Var.f362694b);
    }

    /* renamed from: hashCode */
    public int m133478x8cdac1b() {
        return (this.f362693a.hashCode() * 31) + this.f362694b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133479x9616526c() {
        return "LocationInfo(pos=" + this.f362693a + ", size=" + this.f362694b + ')';
    }
}
