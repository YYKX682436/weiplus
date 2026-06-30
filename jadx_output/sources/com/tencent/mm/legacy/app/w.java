package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.splash.c f68526a = new com.tencent.mm.legacy.app.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f68527b;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f68527b = hashSet;
        hashSet.addAll(java.util.Arrays.asList("com.tencent.mm.plugin.card.ui.CardHomePageUI", "com.tencent.mm.plugin.card.ui.CardHomePageNewUI", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI", "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI", "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", "com.tencent.mm.ui.chatting.ChattingUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsUI", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "com.tencent.mm.plugin.readerapp.ui.ReaderAppUI", "com.tencent.mm.ui.SingleChatInfoUI", "com.tencent.mm.plugin.sns.ui.SnsUploadUI", "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI", "com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI", "com.tencent.mm.chatroom.ui.ChatroomInfoUI"));
    }

    public static boolean a(boolean z17) {
        if (!((km0.c) gm0.j1.p().a()).a()) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PreventAccountNotReady", "not main process");
            }
            return true;
        }
        if (!gm0.j1.i().f273218k || !gm0.j1.b().m()) {
            return false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreventAccountNotReady", "account hasInitialized");
        }
        return true;
    }
}
