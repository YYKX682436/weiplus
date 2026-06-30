package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class e1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289176f;

    public e1(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.app.ProgressDialog progressDialog, java.lang.String str) {
        this.f289174d = c19762x487075a;
        this.f289175e = progressDialog;
        this.f289176f = str;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        return this.f289174d.f38859x6ac9171 || (progressDialog = this.f289175e) == null || !progressDialog.isShowing();
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q();
        java.lang.String str = this.f289176f;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = k4Var.n(str, true);
        n17.mo43621x7650bebc(n17.m124896xfb85f7b0() & (-3));
        if (n17.r2()) {
            c01.e2.B0(n17.d1(), false, true);
        } else {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(str, n17);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.e(str);
        com.p314xaae8f345.mm.p950x112e8cc1.f.d().b(str);
        android.app.ProgressDialog progressDialog = this.f289175e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
