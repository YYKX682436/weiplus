package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes14.dex */
public class s extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity f98182a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity emojiBaseActivity, android.os.Looper looper) {
        super(looper);
        this.f98182a = emojiBaseActivity;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f98182a.U6(message);
    }
}
