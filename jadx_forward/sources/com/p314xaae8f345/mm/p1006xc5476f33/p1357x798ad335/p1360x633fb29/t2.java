package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes.dex */
public abstract class t2 {
    public static int a(java.lang.String str) {
        if ("fail".equals(str)) {
            return 809;
        }
        if ("cancel".equals(str)) {
            return 810;
        }
        if ("fail_network_not_wifi".equals(str) || "network_not_wifi".equals(str)) {
            return 104;
        }
        if ("network_not_connected".equals(str)) {
            return 803;
        }
        if ("sdcard_not_ready".equals(str)) {
            return 804;
        }
        if ("has_not_enough_space".equals(str)) {
            return 710;
        }
        return "invalid_downloadid".equals(str) ? 808 : 0;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37, vz.n1 n1Var) {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = c13222x107de37.f178496f;
        if (i17 == -1) {
            str = "api_not_support";
        } else if (i17 == 1) {
            str = "downloading";
        } else if (i17 == 2) {
            str = "download_pause";
        } else if (i17 == 3) {
            if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                str = "download_succ";
            }
            str = "default";
        } else if (i17 != 4) {
            if (i17 == 5) {
                str = "download_removed";
            }
            str = "default";
        } else {
            str = "download_fail";
        }
        try {
            jSONObject.put("downloadId", c13222x107de37.f178494d);
            jSONObject.put("state", str);
            if (c13222x107de37.f178505r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j17 = c13222x107de37.f178501n;
            if (j17 != 0) {
                jSONObject.put("progress", (100 * c13222x107de37.f178500m) / j17);
                jSONObject.put("progress_float", (((float) r3) * 100.0f) / ((float) j17));
            }
            n1Var.c(jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", e17.getMessage());
        }
    }

    public static void c(org.json.JSONObject jSONObject, java.util.LinkedList linkedList) {
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiGameDownloadManager", e17.getMessage());
            }
        }
    }
}
