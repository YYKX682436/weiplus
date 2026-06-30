package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/mc;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiSetWxPayTestInfo$RequestType;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes5.dex */
final class mc implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        java.util.Collection collection;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19460xe01f4afb data = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19460xe01f4afb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "SetWxPayTestInfoTask auto auth is empty");
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false);
        }
        java.lang.String str2 = data.f267453d;
        if (str2 != null && (str = data.f267454e) != null) {
            c17.l0(str, "", str2, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "set long and short, ipLong: " + str2 + "ipShort:" + str);
        }
        java.lang.String str3 = data.f267455f;
        if (str3 != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn") || !r26.n0.B("short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn", "|", false)) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().k0("shshort.pay.weixin.qq.com", str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "setPay ip:" + str3 + "hosts:shshort.pay.weixin.qq.com");
            } else {
                java.util.List g17 = new r26.t("\\|").g("short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn", 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kz5.p0.f395529d;
                java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
                    if (!(strArr.length == 0)) {
                        for (java.lang.String str4 : strArr) {
                            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().k0(str4, str3);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "setPay ip:" + str3 + "hosts:short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn");
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true);
    }
}
