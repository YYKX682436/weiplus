package com.tencent.mm.feature.wallet_core.extension;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u001d\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0086 J\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0086 J\u001a\u0010\r\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/feature/wallet_core/extension/SecLiteAppNative;", "", "", "key", "value", "Ljz5/f0;", com.tenpay.android.wechat.MyKeyboardWindow.KINDE_REPORT_METHOD_NAME, "", "sceneId", "eventName", "getResult", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "info", "r0os0", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class SecLiteAppNative {
    public static final com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative INSTANCE = new com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative();

    private SecLiteAppNative() {
    }

    public static final void reportKindaEvent(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        com.tencent.mm.autogen.events.KindaNotifyEvent kindaNotifyEvent = new com.tencent.mm.autogen.events.KindaNotifyEvent();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(str, str2);
        kindaNotifyEvent.f54459g.f6954a = hashMap;
        kindaNotifyEvent.e();
    }

    public final native java.lang.String getResult(int sceneId, java.lang.String eventName);

    public final native void init(int i17, java.lang.String str);

    public final void r0os0(java.lang.String str, java.lang.String str2) {
        new vs4.a(str, str2).l().K(rg0.p.f395186a);
    }
}
