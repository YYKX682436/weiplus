package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public class s0 extends i95.w implements com.tencent.mm.feature.emoji.api.y5 {
    public void Ai(java.lang.String str, com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.storage.f9 f9Var) {
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().Y(str, (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, f9Var, null, iEmojiInfo != null ? iEmojiInfo.c0().ordinal() : 0);
    }

    public boolean wi(android.content.Context context, com.tencent.mm.api.IEmojiInfo iEmojiInfo, int i17, java.lang.String str) {
        return ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().U(context, iEmojiInfo, i17, str);
    }
}
