package av5;

/* loaded from: classes16.dex */
public final class u extends bv5.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ av5.y f14457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(av5.y yVar, java.lang.String str, java.nio.ByteBuffer byteBuffer, av5.n nVar) {
        super(byteBuffer);
        this.f14457f = yVar;
    }

    public final void A(av5.n0 n0Var, boolean z17) {
        if (n0Var.f14419e) {
            if (!z17) {
                java.nio.ByteBuffer byteBuffer = this.f24762a;
                byteBuffer.position((byteBuffer.position() + 3) & (-4));
                return;
            }
            a((((this.f24762a.position() + 3) & (-4)) - this.f24762a.position()) * 1);
            while ((this.f24762a.position() & 3) != 0) {
                this.f24762a.put((byte) 0);
            }
            if (this.f24762a.position() > this.f24763b) {
                this.f24763b = this.f24762a.position();
            }
        }
    }

    public int B(av5.b0 b0Var) {
        A(this.f14457f.f14462a.f14442s, true);
        int position = this.f24762a.position();
        v(b0Var.f14356e);
        return position;
    }

    @Override // bv5.b
    public av5.a b() {
        A(this.f14457f.f14462a.f14441r, false);
        return super.b();
    }

    @Override // bv5.b
    public av5.b c() {
        A(this.f14457f.f14462a.f14436m, false);
        return super.c();
    }

    @Override // bv5.b
    public av5.c d() {
        A(this.f14457f.f14462a.f14435l, false);
        return super.d();
    }

    @Override // bv5.b
    public av5.d f() {
        A(this.f14457f.f14462a.f14443t, false);
        return super.f();
    }

    @Override // bv5.b
    public av5.h g() {
        A(this.f14457f.f14462a.f14437n, false);
        return super.g();
    }

    @Override // bv5.b
    public av5.i h() {
        A(this.f14457f.f14462a.f14430g, false);
        return super.h();
    }

    @Override // bv5.b
    public av5.l i() {
        A(this.f14457f.f14462a.f14438o, false);
        return super.i();
    }

    @Override // bv5.b
    public av5.m j() {
        A(this.f14457f.f14462a.f14440q, false);
        return super.j();
    }

    @Override // bv5.b
    public av5.b0 k() {
        A(this.f14457f.f14462a.f14442s, false);
        return super.k();
    }

    @Override // bv5.b
    public av5.e0 l() {
        A(this.f14457f.f14462a.f14428e, false);
        return super.l();
    }

    @Override // bv5.b
    public av5.i0 o() {
        A(this.f14457f.f14462a.f14429f, false);
        return super.o();
    }

    @Override // bv5.b
    public av5.k0 q() {
        A(this.f14457f.f14462a.f14427d, false);
        return super.q();
    }

    @Override // bv5.b
    public av5.l0 r() {
        A(this.f14457f.f14462a.f14439p, false);
        return super.r();
    }

    @Override // bv5.b
    public av5.p0 s() {
        A(this.f14457f.f14462a.f14434k, false);
        return super.s();
    }
}
