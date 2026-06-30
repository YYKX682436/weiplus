package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class n0 extends lr.y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI, lr.z zVar) {
        super(zVar);
        this.f98097b = emojiCustomUI;
    }

    @Override // lr.y, ir.l0
    public void a(int i17, int i18) {
        super.a(i17, i18);
    }

    @Override // ir.d0
    public void b(ir.k0 data) {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98097b;
        if (emojiCustomUI.H) {
            return;
        }
        kotlin.jvm.internal.o.g(data, "data");
        this.f320612a.E(data.b());
        emojiCustomUI.e7();
    }
}
