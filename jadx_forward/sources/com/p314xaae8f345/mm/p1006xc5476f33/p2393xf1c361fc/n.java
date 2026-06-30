package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public final class n implements su4.j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.n f263104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.n();

    @Override // su4.j1
    public final void a(su4.d2 d2Var) {
        java.lang.Object obj = d2Var.f494388d;
        if ((obj instanceof su4.r1) && (d2Var.f494389e instanceof java.lang.String)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.api.NetSceneRequestModel");
            su4.r1 r1Var = (su4.r1) obj;
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            int i17 = r1Var.f494610q;
            java.lang.Object obj2 = d2Var.f494389e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = r1Var.f494618y;
            ((jw4.e) l3Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17);
            a17.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("fts_key_json_data", (java.lang.String) obj2);
            bundle.putString("fts_key_req_id", str);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = a17.f266531y;
                if (z0Var != null) {
                    z0Var.mo70207xf5bc2045(127, bundle);
                }
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "onChatSearchDataReady exception" + e17.getMessage());
            }
        }
    }
}
