package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class f3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiSortFragment f97974d;

    public f3(com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment) {
        this.f97974d = emojiSortFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.emoji.ui.EmojiSortFragment emojiSortFragment = this.f97974d;
        if (emojiSortFragment.f97832g != null) {
            gm0.j1.n().f273288b.d(emojiSortFragment.f97832g);
        }
    }
}
