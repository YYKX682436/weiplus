package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221456a;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var) {
        this.f221456a = x0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.w0
    public void a() {
        java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__report_session_id__=\"%s\"; })()", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.b().getString("session_id"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "getSessionId, jsStr_6:%s", format);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221456a;
        x0Var.o(format, null);
        java.lang.String format2 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameNavigationBarHeight__= %d; })()", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bl.c(x0Var.f488143d)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "gameNavigationBarHeight, jsStr_6:%s", format2);
        x0Var.o(format2, null);
        java.lang.String Q = x0Var.Q();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Q)) {
            return;
        }
        java.lang.String format3 = java.lang.String.format("javascript:(function(){ window.__wxWebEnv= { getEnv: function(){ return %s; } }; })()", org.json.JSONObject.quote(Q));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "_wxWebEnv, :%s", org.json.JSONObject.quote(Q));
        x0Var.o(format3, null);
    }
}
