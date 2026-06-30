package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f161070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce f161071e;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce, java.util.LinkedList linkedList) {
        this.f161071e = c12004xb7c17ce;
        this.f161070d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = this.f161070d;
        ui1.b0 b0Var = (ui1.b0) linkedList.getFirst();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a3 a3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a3(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = this.f161071e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = c12004xb7c17ce.f160910g.t3();
        boolean b17 = si1.d1.b(b0Var.f509563a, t37.E0());
        ui1.z a17 = ui1.w.a(c12004xb7c17ce.f160910g, a3Var, linkedList);
        a17.mo2026xce3d2713(c12004xb7c17ce.D);
        a17.mo2039xb4c13ffe(b0Var.f509564b);
        a17.mo2027xea2586cc(c12004xb7c17ce.I);
        a17.mo2036xc499c596(c12004xb7c17ce.f160908J);
        a17.mo2038xd611ee5a(c12004xb7c17ce.K);
        a17.mo2033x12ec1b74(c12004xb7c17ce.E);
        boolean z17 = false;
        if ((t37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37).u0().L1.c() : false) || !c12004xb7c17ce.L || android.text.TextUtils.isEmpty(c12004xb7c17ce.M)) {
            a17.o(false);
        } else {
            a17.o(true);
            a17.mo2028x78fb63c8(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.b3(this, a17));
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(c12004xb7c17ce.Q);
        java.lang.String str = b0Var.f509563a;
        if (!isEmpty) {
            a17.mo2042x364e0e56(c12004xb7c17ce.Q);
        } else if (b17) {
            if (android.text.TextUtils.isEmpty(si1.d1.a(str, t37))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "error = fail:require permission desc");
                c12004xb7c17ce.f160910g.a(c12004xb7c17ce.f160912i, c12004xb7c17ce.f160909f.o("fail:require permission desc"));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2) c12004xb7c17ce.f160911h).a();
                return;
            }
            a17.mo2042x364e0e56(si1.d1.a(str, t37));
        }
        if ("scope.userInfo".equals(str) || "scope.userProfileChange".equals(str)) {
            if (c12004xb7c17ce.f160910g.t3() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
                c12004xb7c17ce.f160925v = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c12004xb7c17ce.f160910g.t3()).u0().f128809v;
            }
            if (c12004xb7c17ce.N != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0(c12004xb7c17ce.f160910g.mo50352x76847179(), c12004xb7c17ce.N, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c3(this, a17));
                a17.mo2034x26df5226(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d3(this, m0Var));
                a17.mo2037x3aaa4d8e(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.e3(this, a17, m0Var));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str2 = c12004xb7c17ce.f160926w;
                java.lang.String string = c12004xb7c17ce.f160910g.mo50352x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a07);
                java.lang.String str3 = b0Var.f509563a;
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str4 = c12004xb7c17ce.f160927x;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                arrayList.add(new fl1.h1(0, str2, string, str3, true, com.p314xaae8f345.mm.p943x351df9c2.z.h(str4, null, false), 0));
                a17.mo2041x3f8132ef(arrayList);
            }
        } else {
            a17.mo2040x53aeff12(str);
        }
        if (c12004xb7c17ce.P.f161013d && (!r26.n0.N(r2.f161014e))) {
            z17 = true;
        }
        if (z17) {
            a17.mo2015xf085c78(c12004xb7c17ce.P.f161014e);
            a17.mo2005x1f85dcf7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) c12004xb7c17ce.f160910g.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class));
        }
        a17.r(c12004xb7c17ce.f160910g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "dialog show");
    }
}
