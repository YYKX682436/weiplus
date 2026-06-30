package d24;

/* loaded from: classes11.dex */
public final class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f307447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d f307448e;

    public f(de0.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d c17512x6b00b84d) {
        this.f307447d = iVar;
        this.f307448e = c17512x6b00b84d;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f307447d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d c17512x6b00b84d = this.f307448e;
        d17.q(281, c17512x6b00b84d.f243380o);
        c17512x6b00b84d.f243380o = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c17512x6b00b84d.f243379n;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            c17512x6b00b84d.f243379n = null;
        }
        android.app.ProgressDialog progressDialog = c17512x6b00b84d.f243381p;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        c17512x6b00b84d.y7();
        return false;
    }
}
