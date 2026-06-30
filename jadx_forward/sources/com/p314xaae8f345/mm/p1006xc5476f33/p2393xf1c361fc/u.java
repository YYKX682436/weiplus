package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class u implements su4.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 f263160a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 a0Var) {
        this.f263160a = a0Var;
    }

    @Override // su4.j1
    public void a(su4.d2 d2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w wVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSWebSearchLogic", "handleCallback %s", d2Var);
        if (d2Var == null || (wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w) d2Var.f494389e) == null) {
            return;
        }
        int intValue = ((java.lang.Integer) d2Var.f494388d).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSWebSearchLogic", "calling back to webview, id %d, reqId %s,  %s", java.lang.Integer.valueOf(intValue), wVar.f263226d, this.f263160a.f262961h);
        zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
        java.lang.String str = wVar.f263224b;
        boolean z17 = wVar.f263225c;
        java.lang.String str2 = wVar.f263226d;
        android.os.Bundle bundle = wVar.f263227e;
        ((jw4.e) l3Var).getClass();
        qx4.d0 a17 = qx4.d0.f448925m.a(intValue);
        if (a17 != null) {
            pm0.v.X(new qx4.u(bundle, str, a17, str2, z17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(intValue);
        a18.getClass();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("fts_key_req_id", str2);
        bundle2.putString("fts_key_json_data", str);
        bundle2.putBoolean("fts_key_new_query", z17);
        if (bundle != null) {
            bundle2.putBundle("fts_key_data", bundle);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = a18.f266531y;
            if (z0Var != null) {
                z0Var.mo70207xf5bc2045(119, bundle2);
            }
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + e17.getMessage());
        }
    }
}
