package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class nf {
    public static void a(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf lfVar, ot0.a aVar, tt0.e eVar) {
        if (eVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f66300xad49e234)) {
            lfVar.f286005k.setVisibility(0);
            lfVar.f286005k.setText(eVar.f66300xad49e234);
            lfVar.f286005k.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(eVar.f66301x3c339d8f, dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f429883f)) {
                lfVar.f286005k.setVisibility(8);
                return;
            }
            lfVar.f286005k.setVisibility(0);
            lfVar.f286005k.setText(aVar.f429883f);
            lfVar.f286005k.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(aVar.f429884g, dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
        }
    }

    public static void b(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf lfVar, ot0.a aVar, ot0.q qVar, tt0.e eVar) {
        if (eVar == null || eVar.f66303xc4aab016 != 0) {
            lfVar.f286013s.setVisibility(8);
            return;
        }
        int i17 = eVar.f66299x9ac5f93a;
        if (i17 == 0) {
            lfVar.f286013s.setVisibility(8);
            return;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                lfVar.f286013s.setVisibility(0);
                lfVar.f286013s.setText(aVar.f429887j);
                return;
            }
            return;
        }
        if (eVar.f66302xd09abf35 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f429888k)) {
                lfVar.f286013s.setVisibility(8);
                return;
            } else {
                lfVar.f286013s.setVisibility(0);
                lfVar.f286013s.setText(aVar.f429888k);
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(aVar.f429885h) || android.text.TextUtils.isEmpty(aVar.f429886i)) {
            lfVar.f286013s.setVisibility(8);
            return;
        }
        lfVar.f286013s.setVisibility(0);
        java.lang.String replace = aVar.f429885h.replace("$button$", aVar.f429886i);
        android.text.SpannableString spannableString = new android.text.SpannableString(replace);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cf cfVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cf(1, null, qVar, aVar, lfVar, aVar.f429887j, dVar);
        int indexOf = replace.indexOf(aVar.f429886i);
        int length = aVar.f429886i.length() + indexOf;
        if (indexOf <= 0 || length <= 0 || indexOf >= length) {
            lfVar.f286013s.setVisibility(8);
            return;
        }
        spannableString.setSpan(cfVar, indexOf, length, 17);
        lfVar.f286013s.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        lfVar.f286013s.setText(spannableString);
    }

    public static void c(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625, ot0.q qVar) {
        ot0.a aVar;
        java.lang.String str;
        if (c6113xa3727625 == null || qVar == null || (aVar = (ot0.a) qVar.y(ot0.a.class)) == null) {
            return;
        }
        boolean z17 = aVar.f429900w;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isPrivateMessage", z17);
            str = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeAppPrivateMessageNativeExtraData", e17, "", new java.lang.Object[0]);
            str = "{}";
        }
        c6113xa3727625.f136390g.G = str;
    }

    public static void d(yb5.d dVar, ot0.q qVar) {
        tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(qVar.f430226o2);
        if (Ai == null || Ai.f66303xc4aab016 == 0) {
            cm.c1 c1Var = cm.c1.DEFAULT;
            cm.d1 d1Var = cm.d1.DEFAULT;
            if (Ai != null) {
                int i17 = Ai.f66302xd09abf35;
                if (i17 == 1) {
                    c1Var = cm.c1.DONE;
                } else if (i17 == 0) {
                    c1Var = cm.c1.DOING;
                }
                int i18 = Ai.f66299x9ac5f93a;
                if (i18 == 2) {
                    d1Var = cm.d1.SUBSCRIBE;
                } else if (i18 == 0 || i18 == 1) {
                    d1Var = cm.d1.NOTSUBSCRIBE;
                }
            }
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            int i19 = aVar != null ? aVar.f429881d : 0;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7150xae2fbc94 c7150xae2fbc94 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7150xae2fbc94();
            c7150xae2fbc94.f144583d = c7150xae2fbc94.b("AppId", qVar.f430210k2, true);
            c7150xae2fbc94.f144584e = c7150xae2fbc94.b("PageId", qVar.f430202i2, true);
            c7150xae2fbc94.f144586g = c7150xae2fbc94.b("ShareTicket", qVar.f430226o2, true);
            c7150xae2fbc94.f144587h = c7150xae2fbc94.b("ChattingId", dVar.x(), true);
            c7150xae2fbc94.f144588i = dVar.D() ? cm.b1.YES : cm.b1.NO;
            c7150xae2fbc94.f144589j = cm.a1.CLICKAPPMSG;
            c7150xae2fbc94.f144590k = 0L;
            c7150xae2fbc94.f144591l = c7150xae2fbc94.b("SceneNote", "", true);
            c7150xae2fbc94.f144594o = cm.z0.a(i19 + 1000);
            c7150xae2fbc94.f144585f = c7150xae2fbc94.i();
            c7150xae2fbc94.f144592m = c1Var;
            c7150xae2fbc94.f144593n = d1Var;
            c7150xae2fbc94.k();
        }
    }
}
