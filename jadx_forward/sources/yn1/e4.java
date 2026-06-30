package yn1;

/* loaded from: classes.dex */
public final class e4 implements qi0.h {
    @Override // qi0.h
    public java.lang.Object a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "migration");
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!b17) {
            return f0Var;
        }
        int hashCode = str2.hashCode();
        if (hashCode != -1998156817) {
            if (hashCode != -504681497) {
                if (hashCode == 901823813 && str2.equals("openHotSpot")) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a8v));
                    intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a8u, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
                    intent.putExtra("showShare", false);
                    intent.putExtra("neverGetA8Key", true);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                }
            } else if (str2.equals("openScan")) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("BaseScanUI_select_scan_mode", 1);
                intent2.putExtra("key_scan_report_enter_scene", 20);
                j45.l.j(context, "scanner", ".ui.BaseScanUI", intent2, null);
            }
        } else if (str2.equals("openFeedback")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("showShare", false);
            intent3.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575221la4));
            intent3.putExtra("show_feedback", false);
            intent3.putExtra("KShowFixToolsBtn", true);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        return f0Var;
    }
}
