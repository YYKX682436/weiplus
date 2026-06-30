package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class PlatformUIRouterImpl implements com.tencent.kinda.gen.KPlatformUIRouter {
    public static final java.lang.String TAG = "MicroMsg.PlatformUIRouterImpl";
    private byte _hellAccFlag_;

    @Override // com.tencent.kinda.gen.KPlatformUIRouter
    public void gotoExternApp(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, byte[] bArr) {
        com.tencent.mm.autogen.events.KindaGotoExternAppEvent kindaGotoExternAppEvent = new com.tencent.mm.autogen.events.KindaGotoExternAppEvent();
        am.fi fiVar = kindaGotoExternAppEvent.f54456g;
        fiVar.f6678a = i17;
        fiVar.f6679b = str2;
        fiVar.getClass();
        kindaGotoExternAppEvent.e();
    }

    @Override // com.tencent.kinda.gen.KPlatformUIRouter
    public void jointpayGotoExternApp(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, byte[] bArr) {
        com.tencent.mm.autogen.events.KindaGotoExternAppEvent kindaGotoExternAppEvent = new com.tencent.mm.autogen.events.KindaGotoExternAppEvent();
        am.fi fiVar = kindaGotoExternAppEvent.f54456g;
        fiVar.f6678a = i17;
        fiVar.f6679b = str2;
        fiVar.getClass();
        kindaGotoExternAppEvent.e();
    }

    @Override // com.tencent.kinda.gen.KPlatformUIRouter
    public void openUrlScheme(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!str.startsWith("telprompt://")) {
            com.tencent.mars.xlog.Log.i(TAG, "startOuterApp callbackUrl is ".concat(str));
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            if (com.tencent.mm.sdk.platformtools.t8.I0(com.tencent.mm.sdk.platformtools.x2.f193071a, intent, true, false)) {
                try {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "call dial: %s", str);
        java.lang.String replace = str.replace("telprompt://", "");
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.DIAL");
        intent2.setFlags(268435456);
        intent2.setData(android.net.Uri.parse("tel:" + replace));
        if (com.tencent.mm.sdk.platformtools.t8.I0(com.tencent.mm.sdk.platformtools.x2.f193071a, intent2, true, false)) {
            try {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KPlatformUIRouter
    public void openUrlSchemeWithCallbackImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        java.lang.String string = iTransmitKvData.getString("url");
        com.tencent.mars.xlog.Log.i(TAG, "openUrlSchemeWithCallbackImpl url is %s", string);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.i(TAG, "openUrlSchemeWithCallbackImpl url is null");
            create.putInt("retcode", 2);
            voidITransmitKvDataCallback.call(create);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(string));
        intent.addFlags(268435456);
        if (!com.tencent.mm.sdk.platformtools.t8.I0(com.tencent.mm.sdk.platformtools.x2.f193071a, intent, true, false)) {
            com.tencent.mars.xlog.Log.i(TAG, "openUrlSchemeWithCallbackImpl unhandle");
            create.putInt("retcode", 2);
            voidITransmitKvDataCallback.call(create);
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "openUrlSchemeWithCallbackImpl handle");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlSchemeWithCallbackImpl", "(Lcom/tencent/kinda/gen/ITransmitKvData;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlSchemeWithCallbackImpl", "(Lcom/tencent/kinda/gen/ITransmitKvData;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            create.putInt("retcode", 1);
            voidITransmitKvDataCallback.call(create);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            create.putInt("retcode", 2);
            voidITransmitKvDataCallback.call(create);
        }
    }
}
