package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 f283877e;

    public m3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var, java.util.List list) {
        this.f283877e = n3Var;
        this.f283876d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = this.f283877e;
        n3Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f283876d;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.M(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.F(f9Var)) {
                if (!(f9Var == null ? false : f9Var.M2())) {
                    arrayList.add(f9Var);
                }
            }
        }
        if (arrayList.size() != list.size()) {
            db5.e1.n(n3Var.f283891f, com.p314xaae8f345.mm.R.C30867xcad56011.fjf, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l3(this, arrayList), null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) n3Var.f283889d;
        viewOnClickListenerC21789x2eb4d316.f282286q = true;
        viewOnClickListenerC21789x2eb4d316.W6(true, viewOnClickListenerC21789x2eb4d316.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573838g01));
        s75.d.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.r2(n3Var, arrayList), "handleSave");
    }
}
