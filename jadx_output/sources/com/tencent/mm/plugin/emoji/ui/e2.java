package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity) {
        super(1);
        this.f97952d = emojiEditorActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o12.u uVar = (o12.u) obj;
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97952d;
        emojiEditorActivity.d7().setEnabled(true);
        if (uVar != null) {
            android.graphics.Rect rect = uVar.f342188f;
            if (rect.isEmpty()) {
                rect.set(emojiEditorActivity.b7().getInvisibleBounds());
            }
            emojiEditorActivity.d7().a(uVar);
        }
        android.view.ViewGroup viewGroup = emojiEditorActivity.f97764o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("textInputLayout");
            throw null;
        }
        emojiEditorActivity.hideVKB(viewGroup);
        emojiEditorActivity.n7(l12.a.f314981f);
        return jz5.f0.f302826a;
    }
}
