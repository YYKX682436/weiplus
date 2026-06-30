package com.tencent.mm.plugin.appbrand.report;

@j95.b
/* loaded from: classes16.dex */
public final class h0 extends i95.w implements com.tencent.mm.plugin.appbrand.service.e5 {
    public void Ai(java.lang.String userName, int i17, java.lang.String chatName, int i18, java.lang.String sessionId, long j17, java.lang.String currentAppId, java.lang.String currentPath, java.lang.String imageSrc, java.lang.String shareAppId, java.lang.String sharePath, java.lang.String imageKey) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(chatName, "chatName");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(currentAppId, "currentAppId");
        kotlin.jvm.internal.o.g(currentPath, "currentPath");
        kotlin.jvm.internal.o.g(imageSrc, "imageSrc");
        kotlin.jvm.internal.o.g(shareAppId, "shareAppId");
        kotlin.jvm.internal.o.g(sharePath, "sharePath");
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        com.tencent.mm.autogen.mmdata.rpt.AppMsgImageShareStruct appMsgImageShareStruct = new com.tencent.mm.autogen.mmdata.rpt.AppMsgImageShareStruct();
        appMsgImageShareStruct.f55298d = appMsgImageShareStruct.b("Username", userName, true);
        appMsgImageShareStruct.f55299e = 1;
        appMsgImageShareStruct.f55300f = i17;
        appMsgImageShareStruct.f55301g = appMsgImageShareStruct.b("ChatName", Bi(chatName), true);
        appMsgImageShareStruct.f55302h = i18;
        appMsgImageShareStruct.f55303i = appMsgImageShareStruct.b("SessionId", sessionId, true);
        appMsgImageShareStruct.f55304j = j17;
        appMsgImageShareStruct.f55305k = appMsgImageShareStruct.b("CurrentAppId", currentAppId, true);
        appMsgImageShareStruct.f55306l = appMsgImageShareStruct.b("CurrentPath", currentPath, true);
        appMsgImageShareStruct.f55307m = appMsgImageShareStruct.b("ImageSrc", imageSrc, true);
        appMsgImageShareStruct.f55308n = appMsgImageShareStruct.b("ShareAppId", shareAppId, true);
        appMsgImageShareStruct.f55309o = appMsgImageShareStruct.b("SharePath", sharePath, true);
        appMsgImageShareStruct.f55310p = appMsgImageShareStruct.b("ImageKey", imageKey, true);
        appMsgImageShareStruct.k();
    }

    public final java.lang.String Bi(java.lang.String str) {
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        if (!r26.n0.B(str, ",", false)) {
            return str;
        }
        java.lang.String b17 = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
        return b17 == null ? "" : b17;
    }

    public void wi(java.lang.String userName, int i17, int i18, java.lang.String chatName, int i19, java.lang.String sessionId, long j17, int i27, java.lang.String launchAppId, java.lang.String launchPath, java.lang.String imageKey) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(chatName, "chatName");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(launchAppId, "launchAppId");
        kotlin.jvm.internal.o.g(launchPath, "launchPath");
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        com.tencent.mm.autogen.mmdata.rpt.AppMsgImageLaunchStruct appMsgImageLaunchStruct = new com.tencent.mm.autogen.mmdata.rpt.AppMsgImageLaunchStruct();
        appMsgImageLaunchStruct.f55279d = appMsgImageLaunchStruct.b("UserName", userName, true);
        appMsgImageLaunchStruct.f55280e = new kk.v(i17).longValue();
        appMsgImageLaunchStruct.f55281f = i18;
        appMsgImageLaunchStruct.f55282g = appMsgImageLaunchStruct.b("ChatName", Bi(chatName), true);
        appMsgImageLaunchStruct.f55283h = i19;
        appMsgImageLaunchStruct.f55284i = appMsgImageLaunchStruct.b("SessionId", sessionId, true);
        appMsgImageLaunchStruct.f55285j = j17;
        appMsgImageLaunchStruct.f55286k = i27;
        appMsgImageLaunchStruct.f55290o = appMsgImageLaunchStruct.b("ImageKey", imageKey, true);
        appMsgImageLaunchStruct.f55288m = appMsgImageLaunchStruct.b("LaunchAppId", launchAppId, true);
        appMsgImageLaunchStruct.f55289n = appMsgImageLaunchStruct.b("LaunchPath", launchPath, true);
        appMsgImageLaunchStruct.k();
    }
}
