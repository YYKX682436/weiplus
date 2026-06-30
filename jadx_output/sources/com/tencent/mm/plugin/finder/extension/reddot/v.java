package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f105914a;

    public v(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105914a = "Finder.MentionEntranceExposeHandler";
    }

    public final void a() {
        jz5.f0 f0Var;
        int i17;
        int i18;
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.U.getValue();
        java.lang.String str = this.f105914a;
        if (z9Var != null) {
            if (z9Var.f105327a) {
                r45.f03 f03Var = z9Var.f105328b;
                int i19 = f03Var != null ? f03Var.f373888e : 0;
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_MENTION_ENTRANCE_LAST_EXPOSE_INFO_STRING_SYNC;
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
                    com.tencent.mars.xlog.Log.i(str, "updateFinderMentionEntranceExposeInfo count:" + i19 + " now:" + e17 + " latestCount:" + i17 + " latestTime:" + i18 + '!');
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "updateFinderMentionEntranceExposeInfo count:" + i19, new java.lang.Object[0]);
                }
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_MENTION_ENTRANCE_LAST_EXPOSE_INFO_STRING_SYNC, "");
                com.tencent.mars.xlog.Log.i(str, "updateFinderMentionEntranceExposeInfo clear info!");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "updateFinderMentionEntranceExposeInfo but finderMessageEntrance value is null!");
        }
    }
}
