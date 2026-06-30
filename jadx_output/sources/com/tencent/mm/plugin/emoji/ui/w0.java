package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI f98530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI) {
        super(2);
        this.f98530d = emojiDesignerPackInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = (java.util.List) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI = this.f98530d;
        java.lang.String str = emojiDesignerPackInfoUI.f97744d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateView: ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", ");
        sb6.append(booleanValue);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) emojiDesignerPackInfoUI.f97745e).getValue()).post(new com.tencent.mm.plugin.emoji.ui.v0(booleanValue, emojiDesignerPackInfoUI, list));
        return jz5.f0.f302826a;
    }
}
