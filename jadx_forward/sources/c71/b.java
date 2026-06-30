package c71;

/* loaded from: classes5.dex */
public abstract class b {
    public static boolean a(android.content.Context context, java.lang.String str) {
        if (str.length() > 16) {
            d(context, c71.a.BeyondMaximumLength);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str)) {
            db5.e1.i(context, com.p314xaae8f345.mm.R.C30867xcad56011.f574329hw2, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Z0(str)) {
            return true;
        }
        if (str.length() < 8 || str.length() >= 16) {
            d(context, c71.a.NotReachMinimumLength);
        } else {
            d(context, c71.a.DisallowShortNumericPassword);
        }
        return false;
    }

    public static void b(android.content.Context context, java.lang.String str, int i17, boolean z17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z17);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        intent.putExtra("KHalfScreenHeight", i18);
        intent.putExtra("KHalfScreenHeightPercent", -1.0f);
        if (i17 > 0) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void c(android.content.Context context, java.lang.String str, int i17, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", !z17);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        if (i17 > 0) {
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void d(android.content.Context context, c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(context, com.p314xaae8f345.mm.R.C30867xcad56011.hwv, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(context, com.p314xaae8f345.mm.R.C30867xcad56011.hww, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        } else if (ordinal == 2 || ordinal == 3) {
            db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k66), "");
        }
    }
}
