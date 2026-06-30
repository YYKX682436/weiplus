package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f97234a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f97235b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f97236c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f97237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f97238e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f97239f;

    /* renamed from: g, reason: collision with root package name */
    public long f97240g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f97241h;

    /* renamed from: i, reason: collision with root package name */
    public int f97242i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f97243j;

    /* renamed from: k, reason: collision with root package name */
    public int f97244k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f97245l;

    /* renamed from: n, reason: collision with root package name */
    public int f97247n;

    /* renamed from: o, reason: collision with root package name */
    public int f97248o;

    /* renamed from: p, reason: collision with root package name */
    public int f97249p;

    /* renamed from: q, reason: collision with root package name */
    public int f97250q;

    /* renamed from: r, reason: collision with root package name */
    public int f97251r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f97252s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f97253t;

    /* renamed from: m, reason: collision with root package name */
    public boolean f97246m = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f97254u = false;

    public static com.tencent.mm.plugin.downloader_app.model.a a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
        if (jSONObject == null) {
            return aVar;
        }
        aVar.f97236c = jSONObject.optString("taskName");
        aVar.f97234a = jSONObject.optString("taskUrl");
        aVar.f97235b = jSONObject.optString("alterUrl");
        aVar.f97240g = jSONObject.optLong("taskSize");
        aVar.f97241h = jSONObject.optString("fileMd5");
        aVar.f97243j = jSONObject.optString("extInfo");
        aVar.f97247n = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("fileType"), 0);
        aVar.f97237d = jSONObject.optString("appId");
        aVar.f97238e = jSONObject.optString("rawAppId");
        aVar.f97239f = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        aVar.f97244k = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        aVar.f97242i = jSONObject.optInt("downloaderType", 1);
        aVar.f97245l = jSONObject.optBoolean("downloadInWifi", false);
        aVar.f97254u = jSONObject.optInt("ignoreNetwork", 0) == 1;
        return aVar;
    }

    public static com.tencent.mm.plugin.downloader_app.model.a b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
        if (jSONObject == null) {
            return aVar;
        }
        aVar.f97236c = jSONObject.optString("task_name");
        aVar.f97234a = jSONObject.optString("task_url");
        aVar.f97235b = jSONObject.optString("alternative_url");
        aVar.f97240g = jSONObject.optLong("task_size");
        aVar.f97241h = jSONObject.optString("file_md5");
        aVar.f97243j = jSONObject.optString("extInfo");
        aVar.f97247n = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("fileType"), 0);
        aVar.f97237d = jSONObject.optString("appid");
        aVar.f97238e = jSONObject.optString("raw_appid");
        aVar.f97239f = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        aVar.f97244k = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        aVar.f97242i = jSONObject.optInt("downloader_type", 1);
        aVar.f97245l = jSONObject.optBoolean("download_in_wifi", false);
        aVar.f97248o = jSONObject.optInt("download_type", 1);
        aVar.f97249p = jSONObject.optInt("uiarea");
        aVar.f97250q = jSONObject.optInt("notice_id");
        aVar.f97251r = jSONObject.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("fileSectionMd5");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            aVar.f97253t = new java.util.LinkedList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    d02.a aVar2 = new d02.a();
                    aVar2.f225269d = optJSONObject.optLong("android_md5_section_begin");
                    aVar2.f225270e = optJSONObject.optLong("android_md5_section_end");
                    aVar2.f225271f = optJSONObject.optString("android_md5_section_md5");
                    aVar.f97253t.add(aVar2);
                }
            }
        }
        aVar.f97254u = jSONObject.optInt("ignoreNetwork", 0) == 1;
        return aVar;
    }

    public static com.tencent.mm.plugin.downloader_app.model.a c(java.util.Map map) {
        com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
        if (map == null) {
            return aVar;
        }
        aVar.f97236c = (java.lang.String) map.get("task_name");
        aVar.f97234a = (java.lang.String) map.get("task_url");
        aVar.f97235b = (java.lang.String) map.get("alternative_url");
        aVar.f97240g = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get("task_size"), 0L);
        aVar.f97241h = (java.lang.String) map.get("file_md5");
        aVar.f97243j = (java.lang.String) map.get("extInfo");
        aVar.f97247n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("fileType"), 0);
        aVar.f97237d = (java.lang.String) map.get("appid");
        aVar.f97238e = (java.lang.String) map.get("raw_appid");
        aVar.f97239f = (java.lang.String) map.get("package_name");
        aVar.f97244k = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 1000);
        aVar.f97242i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("downloader_type"), 1);
        aVar.f97248o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("download_type"), 1);
        aVar.f97249p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("uiarea"), 0);
        aVar.f97250q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("notice_id"), 0);
        aVar.f97251r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID), 0);
        java.lang.String str = (java.lang.String) map.get("fileSectionMd5");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                if (jSONArray.length() > 0) {
                    aVar.f97253t = new java.util.LinkedList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                        if (optJSONObject != null) {
                            d02.a aVar2 = new d02.a();
                            aVar2.f225269d = optJSONObject.optLong("android_md5_section_begin");
                            aVar2.f225270e = optJSONObject.optLong("android_md5_section_end");
                            aVar2.f225271f = optJSONObject.optString("android_md5_section_md5");
                            aVar.f97253t.add(aVar2);
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        aVar.f97254u = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("ignoreNetwork"), 0) == 1;
        return aVar;
    }
}
