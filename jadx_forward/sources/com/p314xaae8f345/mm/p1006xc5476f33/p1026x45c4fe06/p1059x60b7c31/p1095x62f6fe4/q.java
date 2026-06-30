package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f163533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f163534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p f163535h;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, java.util.List list, int i17) {
        this.f163535h = pVar;
        this.f163531d = lVar;
        this.f163532e = jSONObject;
        this.f163533f = list;
        this.f163534g = i17;
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
        if (this.f163531d.mo50262x39e05d35()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
                ((ku5.t0) ku5.t0.f394148d).q(this);
                return;
            }
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p pVar = this.f163535h;
            org.json.JSONObject jSONObject = this.f163532e;
            java.util.List<java.lang.String> list = this.f163533f;
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163531d;
            final int i18 = this.f163534g;
            pVar.getClass();
            java.lang.String str2 = null;
            if (list.size() == 1) {
                pVar.G((java.lang.String) list.get(0), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.p$$a
                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v
                    public final void a(java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p pVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
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
                        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 0);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
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
                ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.p$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        final java.lang.String str6 = r162;
                        final java.util.List list3 = list2;
                        final java.util.List list4 = r162;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                        java.lang.String str7 = str5;
                        java.util.concurrent.CountDownLatch countDownLatch3 = countDownLatch2;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p pVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p.this;
                        pVar2.getClass();
                        try {
                            pVar2.G(str6, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v() { // from class: com.tencent.mm.plugin.appbrand.jsapi.media.p$$c
                                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v
                                public final void a(java.lang.String str8, java.lang.String str9, boolean z17, java.lang.String str10) {
                                    java.lang.String str11 = str6;
                                    if (z17) {
                                        list4.add(str11);
                                    } else {
                                        list3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u(str11, str9));
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
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u> list4 = synchronizedList;
            int i27 = size;
            java.lang.String str6 = str3;
            java.lang.String str7 = str2;
            try {
                countDownLatch.await(u04.d.f505010c, java.util.concurrent.TimeUnit.MILLISECONDS);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
            }
            if (atomicBoolean2.get()) {
                for (java.lang.String str8 : list) {
                    java.util.List list5 = list3;
                    if (!list5.contains(str8)) {
                        list4.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u(str8, "fail timeout"));
                    }
                    list3 = list5;
                }
            }
            if (list4.isEmpty()) {
                java.lang.String str9 = android.text.TextUtils.isEmpty(str7) ? "ok" : str7;
                if (str9 == null) {
                    str9 = "";
                }
                java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
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
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u uVar : list4) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, uVar.f163617a);
                            jSONObject3.put("errMsg", uVar.f163618b);
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "failedListToJsonArray error: " + e18);
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
            java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            boolean z17 = map instanceof java.util.HashMap;
            java.util.Map map2 = map;
            if (!z17) {
                map2 = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
            }
            map2.put("errno", 4);
            lVar.a(i18, pVar.t("fail:internal error", map2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "batchSaveToPhotosAlbum fail " + list4.size() + " items failed");
        }
    }
}
