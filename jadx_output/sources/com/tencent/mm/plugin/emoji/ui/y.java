package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class y implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f98561a;

    public y(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI, q80.d0 d0Var) {
        this.f98561a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "openLiteApp fail %s.", this.f98561a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "openLiteApp success %s.", this.f98561a.f360649a);
    }
}
