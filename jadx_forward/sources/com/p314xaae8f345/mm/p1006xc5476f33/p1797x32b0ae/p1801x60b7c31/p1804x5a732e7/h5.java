package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class h5 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f225126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i5 f225127b;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i5 i5Var, android.app.ProgressDialog progressDialog) {
        this.f225127b = i5Var;
        this.f225126a = progressDialog;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        android.app.ProgressDialog progressDialog = this.f225126a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            z17 = false;
        } else {
            str = n17.d1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i5 i5Var = this.f225127b;
        if (!z17) {
            android.content.Context context = i5Var.f225143d;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, 3, -1), 0).show();
            i5Var.f225147h.f224976f.a("fail");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.g.f(str, 3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str);
        i5Var.f225145f.putExtra("Contact_User", str);
        if (n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",42");
            i5Var.f225145f.putExtra("Contact_Scene", 42);
        }
        i5Var.f225147h.A(i5Var.f225143d, i5Var.f225146g, i5Var.f225145f);
        i5Var.f225147h.f224976f.d(false);
    }
}
