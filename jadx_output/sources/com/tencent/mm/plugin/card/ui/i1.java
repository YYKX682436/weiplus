package com.tencent.mm.plugin.card.ui;

/* loaded from: classes9.dex */
public class i1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95026d;

    public i1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI) {
        this.f95026d = cardGiftReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95026d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = cardGiftReceiveUI.f94823g;
        if (u3Var != null && u3Var.isShowing()) {
            cardGiftReceiveUI.f94823g.dismiss();
        }
        if (cardGiftReceiveUI.getContentView().getVisibility() == 8 || cardGiftReceiveUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "user cancel & finish");
            cardGiftReceiveUI.finish();
        }
    }
}
