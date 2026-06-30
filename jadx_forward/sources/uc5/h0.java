package uc5;

/* loaded from: classes10.dex */
public final class h0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final uc5.d f508027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(uc5.d item) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f508027d = item;
    }

    @Override // uc5.l0, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        uc5.l0 other = (uc5.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof uc5.k0) {
            return -((uc5.k0) other).n(this);
        }
        if (other instanceof uc5.h0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 p17 = this.f508027d.p();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 p18 = ((uc5.h0) other).f508027d.p();
            int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(p18.T1(), p17.T1());
            return j17 != 0 ? j17 : p3321xbce91901.jvm.p3324x21ffc6bd.o.j(p18.m124847x74d37ac6(), p17.m124847x74d37ac6());
        }
        if ((other instanceof uc5.i0) || (other instanceof uc5.j0)) {
            return 1;
        }
        throw new jz5.j();
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f508027d.h();
    }

    @Override // xm3.a
    /* renamed from: k */
    public xm3.d y0() {
        return new uc5.h0(this.f508027d.y0());
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f508027d.v();
    }

    @Override // xm3.a, xm3.d
    public java.lang.Object y0() {
        return new uc5.h0(this.f508027d.y0());
    }
}
