package com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c;

@j95.b
/* loaded from: classes13.dex */
public class e extends i95.w implements jy1.e, ez1.a, mz1.c, gy1.c {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e f178226g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f178227d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f178228e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f178229f;

    private e() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f178229f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5805x90206df7>(a0Var) { // from class: com.tencent.mm.plugin.datareport.flutter.FlutterDataReportService$1
            {
                this.f39173x3fe91575 = -160926713;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5805x90206df7 c5805x90206df7) {
                java.util.HashMap hashMap = new java.util.HashMap();
                am.an anVar = c5805x90206df7.f136114g;
                java.util.HashMap hashMap2 = anVar.f87702f;
                if (hashMap2 != null && hashMap2.size() > 0) {
                    for (java.lang.Object obj : anVar.f87702f.keySet()) {
                        java.lang.Object obj2 = anVar.f87702f.get(obj);
                        if (obj != null && (obj instanceof java.lang.String) && obj2 != null) {
                            hashMap.put((java.lang.String) obj, obj2);
                        }
                    }
                }
                int i17 = anVar.f87697a;
                java.lang.String str = anVar.f87698b;
                int i18 = anVar.f87699c;
                int i19 = anVar.f87700d;
                int i27 = anVar.f87701e;
                boolean z17 = anVar.f87703g;
                boolean z18 = anVar.f87704h;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this;
                eVar.getClass();
                if (!u46.l.e(str) && i18 > 0 && z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[pageChange] eventType " + i17 + ", pageName : " + str + ", pageHash : " + i18 + ", pageId : " + i19 + ", bizGroupId : " + i27 + ", isSubPage : " + z17 + ", isFlutterPage : " + z18);
                    final java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
                    hashMap3.put("hash", java.lang.String.valueOf(i18));
                    final java.lang.String[] strArr = new java.lang.String[hashMap3.size()];
                    final java.lang.String[] strArr2 = new java.lang.String[hashMap3.size()];
                    int i28 = 0;
                    for (java.lang.String str2 : hashMap3.keySet()) {
                        strArr[i28] = str2;
                        strArr2[i28] = (java.lang.String) hashMap3.get(str2);
                        i28++;
                    }
                    if (i17 == 0) {
                        sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this.f178228e).iterator();
                                while (it.hasNext()) {
                                    ((c61.ab) ((jy1.f) it.next())).b("native_action_page_in", hashMap3);
                                }
                                w71.f[] a17 = w71.g.a();
                                if (a17 != null) {
                                    for (w71.f fVar : a17) {
                                        ((w71.h) fVar).a("native_action_page_in", strArr, strArr2);
                                    }
                                }
                            }
                        });
                    } else if (i17 == 1) {
                        sz1.i.d(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this.f178228e).iterator();
                                while (it.hasNext()) {
                                    ((c61.ab) ((jy1.f) it.next())).b("native_action_page_out", hashMap3);
                                }
                                w71.f[] a17 = w71.g.a();
                                if (a17 != null) {
                                    for (w71.f fVar : a17) {
                                        ((w71.h) fVar).a("native_action_page_out", strArr, strArr2);
                                    }
                                }
                            }
                        }, 2000L);
                    }
                }
                return false;
            }
        };
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e wi() {
        if (f178226g == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.class) {
                if (f178226g == null) {
                    f178226g = new com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e();
                }
            }
        }
        return f178226g;
    }

    public final java.util.Map Ai(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj instanceof java.lang.String) {
                java.lang.String str2 = (java.lang.String) obj;
                if (str2.contains("jm|")) {
                    java.lang.String[] split = str2.split("jm\\|");
                    if (split.length > 0) {
                        try {
                            hashMap.put(str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138431xcdecea63(new org.json.JSONObject(split[split.length - 1])));
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } else if (str2.contains("jl|")) {
                    java.lang.String[] split2 = str2.split("jl\\|");
                    if (split2.length > 0) {
                        hashMap.put(str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28685xb8fe950a.m138431xcdecea63(new org.json.JSONArray(split2[split2.length - 1])));
                    }
                } else {
                    hashMap.put(str, obj);
                }
            } else {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    @Override // gy1.c
    public void D2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f178228e).size() == 0) {
            return;
        }
        sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$h
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this.f178228e).iterator();
                while (it.hasNext()) {
                    ((c61.ab) ((jy1.f) it.next())).b("native_action_app_in", new java.util.HashMap());
                }
                w71.f[] a17 = w71.g.a();
                if (a17 != null) {
                    for (w71.f fVar : a17) {
                        ((w71.h) fVar).a("native_action_app_in", new java.lang.String[0], new java.lang.String[0]);
                    }
                }
            }
        });
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f178228e).size() == 0) {
            return;
        }
        sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$i
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this.f178228e).iterator();
                while (it.hasNext()) {
                    ((c61.ab) ((jy1.f) it.next())).b("native_action_app_out", new java.util.HashMap());
                }
                w71.f[] a17 = w71.g.a();
                if (a17 != null) {
                    for (w71.f fVar : a17) {
                        ((w71.h) fVar).a("native_action_app_out", new java.lang.String[0], new java.lang.String[0]);
                    }
                }
            }
        });
    }

    @Override // mz1.c
    /* renamed from: onActivityCreated */
    public void mo54634x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    /* renamed from: onActivityDestroyed */
    public void mo54635xa9f48fab(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPaused */
    public void mo54636x99a658dc(android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f178228e).size() == 0) {
            return;
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) || u46.l.c(activity.getClass().getSimpleName(), "MMFTSSearchTabWebViewUI") || u46.l.c(activity.getClass().getSimpleName(), "VideoActivity")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[onActivityPrePaused] activity : " + activity);
            final java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, activity.getClass().getSimpleName());
            hashMap.put("hash", java.lang.String.valueOf(activity.hashCode()));
            final java.lang.String[] strArr = new java.lang.String[hashMap.size()];
            final java.lang.String[] strArr2 = new java.lang.String[hashMap.size()];
            int i17 = 0;
            for (java.lang.String str : hashMap.keySet()) {
                strArr[i17] = str;
                strArr2[i17] = (java.lang.String) hashMap.get(str);
                i17++;
            }
            sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$d
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this.f178228e).iterator();
                    while (it.hasNext()) {
                        ((c61.ab) ((jy1.f) it.next())).b("native_action_page_out", hashMap);
                    }
                    w71.f[] a17 = w71.g.a();
                    if (a17 != null) {
                        for (w71.f fVar : a17) {
                            ((w71.h) fVar).a("native_action_page_out", strArr, strArr2);
                        }
                    }
                }
            });
        }
    }

    @Override // mz1.c
    /* renamed from: onActivityPostCreated */
    public void mo54637xd264673a(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPostDestroyed */
    public void mo54638x1da8b1eb(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPostPaused */
    public void mo54639x97ef5e9c(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPostResumed */
    public void mo54640xd6812629(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPostSaveInstanceState */
    public void mo54641xadb8051(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPostStarted */
    public void mo54642x240128d3(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPostStopped */
    public void mo54643x24c57a1f(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPreCreated */
    public void mo54644xc08eef73(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPreDestroyed */
    public void mo54645x2b520fe4(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPrePaused */
    public void mo54646xc0a66b43(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPreResumed */
    public void mo54647xc4abae62(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPreSaveInstanceState */
    public void mo54648x7267d54a(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPreStarted */
    public void mo54649x122bb10c(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityPreStopped */
    public void mo54650x12f00258(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityResumed */
    public void mo54651xba973e9(android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f178228e).size() == 0) {
            return;
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) || u46.l.c(activity.getClass().getSimpleName(), "MMFTSSearchTabWebViewUI") || u46.l.c(activity.getClass().getSimpleName(), "VideoActivity")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[onActivityResumed] activity : " + activity);
            final java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, activity.getClass().getSimpleName());
            hashMap.put("hash", java.lang.String.valueOf(activity.hashCode()));
            final java.lang.String[] strArr = new java.lang.String[hashMap.size()];
            final java.lang.String[] strArr2 = new java.lang.String[hashMap.size()];
            int i17 = 0;
            for (java.lang.String str : hashMap.keySet()) {
                strArr[i17] = str;
                strArr2[i17] = (java.lang.String) hashMap.get(str);
                i17++;
            }
            sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this.f178228e).iterator();
                    while (it.hasNext()) {
                        ((c61.ab) ((jy1.f) it.next())).b("native_action_page_in", hashMap);
                    }
                    w71.f[] a17 = w71.g.a();
                    if (a17 != null) {
                        for (w71.f fVar : a17) {
                            ((w71.h) fVar).a("native_action_page_in", strArr, strArr2);
                        }
                    }
                }
            });
        }
    }

    @Override // mz1.c
    /* renamed from: onActivitySaveInstanceState */
    public void mo54652x634d9e11(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    /* renamed from: onActivityStarted */
    public void mo54653x59297693(android.app.Activity activity) {
    }

    @Override // mz1.c
    /* renamed from: onActivityStopped */
    public void mo54654x59edc7df(android.app.Activity activity) {
    }

    @Override // gy1.c
    public void w8(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
    }
}
