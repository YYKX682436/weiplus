package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class x implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98551a;

    public x(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98551a = emojiCustomUI;
    }

    @Override // dr.r
    public void a(int i17, com.tencent.mm.api.IEmojiInfo iEmojiInfo, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f98551a.I.setImageBitmap(bitmap);
        }
    }
}
