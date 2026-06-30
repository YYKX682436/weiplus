package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o0 f263028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f263029e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o0 o0Var, org.json.JSONObject jSONObject) {
        this.f263028d = o0Var;
        this.f263029e = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o0 o0Var = this.f263028d;
        int i17 = o0Var.f263111s;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "historySearchResultListener callback， id %d", java.lang.Integer.valueOf(i17));
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            int i18 = o0Var.f263111s;
            java.lang.String jSONObject = this.f263029e.toString();
            ((jw4.e) l3Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i18);
            a17.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = a17.f266531y;
                if (z0Var != null) {
                    z0Var.mo70207xf5bc2045(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd, bundle);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "callbacker is null");
                }
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "onGetSearchHistory exception" + e17.getMessage());
            }
        }
    }
}
