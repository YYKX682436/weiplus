package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes11.dex */
public class l0 implements android.os.MessageQueue.IdleHandler {
    public l0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI) {
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "now try to activity the tools process");
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        return false;
    }
}
