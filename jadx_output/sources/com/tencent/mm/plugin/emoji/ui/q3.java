package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader f98170d;

    public q3(com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader) {
        this.f98170d = emojiStoreVpHeader;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader emojiStoreVpHeader = this.f98170d;
        i12.c0 c0Var = emojiStoreVpHeader.f97849i;
        if (c0Var == null || (linkedList = emojiStoreVpHeader.f97847g) == null) {
            return;
        }
        java.util.LinkedList linkedList2 = c0Var.f287195e;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        c0Var.notifyDataSetChanged();
    }
}
