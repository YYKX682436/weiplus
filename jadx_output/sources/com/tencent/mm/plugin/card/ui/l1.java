package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class l1 implements lu1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95063d;

    public l1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI) {
        this.f95063d = cardGiftReceiveUI;
    }

    @Override // lu1.b
    public void I1(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "CDN  download success! fieldId:" + str);
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95063d;
        if (cardGiftReceiveUI.f94822f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "CDN  download cardGiftInfo is null return!");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(cardGiftReceiveUI.f94822f.f94652i) || !str.equals(cardGiftReceiveUI.f94822f.f94652i)) {
            cardGiftReceiveUI.Y.post(new com.tencent.mm.plugin.card.ui.k1(this, str, str2));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "CDN  download fromUserContentVideoUrl! return");
        }
    }

    @Override // lu1.b
    public void J(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "CDN download pic failure! fieldId:" + str);
    }

    @Override // lu1.b
    public void g2(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95063d;
        if (cardGiftReceiveUI.f94822f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress cardGiftInfo is null return!");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(cardGiftReceiveUI.f94822f.f94652i) || !str.equals(cardGiftReceiveUI.f94822f.f94652i)) {
            cardGiftReceiveUI.Y.post(new com.tencent.mm.plugin.card.ui.j1(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress fromUserContentVideoUrl return!");
        }
    }
}
