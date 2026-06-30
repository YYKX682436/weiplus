package com.tencent.mm.plugin.datareport.flutter;

@j95.b
/* loaded from: classes13.dex */
public class e extends i95.w implements jy1.e, ez1.a, mz1.c, gy1.c {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.datareport.flutter.e f96693g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f96694d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f96695e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f96696f;

    private e() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f96696f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnPageChanegeEvent>(a0Var) { // from class: com.tencent.mm.plugin.datareport.flutter.FlutterDataReportService$1
            {
                this.__eventId = -160926713;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnPageChanegeEvent onPageChanegeEvent) {
                java.util.HashMap hashMap = new java.util.HashMap();
                am.an anVar = onPageChanegeEvent.f54581g;
                java.util.HashMap hashMap2 = anVar.f6169f;
                if (hashMap2 != null && hashMap2.size() > 0) {
                    for (java.lang.Object obj : anVar.f6169f.keySet()) {
                        java.lang.Object obj2 = anVar.f6169f.get(obj);
                        if (obj != null && (obj instanceof java.lang.String) && obj2 != null) {
                            hashMap.put((java.lang.String) obj, obj2);
                        }
                    }
                }
                int i17 = anVar.f6164a;
                java.lang.String str = anVar.f6165b;
                int i18 = anVar.f6166c;
                int i19 = anVar.f6167d;
                int i27 = anVar.f6168e;
                boolean z17 = anVar.f6170g;
                boolean z18 = anVar.f6171h;
                final com.tencent.mm.plugin.datareport.flutter.e eVar = com.tencent.mm.plugin.datareport.flutter.e.this;
                eVar.getClass();
                if (!u46.l.e(str) && i18 > 0 && z18) {
                    com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[pageChange] eventType " + i17 + ", pageName : " + str + ", pageHash : " + i18 + ", pageId : " + i19 + ", bizGroupId : " + i27 + ", isSubPage : " + z17 + ", isFlutterPage : " + z18);
                    final java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
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
                                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.plugin.datareport.flutter.e.this.f96695e).iterator();
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
                                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.plugin.datareport.flutter.e.this.f96695e).iterator();
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

    public static com.tencent.mm.plugin.datareport.flutter.e wi() {
        if (f96693g == null) {
            synchronized (com.tencent.mm.plugin.datareport.flutter.e.class) {
                if (f96693g == null) {
                    f96693g = new com.tencent.mm.plugin.datareport.flutter.e();
                }
            }
        }
        return f96693g;
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
                            hashMap.put(str, io.flutter.plugin.common.JSONUtil.unwrap(new org.json.JSONObject(split[split.length - 1])));
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } else if (str2.contains("jl|")) {
                    java.lang.String[] split2 = str2.split("jl\\|");
                    if (split2.length > 0) {
                        hashMap.put(str, io.flutter.plugin.common.JSONUtil.unwrap(new org.json.JSONArray(split2[split2.length - 1])));
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
    public void D2(androidx.fragment.app.Fragment fragment) {
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f96695e).size() == 0) {
            return;
        }
        sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$h
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.plugin.datareport.flutter.e.this.f96695e).iterator();
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
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f96695e).size() == 0) {
            return;
        }
        sz1.i.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$i
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.plugin.datareport.flutter.e.this.f96695e).iterator();
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
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPaused(android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f96695e).size() == 0) {
            return;
        }
        if ((activity instanceof com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) || u46.l.c(activity.getClass().getSimpleName(), "MMFTSSearchTabWebViewUI") || u46.l.c(activity.getClass().getSimpleName(), "VideoActivity")) {
            com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[onActivityPrePaused] activity : " + activity);
            final java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, activity.getClass().getSimpleName());
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
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.plugin.datareport.flutter.e.this.f96695e).iterator();
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
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    public void onActivityPostDestroyed(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPostPaused(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPostResumed(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    public void onActivityPostStarted(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPostStopped(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    public void onActivityPreDestroyed(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPrePaused(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPreResumed(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    public void onActivityPreStarted(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityPreStopped(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityResumed(android.app.Activity activity) {
        if (((java.util.concurrent.CopyOnWriteArrayList) this.f96695e).size() == 0) {
            return;
        }
        if ((activity instanceof com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) || u46.l.c(activity.getClass().getSimpleName(), "MMFTSSearchTabWebViewUI") || u46.l.c(activity.getClass().getSimpleName(), "VideoActivity")) {
            com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[onActivityResumed] activity : " + activity);
            final java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, activity.getClass().getSimpleName());
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
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.plugin.datareport.flutter.e.this.f96695e).iterator();
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
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // mz1.c
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // mz1.c
    public void onActivityStopped(android.app.Activity activity) {
    }

    @Override // gy1.c
    public void w8(androidx.fragment.app.Fragment fragment) {
    }
}
