package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98020a;

    public k(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98020a = fTSEmojiDetailPageUI;
    }

    @Override // com.tencent.mm.feature.emoji.api.q5
    public void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        if (iEmojiInfo == null || !z17 || (emojiInfo = (fTSEmojiDetailPageUI = this.f98020a).f97999q) == null || !emojiInfo.getMd5().equals(iEmojiInfo.getMd5())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "somethings error.");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiServiceCallback onDownload %s", fTSEmojiDetailPageUI.f97999q.getMd5());
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.emoji.ui.fts.j(this));
        }
    }
}
