package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KTransferPayServiceImpl implements com.tencent.kinda.gen.KTransferPayService {
    private static final java.lang.String TAG = "MicroMsg.KTransferPayServiceImpl";
    private com.tencent.kinda.gen.VoidCallback mCheckSurnameCancelCallBack = null;
    private com.tencent.kinda.gen.VoidStringCallback mCheckSurnameConfirmCallBack = null;
    private com.tencent.kinda.gen.VoidCallback mCheckAmountCancelCallBack = null;
    private com.tencent.kinda.gen.VoidI64Callback mCheckAmountConfirmCallBack = null;
    private com.tencent.mm.sdk.event.IListener mLargeMoneyListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.app.KTransferPayServiceImpl.2
        {
            this.__eventId = -84556123;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent remittanceLargeMoneyPayEvent) {
            am.rq rqVar;
            if (remittanceLargeMoneyPayEvent != null && (rqVar = remittanceLargeMoneyPayEvent.f54676g) != null) {
                if (com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mCheckAmountConfirmCallBack == null) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KTransferPayServiceImpl.TAG, "mCheckAmountConfirmCallBack == null");
                    return false;
                }
                com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mCheckAmountConfirmCallBack.call((int) java.lang.Math.round(rqVar.f7835b * 100.0d));
                com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mLargeMoneyListener.dead();
                return true;
            }
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KTransferPayServiceImpl.TAG, "event == null || event.data == null");
            return false;
        }
    };

    @Override // com.tencent.kinda.gen.KTransferPayService
    public void startTransferCheckAmountImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidI64Callback voidI64Callback) {
        com.tencent.mars.xlog.Log.i(TAG, "startTransferCheckAmountImpl");
        this.mCheckAmountConfirmCallBack = voidI64Callback;
        this.mCheckAmountCancelCallBack = voidCallback;
        java.lang.String string = iTransmitKvData.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String string2 = iTransmitKvData.getString("sub_title");
        java.lang.String string3 = iTransmitKvData.getString("prepay_page_payee");
        java.lang.String string4 = iTransmitKvData.getString("receiver_username");
        java.lang.String string5 = iTransmitKvData.getString("displayname_with_true_name");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_amount_remind_bit", 4);
        intent.putExtra("key_title", string);
        this.mLargeMoneyListener.alive();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string4);
            string5 = q17 != null ? com.tencent.mm.wallet_core.ui.r1.H(q17.g2()) : "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2) && !com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
            intent.putExtra("key_desc", string2.replace("${receiver_name}", string5));
        }
        intent.putExtra("key_display_name", string3);
        intent.putExtra("key_place_attach", "");
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        intent.setClass(topOrUIPageFragmentActivity, com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI.class);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477886ea);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477889ed);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(7);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(topOrUIPageFragmentActivity, arrayList.toArray(), "com/tencent/kinda/framework/app/KTransferPayServiceImpl", "startTransferCheckAmountImpl", "(Lcom/tencent/kinda/gen/ITransmitKvData;Lcom/tencent/kinda/gen/VoidCallback;Lcom/tencent/kinda/gen/VoidI64Callback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.tencent.kinda.gen.KTransferPayService
    public void startTransferCheckSurnameImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "startTransferCheckSurnameImpl");
        java.lang.String string = iTransmitKvData.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String string2 = iTransmitKvData.getString("sub_title");
        java.lang.String string3 = iTransmitKvData.getString("display_name");
        java.lang.String string4 = iTransmitKvData.getString("confirm_button_text");
        java.lang.String string5 = iTransmitKvData.getString("cancel_button_text");
        r45.o10 o10Var = new r45.o10();
        o10Var.f381810d = string;
        o10Var.f381811e = string2;
        o10Var.f381812f = string3;
        this.mCheckSurnameCancelCallBack = voidCallback;
        this.mCheckSurnameConfirmCallBack = voidStringCallback;
        final android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity instanceof com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI) {
            new com.tencent.mm.plugin.remittance.ui.b0(topOrUIPageFragmentActivity).a(0, "", o10Var, new com.tencent.mm.plugin.remittance.ui.a0() { // from class: com.tencent.kinda.framework.app.KTransferPayServiceImpl.1
                @Override // com.tencent.mm.plugin.remittance.ui.a0
                public void onCancel() {
                    if (com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mCheckSurnameCancelCallBack != null) {
                        com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mCheckSurnameCancelCallBack.call();
                        android.app.Activity activity = topOrUIPageFragmentActivity;
                        if (activity instanceof com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI) {
                            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = (com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI) activity;
                            remittanceNewBaseUI.f157459q.p();
                            remittanceNewBaseUI.showNormalStWcKb();
                        }
                    }
                }

                @Override // com.tencent.mm.plugin.remittance.ui.a0
                public void onINputName(java.lang.String str) {
                    if (com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mCheckSurnameConfirmCallBack != null) {
                        com.tencent.kinda.framework.app.KTransferPayServiceImpl.this.mCheckSurnameConfirmCallBack.call(str);
                    }
                }
            }, string4, string5);
        }
    }

    @Override // com.tencent.kinda.gen.KTransferPayService
    public void stopTransferCheckAmount() {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity instanceof com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI) {
            topOrUIPageFragmentActivity.finish();
        }
    }
}
