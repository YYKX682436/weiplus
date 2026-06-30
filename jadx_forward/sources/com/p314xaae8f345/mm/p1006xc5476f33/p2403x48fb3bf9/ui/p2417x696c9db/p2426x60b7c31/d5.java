package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266585e;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266585e = c1Var;
        this.f266584d = y2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17;
        java.lang.String str;
        java.lang.String str2;
        nw4.y2 y2Var;
        java.lang.String str3;
        nw4.y2 y2Var2 = this;
        nw4.y2 y2Var3 = y2Var2.f266584d;
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) y2Var3.f422323a.get("download_id"), -1L);
        java.lang.String str4 = (java.lang.String) y2Var3.f422323a.get("appid");
        java.lang.String str5 = (java.lang.String) y2Var3.f422323a.get("appIdArray");
        java.lang.String str6 = "MicroMsg.MsgHandler";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doQueryDownloadTask, downloadId = " + V + ",appId = " + str4 + ",appIds = " + str5);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5);
        java.lang.String str7 = "download_succ";
        java.lang.String str8 = "download_fail";
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = y2Var2.f266585e;
        if (K0) {
            if (V > 0) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(V);
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, invalid downloadId = " + V + " or appid is null");
                    c1Var.i5(y2Var3, "query_download_task:fail", null);
                    return;
                }
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str4);
            }
            int i17 = q17.f178496f;
            if (i17 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, api not support");
                c1Var.i5(y2Var3, "query_download_task:fail_apilevel_too_low", null);
                return;
            }
            if (i17 == 1) {
                str = "downloading";
            } else if (i17 == 2) {
                str = "download_pause";
            } else if (i17 != 3) {
                if (i17 == 4) {
                    str = "download_fail";
                }
                str = "default";
            } else {
                if (com.p314xaae8f345.mm.vfs.w6.j(q17.f178497g)) {
                    str = "download_succ";
                }
                str = "default";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doQueryDownloadTask, state = ".concat(str));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", str);
            hashMap.put("download_id", java.lang.Long.valueOf(q17.f178494d));
            if (q17.f178505r) {
                hashMap.put("reserve_for_wifi", 1);
            }
            long j17 = q17.f178501n;
            if (j17 != 0) {
                long j18 = q17.f178500m;
                hashMap.put("progress", java.lang.Long.valueOf((100 * j18) / j17));
                hashMap.put("progress_float", java.lang.Float.valueOf((((float) j18) * 100.0f) / ((float) j17)));
            }
            c1Var.i5(y2Var3, "query_download_task:ok", hashMap);
            return;
        }
        c1Var.getClass();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str5);
            try {
                if (jSONArray.length() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    int i18 = 0;
                    while (i18 < jSONArray.length()) {
                        try {
                            java.lang.String string = jSONArray.getString(i18);
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(string);
                            org.json.JSONArray jSONArray2 = jSONArray;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            int i19 = q18.f178496f;
                            java.lang.String str9 = str7;
                            if (i19 == -1) {
                                str3 = "api_not_support";
                            } else if (i19 == 1) {
                                str3 = "downloading";
                            } else if (i19 == 2) {
                                str3 = "download_pause";
                            } else if (i19 != 3) {
                                if (i19 == 4) {
                                    str3 = str8;
                                }
                                str3 = "default";
                            } else {
                                if (com.p314xaae8f345.mm.vfs.w6.j(q18.f178497g)) {
                                    str3 = str9;
                                }
                                str3 = "default";
                            }
                            java.lang.String str10 = str8;
                            jSONObject2.put("download_id", q18.f178494d);
                            jSONObject2.put("state", str3);
                            if (q18.f178505r) {
                                jSONObject2.put("reserve_for_wifi", 1);
                            }
                            long j19 = q18.f178501n;
                            if (j19 != 0) {
                                java.lang.String str11 = str6;
                                try {
                                    str2 = str11;
                                    y2Var = y2Var3;
                                } catch (org.json.JSONException e17) {
                                    e = e17;
                                    str2 = str11;
                                    y2Var = y2Var3;
                                    y2Var2 = y2Var;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, e.getMessage());
                                    c1Var.i5(y2Var2, "query_download_task:fail", null);
                                    return;
                                }
                                try {
                                    jSONObject2.put("progress", (q18.f178500m * 100) / j19);
                                    jSONObject2.put("progress_float", (((float) r7) * 100.0f) / ((float) j19));
                                } catch (org.json.JSONException e18) {
                                    e = e18;
                                    y2Var2 = y2Var;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, e.getMessage());
                                    c1Var.i5(y2Var2, "query_download_task:fail", null);
                                    return;
                                }
                            } else {
                                y2Var = y2Var3;
                                str2 = str6;
                            }
                            jSONObject.put(string, jSONObject2);
                            i18++;
                            jSONArray = jSONArray2;
                            str7 = str9;
                            str8 = str10;
                            y2Var3 = y2Var;
                            str6 = str2;
                        } catch (org.json.JSONException e19) {
                            e = e19;
                            y2Var = y2Var3;
                            str2 = str6;
                        }
                    }
                    y2Var = y2Var3;
                    str2 = str6;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("result", jSONObject);
                    nw4.y2 y2Var4 = y2Var;
                    c1Var.i5(y2Var4, "query_download_task:ok", hashMap2);
                    y2Var2 = y2Var4;
                } else {
                    nw4.y2 y2Var5 = y2Var3;
                    str2 = "MicroMsg.MsgHandler";
                    c1Var.i5(y2Var5, "query_download_task:fail", null);
                    y2Var2 = y2Var5;
                }
            } catch (org.json.JSONException e27) {
                e = e27;
            }
        } catch (org.json.JSONException e28) {
            e = e28;
            y2Var2 = y2Var3;
            str2 = str6;
        }
    }
}
