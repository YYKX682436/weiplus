package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J.\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/PayLiteAppNotify;", "Lh45/m;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "notifyAllUseCase", "", "appId", "businessEventName", "Landroid/os/Bundle;", "", "callbackId", "onEventResponse", "", "Lcom/tencent/kinda/gen/ITransmitKvData;", "payNotifyMap", "Ljava/util/Map;", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class PayLiteAppNotify implements h45.m {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.kinda.framework.kindalite.PayLiteAppNotify.Companion INSTANCE = new com.tencent.kinda.framework.kindalite.PayLiteAppNotify.Companion(null);
    private static volatile com.tencent.kinda.framework.kindalite.PayLiteAppNotify INSTANCE = null;
    private static final java.lang.String PayLiteAppNotifyCallback = "pay.kindaNotify.callback";
    private static final java.lang.String TAG = "PayLiteAppNotify";
    private static final java.lang.String WxPayCashierStoreActionJSEventCloseWebView = "jsEventCloseWebView";
    private static final java.lang.String WxPayCashierStoreActionJSEventEndWithResult = "jsEventEndWithResult";
    private java.util.Map<java.lang.String, com.tencent.kinda.gen.ITransmitKvData> payNotifyMap;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/PayLiteAppNotify$Companion;", "", "()V", "INSTANCE", "Lcom/tencent/kinda/framework/kindalite/PayLiteAppNotify;", "PayLiteAppNotifyCallback", "", "TAG", "WxPayCashierStoreActionJSEventCloseWebView", "WxPayCashierStoreActionJSEventEndWithResult", "getInstance", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.kinda.framework.kindalite.PayLiteAppNotify getInstance() {
            com.tencent.kinda.framework.kindalite.PayLiteAppNotify payLiteAppNotify = com.tencent.kinda.framework.kindalite.PayLiteAppNotify.INSTANCE;
            if (payLiteAppNotify == null) {
                synchronized (this) {
                    payLiteAppNotify = com.tencent.kinda.framework.kindalite.PayLiteAppNotify.INSTANCE;
                    if (payLiteAppNotify == null) {
                        payLiteAppNotify = new com.tencent.kinda.framework.kindalite.PayLiteAppNotify(null);
                        com.tencent.kinda.framework.kindalite.PayLiteAppNotify.INSTANCE = payLiteAppNotify;
                    }
                }
            }
            return payLiteAppNotify;
        }
    }

    public /* synthetic */ PayLiteAppNotify(kotlin.jvm.internal.i iVar) {
        this();
    }

    public final void notifyAllUseCase(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(TAG, "start common notifyAllUseCase");
        if (!(obj instanceof com.tencent.kinda.gen.ITransmitKvData)) {
            com.tencent.mars.xlog.Log.e(TAG, "notifyAllUseCase fail data is not ITransmitKvData");
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "start common notifyAllUseCase: %s", ((com.tencent.kinda.gen.ITransmitKvData) obj).toJson());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.tencent.kinda.gen.ITransmitKvData) obj).toJson());
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            jSONObject.putOpt("notifyCallbackId", uuid);
            this.payNotifyMap.put(uuid, obj);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.l("pay.kindaNotify", jSONObject);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(TAG, "notifyAllUseCase json parse error: %s", e17.toString());
        }
    }

    @Override // h45.m
    public void onEventResponse(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, int i17) {
        java.lang.String string = bundle != null ? bundle.getString("notifyCallbackId") : null;
        com.tencent.mars.xlog.Log.i(TAG, "notifyAllUseCase onEventResponse: " + str + ' ' + str2 + ' ' + bundle);
        if (string != null) {
            if (!(string.length() == 0)) {
                com.tencent.kinda.gen.ITransmitKvData iTransmitKvData = this.payNotifyMap.get(string);
                if (iTransmitKvData == null) {
                    com.tencent.mars.xlog.Log.e(TAG, "notifyData == null");
                    return;
                }
                java.lang.String string2 = bundle.getString("action");
                if (string2 != null) {
                    if (!(string2.length() == 0)) {
                        com.tencent.kinda.gen.KJSEvent jSEvent = iTransmitKvData.getJSEvent("jsEvent");
                        if (com.tencent.mm.sdk.platformtools.t8.D0(string2, "jsEventEndWithResult") && jSEvent != null) {
                            java.lang.String string3 = bundle.getString("result");
                            dd.c cVar = dd.d.f228871a;
                            org.json.JSONObject a17 = cVar.a(bundle.getBundle(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO));
                            java.util.HashMap c17 = a17 != null ? cVar.c(a17) : new java.util.HashMap();
                            jSEvent.kindaEndWithResult(string3, c17);
                            com.tencent.mars.xlog.Log.i(TAG, "notifyAllUseCase callback kindaEndWithResult: " + string3 + ' ' + c17);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.D0(string2, "jsEventCloseWebView") || jSEvent == null) {
                            return;
                        }
                        boolean z17 = bundle.getBoolean("animated");
                        jSEvent.kindaCloseWebViewImpl(z17, new com.tencent.kinda.gen.VoidCallback() { // from class: com.tencent.kinda.framework.kindalite.PayLiteAppNotify$onEventResponse$1
                            @Override // com.tencent.kinda.gen.VoidCallback
                            public void call() {
                                com.tencent.mars.xlog.Log.i("PayLiteAppNotify", "webView closed");
                            }
                        });
                        com.tencent.mars.xlog.Log.i(TAG, "notifyAllUseCase callback kindaCloseWebViewImpl: " + z17);
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.e(TAG, "action == null");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e(TAG, "notifyCallbackId == null");
    }

    private PayLiteAppNotify() {
        this.payNotifyMap = new java.util.HashMap();
        id.d.f290444c.a().b(PayLiteAppNotifyCallback, this);
    }
}
