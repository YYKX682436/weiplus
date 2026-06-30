package com.tencent.mm.plugin.card.ui;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftAcceptUI f95160d;

    public t0(com.tencent.mm.plugin.card.ui.CardGiftAcceptUI cardGiftAcceptUI) {
        this.f95160d = cardGiftAcceptUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.card.ui.CardGiftAcceptUI cardGiftAcceptUI = this.f95160d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = cardGiftAcceptUI.f94801y;
        if (u3Var != null && u3Var.isShowing()) {
            cardGiftAcceptUI.f94801y.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftAcceptUI", "user cancel & finish");
        cardGiftAcceptUI.finish();
    }
}
