package com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J.\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/PayLiteAppNotify;", "Lh45/m;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Ljz5/f0;", "notifyAllUseCase", "", "appId", "businessEventName", "Landroid/os/Bundle;", "", "callbackId", "onEventResponse", "", "Lcom/tencent/kinda/gen/ITransmitKvData;", "payNotifyMap", "Ljava/util/Map;", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.kindalite.PayLiteAppNotify */
/* loaded from: classes9.dex */
public final class C3223xe2f48814 implements h45.m {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814.Companion INSTANCE = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814.Companion(null);

    /* renamed from: INSTANCE */
    private static volatile com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814 f12390x4fbc8495 = null;

    /* renamed from: PayLiteAppNotifyCallback */
    private static final java.lang.String f12391x98dbb879 = "pay.kindaNotify.callback";
    private static final java.lang.String TAG = "PayLiteAppNotify";

    /* renamed from: WxPayCashierStoreActionJSEventCloseWebView */
    private static final java.lang.String f12392x98a2f697 = "jsEventCloseWebView";

    /* renamed from: WxPayCashierStoreActionJSEventEndWithResult */
    private static final java.lang.String f12393xe41a46e8 = "jsEventEndWithResult";
    private java.util.Map<java.lang.String, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e> payNotifyMap;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/PayLiteAppNotify$Companion;", "", "()V", "INSTANCE", "Lcom/tencent/kinda/framework/kindalite/PayLiteAppNotify;", "PayLiteAppNotifyCallback", "", "TAG", "WxPayCashierStoreActionJSEventCloseWebView", "WxPayCashierStoreActionJSEventEndWithResult", "getInstance", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.kinda.framework.kindalite.PayLiteAppNotify$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getInstance */
        public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814 m25845x9cf0d20b() {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814 c3223xe2f48814 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814.f12390x4fbc8495;
            if (c3223xe2f48814 == null) {
                synchronized (this) {
                    c3223xe2f48814 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814.f12390x4fbc8495;
                    if (c3223xe2f48814 == null) {
                        c3223xe2f48814 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814(null);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814.f12390x4fbc8495 = c3223xe2f48814;
                    }
                }
            }
            return c3223xe2f48814;
        }
    }

    public /* synthetic */ C3223xe2f48814(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this();
    }

    /* renamed from: notifyAllUseCase */
    public final void m25844x40cf7c9f(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start common notifyAllUseCase");
        if (!(obj instanceof com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "notifyAllUseCase fail data is not ITransmitKvData");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start common notifyAllUseCase: %s", ((com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) obj).mo27567xcc31ba03());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) obj).mo27567xcc31ba03());
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            jSONObject.putOpt("notifyCallbackId", uuid);
            this.payNotifyMap.put(uuid, obj);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("pay.kindaNotify", jSONObject);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "notifyAllUseCase json parse error: %s", e17.toString());
        }
    }

    @Override // h45.m
    /* renamed from: onEventResponse */
    public void mo25590xacff955c(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, int i17) {
        java.lang.String string = bundle != null ? bundle.getString("notifyCallbackId") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyAllUseCase onEventResponse: " + str + ' ' + str2 + ' ' + bundle);
        if (string != null) {
            if (!(string.length() == 0)) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e = this.payNotifyMap.get(string);
                if (abstractC3411xcfaed72e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "notifyData == null");
                    return;
                }
                java.lang.String string2 = bundle.getString("action");
                if (string2 != null) {
                    if (!(string2.length() == 0)) {
                        com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 mo27546xb6c782bb = abstractC3411xcfaed72e.mo27546xb6c782bb("jsEvent");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string2, "jsEventEndWithResult") && mo27546xb6c782bb != null) {
                            java.lang.String string3 = bundle.getString("result");
                            dd.c cVar = dd.d.f310404a;
                            org.json.JSONObject a17 = cVar.a(bundle.getBundle(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96));
                            java.util.HashMap c17 = a17 != null ? cVar.c(a17) : new java.util.HashMap();
                            mo27546xb6c782bb.mo24860x91578571(string3, c17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyAllUseCase callback kindaEndWithResult: " + string3 + ' ' + c17);
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string2, "jsEventCloseWebView") || mo27546xb6c782bb == null) {
                            return;
                        }
                        boolean z17 = bundle.getBoolean("animated");
                        mo27546xb6c782bb.mo24859x14baf22e(z17, new com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619() { // from class: com.tencent.kinda.framework.kindalite.PayLiteAppNotify$onEventResponse$1
                            @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619
                            /* renamed from: call */
                            public void mo25801x2e7a5e() {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PayLiteAppNotify", "webView closed");
                            }
                        });
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyAllUseCase callback kindaCloseWebViewImpl: " + z17);
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "action == null");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "notifyCallbackId == null");
    }

    private C3223xe2f48814() {
        this.payNotifyMap = new java.util.HashMap();
        id.d.f371977c.a().b(f12391x98dbb879, this);
    }
}
