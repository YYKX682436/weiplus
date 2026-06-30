package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class c2 {

    /* renamed from: c, reason: collision with root package name */
    public long f90057c;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f90060f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f90055a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f90056b = null;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct f90058d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedHashSet f90059e = null;

    public final void a(java.lang.String str, android.app.Activity activity) {
        int i17;
        int i18;
        if (this.f90058d != null) {
            long longExtra = activity.getIntent().getLongExtra("extra_start_activity_click_timestamp_ms", this.f90057c);
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = this.f90058d;
            wAMainFrameEnterHistoryListExposeStruct.f61975d = longExtra;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            wAMainFrameEnterHistoryListExposeStruct.f61976e = java.lang.System.currentTimeMillis();
            if (wAMainFrameEnterHistoryListExposeStruct.f61977f <= 0) {
                if ("onDestroy".equals(str)) {
                    wAMainFrameEnterHistoryListExposeStruct.f61977f = 1L;
                } else {
                    android.content.Intent intent = this.f90056b;
                    if (intent != null) {
                        try {
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecentsReporter", "makeFromMainFrameExitReportLeaveType e=%s", e17);
                        }
                        if (intent.getComponent() != null) {
                            java.lang.String shortClassName = intent.getComponent().getShortClassName();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(shortClassName)) {
                                java.lang.String substring = shortClassName.substring(shortClassName.lastIndexOf(46) + 1);
                                if (u46.a.b(new java.lang.String[]{"AppBrandNearbyEmptyUI", "AppBrandNearbyWebViewUI"}, substring)) {
                                    i18 = 3;
                                } else if (u46.a.b(new java.lang.String[]{"AppBrandSearchUI"}, substring)) {
                                    i18 = 5;
                                } else if ("AppBrandLauncherFolderUI".equals(substring)) {
                                    if (intent.getIntExtra("KEY_MODE", 0) == 2) {
                                        i18 = 4;
                                    }
                                }
                                wAMainFrameEnterHistoryListExposeStruct.f61977f = i18;
                            }
                        }
                    }
                    i18 = 0;
                    wAMainFrameEnterHistoryListExposeStruct.f61977f = i18;
                }
            }
            java.lang.String[] strArr = new java.lang.String[4];
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f90059e);
            int i19 = 0;
            while (i19 < 4) {
                linkedList.clear();
                int i27 = i19 * 5;
                while (true) {
                    i17 = i19 + 1;
                    if (i27 < java.lang.Math.min(arrayList.size(), i17 * 5)) {
                        linkedList.addLast(((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) arrayList.get(i27)).f76362e);
                        i27++;
                    }
                }
                strArr[i19] = u46.l.h(linkedList, "|");
                i19 = i17;
            }
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct2 = this.f90058d;
            wAMainFrameEnterHistoryListExposeStruct2.f61982k = wAMainFrameEnterHistoryListExposeStruct2.b("AppidFrom1And5", strArr[0], true);
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct3 = this.f90058d;
            wAMainFrameEnterHistoryListExposeStruct3.f61983l = wAMainFrameEnterHistoryListExposeStruct3.b("AppidFrom6And10", strArr[1], true);
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct4 = this.f90058d;
            wAMainFrameEnterHistoryListExposeStruct4.f61984m = wAMainFrameEnterHistoryListExposeStruct4.b("AppidFrom11And15", strArr[2], true);
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct5 = this.f90058d;
            wAMainFrameEnterHistoryListExposeStruct5.f61985n = wAMainFrameEnterHistoryListExposeStruct5.b("AppidFrom16And20", strArr[3], true);
            wAMainFrameEnterHistoryListExposeStruct.k();
            this.f90058d = null;
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f90060f;
        if (iListener != null) {
            iListener.dead();
            this.f90060f = null;
        }
    }
}
