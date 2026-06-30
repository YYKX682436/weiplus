package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 f129059d;

    public r0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var) {
        this.f129059d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.BaseAppBrandServiceLogic", "hy: base service js runtime post created run");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 a0Var = this.f129059d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) a0Var.M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: v8 not ready or released!");
            return;
        }
        if (a0Var.f128901o != null) {
            if (l0Var.z() != 0) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t0 t0Var = a0Var.f128901o;
                long L = l0Var.L();
                long G = l0Var.G();
                long z17 = l0Var.z();
                iz5.a.b(null, 0L, java.lang.Long.valueOf(t0Var.f129068a));
                t0Var.f129068a = t0Var.f129072e.m154277x41e19e8f(L, G, z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.BaseAppBrandServiceLogic", "uv_ptr is null. cronet binding init failed");
                a0Var.f128901o = null;
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar = a0Var.f128895f;
        eVar.f128931a.m43148x39fc3c41(l0Var.L(), l0Var.G(), l0Var.z());
        if (a0Var.f128902p == null) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2();
            a0Var.f128902p = n2Var;
            long L2 = l0Var.L();
            long G2 = l0Var.G();
            com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = n2Var.f129035a;
            if (abstractC22919x419b2652 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
                throw null;
            }
            abstractC22919x419b2652.m83327xad361398(L2, G2);
        }
        if (a0Var.Z()) {
            eVar.f128931a.m43147xa622ddac(l0Var.L(), l0Var.G(), l0Var.z());
        }
        eVar.f128932b.a(l0Var.L(), l0Var.G());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v) a0Var.M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class);
        if (vVar != null) {
            vVar.B(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.q0(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.BaseAppBrandServiceLogic", "hy: buffer url addon not exist!");
        }
    }
}
