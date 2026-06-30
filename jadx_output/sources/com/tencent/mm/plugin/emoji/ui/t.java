package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class t extends m22.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98191b;

    public t(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98191b = emojiCustomUI;
    }

    @Override // m22.s
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "onMove(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98191b;
        java.util.ArrayList arrayList = new java.util.ArrayList(emojiCustomUI.f97700f.f320619f);
        if (i18 >= 0) {
            emojiCustomUI.f97699e.performHapticFeedback(1);
        }
        if (i17 < 0 && i18 >= 0) {
            arrayList.add(i18, emojiCustomUI.T);
            emojiCustomUI.f97700f.E(arrayList);
            emojiCustomUI.f97700f.notifyItemInserted(i18);
        } else if (i18 < 0) {
            int indexOf = arrayList.indexOf(emojiCustomUI.T);
            if (arrayList.remove(emojiCustomUI.T)) {
                emojiCustomUI.f97700f.E(arrayList);
                emojiCustomUI.f97700f.notifyItemRemoved(indexOf);
            }
        } else {
            arrayList.add(i18, (ir.u0) arrayList.remove(i17));
            emojiCustomUI.f97700f.E(arrayList);
            emojiCustomUI.f97700f.notifyItemMoved(i17, i18);
        }
        m22.e eVar = emojiCustomUI.f97716x;
        boolean z17 = i18 == arrayList.size() - 1;
        eVar.f323042m = z17;
        eVar.f323036d.D0();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFreeSortingItemDec", "set showLastDots: " + z17);
    }
}
