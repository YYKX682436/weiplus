package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes5.dex */
public class s implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98395d;

    public s(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98395d = emojiStoreV2SingleProductUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98395d;
        if (emojiStoreV2SingleProductUI.M != null) {
            gm0.j1.n().f273288b.d(emojiStoreV2SingleProductUI.M);
        }
    }
}
