package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class w0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        int i17;
        if (gm0.j1.a() && map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.AppID");
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.UserName");
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.Path");
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.URL");
            java.lang.String str6 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.MD5");
            java.lang.String str7 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.ExtInfo");
            java.lang.String str8 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.WsEndpoint");
            java.lang.String str9 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.VersionType");
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "onNewXmlReceived appId %s, userName %s, path %s, url %s, md5 %s, extInfo %s, wsEndpoint:%s, versionType:%s", str2, str3, str4, str5, str6, str7, str8, str9);
            int P = com.tencent.mm.sdk.platformtools.t8.P(str9, 1);
            if (P == 0 || P == 1 || P == 2) {
                i17 = P;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "parseDebugType: invalid versionType=%s, fallback to AS_TESTING", str9);
                i17 = 1;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "appId = %s, username = %s, invalid, return", str2, str3);
                return;
            }
            if (com.tencent.mm.plugin.appbrand.app.r9.Di().k(str2, i17, str5, str6, 0L, com.tencent.mm.sdk.platformtools.t8.i1() + 7200)) {
                com.tencent.mm.plugin.appbrand.task.u0.C().s(str2, i17);
            }
            com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = new com.tencent.mm.modelappbrand.LaunchParamsOptional();
            launchParamsOptional.f70417f = str7;
            launchParamsOptional.f70421m = str8;
            ((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).z0(str2, i17, str7);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo a17 = k91.x5.a(str7);
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> list = a17.f77450m;
                java.util.List list2 = a17.f77452o;
                if (list2 != null && list2.size() > 0) {
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) it.next();
                        java.util.List list3 = wxaAttributes$WxaVersionModuleInfo.f77469i;
                        if (list3 != null && list3.size() > 0) {
                            for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo wxaAttributes$WxaPluginCodeInfo : wxaAttributes$WxaVersionModuleInfo.f77469i) {
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaPluginCodeInfo.f77440n)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "start: module :%s dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", wxaAttributes$WxaVersionModuleInfo.f77464d, wxaAttributes$WxaPluginCodeInfo.f77433d, wxaAttributes$WxaPluginCodeInfo.f77440n, java.lang.Integer.valueOf(new kk.v(wxaAttributes$WxaPluginCodeInfo.f77439m).f308478d), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.appbrand.launching.ya) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.ya.class)).D0(wxaAttributes$WxaPluginCodeInfo.f77433d, wxaAttributes$WxaPluginCodeInfo.f77440n, wxaAttributes$WxaPluginCodeInfo.f77439m)));
                                    it = it;
                                    wxaAttributes$WxaVersionModuleInfo = wxaAttributes$WxaVersionModuleInfo;
                                }
                            }
                        }
                    }
                } else if (list != null && list.size() > 0) {
                    for (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo wxaAttributes$WxaPluginCodeInfo2 : list) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaPluginCodeInfo2.f77440n)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "start: dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", wxaAttributes$WxaPluginCodeInfo2.f77433d, wxaAttributes$WxaPluginCodeInfo2.f77440n, java.lang.Integer.valueOf(new kk.v(wxaAttributes$WxaPluginCodeInfo2.f77439m).f308478d), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.appbrand.launching.ya) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.ya.class)).D0(wxaAttributes$WxaPluginCodeInfo2.f77433d, wxaAttributes$WxaPluginCodeInfo2.f77440n, wxaAttributes$WxaPluginCodeInfo2.f77439m)));
                        }
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject.f87790f = 1101;
            appBrandStatObject.f87791g = str2 + ":" + str3;
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(com.tencent.mm.sdk.platformtools.x2.f193071a, str3, null, str4, i17, -1, appBrandStatObject, null, launchParamsOptional);
        }
    }
}
