package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes15.dex */
public abstract class e1 {
    public static void a(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.Object[] objArr = {str, str2, java.lang.Integer.valueOf(i17), str3, str4, str5};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskReport", "reportTaskAction appId:%s, taskSessionId:%s, action:%d, actionNode:%s, ActionScene:%s, extraData:%s", objArr);
        com.tencent.mm.autogen.mmdata.rpt.WxaRecentTaskPanelReportStruct wxaRecentTaskPanelReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WxaRecentTaskPanelReportStruct();
        wxaRecentTaskPanelReportStruct.f63043d = wxaRecentTaskPanelReportStruct.b("AppId", str, true);
        wxaRecentTaskPanelReportStruct.f63044e = wxaRecentTaskPanelReportStruct.b("TaskSessionId", str2, true);
        wxaRecentTaskPanelReportStruct.f63045f = i17;
        wxaRecentTaskPanelReportStruct.f63046g = wxaRecentTaskPanelReportStruct.b("ActionNote", str3, true);
        wxaRecentTaskPanelReportStruct.f63047h = wxaRecentTaskPanelReportStruct.b("ActionScene", str4, true);
        wxaRecentTaskPanelReportStruct.f63048i = java.lang.System.currentTimeMillis();
        wxaRecentTaskPanelReportStruct.f63049j = wxaRecentTaskPanelReportStruct.b("ExtraData", str5, true);
        wxaRecentTaskPanelReportStruct.k();
    }
}
