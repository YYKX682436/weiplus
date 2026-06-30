package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f97890d;

    public a0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f97890d = emojiCustomUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f97890d;
        java.util.ArrayList arrayList = emojiCustomUI.f97711s;
        objArr[0] = java.lang.Integer.valueOf(arrayList == null ? 0 : arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "deleteEmoji mSelectedList size:%d", objArr);
        java.util.ArrayList arrayList2 = emojiCustomUI.f97711s;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiCustomUI", "empty seleted list");
            return;
        }
        emojiCustomUI.f97707p = db5.e1.Q(emojiCustomUI, emojiCustomUI.getString(com.tencent.mm.R.string.f490573yv), emojiCustomUI.getString(com.tencent.mm.R.string.bvs), true, true, new com.tencent.mm.plugin.emoji.ui.f0(emojiCustomUI));
        java.util.ArrayList arrayList3 = emojiCustomUI.f97711s;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Integer.valueOf(arrayList3 == null ? 0 : arrayList3.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "deleteSyncEmoji list size:%d", objArr2);
        if (arrayList3 == null || arrayList3.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "empty size.");
        } else {
            gm0.j1.n().f273288b.g(new z12.g(emojiCustomUI.f97712t, 2, com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.T6(emojiCustomUI.f97711s), null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "touchBatchEmojiBackup over emoji size. need touch :%b", java.lang.Boolean.FALSE);
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(emojiCustomUI) || (n3Var = emojiCustomUI.S) == null) {
            return;
        }
        n3Var.sendEmptyMessageDelayed(1003, 0);
    }
}
