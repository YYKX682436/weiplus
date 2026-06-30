package r83;

/* loaded from: classes14.dex */
public class i extends k83.f {

    /* renamed from: i, reason: collision with root package name */
    public p83.o f474850i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f474851m = 0;

    @Override // k83.b
    public int[] d() {
        return new int[]{819};
    }

    @Override // k83.b
    public int e() {
        return 2;
    }

    @Override // k83.b
    public void g() {
    }

    @Override // k83.b
    public void h() {
    }

    @Override // k83.b
    public void i(k83.g gVar) {
        k83.g gVar2 = this.f386424e;
        if (gVar2 != null) {
            this.f474851m = gVar2.f386444n;
            this.f474850i = new p83.o(gVar2.f386431a, gVar2.f386432b, gVar2.b(), this.f386424e.f386433c, false);
            c01.d9.e().g(this.f474850i);
        }
    }

    @Override // k83.f
    public int k() {
        return this.f474851m;
    }

    @Override // k83.f
    public boolean l() {
        return false;
    }

    @Override // k83.f
    public void m(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // k83.f
    public void n(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // k83.f
    public void o() {
        if (this.f474850i != null) {
            c01.d9.e().d(this.f474850i);
        }
    }
}
