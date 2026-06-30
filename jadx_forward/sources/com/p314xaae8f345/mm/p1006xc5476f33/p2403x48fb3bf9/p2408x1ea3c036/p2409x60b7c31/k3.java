package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class k3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k3 k3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        java.lang.String str;
        k3Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = c13222x107de37.f178496f;
        if (i17 == -1) {
            str = "api_not_support";
        } else if (i17 == 1) {
            str = "downloading";
        } else if (i17 == 2) {
            str = "download_pause";
        } else if (i17 != 3) {
            if (i17 == 4) {
                str = "download_fail";
            }
            str = "default";
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                str = "download_succ";
            }
            str = "default";
        }
        try {
            jSONObject.put("download_id", c13222x107de37.f178494d);
            jSONObject.put("state", str);
            if (c13222x107de37.f178505r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j17 = c13222x107de37.f178501n;
            if (j17 != 0) {
                jSONObject.put("progress", (100 * c13222x107de37.f178500m) / j17);
                jSONObject.put("progress_float", (((float) r2) * 100.0f) / ((float) j17));
            }
            q5Var.a(null, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
        }
    }

    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33739x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiQueryDownloadTask", "invokeInMM");
        try {
            p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j3(this, new org.json.JSONObject(str), q5Var));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTask", "paras data error: " + e17.getMessage());
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public final void g(org.json.JSONObject jSONObject, java.util.LinkedList linkedList) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("download_id", -1);
                jSONObject2.put("state", "default");
                jSONObject.put(str, jSONObject2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryDownloadTask", e17.getMessage());
            }
        }
    }
}
