package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class a1 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f94927a;

    public a1(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI) {
        this.f94927a = cardGiftImageUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.card.ui.z0(this));
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
    }
}
