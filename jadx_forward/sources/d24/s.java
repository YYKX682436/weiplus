package d24;

/* loaded from: classes11.dex */
public final class s implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f307495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307496e;

    public s(de0.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307495d = iVar;
        this.f307496e = c17513xe6a0fae1;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f307495d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307496e;
        d17.q(281, c17513xe6a0fae1.f243384g);
        gm0.j1.d().q(282, c17513xe6a0fae1.f243385h);
        c17513xe6a0fae1.f243384g = null;
        c17513xe6a0fae1.f243385h = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c17513xe6a0fae1.D;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            c17513xe6a0fae1.D = null;
        }
        android.app.ProgressDialog progressDialog = c17513xe6a0fae1.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1.z7(c17513xe6a0fae1);
        return false;
    }
}
