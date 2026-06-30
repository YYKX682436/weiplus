package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes9.dex */
public interface b {
    static void a(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b bVar, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage invokeArgs, android.content.Context context, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: backToApp");
        }
        if ((i17 & 2) != 0) {
            context = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        bVar.getClass();
        kotlin.jvm.internal.o.g(invokeArgs, "invokeArgs");
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp(android.os.Bundle.EMPTY);
        java.lang.String str2 = invokeArgs.f85558d;
        kotlin.jvm.internal.o.d(str2);
        resp.invokeTicket = str2;
        resp.callbackActivity = invokeArgs.f85565n;
        resp.errStr = str;
        resp.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        fm1.b bVar2 = fm1.b.f264014a;
        java.lang.String str3 = invokeArgs.f85558d;
        kotlin.jvm.internal.o.d(str3);
        android.app.Activity a17 = bVar2.a(str3);
        if (a17 != null) {
            a17.overridePendingTransition(0, 0);
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = invokeArgs.f85564m;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args);
    }

    java.lang.String b();

    void c(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, l81.b1 b1Var);
}
