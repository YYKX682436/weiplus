package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class s3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader f98186a;

    public s3(com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader, com.tencent.mm.plugin.emoji.ui.q3 q3Var) {
        this.f98186a = emojiStoreVpHeader;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.emoji.ui.s3 s3Var;
        if (this.f98186a.f97853p || message.what == 0) {
            java.util.LinkedList linkedList = this.f98186a.f97847g;
            if (linkedList == null || linkedList.size() <= 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreVpHeader", "list is null");
                return;
            }
            com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader = this.f98186a;
            if (emojiStoreVpHeader.f97849i == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreVpHeader", "adapter is null");
                return;
            }
            int currentItem = emojiStoreVpHeader.f97845e.getCurrentItem() + 1;
            if (currentItem >= this.f98186a.f97849i.getCount()) {
                currentItem = (this.f98186a.f97847g.size() * 60) / 2;
            }
            this.f98186a.f97845e.setCurrentItem(currentItem);
            if (!this.f98186a.f97853p || (s3Var = this.f98186a.f97852o) == null) {
                return;
            }
            sendMessageDelayed(s3Var.obtainMessage(0), 5000L);
        }
    }
}
