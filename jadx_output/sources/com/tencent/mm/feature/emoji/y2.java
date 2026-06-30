package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class y2 implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f66554b;

    public y2(com.tencent.mm.feature.emoji.c4 c4Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f66553a = c4Var;
        this.f66554b = emojiInfo;
    }

    @Override // qr.i
    public final void onResult(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f66553a.f66207d, "async EmojiUploadCheck: errType=" + i17 + ", md5=" + this.f66554b.getMd5() + ", gifMd5=" + str);
    }
}
