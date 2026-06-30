package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class w4 {
    public static void a(android.view.View view, ot0.q qVar, java.lang.String str, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4 t4Var) {
        if (qVar != null) {
            ot0.b bVar = (ot0.b) qVar.y(ot0.b.class);
            java.lang.String str2 = z17 ? bVar.f429922o : bVar.f429925r;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "get background name: %s", str2);
                int identifier = view.getResources().getIdentifier(str2, "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                if (identifier > 0) {
                    view.setBackgroundResource(identifier);
                    return;
                }
            }
            java.lang.String str3 = z17 ? bVar.f429923p : bVar.f429926s;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).D(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s4(str, str3, t4Var, z17, view));
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, android.app.Activity activity) {
        try {
            r45.wl6 wl6Var = new r45.wl6();
            wl6Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
            int i17 = wl6Var.f470794d;
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", wl6Var.f470795e);
                intent.putExtra("msgUsername", str2);
                intent.putExtra("geta8key_username", str3);
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).cj(activity, intent);
            } else if (i17 == 2) {
                qg0.g0 g0Var = (qg0.g0) i95.n0.c(qg0.g0.class);
                r45.nm6 nm6Var = wl6Var.f470796f;
                ((pg0.p3) g0Var).hj(nm6Var.f463051d, nm6Var.f463052e, nm6Var.f463053f, 1007);
            } else if (i17 == 3) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).fj(activity, wl6Var.f470797g);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgC2CNewV2", "ThirdC2CRouteInfo type:%s is invalid", java.lang.Integer.valueOf(i17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemAppMsgC2CNewV2", e17, "", new java.lang.Object[0]);
        }
    }
}
