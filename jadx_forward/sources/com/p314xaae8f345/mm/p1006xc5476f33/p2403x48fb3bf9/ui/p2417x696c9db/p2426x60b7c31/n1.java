package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class n1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f266815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266816b;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, android.content.Intent intent) {
        this.f266816b = c1Var;
        this.f266815a = intent;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266816b;
        c1Var.f266524t = null;
        if (c1Var.f266508d == null || (z0Var = c1Var.f266531y) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "getNow callback, msghandler has already been detached!");
            c1Var.i5(c1Var.f266509e, "profile:fail", null);
            return;
        }
        try {
            z0Var.i(199, null);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "hide dialog fail %s", e17.getMessage());
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
        if (!z17) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, j65.q.a(c1Var.f266508d).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fds, 3, -1), 0).show();
            c1Var.i5(c1Var.f266509e, "profile:fail", null);
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.g.f(str, 3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().i(str);
        android.content.Intent intent = this.f266815a;
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        if (n17.k2()) {
            android.os.Bundle bundle = c1Var.f266517o;
            int i17 = bundle != null ? bundle.getInt("Contact_Scene", 42) : 42;
            if (c1Var.M) {
                i17 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + "," + i17);
            intent.putExtra("Contact_Scene", i17);
        }
        c1Var.i7(intent);
        c1Var.i5(c1Var.f266509e, "profile:ok", null);
    }
}
