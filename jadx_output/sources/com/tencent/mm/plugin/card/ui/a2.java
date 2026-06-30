package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class a2 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f94928a;

    public a2(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI) {
        this.f94928a = cardGiftVideoUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.card.ui.z1(this));
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
    }
}
