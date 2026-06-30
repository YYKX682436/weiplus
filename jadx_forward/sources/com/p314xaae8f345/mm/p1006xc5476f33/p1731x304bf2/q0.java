package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class q0 implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 f222152d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var) {
        this.f222152d = p0Var;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f551991d) {
            return;
        }
        if (l0Var != null) {
            java.lang.String str = l0Var.f535943a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && java.util.Objects.equals(l0Var.f535944b, "insert")) {
                if (!str.equals("gh_25d9ac85a4bc")) {
                    int c17 = c01.h2.c(1);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("totalUnreadCount", c17);
                    } catch (org.json.JSONException unused) {
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k("wxalite7f2b757eb3c356d7b3d4291ded2f7743", "game.gamePluginDataChange", jSONObject);
                    return;
                }
                java.util.Iterator it = l0Var.f535945c.iterator();
                while (it.hasNext()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(this.f222152d.ij((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()));
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("newMessage", jSONObject2);
                    } catch (org.json.JSONException unused2) {
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k("wxalite7f2b757eb3c356d7b3d4291ded2f7743", "game.gamePluginDataChange", jSONObject3);
                }
                return;
            }
        }
        if (l0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameExternalService", "onNotifyChange talker:%s func:%s", l0Var.f535943a, l0Var.f535944b);
        }
    }
}
