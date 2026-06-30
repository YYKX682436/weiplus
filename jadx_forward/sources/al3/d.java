package al3;

/* loaded from: classes8.dex */
public abstract class d {
    public static void a(android.content.Intent intent, r45.qs0 qs0Var) {
        if (qs0Var == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("app_type", qs0Var.m75945x2fec8307(8));
        bundle.putString("app_media_id", qs0Var.m75945x2fec8307(9));
        bundle.putLong("app_msg_id", qs0Var.m75942xfb822ef2(10));
        bundle.putBoolean("app_show_share", qs0Var.m75933x41a8a7f2(11));
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, qs0Var.m75939xb282bd08(12));
        bundle.putString("msg_talker", qs0Var.m75945x2fec8307(30));
        intent.putExtras(bundle);
    }

    public static void b(android.content.Intent intent, r45.k97 k97Var) {
        if (k97Var == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, k97Var.m75945x2fec8307(4));
        bundle.putString("webpageTitle", k97Var.m75945x2fec8307(5));
        bundle.putBoolean("hide_option_menu", k97Var.m75933x41a8a7f2(6));
        bundle.putBoolean("translate_webview", k97Var.m75933x41a8a7f2(7));
        bundle.putString("srcUsername", k97Var.m75945x2fec8307(8));
        bundle.putString("srcDisplayname", k97Var.m75945x2fec8307(9));
        bundle.putInt("mode", k97Var.m75939xb282bd08(10));
        bundle.putString("KTemplateId", k97Var.m75945x2fec8307(11));
        bundle.putString("KPublisherId", k97Var.m75945x2fec8307(12));
        bundle.putInt("KOpenArticleSceneFromScene", k97Var.m75939xb282bd08(13));
        bundle.putInt(com.p314xaae8f345.mm.ui.w2.f292727g, k97Var.m75939xb282bd08(14));
        bundle.putInt("pay_channel", k97Var.m75939xb282bd08(15));
        bundle.putInt("key_download_restrict", k97Var.m75939xb282bd08(16));
        bundle.putInt("key_wallet_region", k97Var.m75939xb282bd08(17));
        bundle.putString("key_function_id", k97Var.m75945x2fec8307(18));
        bundle.putInt(com.p314xaae8f345.mm.ui.w2.f292730j, k97Var.m75939xb282bd08(19));
        bundle.putInt("geta8key_scene", k97Var.m75939xb282bd08(20));
        bundle.putString("ad_ux_info_for_jsapi_pay", k97Var.m75945x2fec8307(25));
        bundle.putBoolean("key_menu_hide_expose", k97Var.m75933x41a8a7f2(26));
        bundle.putString("webviewCurrentProcess", k97Var.m75945x2fec8307(27));
        bundle.putString("rawUrl", k97Var.m75945x2fec8307(1));
        intent.putExtras(bundle);
    }
}
