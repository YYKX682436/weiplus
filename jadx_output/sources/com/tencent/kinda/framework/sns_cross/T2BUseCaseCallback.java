package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class T2BUseCaseCallback implements com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback {
    private static final int REQ_DETAIL = 2;
    private com.tencent.kinda.framework.sns_cross.SnsServiceBean mBean;

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.kinda.framework.sns_cross.SnsServiceBean snsServiceBean;
        android.os.Bundle bundle;
        android.content.Context context = this.mBean.getContext();
        if (context instanceof com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI) {
            android.app.Activity activity = (android.app.Activity) context;
            if (iTransmitKvData.getString("closeLoading").equals("1")) {
                ((com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI) activity).hideLoading();
                return;
            }
            int i17 = iTransmitKvData.getInt("retcode");
            java.lang.String string = iTransmitKvData.getString(ya.b.TRANSACTION_ID);
            if (i17 != 1 || (snsServiceBean = this.mBean) == null || snsServiceBean.getPayInfo() == null || (bundle = this.mBean.getPayInfo().f192122u) == null) {
                return;
            }
            java.lang.String string2 = bundle.getString("key_transfer_bill_id");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI.class);
            intent.putExtra("key_transfer_transaction_id", string);
            intent.putExtra("key_transfer_bill_id", string2);
            intent.putExtra("key_enter_scene", 0);
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI) activity;
            bankRemitMoneyInputUI.startActivityForResult(intent, 2);
            java.lang.String stringExtra = intent.getStringExtra("key_transfer_transaction_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", bankRemitMoneyInputUI.f156513J, stringExtra);
            bankRemitMoneyInputUI.doSceneProgress(new ow3.c(bankRemitMoneyInputUI.f156513J, stringExtra), false);
            bankRemitMoneyInputUI.L = 1;
            bankRemitMoneyInputUI.doSceneProgress(new ow3.l(bankRemitMoneyInputUI.f156513J, bankRemitMoneyInputUI.K, 1), false);
        }
    }

    @Override // com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback
    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mBean = new com.tencent.kinda.framework.sns_cross.SnsServiceBean(context, payInfo);
    }
}
