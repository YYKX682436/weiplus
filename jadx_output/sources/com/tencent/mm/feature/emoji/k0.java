package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes.dex */
public class k0 extends i95.w implements com.tencent.mm.feature.emoji.api.v5 {
    public com.tencent.mm.api.IEmojiInfo Ai() {
        return new com.tencent.mm.storage.emotion.EmojiInfo();
    }

    public com.tencent.mm.api.IEmojiInfo Bi(java.lang.String str) {
        return com.tencent.mm.storage.n5.f().c().u1(str);
    }

    public com.tencent.mm.api.IEmojiInfo wi(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        return com.tencent.mm.storage.n5.f().c().L0((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, true);
    }
}
