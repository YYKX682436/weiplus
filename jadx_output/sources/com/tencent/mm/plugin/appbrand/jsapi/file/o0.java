package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.p0 f81113f;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.file.p0 p0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81113f = p0Var;
        this.f81111d = lVar;
        this.f81112e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81111d;
        if (lVar.isRunning()) {
            java.util.List<com.tencent.mm.plugin.appbrand.appstorage.t1> savedFileList = lVar.getFileSystem().getSavedFileList();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (savedFileList != null && savedFileList.size() > 0) {
                for (com.tencent.mm.plugin.appbrand.appstorage.t1 t1Var : savedFileList) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, t1Var.a());
                        jSONObject.put("size", t1Var.b());
                        jSONObject.put("createTime", java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(t1Var.lastModified()));
                        jSONArray.put(jSONObject);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("fileList", jSONArray);
            lVar.a(this.f81112e, this.f81113f.p("ok", hashMap));
        }
    }
}
