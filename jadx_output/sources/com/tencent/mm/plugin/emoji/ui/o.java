package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98103d;

    public o(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f98103d = emojiAddCustomDialogUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98103d;
        emojiAddCustomDialogUI.setResult(2);
        emojiAddCustomDialogUI.finish();
    }
}
