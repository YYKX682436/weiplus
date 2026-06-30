package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.AnonymousClass2 f98407d;

    public w(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.AnonymousClass2 anonymousClass2) {
        this.f98407d = anonymousClass2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.this.f98297w.notifyDataSetInvalidated();
    }
}
