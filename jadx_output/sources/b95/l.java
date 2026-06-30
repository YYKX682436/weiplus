package b95;

/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f18636a;

    public static void a(com.tencent.mm.storage.u3 u3Var, java.util.Queue queue) {
        org.json.JSONArray jSONArray;
        boolean z17;
        int i17;
        if (u3Var == null) {
            return;
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(u3Var, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.List b17 = b(str);
        if (com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
            return;
        }
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) b17;
            if (i18 >= linkedList.size()) {
                return;
            }
            b95.a aVar = (b95.a) linkedList.get(i18);
            com.tencent.mm.storage.ea eaVar = new com.tencent.mm.storage.ea();
            eaVar.f193885d = aVar.f18627a;
            eaVar.f193886e = aVar.f18628b.longValue();
            eaVar.f193887f = b95.j.f18632b.b(eaVar.f193885d);
            queue.offer(eaVar);
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(u3Var, null);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            java.util.List b18 = b(str2);
            boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(b18);
            java.lang.String str3 = aVar.f18627a;
            if (L0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.a());
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str3);
                    jSONObject.put("time", valueOf);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("RecentForwardStorage", "deleteRecentForwardStorage: " + e17.getMessage());
                }
                jSONArray2.put(jSONObject);
                jSONArray = jSONArray2;
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.L0(b18) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    int i19 = 0;
                    while (true) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) b18;
                        if (i19 >= linkedList2.size()) {
                            break;
                        }
                        if (((b95.a) linkedList2.get(i19)).f18627a.equals(str3)) {
                            z17 = true;
                            break;
                        }
                        i19++;
                    }
                }
                z17 = false;
                if (z17) {
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(b18) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        i17 = 0;
                        while (true) {
                            java.util.LinkedList linkedList3 = (java.util.LinkedList) b18;
                            if (i17 >= linkedList3.size()) {
                                break;
                            } else if (((b95.a) linkedList3.get(i17)).f18627a.equals(str3)) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    i17 = -1;
                    ((java.util.LinkedList) b18).remove(i17);
                }
                jSONArray = new org.json.JSONArray();
                int i27 = 0;
                while (true) {
                    java.util.LinkedList linkedList4 = (java.util.LinkedList) b18;
                    if (i27 < linkedList4.size()) {
                        b95.a aVar2 = (b95.a) linkedList4.get(i27);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, aVar2.f18627a);
                            jSONObject2.put("time", aVar2.f18628b);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.e("RecentForwardStorage", "deleteRecentForwardStorage: " + e18.getMessage());
                        }
                        jSONArray.put(jSONObject2);
                        i27++;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("RecentForwardStorage", "recent name list: %s", jSONArray);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, jSONArray.toString());
            i18++;
        }
    }

    public static java.util.List b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                linkedList.add(new b95.a(optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), java.lang.Long.valueOf(optJSONObject.optLong("time"))));
            }
            return linkedList;
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("RecentForwardStorage", "optListFromJSONStr err! %s", com.tencent.mm.sdk.platformtools.z3.c(th6));
            return null;
        }
    }
}
