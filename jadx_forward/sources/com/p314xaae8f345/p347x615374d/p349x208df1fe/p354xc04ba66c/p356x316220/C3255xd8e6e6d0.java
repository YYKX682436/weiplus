package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.PlatformUIRouterImpl */
/* loaded from: classes9.dex */
public class C3255xd8e6e6d0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3502x5fc6e2db {
    public static final java.lang.String TAG = "MicroMsg.PlatformUIRouterImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f12451x7f11beae;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3502x5fc6e2db
    /* renamed from: gotoExternApp */
    public void mo25946x35c1c3e(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, byte[] bArr) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09 c5665x154acf09 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09();
        am.fi fiVar = c5665x154acf09.f135989g;
        fiVar.f88211a = i17;
        fiVar.f88212b = str2;
        fiVar.getClass();
        c5665x154acf09.e();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3502x5fc6e2db
    /* renamed from: jointpayGotoExternApp */
    public void mo25947xb5cf6100(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, byte[] bArr) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09 c5665x154acf09 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5665x154acf09();
        am.fi fiVar = c5665x154acf09.f135989g;
        fiVar.f88211a = i17;
        fiVar.f88212b = str2;
        fiVar.getClass();
        c5665x154acf09.e();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3502x5fc6e2db
    /* renamed from: openUrlScheme */
    public void mo25948xdfb744ca(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!str.startsWith("telprompt://")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startOuterApp callbackUrl is ".concat(str));
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent, true, false)) {
                try {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "call dial: %s", str);
        java.lang.String replace = str.replace("telprompt://", "");
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.DIAL");
        intent2.setFlags(268435456);
        intent2.setData(android.net.Uri.parse("tel:" + replace));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent2, true, false)) {
            try {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlScheme", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3502x5fc6e2db
    /* renamed from: openUrlSchemeWithCallbackImpl */
    public void mo25949xa06a0cd5(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "openUrlSchemeWithCallbackImpl url is %s", mo27551x2fec8307);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "openUrlSchemeWithCallbackImpl url is null");
            m27539xaf65a0fc.mo27557xc5c55e60("retcode", 2);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(mo27551x2fec8307));
        intent.addFlags(268435456);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent, true, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "openUrlSchemeWithCallbackImpl unhandle");
            m27539xaf65a0fc.mo27557xc5c55e60("retcode", 2);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "openUrlSchemeWithCallbackImpl handle");
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlSchemeWithCallbackImpl", "(Lcom/tencent/kinda/gen/ITransmitKvData;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/kinda/framework/module/impl/PlatformUIRouterImpl", "openUrlSchemeWithCallbackImpl", "(Lcom/tencent/kinda/gen/ITransmitKvData;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m27539xaf65a0fc.mo27557xc5c55e60("retcode", 1);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            m27539xaf65a0fc.mo27557xc5c55e60("retcode", 2);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
        }
    }
}
