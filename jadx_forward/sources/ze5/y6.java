package ze5;

/* loaded from: classes9.dex */
public final class y6 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f553851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f553852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.i7 f553856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v05.b f553857g;

    public y6(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ze5.i7 i7Var, v05.b bVar) {
        this.f553851a = u3Var;
        this.f553852b = z17;
        this.f553853c = view;
        this.f553854d = dVar;
        this.f553855e = f9Var;
        this.f553856f = i7Var;
        this.f553857g = bVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        boolean z17 = this.f553852b;
        yb5.d dVar = this.f553854d;
        if (z17) {
            ot0.q qVar = new ot0.q();
            v05.b bVar = this.f553857g;
            qVar.f430207k = bVar.m75945x2fec8307(bVar.f449898d + 9);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.h0(qVar, this.f553853c, dVar, this.f553855e, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq(this.f553856f));
        } else {
            db5.t7.m123882x26a183b(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.ggb, 0).show();
        }
        this.f553851a.cancel();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 32L, 1L);
        this.f553851a.cancel();
    }
}
