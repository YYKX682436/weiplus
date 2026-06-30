package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes8.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity f97891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f97891d = emojiEditorActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.ui.a1(this.f97891d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.emoji.ui.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity emojiEditorActivity = this.f97891d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = emojiEditorActivity.C;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        return db5.e1.i(emojiEditorActivity, com.tencent.mm.R.string.f491100bw5, com.tencent.mm.R.string.bw6);
    }
}
