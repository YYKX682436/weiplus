package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes14.dex */
public class r extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity f98174a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity emojiBaseActivity, xu5.b bVar) {
        super(bVar);
        this.f98174a = emojiBaseActivity;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f98174a.T6(message);
    }
}
