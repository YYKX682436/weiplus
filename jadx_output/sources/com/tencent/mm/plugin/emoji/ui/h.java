package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98047d;

    public h(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f98047d = emojiAddCustomDialogUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98047d;
        java.lang.String string = emojiAddCustomDialogUI.getString(com.tencent.mm.R.string.f491118c03);
        int i17 = com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI.L;
        if (emojiAddCustomDialogUI.isFinishing()) {
            return;
        }
        emojiAddCustomDialogUI.f97675q = db5.e1.Q(emojiAddCustomDialogUI, emojiAddCustomDialogUI.getString(com.tencent.mm.R.string.f490573yv), string, true, true, new com.tencent.mm.plugin.emoji.ui.p(emojiAddCustomDialogUI));
    }
}
