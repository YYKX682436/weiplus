package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.g2 f98043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f98044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f98046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.emoji.ui.g2 g2Var, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f98043d = g2Var;
        this.f98044e = bitmap;
        this.f98045f = multiEmojiEditorActivity;
        this.f98046g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.ui.g5(this.f98043d, this.f98044e, this.f98045f, this.f98046g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.emoji.ui.g5 g5Var = (com.tencent.mm.plugin.emoji.ui.g5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f98043d.f98038j = this.f98044e;
        com.tencent.mm.plugin.emoji.ui.x4 x4Var = this.f98045f.G;
        if (x4Var != null) {
            x4Var.notifyItemChanged(this.f98046g);
        }
        return jz5.f0.f302826a;
    }
}
