package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaWalletMixManagerImpl implements com.tencent.kinda.gen.KindaWalletMixManager {
    private static final java.lang.String TAG = "KindaWalletMixManagerImpl";
    private com.tencent.kinda.gen.VoidCallback mCancelCallback;
    private com.tencent.kinda.gen.VoidITransmitKvDataCallback mSuccessCallback;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent> mWalletPayResultEventIListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.1
        {
            this.__eventId = 520089918;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
            int i17 = walletPayResultEvent.f54965g.f7863c;
            if (i17 == 0) {
                if (com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mCancelCallback != null) {
                    com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mWalletPayResultEventIListener.dead();
                    com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mCancelCallback.call();
                }
            } else if (i17 == -1 && com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mSuccessCallback != null) {
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                android.content.Intent intent = walletPayResultEvent.f54965g.f7861a;
                if (intent != null) {
                    create.putBool("is_jsapi_close_page", "1".equals(intent.getStringExtra("is_jsapi_close_page")));
                }
                com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mWalletPayResultEventIListener.dead();
                com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mSuccessCallback.call(create);
            }
            com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.this.mWalletPayResultEventIListener.dead();
            return false;
        }
    };

    private r45.v67 genWalletMixSpGenPrePayRespFromUrl(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (android.text.TextUtils.isEmpty(str) || iTransmitKvData == null) {
            return null;
        }
        r45.v67 v67Var = new r45.v67();
        v67Var.f387953d = str;
        v67Var.f387955f = false;
        v67Var.f387956g = "";
        v67Var.f387954e = null;
        if (iTransmitKvData.getBool("hasCallbackRetryConf")) {
            r45.ws wsVar = new r45.ws();
            v67Var.f387954e = wsVar;
            wsVar.f389408e = iTransmitKvData.getInt("maxCount");
            v67Var.f387954e.f389407d = iTransmitKvData.getInt("intevalTime");
            v67Var.f387954e.f389409f = iTransmitKvData.getString("defaultWording");
        }
        return v67Var;
    }

    @Override // com.tencent.kinda.gen.KindaWalletMixManager
    public void startWalletMixUseCaseImpl(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2) {
        r45.v67 genWalletMixSpGenPrePayRespFromUrl = genWalletMixSpGenPrePayRespFromUrl(str, iTransmitKvData);
        if (genWalletMixSpGenPrePayRespFromUrl != null && !com.tencent.mm.sdk.platformtools.t8.K0(genWalletMixSpGenPrePayRespFromUrl.f387953d)) {
            android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
            if (topOrUIPageFragmentActivity == null) {
                com.tencent.mars.xlog.Log.e(TAG, "KindaWalletMixManagerImpl startWalletMixUseCaseImpl() KindaContext.getTopOrUIPageFragmentActivity() return null!");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("prepayId", iTransmitKvData.getString("prepayId"));
            intent.putExtra("is_jsapi_offline_pay", false);
            intent.putExtra("pay_gate_url", genWalletMixSpGenPrePayRespFromUrl.f387953d);
            intent.putExtra("need_dialog", genWalletMixSpGenPrePayRespFromUrl.f387955f);
            intent.putExtra("dialog_text", genWalletMixSpGenPrePayRespFromUrl.f387956g);
            r45.ws wsVar = genWalletMixSpGenPrePayRespFromUrl.f387954e;
            if (wsVar != null) {
                intent.putExtra("max_count", wsVar.f389408e);
                intent.putExtra("inteval_time", genWalletMixSpGenPrePayRespFromUrl.f387954e.f389407d);
                intent.putExtra("default_wording", genWalletMixSpGenPrePayRespFromUrl.f387954e.f389409f);
            }
            j45.l.k(topOrUIPageFragmentActivity, "wallet_core", ".ui.WalletMixOrderInfoUI", intent, true);
        }
        this.mSuccessCallback = voidITransmitKvDataCallback;
        this.mCancelCallback = voidCallback;
        this.mWalletPayResultEventIListener.alive();
    }
}
