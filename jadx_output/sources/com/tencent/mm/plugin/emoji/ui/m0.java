package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class m0 extends com.tencent.mm.plugin.emoji.model.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI, boolean z17) {
        super(z17);
        this.f98089f = emojiCustomUI;
    }

    @Override // ir.t0
    public void h() {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98089f;
        if (emojiCustomUI.H || this.f293903c == null) {
            return;
        }
        com.tencent.mm.plugin.emoji.model.g gVar = new com.tencent.mm.plugin.emoji.model.g(this.f97545d);
        androidx.recyclerview.widget.c0 c17 = c(emojiCustomUI.f97700f.f320619f, gVar.f97547a);
        this.f97546e = gVar;
        d(gVar, c17);
    }
}
