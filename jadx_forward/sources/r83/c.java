package r83;

/* loaded from: classes14.dex */
public class c extends k83.f {

    /* renamed from: i, reason: collision with root package name */
    public p83.h f474846i;

    @Override // k83.b
    public int[] d() {
        return new int[]{824};
    }

    @Override // k83.b
    public int e() {
        return 5;
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
            this.f474846i = new p83.h(gVar2.f386431a, gVar2.f386432b, gVar2.f386433c);
            c01.d9.e().g(this.f474846i);
        }
    }

    @Override // k83.f
    public int k() {
        return 50000;
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
        if (this.f474846i != null) {
            c01.d9.e().d(this.f474846i);
        }
    }
}
