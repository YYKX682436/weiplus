package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* loaded from: classes8.dex */
public abstract class d {
    public static final boolean a() {
        boolean z17;
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_LEVELUP_SHUTDOWN_TIME_SEC_LONG, 0L);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() < t17) {
            return false;
        }
        java.lang.String Ai = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_exp_22t4_new_redpoint, "");
        if (Ai != null && Ai.length() == 0) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Ai);
            boolean z18 = jSONObject.has("disable_android") && jSONObject.getInt("disable_android") == 1;
            if (jSONObject.has("exp_id")) {
                if (jSONObject.getInt("exp_id") == 1) {
                    z17 = true;
                    return !z18 && z17;
                }
            }
            z17 = false;
            if (z18) {
                return false;
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameABConfig", e17.getMessage());
            return false;
        }
    }

    public static final boolean b() {
        try {
            return new org.json.JSONObject(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_friends_ui_reddot_special_android, "")).optBoolean("jumpdirectly");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameABConfig", e17.getMessage());
            return false;
        }
    }

    public static final boolean c() {
        try {
            return new org.json.JSONObject(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_friends_ui_reddot_special_android, "")).optBoolean("jumpfinder");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameABConfig", e17.getMessage());
            return false;
        }
    }
}
