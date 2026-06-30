package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class i6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        android.app.Activity g17 = dVar.g();
        java.lang.String x17 = dVar.x();
        java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.f287745a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.lang.String str = erVar.f285446i;
        if (android.text.TextUtils.isEmpty(str)) {
            str = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).P(erVar.f285459v);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("geta8key_username", x17);
            intent.putExtra("rawUrl", erVar.f285459v);
            j45.l.j(g17, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        qk.c0 c0Var = new qk.c0(str == null ? "" : str);
        if (erVar.f285447j) {
            c0Var.f445688a = 20;
            c0Var.f445731g = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12953, 1, str);
        } else if (erVar.f285448k) {
            c0Var.f445688a = 25;
            c0Var.f445731g = 9;
        } else {
            c0Var.f445688a = 22;
            c0Var.f445731g = 122;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10993, 2, str);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemHelper", "emoticon liteapp service not found");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(g17, c0Var);
        }
    }
}
