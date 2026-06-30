package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class c2 {

    /* renamed from: c, reason: collision with root package name */
    public long f171590c;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f171593f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f171588a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent f171589b = null;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd f171591d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedHashSet f171592e = null;

    public final void a(java.lang.String str, android.app.Activity activity) {
        int i17;
        int i18;
        if (this.f171591d != null) {
            long longExtra = activity.getIntent().getLongExtra("extra_start_activity_click_timestamp_ms", this.f171590c);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd = this.f171591d;
            c7036xbdc787dd.f143508d = longExtra;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c7036xbdc787dd.f143509e = java.lang.System.currentTimeMillis();
            if (c7036xbdc787dd.f143510f <= 0) {
                if ("onDestroy".equals(str)) {
                    c7036xbdc787dd.f143510f = 1L;
                } else {
                    android.content.Intent intent = this.f171589b;
                    if (intent != null) {
                        try {
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecentsReporter", "makeFromMainFrameExitReportLeaveType e=%s", e17);
                        }
                        if (intent.getComponent() != null) {
                            java.lang.String shortClassName = intent.getComponent().getShortClassName();
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(shortClassName)) {
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
                                c7036xbdc787dd.f143510f = i18;
                            }
                        }
                    }
                    i18 = 0;
                    c7036xbdc787dd.f143510f = i18;
                }
            }
            java.lang.String[] strArr = new java.lang.String[4];
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f171592e);
            int i19 = 0;
            while (i19 < 4) {
                linkedList.clear();
                int i27 = i19 * 5;
                while (true) {
                    i17 = i19 + 1;
                    if (i27 < java.lang.Math.min(arrayList.size(), i17 * 5)) {
                        linkedList.addLast(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) arrayList.get(i27)).f157895e);
                        i27++;
                    }
                }
                strArr[i19] = u46.l.h(linkedList, "|");
                i19 = i17;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd2 = this.f171591d;
            c7036xbdc787dd2.f143515k = c7036xbdc787dd2.b("AppidFrom1And5", strArr[0], true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd3 = this.f171591d;
            c7036xbdc787dd3.f143516l = c7036xbdc787dd3.b("AppidFrom6And10", strArr[1], true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd4 = this.f171591d;
            c7036xbdc787dd4.f143517m = c7036xbdc787dd4.b("AppidFrom11And15", strArr[2], true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd5 = this.f171591d;
            c7036xbdc787dd5.f143518n = c7036xbdc787dd5.b("AppidFrom16And20", strArr[3], true);
            c7036xbdc787dd.k();
            this.f171591d = null;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f171593f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
            this.f171593f = null;
        }
    }
}
