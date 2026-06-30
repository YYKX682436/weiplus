package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class MobileRemittanceCaseCallBack implements com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback {
    private com.tencent.kinda.framework.sns_cross.SnsServiceBean mBean;

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        android.content.Context context = this.mBean.getContext();
        if (context instanceof com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI) {
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = (com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI) context;
            if (iTransmitKvData.getString("closeLoading").equals("1")) {
                mobileRemittanceUI.hideProgress();
                return;
            }
            int i17 = iTransmitKvData.getInt("retcode") == 1 ? -1 : 0;
            mobileRemittanceUI.hideProgress();
            mobileRemittanceUI.hideLoading();
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "resultCode :%s", java.lang.Integer.valueOf(i17));
            if (i17 == -1) {
                android.content.Intent intent = mobileRemittanceUI.V;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mobileRemittanceUI, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "onMobileRemittanceResult", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mobileRemittanceUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mobileRemittanceUI, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI", "onMobileRemittanceResult", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback
    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mBean = new com.tencent.kinda.framework.sns_cross.SnsServiceBean(context, payInfo);
    }
}
