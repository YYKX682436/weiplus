package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f187447a;

    public v(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187447a = "Finder.MentionEntranceExposeHandler";
    }

    public final void a() {
        jz5.f0 f0Var;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.U.mo3195x754a37bb();
        java.lang.String str = this.f187447a;
        if (z9Var != null) {
            if (z9Var.f186860a) {
                r45.f03 f03Var = z9Var.f186861b;
                int i19 = f03Var != null ? f03Var.f455421e : 0;
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_MENTION_ENTRANCE_LAST_EXPOSE_INFO_STRING_SYNC;
                java.lang.String v17 = c17.v(u3Var, "");
                try {
                    int e17 = c01.id.e();
                    if (v17 == null || v17.length() == 0) {
                        i17 = 0;
                        i18 = 0;
                    } else {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(v17);
                        i17 = jSONObject.optInt("LATEST_FINDER_MENTION_EXPOSE_NUM");
                        i18 = jSONObject.optInt("LATEST_FINDER_MENTION_EXPOSE_TIME");
                    }
                    if (i17 != i19) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("LATEST_FINDER_MENTION_EXPOSE_NUM", i19);
                        jSONObject2.put("LATEST_FINDER_MENTION_EXPOSE_TIME", e17);
                        gm0.j1.u().c().x(u3Var, jSONObject2.toString());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateFinderMentionEntranceExposeInfo count:" + i19 + " now:" + e17 + " latestCount:" + i17 + " latestTime:" + i18 + '!');
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "updateFinderMentionEntranceExposeInfo count:" + i19, new java.lang.Object[0]);
                }
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_MENTION_ENTRANCE_LAST_EXPOSE_INFO_STRING_SYNC, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateFinderMentionEntranceExposeInfo clear info!");
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateFinderMentionEntranceExposeInfo but finderMessageEntrance value is null!");
        }
    }
}
