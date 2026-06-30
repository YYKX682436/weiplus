package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f66383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f66384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f66386g;

    public m3(com.tencent.mm.ui.widget.dialog.f4 f4Var, boolean z17, android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f66383d = f4Var;
        this.f66384e = z17;
        this.f66385f = context;
        this.f66386g = emojiInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f66383d.dismiss();
        if (this.f66384e) {
            o22.i.c(this.f66385f, 6, this.f66386g.getMd5(), "");
        }
    }
}
