package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class l0 extends com.tencent.mm.plugin.emoji.model.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98081e;

    public l0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98081e = emojiCustomUI;
    }

    @Override // ir.t0
    public void h() {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98081e;
        if (emojiCustomUI.H || this.f293903c == null) {
            return;
        }
        com.tencent.mm.plugin.emoji.model.e eVar = new com.tencent.mm.plugin.emoji.model.e();
        androidx.recyclerview.widget.c0 c17 = c(emojiCustomUI.f97700f.f320619f, eVar.f97543a);
        this.f97542d = eVar;
        d(eVar, c17);
    }
}
