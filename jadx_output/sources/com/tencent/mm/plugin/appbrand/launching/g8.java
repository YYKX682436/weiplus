package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.g8 f84628a = new com.tencent.mm.plugin.appbrand.launching.g8();

    public final boolean a(java.lang.String appId, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.appcache.k kVar;
        kotlin.jvm.internal.o.g(appId, "appId");
        if (com.tencent.mm.plugin.appbrand.appcache.g0.a(i17)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.appcache.l lVar = (com.tencent.mm.plugin.appbrand.appcache.l) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.l.class);
        lVar.getClass();
        com.tencent.mm.plugin.appbrand.appcache.i iVar = new com.tencent.mm.plugin.appbrand.appcache.i();
        iVar.field_appId = appId;
        iVar.field_appVersion = i18;
        if (!lVar.get(iVar, new java.lang.String[0])) {
            com.tencent.mm.plugin.appbrand.appcache.j jVar = com.tencent.mm.plugin.appbrand.appcache.k.f75618e;
            iVar.field_isSeparatedPluginsUsed = -1;
        }
        com.tencent.mm.plugin.appbrand.appcache.j jVar2 = com.tencent.mm.plugin.appbrand.appcache.k.f75618e;
        int i19 = iVar.field_isSeparatedPluginsUsed;
        jVar2.getClass();
        com.tencent.mm.plugin.appbrand.appcache.k[] values = com.tencent.mm.plugin.appbrand.appcache.k.values();
        int length = values.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length) {
                kVar = null;
                break;
            }
            kVar = values[i27];
            if (kVar.f75621d == i19) {
                break;
            }
            i27++;
        }
        if (kVar == null) {
            kVar = com.tencent.mm.plugin.appbrand.appcache.k.f75619f;
        }
        int ordinal = kVar.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final java.util.Map b(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo, java.lang.String appId, boolean z17) {
        kotlin.jvm.internal.o.g(wxaAttributes$WxaVersionInfo, "<this>");
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.List list = wxaAttributes$WxaVersionInfo.f77452o;
        boolean z18 = true;
        boolean z19 = list == null || list.isEmpty();
        int[] iArr = qq5.a.f365994a;
        if (!z19) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap(wxaAttributes$WxaVersionInfo.f77452o.size());
            for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo : wxaAttributes$WxaVersionInfo.f77452o) {
                if (z17) {
                    java.util.List list2 = wxaAttributes$WxaVersionModuleInfo.f77471n;
                    if (!(list2 == null || list2.isEmpty())) {
                        java.util.List wxaWidgetInfoList = wxaAttributes$WxaVersionModuleInfo.f77471n;
                        kotlin.jvm.internal.o.f(wxaWidgetInfoList, "wxaWidgetInfoList");
                        for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo : kz5.n0.F0(wxaWidgetInfoList, new com.tencent.mm.plugin.appbrand.launching.f8())) {
                            if (kz5.z.F(iArr, wxaAttributes$WxaWidgetInfo.f77474d)) {
                                break;
                            }
                        }
                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    java.util.List list3 = wxaAttributes$WxaVersionModuleInfo.f77469i;
                    if (list3 == null || list3.isEmpty()) {
                        wxaAttributes$WxaWidgetInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
                        wxaAttributes$WxaWidgetInfo.f77474d = 4;
                        wxaAttributes$WxaWidgetInfo.f77475e = wxaAttributes$WxaVersionModuleInfo.f77465e;
                    } else {
                        wxaAttributes$WxaWidgetInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
                        wxaAttributes$WxaWidgetInfo.f77475e = wxaAttributes$WxaVersionModuleInfo.f77470m;
                        wxaAttributes$WxaWidgetInfo.f77474d = 13;
                        wxaAttributes$WxaWidgetInfo.f77477g = new java.util.LinkedList(wxaAttributes$WxaVersionModuleInfo.f77469i);
                    }
                } else {
                    wxaAttributes$WxaWidgetInfo = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
                    wxaAttributes$WxaWidgetInfo.f77474d = 4;
                    wxaAttributes$WxaWidgetInfo.f77475e = wxaAttributes$WxaVersionModuleInfo.f77465e;
                }
                arrayMap.put(wxaAttributes$WxaVersionModuleInfo.f77464d, wxaAttributes$WxaWidgetInfo);
            }
            return arrayMap;
        }
        if (!z17) {
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo2 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
            wxaAttributes$WxaWidgetInfo2.f77474d = 0;
            wxaAttributes$WxaWidgetInfo2.f77475e = wxaAttributes$WxaVersionInfo.f77447g;
            android.util.ArrayMap arrayMap2 = new android.util.ArrayMap();
            arrayMap2.put(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, wxaAttributes$WxaWidgetInfo2);
            return arrayMap2;
        }
        java.util.List list4 = wxaAttributes$WxaVersionInfo.f77457t;
        if (list4 == null || list4.isEmpty()) {
            java.util.List list5 = wxaAttributes$WxaVersionInfo.f77450m;
            if (list5 != null && !list5.isEmpty()) {
                z18 = false;
            }
            if (z18) {
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo3 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
                wxaAttributes$WxaWidgetInfo3.f77474d = 0;
                wxaAttributes$WxaWidgetInfo3.f77475e = wxaAttributes$WxaVersionInfo.f77447g;
                android.util.ArrayMap arrayMap3 = new android.util.ArrayMap();
                arrayMap3.put(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, wxaAttributes$WxaWidgetInfo3);
                return arrayMap3;
            }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo4 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo();
            wxaAttributes$WxaWidgetInfo4.f77475e = wxaAttributes$WxaVersionInfo.f77456s;
            wxaAttributes$WxaWidgetInfo4.f77474d = 12;
            wxaAttributes$WxaWidgetInfo4.f77477g = new java.util.LinkedList(wxaAttributes$WxaVersionInfo.f77450m);
            android.util.ArrayMap arrayMap4 = new android.util.ArrayMap();
            arrayMap4.put(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, wxaAttributes$WxaWidgetInfo4);
            return arrayMap4;
        }
        java.util.List widgetInfoList = wxaAttributes$WxaVersionInfo.f77457t;
        kotlin.jvm.internal.o.f(widgetInfoList, "widgetInfoList");
        for (java.lang.Object obj : kz5.n0.F0(widgetInfoList, new com.tencent.mm.plugin.appbrand.launching.e8())) {
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo5 = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo) obj;
            if (kz5.z.F(iArr, wxaAttributes$WxaWidgetInfo5.f77474d)) {
                java.util.List list6 = wxaAttributes$WxaWidgetInfo5.f77477g;
                if (list6 != null && !list6.isEmpty()) {
                    z18 = false;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils", "WxaVersionInfo.pickAppropriateWidgetInfoList appId(" + appId + ") module(FALSE) split_plugin(TRUE) widgetInfo.wxaPluginCodeInfo isNullOrEmpty");
                    wxaAttributes$WxaWidgetInfo5.f77477g = wxaAttributes$WxaVersionInfo.f77450m;
                }
                android.util.ArrayMap arrayMap5 = new android.util.ArrayMap();
                arrayMap5.put(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, obj);
                return arrayMap5;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
