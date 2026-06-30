package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98088d;

    public m(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f98088d = emojiAddCustomDialogUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (i17 == -2) {
            n22.c.a(5);
        }
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98088d;
        emojiAddCustomDialogUI.setResult(1);
        emojiAddCustomDialogUI.finish();
    }
}
