package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

@j95.b
/* loaded from: classes7.dex */
public final class m1 extends i95.w implements s40.r0 {
    public boolean Ai(org.json.JSONObject data, int i17, java.lang.String componentAppId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentAppId, "componentAppId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.optString("mode"), "halfPage")) {
            org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
            if (optJSONObject != null && optJSONObject.has("anchor_game_panel")) {
                ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85445w6).mo141623x754a37bb()).r()).intValue() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(data.toString());
                    jSONObject.put("vType", i17);
                    jSONObject.put("componentAppId", componentAppId);
                    java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                    com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()), new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k1(), com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.l1.f148340d);
                    return true;
                }
            }
        }
        return false;
    }

    public void wi() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var;
        try {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "changeToPortraitFromExternal");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
            if (k0Var2 != null) {
                z17 = true;
                if (k0Var2.m46546x9b8334b1()) {
                    if (z17 || (k0Var = dk2.ef.f314913e) == null) {
                    }
                    k0Var.m57648x167921cd();
                    return;
                }
            }
            z17 = false;
            if (z17) {
            }
        } catch (java.lang.Throwable th6) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderLiveExternalService", th6, "Fail to call FinderLiveService.changeToPortraitFromExternal()", new java.lang.Object[0]);
        }
    }
}
