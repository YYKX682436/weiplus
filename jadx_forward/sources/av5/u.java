package av5;

/* loaded from: classes16.dex */
public final class u extends bv5.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ av5.y f95990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(av5.y yVar, java.lang.String str, java.nio.ByteBuffer byteBuffer, av5.n nVar) {
        super(byteBuffer);
        this.f95990f = yVar;
    }

    public final void A(av5.n0 n0Var, boolean z17) {
        if (n0Var.f95952e) {
            if (!z17) {
                java.nio.ByteBuffer byteBuffer = this.f106295a;
                byteBuffer.position((byteBuffer.position() + 3) & (-4));
                return;
            }
            a((((this.f106295a.position() + 3) & (-4)) - this.f106295a.position()) * 1);
            while ((this.f106295a.position() & 3) != 0) {
                this.f106295a.put((byte) 0);
            }
            if (this.f106295a.position() > this.f106296b) {
                this.f106296b = this.f106295a.position();
            }
        }
    }

    public int B(av5.b0 b0Var) {
        A(this.f95990f.f95995a.f95975s, true);
        int position = this.f106295a.position();
        v(b0Var.f95889e);
        return position;
    }

    @Override // bv5.b
    public av5.a b() {
        A(this.f95990f.f95995a.f95974r, false);
        return super.b();
    }

    @Override // bv5.b
    public av5.b c() {
        A(this.f95990f.f95995a.f95969m, false);
        return super.c();
    }

    @Override // bv5.b
    public av5.c d() {
        A(this.f95990f.f95995a.f95968l, false);
        return super.d();
    }

    @Override // bv5.b
    public av5.d f() {
        A(this.f95990f.f95995a.f95976t, false);
        return super.f();
    }

    @Override // bv5.b
    public av5.h g() {
        A(this.f95990f.f95995a.f95970n, false);
        return super.g();
    }

    @Override // bv5.b
    public av5.i h() {
        A(this.f95990f.f95995a.f95963g, false);
        return super.h();
    }

    @Override // bv5.b
    public av5.l i() {
        A(this.f95990f.f95995a.f95971o, false);
        return super.i();
    }

    @Override // bv5.b
    public av5.m j() {
        A(this.f95990f.f95995a.f95973q, false);
        return super.j();
    }

    @Override // bv5.b
    public av5.b0 k() {
        A(this.f95990f.f95995a.f95975s, false);
        return super.k();
    }

    @Override // bv5.b
    public av5.e0 l() {
        A(this.f95990f.f95995a.f95961e, false);
        return super.l();
    }

    @Override // bv5.b
    public av5.i0 o() {
        A(this.f95990f.f95995a.f95962f, false);
        return super.o();
    }

    @Override // bv5.b
    public av5.k0 q() {
        A(this.f95990f.f95995a.f95960d, false);
        return super.q();
    }

    @Override // bv5.b
    public av5.l0 r() {
        A(this.f95990f.f95995a.f95972p, false);
        return super.r();
    }

    @Override // bv5.b
    public av5.p0 s() {
        A(this.f95990f.f95995a.f95967k, false);
        return super.s();
    }
}
