package c61;

/* loaded from: classes13.dex */
public final class ab implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.data_report.FlutterDataReportHost, jy1.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.pigeon.data_report.FlutterDataReportFlutter f38883d;

    public final boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return android.text.TextUtils.equals(str, "biz_in") || android.text.TextUtils.equals(str, "biz_out") || android.text.TextUtils.equals(str, "session_in") || android.text.TextUtils.equals(str, "session_out") || android.text.TextUtils.equals(str, "page_in") || android.text.TextUtils.equals(str, "page_out");
    }

    public void b(java.lang.String action, java.util.Map params) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.pigeon.data_report.FlutterDataReportFlutter flutterDataReportFlutter = this.f38883d;
        if (flutterDataReportFlutter != null) {
            flutterDataReportFlutter.onNativeAction(action, params, c61.za.f39455d);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.data_report.FlutterDataReportHost.Companion companion = com.tencent.pigeon.data_report.FlutterDataReportHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.data_report.FlutterDataReportHost.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f38883d = new com.tencent.pigeon.data_report.FlutterDataReportFlutter(binaryMessenger2, null, 2, null);
        com.tencent.mm.plugin.datareport.flutter.e eVar = (com.tencent.mm.plugin.datareport.flutter.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[attachedFlutterEngine] listener : " + this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) eVar.f96695e;
        if (!copyOnWriteArrayList.contains(this)) {
            copyOnWriteArrayList.add(this);
        }
        ez1.g.f257840i.P(eVar);
        mz1.b.b().a(eVar);
        gz1.d.f277714d.t(eVar);
        eVar.f96696f.alive();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.data_report.FlutterDataReportHost.Companion companion = com.tencent.pigeon.data_report.FlutterDataReportHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.data_report.FlutterDataReportHost.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f38883d = null;
        com.tencent.mm.plugin.datareport.flutter.e eVar = (com.tencent.mm.plugin.datareport.flutter.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[detachedFlutterEngine] listener : " + this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) eVar.f96695e;
        copyOnWriteArrayList.remove(this);
        if (copyOnWriteArrayList.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) eVar.f96694d).clear();
            ez1.g.f257840i.Y(eVar);
            mz1.b.b().getClass();
            ((java.util.concurrent.CopyOnWriteArrayList) mz1.b.f333083d).remove(eVar);
            gz1.d.f277715e.remove(eVar);
            eVar.f96696f.dead();
        }
    }

    @Override // com.tencent.pigeon.data_report.FlutterDataReportHost
    public void reportAllOutEvent(final long j17, final long j18, final java.lang.String eventId, final java.lang.String pageName, java.util.Map params, com.tencent.pigeon.data_report.ReportPageInfo sourcePageInfo) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(sourcePageInfo, "sourcePageInfo");
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(kz5.c1.s(params));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams = sourcePageInfo.getPageParams();
        if (pageParams != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : pageParams.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", sourcePageInfo.getPageId());
        linkedHashMap2.put("page_name", sourcePageInfo.getPageName());
        linkedHashMap.put("source_page", linkedHashMap2);
        final com.tencent.mm.plugin.datareport.flutter.e eVar = (com.tencent.mm.plugin.datareport.flutter.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.datareport.flutter.e eVar2 = com.tencent.mm.plugin.datareport.flutter.e.this;
                eVar2.getClass();
                java.util.HashMap hashMap = new java.util.HashMap(eVar2.Ai(linkedHashMap));
                hashMap.put("page_id", java.lang.Long.valueOf(j18));
                hashMap.put("page_name", pageName);
                ((fm4.f) ((qk.k8) i95.n0.c(qk.k8.class))).getClass();
                jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
                hashMap.put("exploresessions", Zi != null ? fm4.f.Ni(urgen.ur_0025.UR_5769.UR_F05B(((jm4.k4) Zi).getCppPointer())) : null);
                oz1.e.a().d(eventId, j17, hashMap);
            }
        });
    }

    @Override // com.tencent.pigeon.data_report.FlutterDataReportHost
    public void reportCustomCgiEvent(long j17, java.lang.String eventId, java.util.Map params, long j18, boolean z17, com.tencent.pigeon.data_report.ReportPageInfo curPageInfo, com.tencent.pigeon.data_report.ReportPageInfo sourcePageInfo) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(curPageInfo, "curPageInfo");
        kotlin.jvm.internal.o.g(sourcePageInfo, "sourcePageInfo");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams = curPageInfo.getPageParams();
        if (pageParams != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : pageParams.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", curPageInfo.getPageId());
        linkedHashMap2.put("page_name", curPageInfo.getPageName());
        linkedHashMap.put("cur_page", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams2 = sourcePageInfo.getPageParams();
        if (pageParams2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : pageParams2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        linkedHashMap3.put("page_id", sourcePageInfo.getPageId());
        linkedHashMap3.put("page_name", sourcePageInfo.getPageName());
        if (a(eventId)) {
            linkedHashMap.put("source_page", linkedHashMap3);
        } else {
            linkedHashMap2.put("source_page", linkedHashMap3);
        }
        jy1.e eVar = (jy1.e) i95.n0.c(jy1.e.class);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.datareport.flutter.e eVar2 = (com.tencent.mm.plugin.datareport.flutter.e) eVar;
        eVar2.getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[reportCustomCgiEvent] eventId : ".concat(eventId));
        cy1.a.Ui().yj(eventId, null, new java.util.HashMap(eVar2.Ai(linkedHashMap)), (int) j18, valueOf.booleanValue());
    }

    @Override // com.tencent.pigeon.data_report.FlutterDataReportHost
    public void reportCustomEvent(long j17, java.lang.String eventId, java.util.Map params, long j18, com.tencent.pigeon.data_report.ReportPageInfo curPageInfo, com.tencent.pigeon.data_report.ReportPageInfo sourcePageInfo) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(curPageInfo, "curPageInfo");
        kotlin.jvm.internal.o.g(sourcePageInfo, "sourcePageInfo");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams = curPageInfo.getPageParams();
        if (pageParams != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : pageParams.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", curPageInfo.getPageId());
        linkedHashMap2.put("page_name", curPageInfo.getPageName());
        linkedHashMap.put("cur_page", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams2 = sourcePageInfo.getPageParams();
        if (pageParams2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : pageParams2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        linkedHashMap3.put("page_id", sourcePageInfo.getPageId());
        linkedHashMap3.put("page_name", sourcePageInfo.getPageName());
        if (a(eventId)) {
            linkedHashMap.put("source_page", linkedHashMap3);
        } else {
            linkedHashMap2.put("source_page", linkedHashMap3);
        }
        com.tencent.mm.plugin.datareport.flutter.e eVar = (com.tencent.mm.plugin.datareport.flutter.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[reportCustomEvent] eventId : ".concat(eventId));
        cy1.a.Ui().Ej(eventId, eVar.Ai(linkedHashMap), (int) j18);
    }

    @Override // com.tencent.pigeon.data_report.FlutterDataReportHost
    public void reportStandardPageEvent(final long j17, final java.lang.String eventId, long j18, long j19, final java.lang.String pageName, java.util.Map params, java.util.List routeRules, com.tencent.pigeon.data_report.ReportPageInfo sourcePageInfo) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(routeRules, "routeRules");
        kotlin.jvm.internal.o.g(sourcePageInfo, "sourcePageInfo");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = routeRules.iterator();
        while (it.hasNext()) {
            com.tencent.pigeon.data_report.ReportRouteRule reportRouteRule = (com.tencent.pigeon.data_report.ReportRouteRule) it.next();
            ky1.d dVar = new ky1.d();
            java.lang.Long routeType = reportRouteRule.getRouteType();
            boolean z17 = false;
            dVar.f313499a = routeType != null ? (int) routeType.longValue() : 0;
            java.lang.Long routeRule = reportRouteRule.getRouteRule();
            dVar.f313500b = routeRule != null ? (int) routeRule.longValue() : 0;
            java.lang.Boolean isBatchReport = reportRouteRule.isBatchReport();
            if (isBatchReport != null) {
                z17 = isBatchReport.booleanValue();
            }
            dVar.f313502d = z17;
            arrayList.add(dVar);
        }
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams = sourcePageInfo.getPageParams();
        if (pageParams != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : pageParams.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", sourcePageInfo.getPageId());
        linkedHashMap2.put("page_name", sourcePageInfo.getPageName());
        linkedHashMap.put("source_page", linkedHashMap2);
        final int i17 = (int) j19;
        final com.tencent.mm.plugin.datareport.flutter.e eVar = (com.tencent.mm.plugin.datareport.flutter.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        if (android.text.TextUtils.isEmpty(eventId)) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(pageName) || i17 > 0) {
            com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[reportStandardPageEvent] pageName : " + pageName + ", pageId : " + i17 + ", eventId : " + eventId);
            sz1.i.f413941b.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$c
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
                
                    if ((u46.l.c(r15, "TopStoryHomeUI") || u46.l.c(r15, "CastUIB")) != false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
                
                    if ((u46.l.c(r8, "TopStoryHomeUI") || u46.l.c(r8, "CastUIB")) != false) goto L51;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 335
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.datareport.flutter.e$$c.run():void");
                }
            }, 500L);
        }
    }

    @Override // com.tencent.pigeon.data_report.FlutterDataReportHost
    public void reportStandardViewEvent(final long j17, final java.lang.String eventId, final java.lang.String viewId, java.util.Map params, java.util.List routeRules, com.tencent.pigeon.data_report.ReportPageInfo curPageInfo, com.tencent.pigeon.data_report.ReportPageInfo sourcePageInfo) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(routeRules, "routeRules");
        kotlin.jvm.internal.o.g(curPageInfo, "curPageInfo");
        kotlin.jvm.internal.o.g(sourcePageInfo, "sourcePageInfo");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = routeRules.iterator();
        while (it.hasNext()) {
            com.tencent.pigeon.data_report.ReportRouteRule reportRouteRule = (com.tencent.pigeon.data_report.ReportRouteRule) it.next();
            ky1.d dVar = new ky1.d();
            java.lang.Long routeType = reportRouteRule.getRouteType();
            boolean z17 = false;
            dVar.f313499a = routeType != null ? (int) routeType.longValue() : 0;
            java.lang.Long routeRule = reportRouteRule.getRouteRule();
            dVar.f313500b = routeRule != null ? (int) routeRule.longValue() : 0;
            java.lang.Boolean isBatchReport = reportRouteRule.isBatchReport();
            if (isBatchReport != null) {
                z17 = isBatchReport.booleanValue();
            }
            dVar.f313502d = z17;
            arrayList.add(dVar);
        }
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams = curPageInfo.getPageParams();
        if (pageParams != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : pageParams.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", curPageInfo.getPageId());
        linkedHashMap2.put("page_name", curPageInfo.getPageName());
        linkedHashMap.put("cur_page", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> pageParams2 = sourcePageInfo.getPageParams();
        if (pageParams2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : pageParams2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        linkedHashMap3.put("page_id", sourcePageInfo.getPageId());
        linkedHashMap3.put("page_name", sourcePageInfo.getPageName());
        linkedHashMap2.put("source_page", linkedHashMap3);
        final com.tencent.mm.plugin.datareport.flutter.e eVar = (com.tencent.mm.plugin.datareport.flutter.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        if (android.text.TextUtils.isEmpty(eventId) || android.text.TextUtils.isEmpty(viewId)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.FlutterDataReportService", "[reportStandardViewEvent] viewId : " + viewId + ", eventId : " + eventId);
        if (arrayList.size() <= 0) {
            return;
        }
        sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$e
            @Override // java.lang.Runnable
            public final void run() {
                sy1.f fVar;
                java.lang.String str = eventId;
                long j18 = j17;
                java.util.List list = arrayList;
                com.tencent.mm.plugin.datareport.flutter.e eVar2 = com.tencent.mm.plugin.datareport.flutter.e.this;
                eVar2.getClass();
                boolean c17 = u46.l.c(str, "view_clk");
                java.lang.String str2 = viewId;
                if (c17 && (fVar = cy1.a.Ui().f224690m) != null) {
                    fVar.f413853h = str2;
                    fVar.f413854i = j18;
                }
                java.util.HashMap hashMap = new java.util.HashMap(eVar2.Ai(linkedHashMap));
                hashMap.put("view_id", str2);
                cy1.a.Ui().Lj(j18, str, hashMap, list);
            }
        });
    }
}
