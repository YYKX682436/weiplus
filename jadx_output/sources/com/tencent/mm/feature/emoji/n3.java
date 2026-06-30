package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class n3 implements rr.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f66403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f66405c;

    public n3(com.tencent.mm.ui.widget.dialog.f4 f4Var, android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f66403a = f4Var;
        this.f66404b = context;
        this.f66405c = emojiInfo;
    }

    @Override // rr.o
    public void a(boolean z17) {
        com.tencent.thumbplayer.tmediacodec.util.ThreadManager.runOnUiThread(new com.tencent.mm.feature.emoji.m3(this.f66403a, z17, this.f66404b, this.f66405c));
    }
}
