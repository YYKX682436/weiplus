package com.tencent.mm.emoji.sync;

/* loaded from: classes12.dex */
public class EmojiUpdateReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f64930a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        pr.q0 q0Var;
        java.lang.String action = intent.getAction();
        if ("com.tencent.mm.Emoji_Update".equals(action)) {
            java.lang.String stringExtra = intent.getStringExtra("type");
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUpdateReceiver", "receive %s, %s", action, stringExtra);
            if ("update_all_custom_emoji".equals(stringExtra)) {
                gr.t.g().l(false);
                new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
                return;
            }
            if ("update_download_custom_emoji".equals(stringExtra)) {
                gr.t.g().n(false);
                new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
                return;
            }
            if ("update_store_emoji".equals(stringExtra)) {
                gr.t.g().f274684c = true;
                new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
                return;
            }
            if ("update_group_info".equals(stringExtra)) {
                gr.t.g().o(false);
                new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
                return;
            }
            if ("update_capture_emoji".equals(stringExtra)) {
                gr.t.g().m(false);
                new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent().e();
                return;
            }
            if ("TYPE_UPDATE_EMOJI_SYNC".equals(stringExtra)) {
                com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData emojiSyncLoaderIPC$EmojiSyncData = (com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                pr.z zVar = pr.k0.f357723q;
                if (emojiSyncLoaderIPC$EmojiSyncData == null) {
                    return;
                }
                if (emojiSyncLoaderIPC$EmojiSyncData.f64925d == 1) {
                    pr.b1 a17 = zVar.a(false);
                    q0Var = a17 instanceof pr.q0 ? (pr.q0) a17 : null;
                    if (q0Var != null) {
                        q0Var.h(emojiSyncLoaderIPC$EmojiSyncData);
                        return;
                    }
                    return;
                }
                pr.b1 b17 = zVar.b(false);
                q0Var = b17 instanceof pr.q0 ? (pr.q0) b17 : null;
                if (q0Var != null) {
                    q0Var.h(emojiSyncLoaderIPC$EmojiSyncData);
                }
            }
        }
    }
}
