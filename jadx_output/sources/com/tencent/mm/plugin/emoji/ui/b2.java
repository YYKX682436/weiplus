package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        super(1);
        this.f97900d = emojiEditorActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o12.u it = (o12.u) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97900d;
        emojiEditorActivity.f97767r.a(it);
        emojiEditorActivity.d7().setEnabled(false);
        emojiEditorActivity.n7(l12.a.f314983h);
        return jz5.f0.f302826a;
    }
}
