package d24;

/* loaded from: classes11.dex */
public final class p implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f307487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307488e;

    public p(de0.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307487d = iVar;
        this.f307488e = c17513xe6a0fae1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f307487d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307488e;
        d17.q(281, c17513xe6a0fae1.A);
        c17513xe6a0fae1.A = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c17513xe6a0fae1.f243400z;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            c17513xe6a0fae1.f243400z = null;
        }
        android.app.ProgressDialog progressDialog = c17513xe6a0fae1.B;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
