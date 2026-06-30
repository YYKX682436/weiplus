package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes9.dex */
public final class f2 extends i95.w implements com.tencent.mm.feature.emoji.api.i6 {
    public void wi(long j17) {
        qr.a0 a0Var = qr.a0.f365999a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadManager", "addUploadTask: " + j17);
        com.tencent.mm.storage.emotion.EmojiInfo p17 = com.tencent.mm.storage.n5.f().c().p1(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addUploadTask: ");
        sb6.append(p17 != null ? p17.getMd5() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadManager", sb6.toString());
        if (p17 != null) {
            a0Var.a(p17);
        }
    }
}
