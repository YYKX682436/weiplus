package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
class d0 implements com.tencent.mm.ipcinvoker.j {
    private d0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.L0(Ai)) {
            rVar.a(null);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = Ai.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo downloadWidgetTaskInfo = (com.tencent.mm.plugin.downloader_app.api.DownloadWidgetTaskInfo) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("appId", downloadWidgetTaskInfo.f97227d);
                jSONObject.put("status", downloadWidgetTaskInfo.f97229f);
                jSONObject.put("downloadId", downloadWidgetTaskInfo.f97228e);
                jSONObject.put("progress", downloadWidgetTaskInfo.f97230g);
                jSONObject.put("progressFloat", downloadWidgetTaskInfo.f97232i);
                if (downloadWidgetTaskInfo.f97231h) {
                    jSONObject.put("reserveForWifi", 1);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONArray.toString()));
    }
}
