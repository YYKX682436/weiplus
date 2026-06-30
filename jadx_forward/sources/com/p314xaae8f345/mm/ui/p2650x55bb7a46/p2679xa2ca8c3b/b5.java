package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class b5 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f284988a;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f284988a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CNewYear", "handleHKHongbaoRouteInfo: usecase is running, ignore click");
            return;
        }
        byte[] mo24791x3ecda1c7 = ((h45.q) i95.n0.c(h45.q.class)).mo24791x3ecda1c7(str, str2);
        if (mo24791x3ecda1c7 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CNewYear", "handleHKHongbaoRouteInfo routeInfoData size:%s", java.lang.Integer.valueOf(mo24791x3ecda1c7.length));
            f284988a = true;
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", mo24791x3ecda1c7);
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x4());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CNewYear", "handleHKHongbaoRouteInfo routeInfoData is null, use content.url");
        f284988a = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
