package en;

@j95.b
/* loaded from: classes.dex */
public final class a extends jm0.o implements en.k {
    public boolean Zi(android.content.Context context, int i17, int i18, java.lang.String str) {
        if (i17 != 4) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiErrMsgFeatureService", "handleErrMsg errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 == null) {
            return false;
        }
        if (b17.f501933c != 8) {
            return b17.c(context, null, null);
        }
        java.lang.String str2 = b17.f501931a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }

    public void aj(android.content.Context context, java.lang.String str) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiErrMsgFeatureService", "showErrMsgToast errMsg:" + str);
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            dp.a.m125854x26a183b(context, b17.f501932b, 1).show();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (str == null) {
                str = "";
            }
            dp.a.m125854x26a183b(context, str, 1).show();
        }
    }
}
