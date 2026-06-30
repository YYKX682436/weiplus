package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public class w2 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiPaidUI f98532a;

    public w2(com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI) {
        this.f98532a = emojiPaidUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_action_type", 200002);
        com.tencent.mm.plugin.emoji.ui.EmojiPaidUI emojiPaidUI = this.f98532a;
        j45.l.n(emojiPaidUI, "wallet_index", ".ui.WalletIapUI", intent, 2001);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiPaidUI", "[showMenuDialog] startActivityForResult ui.WalletIapUI");
        emojiPaidUI.o7();
    }
}
