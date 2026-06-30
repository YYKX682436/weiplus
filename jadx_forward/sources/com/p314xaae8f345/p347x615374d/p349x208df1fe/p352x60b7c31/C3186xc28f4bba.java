package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J2\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/WalletJsapiUtil;", "", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "", "result", "", "closeWindow", "Ljz5/f0;", "doCallbackForLiteApp", "liteAppNotifyName", "", "paramLiteapp", "doNotifyLiteApp", "TAG", "Ljava/lang/String;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.jsapi.WalletJsapiUtil */
/* loaded from: classes16.dex */
public final class C3186xc28f4bba {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba f12240x4fbc8495 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba();
    private static final java.lang.String TAG = "MicroMsg.WalletJsapiUtil";

    private C3186xc28f4bba() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doCallbackForLiteApp */
    public final void m25588x8eb3379a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec, java.lang.String str, int i17) {
        am.gi giVar;
        java.lang.Runnable runnable;
        am.hi hiVar;
        android.os.Bundle bundle;
        am.hi hiVar2;
        android.os.Bundle bundle2;
        if (c5666x53d8f9ec != null && (hiVar2 = c5666x53d8f9ec.f135991h) != null && (bundle2 = hiVar2.f88368a) != null) {
            bundle2.putString("ret", str);
        }
        if (c5666x53d8f9ec != null && (hiVar = c5666x53d8f9ec.f135991h) != null && (bundle = hiVar.f88368a) != null) {
            bundle.putInt("closeWindow", i17);
        }
        if (c5666x53d8f9ec == null || (giVar = c5666x53d8f9ec.f135990g) == null || (runnable = giVar.f88300d) == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: doNotifyLiteApp */
    public final void m25589x4f5d743f(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec, final java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        am.gi giVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[doNotifyLiteApp] liteAppNotifyName:" + str);
        android.os.Bundle bundle = null;
        if ((c5666x53d8f9ec != null ? c5666x53d8f9ec.f135990g : null) != null) {
            if (c5666x53d8f9ec != null && (giVar = c5666x53d8f9ec.f135990g) != null) {
                bundle = giVar.f88298b;
            }
            if (bundle == null) {
                return;
            }
            ((h45.q) i95.n0.c(h45.q.class)).mo24782x854b4da(str, map);
            ((h45.q) i95.n0.c(h45.q.class)).mo24793x32c55bbd(str, new h45.m() { // from class: com.tencent.kinda.framework.jsapi.WalletJsapiUtil$doNotifyLiteApp$1
                @Override // h45.m
                /* renamed from: onEventResponse */
                public void mo25590xacff955c(java.lang.String str2, java.lang.String str3, android.os.Bundle bundle2, int i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsapiUtil", "[doNotifyLiteApp] onEventResponse appId:" + str2 + " , businessEventName: " + str3 + ' ');
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletJsapiUtil", "businessEventName not match");
                        return;
                    }
                    if (c5666x53d8f9ec.f135991h == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletJsapiUtil", "event.result == null");
                        return;
                    }
                    ((h45.q) i95.n0.c(h45.q.class)).mo24853x34fcc656(str, i17);
                    am.hi hiVar = c5666x53d8f9ec.f135991h;
                    if ((hiVar != null ? hiVar.f88368a : null) == null && hiVar != null) {
                        hiVar.f88368a = new android.os.Bundle();
                    }
                    if (bundle2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletJsapiUtil", "[doNotifyLiteApp] data is null, invoke fail!");
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba.f12240x4fbc8495.m25588x8eb3379a(c5666x53d8f9ec, "fail", 1);
                        return;
                    }
                    int i18 = bundle2.getInt("errCode", -1);
                    boolean z17 = bundle2.getBoolean("notCloseBankPage", false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJsapiUtil", "liteapp callback data, errCode: " + i18 + ", notCloseBankPage: " + z17);
                    int i19 = 1 ^ (z17 ? 1 : 0);
                    if (i18 == -1) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba.f12240x4fbc8495.m25588x8eb3379a(c5666x53d8f9ec, "cancel", i19);
                    } else if (i18 != 0) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba.f12240x4fbc8495.m25588x8eb3379a(c5666x53d8f9ec, "fail", i19);
                    } else {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba.f12240x4fbc8495.m25588x8eb3379a(c5666x53d8f9ec, "ok", i19);
                    }
                }
            });
        }
    }
}
