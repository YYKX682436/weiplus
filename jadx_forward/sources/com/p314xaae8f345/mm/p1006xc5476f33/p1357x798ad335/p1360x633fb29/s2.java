package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz.n1 f178680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178681e;

    public s2(vz.n1 n1Var, org.json.JSONObject jSONObject) {
        this.f178680d = n1Var;
        this.f178681e = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2();
        vz.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2.f178610a;
        vz.n1 n1Var = this.f178680d;
        if (i1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j2(k2Var, n1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k2.f178610a = j2Var;
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).add(j2Var);
        }
        org.json.JSONObject jSONObject = this.f178681e;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("appIdArray");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            long optLong = jSONObject.optLong("downloadId", -1L);
            java.lang.String optString = jSONObject.optString("appId");
            if (optLong > 0) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(optLong);
                if (p17 == null) {
                    p17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t2.b(p17, n1Var);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                n1Var.d(809, "query downloadTask fail");
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(optString);
            if (q17 == null) {
                q17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t2.b(q17, n1Var);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            linkedList.add(optJSONArray.optString(i17));
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        java.util.LinkedList e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().e(linkedList);
        if (e17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", "taskInfos is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t2.c(jSONObject2, linkedList);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("result", jSONObject2.toString());
            } catch (org.json.JSONException unused) {
            }
            n1Var.c(jSONObject3);
            return;
        }
        java.util.Iterator it6 = e17.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37) it6.next();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            int i18 = c13222x107de37.f178496f;
            if (i18 == -1) {
                str = "api_not_support";
            } else if (i18 == 1) {
                str = "downloading";
            } else if (i18 == 2) {
                str = "download_pause";
            } else if (i18 == 3) {
                if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                    str = "download_succ";
                }
                str = "default";
            } else if (i18 != 4) {
                if (i18 == 5) {
                    str = "download_removed";
                }
                str = "default";
            } else {
                str = "download_fail";
            }
            try {
                jSONObject4.put("downloadId", c13222x107de37.f178494d);
                jSONObject4.put("state", str);
                if (c13222x107de37.f178505r) {
                    jSONObject4.put("reserve_for_wifi", 1);
                }
                long j17 = c13222x107de37.f178501n;
                if (j17 != 0) {
                    it = it6;
                    try {
                        jSONObject4.put("progress", (100 * c13222x107de37.f178500m) / j17);
                        jSONObject4.put("progress_float", (((float) r12) * 100.0f) / ((float) j17));
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", e.getMessage());
                        it6 = it;
                    }
                } else {
                    it = it6;
                }
                jSONObject2.put(c13222x107de37.f178499i, jSONObject4);
                linkedList.remove(c13222x107de37.f178499i);
            } catch (java.lang.Exception e19) {
                e = e19;
                it = it6;
            }
            it6 = it;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t2.c(jSONObject2, linkedList);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("result", jSONObject2.toString());
        } catch (org.json.JSONException unused2) {
        }
        n1Var.c(jSONObject5);
    }
}
