package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class v4 extends k34.a implements k34.g {
    @Override // k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        intent.putExtra("type", 4);
        java.lang.String str = "";
        intent.putExtra(dm.i4.f66865x76d1ec5a, "");
        try {
            str = java.net.URLDecoder.decode(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "ext_info"), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("from_shortcut", true);
        intent2.addFlags(268435456);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
    }
}
