package a71;

/* loaded from: classes.dex */
public final class e implements vg3.r4 {

    /* renamed from: d, reason: collision with root package name */
    public static a71.d f83448d;

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "showpolicylist")) {
            a71.d dVar = new a71.d(this);
            f83448d = dVar;
            if (map != null) {
                dVar.f83440a = (java.lang.String) map.get(".sysmsg.showpolicylist.policylist_url");
                a71.d dVar2 = f83448d;
                if (dVar2 != null) {
                    dVar2.f83441b = (java.lang.String) map.get(".sysmsg.showpolicylist.policylist_list");
                }
                a71.d dVar3 = f83448d;
                if (dVar3 != null) {
                    dVar3.f83442c = (java.lang.String) map.get(".sysmsg.showpolicylist.policylist_ticket");
                }
                a71.d dVar4 = f83448d;
                if (dVar4 != null) {
                    dVar4.f83443d = (java.lang.String) map.get(".sysmsg.showpolicylist.deviceid");
                }
                a71.d dVar5 = f83448d;
                if (dVar5 != null) {
                    dVar5.f83444e = (java.lang.String) map.get(".sysmsg.showpolicylist.doublecheck_content");
                }
                a71.d dVar6 = f83448d;
                if (dVar6 != null) {
                    dVar6.f83445f = (java.lang.String) map.get(".sysmsg.showpolicylist.doublecheck_cancel");
                }
                a71.d dVar7 = f83448d;
                if (dVar7 != null) {
                    dVar7.f83446g = (java.lang.String) map.get(".sysmsg.showpolicylist.doublecheck_ok");
                }
                a71.d dVar8 = f83448d;
                if (dVar8 != null) {
                    dVar8.f83447h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.showpolicylist.hideclosebtn"), 0) == 1;
                }
            }
            a71.d dVar9 = f83448d;
            if (dVar9 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Account.AccountComplianceReceiver", "showpolicylist onNewXmlReceived url:" + dVar9.f83440a + " list:" + dVar9.f83441b + " ticket:" + dVar9.f83442c + " hideCloseBtn:" + dVar9.f83447h);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar9.f83440a) || !ot5.h.f430410a.a(dVar9.f83443d, wo.w0.k(), "showpolicylist", false)) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("close_dialog_title", "");
                java.lang.String str2 = dVar9.f83444e;
                if (str2 == null) {
                    str2 = "";
                }
                bundle.putString("close_dialog_msg", str2);
                java.lang.String str3 = dVar9.f83446g;
                if (str3 == null) {
                    str3 = "";
                }
                bundle.putString("close_dialog_ok", str3);
                java.lang.String str4 = dVar9.f83445f;
                bundle.putString("close_dialog_cancel", str4 != null ? str4 : "");
                bundle.putBoolean("close_dialog_ok_close", false);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("key_close_action", 1);
                bundle2.putBoolean("hide_close_btn", dVar9.f83447h);
                bundle2.putBundle("key_close_data", bundle);
                bundle2.putBoolean("hide_option_menu", true);
                bundle2.putBoolean("KRightBtn", true);
                bundle2.putBoolean("KPopUpTransition", true);
                bundle2.putBoolean("open_custom_style_url", true);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.String str5 = dVar9.f83440a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str5);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                intent.putExtras(bundle2);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}
