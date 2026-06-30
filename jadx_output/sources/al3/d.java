package al3;

/* loaded from: classes8.dex */
public abstract class d {
    public static void a(android.content.Intent intent, r45.qs0 qs0Var) {
        if (qs0Var == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("app_type", qs0Var.getString(8));
        bundle.putString("app_media_id", qs0Var.getString(9));
        bundle.putLong("app_msg_id", qs0Var.getLong(10));
        bundle.putBoolean("app_show_share", qs0Var.getBoolean(11));
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, qs0Var.getInteger(12));
        bundle.putString("msg_talker", qs0Var.getString(30));
        intent.putExtras(bundle);
    }

    public static void b(android.content.Intent intent, r45.k97 k97Var) {
        if (k97Var == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, k97Var.getString(4));
        bundle.putString("webpageTitle", k97Var.getString(5));
        bundle.putBoolean("hide_option_menu", k97Var.getBoolean(6));
        bundle.putBoolean("translate_webview", k97Var.getBoolean(7));
        bundle.putString("srcUsername", k97Var.getString(8));
        bundle.putString("srcDisplayname", k97Var.getString(9));
        bundle.putInt("mode", k97Var.getInteger(10));
        bundle.putString("KTemplateId", k97Var.getString(11));
        bundle.putString("KPublisherId", k97Var.getString(12));
        bundle.putInt("KOpenArticleSceneFromScene", k97Var.getInteger(13));
        bundle.putInt(com.tencent.mm.ui.w2.f211194g, k97Var.getInteger(14));
        bundle.putInt("pay_channel", k97Var.getInteger(15));
        bundle.putInt("key_download_restrict", k97Var.getInteger(16));
        bundle.putInt("key_wallet_region", k97Var.getInteger(17));
        bundle.putString("key_function_id", k97Var.getString(18));
        bundle.putInt(com.tencent.mm.ui.w2.f211197j, k97Var.getInteger(19));
        bundle.putInt("geta8key_scene", k97Var.getInteger(20));
        bundle.putString("ad_ux_info_for_jsapi_pay", k97Var.getString(25));
        bundle.putBoolean("key_menu_hide_expose", k97Var.getBoolean(26));
        bundle.putString("webviewCurrentProcess", k97Var.getString(27));
        bundle.putString("rawUrl", k97Var.getString(1));
        intent.putExtras(bundle);
    }
}
