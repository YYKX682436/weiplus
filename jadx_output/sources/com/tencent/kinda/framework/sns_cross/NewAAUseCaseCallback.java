package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class NewAAUseCaseCallback implements com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback {
    private com.tencent.kinda.framework.sns_cross.SnsServiceBean mBean;

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        android.content.Context context = this.mBean.getContext();
        if ("1".equals(iTransmitKvData.getString("closeLoading")) && (context instanceof com.tencent.mm.plugin.aa.ui.PaylistAAUI)) {
            ((com.tencent.mm.plugin.aa.ui.PaylistAAUI) context).hideLoading();
            return;
        }
        java.lang.String string = iTransmitKvData.getString(ya.b.TRANSACTION_ID);
        int i17 = iTransmitKvData.getInt("retcode") == 1 ? -1 : 0;
        if (context instanceof com.tencent.mm.plugin.aa.ui.PaylistAAUI) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_trans_id", string);
            ((com.tencent.mm.plugin.aa.ui.PaylistAAUI) context).m7(i17, intent);
        } else if (context instanceof com.tencent.mm.plugin.aa.ui.AARemittanceUI) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_trans_id", string);
            ((com.tencent.mm.plugin.aa.ui.AARemittanceUI) context).j7(i17, intent2);
        }
    }

    @Override // com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback
    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mBean = new com.tencent.kinda.framework.sns_cross.SnsServiceBean(context, payInfo);
    }
}
