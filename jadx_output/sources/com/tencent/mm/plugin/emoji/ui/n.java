package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class n implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98096d;

    public n(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f98096d = emojiAddCustomDialogUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98096d;
        emojiAddCustomDialogUI.setResult(1);
        emojiAddCustomDialogUI.finish();
    }
}
