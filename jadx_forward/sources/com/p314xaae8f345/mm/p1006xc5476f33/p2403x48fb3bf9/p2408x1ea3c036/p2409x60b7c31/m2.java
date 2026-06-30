package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class m2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openBizChat";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString(dm.i4.f66875xa013b0d5);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                q5Var.a("param_err", null);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(optString, true);
            if (n17 == null || !n17.k2()) {
                q5Var.a("not biz username", null);
                return;
            }
            if (!n17.r2()) {
                q5Var.a("open_biz_chat", null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", optString);
            intent.putExtra("finish_direct", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            q5Var.a(null, null);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBizChat", "parase json fail");
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
