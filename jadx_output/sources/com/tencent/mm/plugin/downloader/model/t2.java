package com.tencent.mm.plugin.downloader.model;

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

    public static void b(com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo, vz.n1 n1Var) {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = fileDownloadTaskInfo.f96963f;
        if (i17 == -1) {
            str = "api_not_support";
        } else if (i17 == 1) {
            str = "downloading";
        } else if (i17 == 2) {
            str = "download_pause";
        } else if (i17 == 3) {
            if (com.tencent.mm.vfs.w6.j(fileDownloadTaskInfo.f96964g)) {
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
            jSONObject.put("downloadId", fileDownloadTaskInfo.f96961d);
            jSONObject.put("state", str);
            if (fileDownloadTaskInfo.f96972r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j17 = fileDownloadTaskInfo.f96968n;
            if (j17 != 0) {
                jSONObject.put("progress", (100 * fileDownloadTaskInfo.f96967m) / j17);
                jSONObject.put("progress_float", (((float) r3) * 100.0f) / ((float) j17));
            }
            n1Var.c(jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", e17.getMessage());
        }
    }

    public static void c(org.json.JSONObject jSONObject, java.util.LinkedList linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
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
                com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", e17.getMessage());
            }
        }
    }
}
