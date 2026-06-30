package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f266564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d7 f266565e;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d7 d7Var, boolean z17) {
        this.f266565e = d7Var;
        this.f266564d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "EnterChattingAfterTrans config disabled, show normal toast for H5 forward");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.h(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d7 d7Var = this.f266565e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 h7Var = d7Var.f266589a.f266616b;
        if (h7Var.f266706f) {
            hashMap.put("sendChatType", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h7Var.f266703c) ? 2 : 1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = d7Var.f266589a.f266616b.f266707g.f266531y;
        java.lang.String str = "";
        if (z0Var != null) {
            android.os.Bundle bundle = null;
            try {
                bundle = z0Var.i(77, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "Exception has occured : %s", e17.getMessage());
            }
            if (bundle != null) {
                java.lang.String string = bundle.getString("KSessionId");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (string != null) {
                    str = string;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 h7Var2 = d7Var.f266589a.f266616b;
        h7Var2.f266707g.i5(h7Var2.f266702b, "send_app_msg:ok", hashMap);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(d7Var.f266589a.f266616b.f266703c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recent forward send result is ");
        sb6.append(this.f266564d);
        sb6.append(" sendChatType=");
        sb6.append(hashMap.get("sendChatType") == null ? "NULL" : hashMap.get("sendChatType"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", sb6.toString());
        if (str.isEmpty()) {
            return;
        }
        d7Var.f266589a.f266616b.f266707g.T6(str);
    }
}
