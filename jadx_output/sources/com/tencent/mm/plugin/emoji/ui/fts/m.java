package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class m implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98022a;

    public m(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98022a = fTSEmojiDetailPageUI;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "imageLoaderListener onImageLoadComplete %s", str);
        if (bitmap == null || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof java.lang.String)) {
            return;
        }
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98022a;
        if (str.equals(fTSEmojiDetailPageUI.f97999q.field_encrypturl)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(objArr[0].toString());
            if (r6Var.m()) {
                fTSEmojiDetailPageUI.f97999q.field_md5 = com.tencent.mm.vfs.w6.p(r6Var.u());
                fTSEmojiDetailPageUI.f98001s = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", fTSEmojiDetailPageUI.f97999q.field_md5);
                com.tencent.mm.vfs.w6.c(r6Var.o(), fTSEmojiDetailPageUI.f98001s);
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.emoji.ui.fts.l(this));
            }
        }
    }
}
