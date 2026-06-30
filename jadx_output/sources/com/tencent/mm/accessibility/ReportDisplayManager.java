package com.tencent.mm.accessibility;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/accessibility/ReportDisplayManager;", "", "Lcom/tencent/mm/accessibility/feature/DisplayReportInfo;", "recordInfo", "Ljz5/f0;", "pushPutMMKVData", "onAppForeground", "", "hasData", "clearData", "", "getNeedReportInfo", "", "DISPLAY_EVENT_ADDED", "I", "DISPLAY_EVENT_REMOVED", "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ReportDisplayManager {
    private static final int DISPLAY_EVENT_ADDED = 1;
    private static final int DISPLAY_EVENT_REMOVED = 2;
    public static final com.tencent.mm.accessibility.ReportDisplayManager INSTANCE = new com.tencent.mm.accessibility.ReportDisplayManager();
    private static final com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.ReportDisplayManager");

    private ReportDisplayManager() {
    }

    public final void clearData() {
        if (hasData()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "hasData! clearAll");
            mmkv.d();
        }
    }

    public final java.util.List<com.tencent.mm.accessibility.feature.DisplayReportInfo> getNeedReportInfo() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
        java.lang.String[] b17 = o4Var.b();
        kotlin.jvm.internal.o.f(b17, "allKeys(...)");
        if (b17.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[getNeedReportInfo] empty");
            return new java.util.ArrayList();
        }
        java.lang.String[] b18 = o4Var.b();
        kotlin.jvm.internal.o.f(b18, "allKeys(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : b18) {
            java.lang.String string = mmkv.getString(str, "");
            if (string != null) {
                arrayList.add(string);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            kotlin.jvm.internal.o.d((java.lang.String) obj);
            if (!r26.n0.N(r6)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (java.lang.String str2 : arrayList2) {
            com.tencent.mm.accessibility.feature.DisplayReportInfo displayReportInfo = new com.tencent.mm.accessibility.feature.DisplayReportInfo();
            kotlin.jvm.internal.o.d(str2);
            displayReportInfo.fromXml(str2);
            arrayList3.add(displayReportInfo);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            java.lang.String displayName = ((com.tencent.mm.accessibility.feature.DisplayReportInfo) obj2).getDisplayName();
            if (!(displayName == null || r26.n0.N(displayName))) {
                arrayList4.add(obj2);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[getNeedReportInfo] success: ".concat(kz5.n0.g0(arrayList4, null, null, null, 0, null, com.tencent.mm.accessibility.ReportDisplayManager$getNeedReportInfo$1.INSTANCE, 31, null)));
        return arrayList4;
    }

    public final boolean hasData() {
        return mmkv.g() > 0;
    }

    public final void onAppForeground() {
        if (hasData()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "hasData! onAppForeground");
            for (com.tencent.mm.accessibility.feature.DisplayReportInfo displayReportInfo : getNeedReportInfo()) {
                java.lang.String valueOf = java.lang.String.valueOf(displayReportInfo.getDisplayId());
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "realReport[" + displayReportInfo.toXml() + ']');
                if (displayReportInfo.getDuration() == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "realReport[skip]");
                    if (java.lang.System.currentTimeMillis() >= displayReportInfo.getStartTimeMs()) {
                        long j17 = 60;
                        if (java.lang.System.currentTimeMillis() - displayReportInfo.getStartTimeMs() > 1 * 24 * j17 * 1000 * j17) {
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "realReport[wrong timeMs], remove key");
                    mmkv.remove(valueOf);
                } else {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("screen_record_rpt", kz5.c1.k(new jz5.l("displayId", java.lang.Integer.valueOf(displayReportInfo.getDisplayId())), new jz5.l("displayName", displayReportInfo.getDisplayName()), new jz5.l("displayOwnerPackage", displayReportInfo.getDisplayOwnerPackage()), new jz5.l("displayEventType", java.lang.Integer.valueOf(displayReportInfo.getDisplayEventType())), new jz5.l("startTimeMs", java.lang.Long.valueOf(displayReportInfo.getStartTimeMs())), new jz5.l("duration", java.lang.Long.valueOf(displayReportInfo.getDuration()))), 33811);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "realReport[" + valueOf + ']');
                    mmkv.remove(valueOf);
                }
            }
        }
    }

    public final void pushPutMMKVData(com.tencent.mm.accessibility.feature.DisplayReportInfo recordInfo) {
        kotlin.jvm.internal.o.g(recordInfo, "recordInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData]");
        java.lang.String valueOf = java.lang.String.valueOf(recordInfo.getDisplayId());
        boolean z17 = true;
        if (recordInfo.getDisplayEventType() == 1) {
            java.lang.String displayName = recordInfo.getDisplayName();
            if (displayName != null && !r26.n0.N(displayName)) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] add skip");
                return;
            }
            recordInfo.setStartTimeMs(java.lang.System.currentTimeMillis());
            mmkv.putString(valueOf, recordInfo.toXml());
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] add success: " + recordInfo.toXml());
            return;
        }
        if (recordInfo.getDisplayEventType() == 2) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = mmkv;
            if (!o4Var.f(valueOf)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] remove skip");
                return;
            }
            com.tencent.mm.accessibility.feature.DisplayReportInfo displayReportInfo = new com.tencent.mm.accessibility.feature.DisplayReportInfo();
            java.lang.String string = o4Var.getString(valueOf, "");
            displayReportInfo.fromXml(string != null ? string : "");
            displayReportInfo.setDuration(java.lang.System.currentTimeMillis() - displayReportInfo.getStartTimeMs());
            o4Var.putString(valueOf, displayReportInfo.toXml());
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] remove success: " + recordInfo.toXml());
        }
    }
}
