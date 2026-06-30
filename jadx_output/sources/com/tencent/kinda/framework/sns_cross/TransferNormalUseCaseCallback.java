package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class TransferNormalUseCaseCallback implements com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback {
    private com.tencent.kinda.framework.sns_cross.SnsServiceBean mBean;

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        android.content.Context context = this.mBean.getContext();
        if ("1".equals(iTransmitKvData.getString("closeLoading")) && (context instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI)) {
            if (context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI) {
                ((com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI) context).hideProgress();
                return;
            } else {
                ((com.tencent.mm.wallet_core.ui.WalletBaseUI) context).hideLoading();
                return;
            }
        }
        if (iTransmitKvData.getBool("clear_input_amount") && (context instanceof com.tencent.mm.plugin.remittance.ui.RemittanceUI)) {
            ((com.tencent.mm.plugin.remittance.ui.RemittanceUI) context).f157459q.d();
        }
        java.lang.String string = iTransmitKvData.getString(ya.b.TRANSACTION_ID);
        int payScene = this.mBean.getPayScene();
        int i17 = iTransmitKvData.getInt("retcode");
        long j17 = iTransmitKvData.getLong("total_fee");
        int i18 = iTransmitKvData.getInt("action");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(iTransmitKvData.getBool("from_wallet_mix"));
        com.tencent.mars.xlog.Log.i("TransferNormalUseCaseCallback", "call: retCode is :" + i17 + ", action is :" + i18 + ", fromWalletMix is :" + valueOf);
        com.tencent.mm.autogen.events.F2fPayCheckEvent f2fPayCheckEvent = new com.tencent.mm.autogen.events.F2fPayCheckEvent();
        java.lang.String string2 = iTransmitKvData.getString("req_key");
        am.g9 g9Var = f2fPayCheckEvent.f54224g;
        g9Var.f6743a = string2;
        if (payScene == 31 || payScene == 82) {
            g9Var.getClass();
        } else if (payScene == 32 || payScene == 33 || payScene == 65) {
            g9Var.getClass();
        }
        if (payScene != 31 && payScene != 82) {
            g9Var.f6746d = i17;
        } else if (i17 == 1 && i18 == 1) {
            if (valueOf.booleanValue()) {
                g9Var.f6746d = 3;
            } else {
                g9Var.f6746d = 1;
            }
        } else if (i17 == 1 && i18 == 2) {
            g9Var.f6746d = 2;
        } else if (valueOf.booleanValue() && (i17 == -1 || i17 == -2)) {
            g9Var.f6746d = 4;
            g9Var.f6748f = iTransmitKvData.getBool("has_try_hkpay");
        }
        g9Var.f6744b = string;
        g9Var.f6745c = true;
        g9Var.f6747e = context.hashCode();
        f2fPayCheckEvent.e();
        if (payScene == 31) {
            return;
        }
        com.tencent.mm.autogen.events.BusiF2fPaySuccEvent busiF2fPaySuccEvent = new com.tencent.mm.autogen.events.BusiF2fPaySuccEvent();
        java.lang.String string3 = iTransmitKvData.getString("req_key");
        am.e1 e1Var = busiF2fPaySuccEvent.f54014g;
        e1Var.f6516a = string3;
        e1Var.f6517b = string;
        e1Var.f6519d = i17;
        e1Var.f6520e = j17 / 100.0d;
        e1Var.f6518c = true;
        e1Var.f6521f = iTransmitKvData.getInt("pay_fail_reason");
        e1Var.f6524i = this.mBean.getAppId();
        e1Var.f6522g = iTransmitKvData.getInt("pay_succ_action");
        e1Var.f6523h = this.mBean.getChannel();
        busiF2fPaySuccEvent.e();
    }

    @Override // com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback
    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mBean = new com.tencent.kinda.framework.sns_cross.SnsServiceBean(context, payInfo);
    }
}
