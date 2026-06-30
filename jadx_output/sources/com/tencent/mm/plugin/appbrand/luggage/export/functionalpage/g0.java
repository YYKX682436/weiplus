package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class g0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g0 f85587d = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g0();

    public static void a(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData newSDKInvokeProcess$NewSdkInvokeBackData, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = null;
        }
        fm1.b bVar = fm1.b.f264014a;
        java.lang.String str2 = newSDKInvokeProcess$NewSdkInvokeBackData.f85555d.f85558d;
        kotlin.jvm.internal.o.d(str2);
        bVar.a(str2);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp(android.os.Bundle.EMPTY);
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = newSDKInvokeProcess$NewSdkInvokeBackData.f85555d;
        java.lang.String str3 = wechatNativeExtraDataInvokeFunctionalPage.f85558d;
        kotlin.jvm.internal.o.d(str3);
        resp.invokeTicket = str3;
        resp.callbackActivity = wechatNativeExtraDataInvokeFunctionalPage.f85565n;
        resp.errStr = str;
        resp.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = wechatNativeExtraDataInvokeFunctionalPage.f85564m;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args);
        if (rVar != null) {
            uk0.a.a(rVar);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData newSDKInvokeProcess$NewSdkInvokeBackData = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData) obj;
        java.lang.String str = newSDKInvokeProcess$NewSdkInvokeBackData.f85555d.f85558d;
        kotlin.jvm.internal.o.d(str);
        pq5.g l17 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b(str, 3, newSDKInvokeProcess$NewSdkInvokeBackData.f85556e, null).l();
        l17.a(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e0(newSDKInvokeProcess$NewSdkInvokeBackData, rVar));
        l17.s(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f0(newSDKInvokeProcess$NewSdkInvokeBackData, rVar));
    }
}
