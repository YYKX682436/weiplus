package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f98567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(yz5.l lVar, com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity) {
        super(1);
        this.f98566d = lVar;
        this.f98567e = multiEmojiEditorActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o12.u uVar = (o12.u) obj;
        yz5.l lVar = this.f98566d;
        if (lVar != null) {
            lVar.invoke(uVar);
        }
        com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity.o7(this.f98567e);
        return jz5.f0.f302826a;
    }
}
