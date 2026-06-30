package a71;

/* loaded from: classes.dex */
public final class e implements vg3.r4 {

    /* renamed from: d, reason: collision with root package name */
    public static a71.d f1915d;

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (kotlin.jvm.internal.o.b(str, "showpolicylist")) {
            a71.d dVar = new a71.d(this);
            f1915d = dVar;
            if (map != null) {
                dVar.f1907a = (java.lang.String) map.get(".sysmsg.showpolicylist.policylist_url");
                a71.d dVar2 = f1915d;
                if (dVar2 != null) {
                    dVar2.f1908b = (java.lang.String) map.get(".sysmsg.showpolicylist.policylist_list");
                }
                a71.d dVar3 = f1915d;
                if (dVar3 != null) {
                    dVar3.f1909c = (java.lang.String) map.get(".sysmsg.showpolicylist.policylist_ticket");
                }
                a71.d dVar4 = f1915d;
                if (dVar4 != null) {
                    dVar4.f1910d = (java.lang.String) map.get(".sysmsg.showpolicylist.deviceid");
                }
                a71.d dVar5 = f1915d;
                if (dVar5 != null) {
                    dVar5.f1911e = (java.lang.String) map.get(".sysmsg.showpolicylist.doublecheck_content");
                }
                a71.d dVar6 = f1915d;
                if (dVar6 != null) {
                    dVar6.f1912f = (java.lang.String) map.get(".sysmsg.showpolicylist.doublecheck_cancel");
                }
                a71.d dVar7 = f1915d;
                if (dVar7 != null) {
                    dVar7.f1913g = (java.lang.String) map.get(".sysmsg.showpolicylist.doublecheck_ok");
                }
                a71.d dVar8 = f1915d;
                if (dVar8 != null) {
                    dVar8.f1914h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.showpolicylist.hideclosebtn"), 0) == 1;
                }
            }
            a71.d dVar9 = f1915d;
            if (dVar9 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Account.AccountComplianceReceiver", "showpolicylist onNewXmlReceived url:" + dVar9.f1907a + " list:" + dVar9.f1908b + " ticket:" + dVar9.f1909c + " hideCloseBtn:" + dVar9.f1914h);
                if (com.tencent.mm.sdk.platformtools.t8.K0(dVar9.f1907a) || !ot5.h.f348877a.a(dVar9.f1910d, wo.w0.k(), "showpolicylist", false)) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("close_dialog_title", "");
                java.lang.String str2 = dVar9.f1911e;
                if (str2 == null) {
                    str2 = "";
                }
                bundle.putString("close_dialog_msg", str2);
                java.lang.String str3 = dVar9.f1913g;
                if (str3 == null) {
                    str3 = "";
                }
                bundle.putString("close_dialog_ok", str3);
                java.lang.String str4 = dVar9.f1912f;
                bundle.putString("close_dialog_cancel", str4 != null ? str4 : "");
                bundle.putBoolean("close_dialog_ok_close", false);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("key_close_action", 1);
                bundle2.putBoolean("hide_close_btn", dVar9.f1914h);
                bundle2.putBundle("key_close_data", bundle);
                bundle2.putBoolean("hide_option_menu", true);
                bundle2.putBoolean("KRightBtn", true);
                bundle2.putBoolean("KPopUpTransition", true);
                bundle2.putBoolean("open_custom_style_url", true);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String str5 = dVar9.f1907a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str5);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                intent.putExtras(bundle2);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}
