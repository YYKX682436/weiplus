package com.tencent.kinda.framework.jsapi;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J2\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/WalletJsapiUtil;", "", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "", "result", "", "closeWindow", "Ljz5/f0;", "doCallbackForLiteApp", "liteAppNotifyName", "", "paramLiteapp", "doNotifyLiteApp", "TAG", "Ljava/lang/String;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class WalletJsapiUtil {
    public static final com.tencent.kinda.framework.jsapi.WalletJsapiUtil INSTANCE = new com.tencent.kinda.framework.jsapi.WalletJsapiUtil();
    private static final java.lang.String TAG = "MicroMsg.WalletJsapiUtil";

    private WalletJsapiUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doCallbackForLiteApp(com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent, java.lang.String str, int i17) {
        am.gi giVar;
        java.lang.Runnable runnable;
        am.hi hiVar;
        android.os.Bundle bundle;
        am.hi hiVar2;
        android.os.Bundle bundle2;
        if (kindaJSInvokeEvent != null && (hiVar2 = kindaJSInvokeEvent.f54458h) != null && (bundle2 = hiVar2.f6835a) != null) {
            bundle2.putString("ret", str);
        }
        if (kindaJSInvokeEvent != null && (hiVar = kindaJSInvokeEvent.f54458h) != null && (bundle = hiVar.f6835a) != null) {
            bundle.putInt("closeWindow", i17);
        }
        if (kindaJSInvokeEvent == null || (giVar = kindaJSInvokeEvent.f54457g) == null || (runnable = giVar.f6767d) == null) {
            return;
        }
        runnable.run();
    }

    public final void doNotifyLiteApp(final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent, final java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        am.gi giVar;
        com.tencent.mars.xlog.Log.i(TAG, "[doNotifyLiteApp] liteAppNotifyName:" + str);
        android.os.Bundle bundle = null;
        if ((kindaJSInvokeEvent != null ? kindaJSInvokeEvent.f54457g : null) != null) {
            if (kindaJSInvokeEvent != null && (giVar = kindaJSInvokeEvent.f54457g) != null) {
                bundle = giVar.f6765b;
            }
            if (bundle == null) {
                return;
            }
            ((h45.q) i95.n0.c(h45.q.class)).notifyAllLiteAppForPay(str, map);
            ((h45.q) i95.n0.c(h45.q.class)).registerLiteAppModuleEventForPay(str, new h45.m() { // from class: com.tencent.kinda.framework.jsapi.WalletJsapiUtil$doNotifyLiteApp$1
                @Override // h45.m
                public void onEventResponse(java.lang.String str2, java.lang.String str3, android.os.Bundle bundle2, int i17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsapiUtil", "[doNotifyLiteApp] onEventResponse appId:" + str2 + " , businessEventName: " + str3 + ' ');
                    if (!kotlin.jvm.internal.o.b(str, str3)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletJsapiUtil", "businessEventName not match");
                        return;
                    }
                    if (kindaJSInvokeEvent.f54458h == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletJsapiUtil", "event.result == null");
                        return;
                    }
                    ((h45.q) i95.n0.c(h45.q.class)).unregisterLiteAppModuleEventForPay(str, i17);
                    am.hi hiVar = kindaJSInvokeEvent.f54458h;
                    if ((hiVar != null ? hiVar.f6835a : null) == null && hiVar != null) {
                        hiVar.f6835a = new android.os.Bundle();
                    }
                    if (bundle2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletJsapiUtil", "[doNotifyLiteApp] data is null, invoke fail!");
                        com.tencent.kinda.framework.jsapi.WalletJsapiUtil.INSTANCE.doCallbackForLiteApp(kindaJSInvokeEvent, "fail", 1);
                        return;
                    }
                    int i18 = bundle2.getInt("errCode", -1);
                    boolean z17 = bundle2.getBoolean("notCloseBankPage", false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsapiUtil", "liteapp callback data, errCode: " + i18 + ", notCloseBankPage: " + z17);
                    int i19 = 1 ^ (z17 ? 1 : 0);
                    if (i18 == -1) {
                        com.tencent.kinda.framework.jsapi.WalletJsapiUtil.INSTANCE.doCallbackForLiteApp(kindaJSInvokeEvent, "cancel", i19);
                    } else if (i18 != 0) {
                        com.tencent.kinda.framework.jsapi.WalletJsapiUtil.INSTANCE.doCallbackForLiteApp(kindaJSInvokeEvent, "fail", i19);
                    } else {
                        com.tencent.kinda.framework.jsapi.WalletJsapiUtil.INSTANCE.doCallbackForLiteApp(kindaJSInvokeEvent, "ok", i19);
                    }
                }
            });
        }
    }
}
