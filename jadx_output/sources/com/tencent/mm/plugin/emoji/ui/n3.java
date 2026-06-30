package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class n3 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI f98100a;

    public n3(com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI emojiStoreTopicUI) {
        this.f98100a = emojiStoreTopicUI;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mm.plugin.emoji.ui.s sVar = this.f98100a.f97695e;
        if (sVar != null) {
            sVar.sendEmptyMessage(1009);
        }
    }
}
