package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public final class x implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f97608a;

    public x(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f97608a = emojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiLogic", "onResult: " + z17);
        com.tencent.mm.plugin.emoji.model.c.f97541a.a(z17, this.f97608a);
    }
}
