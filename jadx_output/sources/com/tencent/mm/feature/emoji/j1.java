package com.tencent.mm.feature.emoji;

@j95.b(dependencies = {com.tencent.mm.feature.emoji.g1.class})
/* loaded from: classes12.dex */
public final class j1 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = com.tencent.mm.emoji.sync.EmojiUpdateReceiver.f64930a;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Emoji_Update");
        if (fp.h.a(33)) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(new com.tencent.mm.emoji.sync.EmojiUpdateReceiver(), intentFilter);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(new com.tencent.mm.emoji.sync.EmojiUpdateReceiver(), intentFilter, 4);
        }
    }
}
