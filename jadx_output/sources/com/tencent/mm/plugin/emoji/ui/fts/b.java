package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98011d;

    public b(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98011d = fTSEmojiDetailPageUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98011d;
        fTSEmojiDetailPageUI.f97996n = null;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            fTSEmojiDetailPageUI.getClass();
            gm0.j1.e().j(new com.tencent.mm.plugin.emoji.ui.fts.c(fTSEmojiDetailPageUI));
            return;
        }
        if (itemId != 2) {
            return;
        }
        fTSEmojiDetailPageUI.getClass();
        ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).wi(fTSEmojiDetailPageUI.f98003u, fTSEmojiDetailPageUI.f98004v, fTSEmojiDetailPageUI.f98006x, 5, 0, 0, fTSEmojiDetailPageUI.f98005w);
        com.tencent.mm.sdk.platformtools.m2.d();
        java.lang.String str = fTSEmojiDetailPageUI.getString(com.tencent.mm.R.string.ffk) + com.tencent.mm.sdk.platformtools.m2.d();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, fTSEmojiDetailPageUI.getString(com.tencent.mm.R.string.byh));
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        j45.l.j(fTSEmojiDetailPageUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}
