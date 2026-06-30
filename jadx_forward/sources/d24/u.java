package d24;

/* loaded from: classes11.dex */
public final class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307501d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307501d = c17513xe6a0fae1;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307501d;
        d17.q(281, c17513xe6a0fae1.f243384g);
        gm0.j1.d().q(282, c17513xe6a0fae1.f243385h);
        c17513xe6a0fae1.f243384g = null;
        c17513xe6a0fae1.f243385h = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c17513xe6a0fae1.f243386i;
        if (b4Var != null && b4Var != null) {
            b4Var.d();
        }
        android.app.ProgressDialog progressDialog = c17513xe6a0fae1.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1.z7(c17513xe6a0fae1);
        return false;
    }
}
