package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* loaded from: classes8.dex */
public abstract class n {
    public static void a(android.content.Context context, java.lang.String str, int i17, boolean z17, int i18, float f17, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z17);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        intent.putExtra("KHalfScreenHeight", i18);
        intent.putExtra("KHalfScreenHeightPercent", f17);
        intent.putExtra("KHalfScreenBackGroundColor", com.p314xaae8f345.mm.ui.bk.C() ? context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560758td) : context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560757tc));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent.putExtra("KGamePreloadData", str2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            intent.putExtra("game_pre_inject_data", str3);
        }
        if (i17 > 0) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void b(android.content.Context context, java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z17);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent.putExtra("KGamePreloadData", str2);
        }
        if (i17 > 0) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
