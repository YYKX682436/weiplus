package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardAcceptCardListUI f95007d;

    public g(com.tencent.mm.plugin.card.ui.CardAcceptCardListUI cardAcceptCardListUI) {
        this.f95007d = cardAcceptCardListUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.M;
        this.f95007d.U6(2);
    }
}
