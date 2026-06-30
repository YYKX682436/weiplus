package hs3;

@j95.b
/* loaded from: classes8.dex */
public class s extends i95.w implements ks3.t {

    /* renamed from: d, reason: collision with root package name */
    public ks3.k0 f366129d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.q0 f366130e;

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        gm0.j1.e().j(new hs3.r(this));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        ks3.k0 k0Var = this.f366129d;
        if (k0Var != null) {
            k0Var.f();
        }
    }

    public ks3.k0 wi() {
        gm0.j1.b().c();
        if (this.f366129d == null) {
            this.f366129d = new ks3.k0();
        }
        return this.f366129d;
    }
}
