package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.p f82002h;

    public q(com.tencent.mm.plugin.appbrand.jsapi.media.p pVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.util.List list, int i17) {
        this.f82002h = pVar;
        this.f81998d = lVar;
        this.f81999e = jSONObject;
        this.f82000f = list;
        this.f82001g = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.util.Map map;
        ?? jSONArray;
        if (this.f81998d.isRunning()) {
            if (com.tencent.mm.plugin.appbrand.utils.d5.a()) {
                ((ku5.t0) ku5.t0.f312615d).q(this);
                return;
            }
            final com.tencent.mm.plugin.appbrand.jsapi.media.p pVar = this.f82002h;
            org.json.JSONObject jSONObject = this.f81999e;
            java.util.List<java.lang.String> list = this.f82000f;
            final com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81998d;
            final int i18 = this.f82001g;
            pVar.getClass();
            java.lang.String str2 = null;
            if (list.size() == 1) {
                pVar.G((java.lang.String) list.get(0), new com.tencent.mm.plugin.appbrand.jsapi.media.v() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.p$$a
                    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.v
                    public final void a(java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
                        com.tencent.mm.plugin.appbrand.jsapi.media.p pVar2 = com.tencent.mm.plugin.appbrand.jsapi.media.p.this;
                        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                        int i19 = i18;
                        if (!z17) {
                            lVar2.a(i19, pVar2.u(str4, null));
                            return;
                        }
                        pVar2.H(str5);
                        java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        if (str6 == null) {
                            str6 = "";
                        }
                        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 0);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                        }
                        lVar2.a(i19, pVar2.u(str6, jSONObject2));
                    }
                }, lVar, null);
                return;
            }
            java.lang.String str3 = "MicroMsg.AppBrand.BaseJsApiSaveToPhotosAlbum";
            int size = list.size();
            java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
            java.util.List synchronizedList2 = java.util.Collections.synchronizedList(new java.util.ArrayList());
            java.util.List F = pVar.F(jSONObject);
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            int i19 = 0;
            while (i19 < size) {
                final java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                final ?? r162 = synchronizedList2;
                final java.util.List list2 = synchronizedList;
                java.lang.String str4 = str3;
                final java.lang.String str5 = (F == null || i19 >= F.size()) ? null : (java.lang.String) F.get(i19);
                ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.p$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        final java.lang.String str6 = r162;
                        final java.util.List list3 = list2;
                        final java.util.List list4 = r162;
                        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                        java.lang.String str7 = str5;
                        java.util.concurrent.CountDownLatch countDownLatch3 = countDownLatch2;
                        com.tencent.mm.plugin.appbrand.jsapi.media.p pVar2 = com.tencent.mm.plugin.appbrand.jsapi.media.p.this;
                        pVar2.getClass();
                        try {
                            pVar2.G(str6, new com.tencent.mm.plugin.appbrand.jsapi.media.v() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.p$$c
                                @Override // com.tencent.mm.plugin.appbrand.jsapi.media.v
                                public final void a(java.lang.String str8, java.lang.String str9, boolean z17, java.lang.String str10) {
                                    java.lang.String str11 = str6;
                                    if (z17) {
                                        list4.add(str11);
                                    } else {
                                        list3.add(new com.tencent.mm.plugin.appbrand.jsapi.media.u(str11, str9));
                                    }
                                }
                            }, lVar2, str7);
                        } finally {
                            countDownLatch3.countDown();
                        }
                    }
                });
                i19++;
                atomicBoolean = atomicBoolean;
                synchronizedList2 = r162;
                str2 = null;
                F = F;
                countDownLatch = countDownLatch2;
                synchronizedList = synchronizedList;
                size = size;
                str3 = str4;
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = atomicBoolean;
            java.util.List list3 = synchronizedList2;
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.media.u> list4 = synchronizedList;
            int i27 = size;
            java.lang.String str6 = str3;
            java.lang.String str7 = str2;
            try {
                countDownLatch.await(u04.d.f423477c, java.util.concurrent.TimeUnit.MILLISECONDS);
                i17 = i27;
                str = str6;
            } catch (java.lang.InterruptedException unused) {
                atomicBoolean2.set(true);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("batchSaveToPhotosAlbum interrupted, total: ");
                i17 = i27;
                sb6.append(i17);
                sb6.append(", failed: ");
                sb6.append(list4.size());
                str = str6;
                com.tencent.mars.xlog.Log.e(str, sb6.toString());
            }
            if (atomicBoolean2.get()) {
                for (java.lang.String str8 : list) {
                    java.util.List list5 = list3;
                    if (!list5.contains(str8)) {
                        list4.add(new com.tencent.mm.plugin.appbrand.jsapi.media.u(str8, "fail timeout"));
                    }
                    list3 = list5;
                }
            }
            if (list4.isEmpty()) {
                java.lang.String str9 = android.text.TextUtils.isEmpty(str7) ? "ok" : str7;
                if (str9 == null) {
                    str9 = "";
                }
                java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i18, pVar.u(str9, jSONObject2));
                pVar.H("");
                return;
            }
            if (list4.size() < i17) {
                java.util.HashMap hashMap = new java.util.HashMap(1);
                if (list4.isEmpty()) {
                    jSONArray = str7;
                } else {
                    jSONArray = new org.json.JSONArray();
                    for (com.tencent.mm.plugin.appbrand.jsapi.media.u uVar : list4) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, uVar.f82084a);
                            jSONObject3.put("errMsg", uVar.f82085b);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.e(str, "failedListToJsonArray error: " + e18);
                        }
                        jSONArray.put(jSONObject3);
                    }
                }
                hashMap.put("failures", jSONArray);
                pVar.H("");
                map = hashMap;
            } else {
                map = str7;
            }
            java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
            boolean z17 = map instanceof java.util.HashMap;
            java.util.Map map2 = map;
            if (!z17) {
                map2 = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
            }
            map2.put("errno", 4);
            lVar.a(i18, pVar.t("fail:internal error", map2));
            com.tencent.mars.xlog.Log.w(str, "batchSaveToPhotosAlbum fail " + list4.size() + " items failed");
        }
    }
}
