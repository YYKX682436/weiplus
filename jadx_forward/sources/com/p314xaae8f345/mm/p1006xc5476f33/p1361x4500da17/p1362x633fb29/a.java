package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f178767a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f178768b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f178769c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f178770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f178771e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178772f;

    /* renamed from: g, reason: collision with root package name */
    public long f178773g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178774h;

    /* renamed from: i, reason: collision with root package name */
    public int f178775i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f178776j;

    /* renamed from: k, reason: collision with root package name */
    public int f178777k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f178778l;

    /* renamed from: n, reason: collision with root package name */
    public int f178780n;

    /* renamed from: o, reason: collision with root package name */
    public int f178781o;

    /* renamed from: p, reason: collision with root package name */
    public int f178782p;

    /* renamed from: q, reason: collision with root package name */
    public int f178783q;

    /* renamed from: r, reason: collision with root package name */
    public int f178784r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178785s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f178786t;

    /* renamed from: m, reason: collision with root package name */
    public boolean f178779m = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f178787u = false;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
        if (jSONObject == null) {
            return aVar;
        }
        aVar.f178769c = jSONObject.optString("taskName");
        aVar.f178767a = jSONObject.optString("taskUrl");
        aVar.f178768b = jSONObject.optString("alterUrl");
        aVar.f178773g = jSONObject.optLong("taskSize");
        aVar.f178774h = jSONObject.optString("fileMd5");
        aVar.f178776j = jSONObject.optString("extInfo");
        aVar.f178780n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("fileType"), 0);
        aVar.f178770d = jSONObject.optString("appId");
        aVar.f178771e = jSONObject.optString("rawAppId");
        aVar.f178772f = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        aVar.f178777k = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        aVar.f178775i = jSONObject.optInt("downloaderType", 1);
        aVar.f178778l = jSONObject.optBoolean("downloadInWifi", false);
        aVar.f178787u = jSONObject.optInt("ignoreNetwork", 0) == 1;
        return aVar;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
        if (jSONObject == null) {
            return aVar;
        }
        aVar.f178769c = jSONObject.optString("task_name");
        aVar.f178767a = jSONObject.optString("task_url");
        aVar.f178768b = jSONObject.optString("alternative_url");
        aVar.f178773g = jSONObject.optLong("task_size");
        aVar.f178774h = jSONObject.optString("file_md5");
        aVar.f178776j = jSONObject.optString("extInfo");
        aVar.f178780n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("fileType"), 0);
        aVar.f178770d = jSONObject.optString("appid");
        aVar.f178771e = jSONObject.optString("raw_appid");
        aVar.f178772f = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        aVar.f178777k = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        aVar.f178775i = jSONObject.optInt("downloader_type", 1);
        aVar.f178778l = jSONObject.optBoolean("download_in_wifi", false);
        aVar.f178781o = jSONObject.optInt("download_type", 1);
        aVar.f178782p = jSONObject.optInt("uiarea");
        aVar.f178783q = jSONObject.optInt("notice_id");
        aVar.f178784r = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("fileSectionMd5");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            aVar.f178786t = new java.util.LinkedList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    d02.a aVar2 = new d02.a();
                    aVar2.f306802d = optJSONObject.optLong("android_md5_section_begin");
                    aVar2.f306803e = optJSONObject.optLong("android_md5_section_end");
                    aVar2.f306804f = optJSONObject.optString("android_md5_section_md5");
                    aVar.f178786t.add(aVar2);
                }
            }
        }
        aVar.f178787u = jSONObject.optInt("ignoreNetwork", 0) == 1;
        return aVar;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a c(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a();
        if (map == null) {
            return aVar;
        }
        aVar.f178769c = (java.lang.String) map.get("task_name");
        aVar.f178767a = (java.lang.String) map.get("task_url");
        aVar.f178768b = (java.lang.String) map.get("alternative_url");
        aVar.f178773g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get("task_size"), 0L);
        aVar.f178774h = (java.lang.String) map.get("file_md5");
        aVar.f178776j = (java.lang.String) map.get("extInfo");
        aVar.f178780n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("fileType"), 0);
        aVar.f178770d = (java.lang.String) map.get("appid");
        aVar.f178771e = (java.lang.String) map.get("raw_appid");
        aVar.f178772f = (java.lang.String) map.get("package_name");
        aVar.f178777k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 1000);
        aVar.f178775i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("downloader_type"), 1);
        aVar.f178781o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("download_type"), 1);
        aVar.f178782p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("uiarea"), 0);
        aVar.f178783q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("notice_id"), 0);
        aVar.f178784r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f), 0);
        java.lang.String str = (java.lang.String) map.get("fileSectionMd5");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                if (jSONArray.length() > 0) {
                    aVar.f178786t = new java.util.LinkedList();
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                        if (optJSONObject != null) {
                            d02.a aVar2 = new d02.a();
                            aVar2.f306802d = optJSONObject.optLong("android_md5_section_begin");
                            aVar2.f306803e = optJSONObject.optLong("android_md5_section_end");
                            aVar2.f306804f = optJSONObject.optString("android_md5_section_md5");
                            aVar.f178786t.add(aVar2);
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        aVar.f178787u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get("ignoreNetwork"), 0) == 1;
        return aVar;
    }
}
