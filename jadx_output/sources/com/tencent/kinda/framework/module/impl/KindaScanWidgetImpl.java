package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaScanWidgetImpl implements com.tencent.kinda.gen.KScanWidget {
    private static final java.lang.String TAG = "KindaScanWidgetImpl";
    private boolean isDismissOnScanFinish = true;
    private com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.ScanWidgetLiteAppCallback liteAppCallback;
    private com.tencent.kinda.gen.VoidStringStringBinaryCallback mCallback;
    private com.tencent.mm.sdk.event.IListener mScanBankCardResultListener;
    private com.tencent.mm.sdk.event.IListener scanBankCardConfirmResultListener;

    /* loaded from: classes9.dex */
    public interface ScanWidgetLiteAppCallback {
        void onScanCallback(android.content.Intent intent);
    }

    public KindaScanWidgetImpl() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.scanBankCardConfirmResultListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent>(a0Var) { // from class: com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.1
            {
                this.__eventId = 582289590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent) {
                am.ps psVar = scanBankCardConfirmResultEvent.f54726g;
                if (psVar.f7657b == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(psVar.f7656a)) {
                    am.ps psVar2 = scanBankCardConfirmResultEvent.f54726g;
                    java.lang.String str = psVar2.f7656a;
                    android.graphics.Bitmap bitmap = psVar2.f7658c;
                    java.lang.String replaceAll = str.replaceAll("-", "").replaceAll(" ", "");
                    if (com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.mCallback != null) {
                        com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.mCallback.call(com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getEncryptDataWithHash(replaceAll), replaceAll, com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getBitmapByte(bitmap));
                    }
                    if (com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.liteAppCallback != null) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("cardNumber", com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getEncryptDataWithHash(replaceAll));
                        intent.putExtra("scanResult", replaceAll);
                        intent.putExtra("imageData", com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getBitmapByte(bitmap));
                        com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.liteAppCallback.onScanCallback(intent);
                    }
                }
                com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.scanBankCardConfirmResultListener.dead();
                return false;
            }
        };
        this.mScanBankCardResultListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanBankCardResultEvent>(a0Var) { // from class: com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.2
            {
                this.__eventId = 96068484;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(scanBankCardResultEvent.f54727g.f7741a)) {
                    am.qs qsVar = scanBankCardResultEvent.f54727g;
                    java.lang.String str = qsVar.f7741a;
                    android.graphics.Bitmap bitmap = qsVar.f7742b;
                    java.lang.String replaceAll = str.replaceAll("-", "").replaceAll(" ", "");
                    if (com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.mCallback != null) {
                        com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.mCallback.call(com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getEncryptDataWithHash(replaceAll), replaceAll, com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getBitmapByte(bitmap));
                    }
                    if (com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.liteAppCallback != null) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("cardNumber", com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getEncryptDataWithHash(replaceAll));
                        intent.putExtra("scanResult", replaceAll);
                        intent.putExtra("imageData", com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.getBitmapByte(bitmap));
                        com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.liteAppCallback.onScanCallback(intent);
                    }
                }
                com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.this.mScanBankCardResultListener.dead();
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getEncryptDataWithHash(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        encrypt.setTimeStamp(com.tencent.mm.wallet_core.model.f1.a());
        com.tencent.mm.wallet_core.b.a().g();
        return encrypt.encryptPasswdWithRSA2048(str);
    }

    @Override // com.tencent.kinda.gen.KScanWidget
    public void dismissOnScanFinish(boolean z17) {
        this.isDismissOnScanFinish = !z17;
    }

    public byte[] getBitmapByte(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (java.io.IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.tencent.kinda.gen.KScanWidget
    public void scan(java.lang.String str) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "KindaScanWidgetImpl scan() KindaContext.get() return null!");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", this.isDismissOnScanFinish);
        intent.putExtra("bank_card_owner", str);
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        j45.l.j(context, "scanner", ".ui.ScanCardUI", intent, null);
        this.scanBankCardConfirmResultListener.alive();
        this.mScanBankCardResultListener.alive();
    }

    @Override // com.tencent.kinda.gen.KScanWidget
    public void setHandlerImpl(com.tencent.kinda.gen.VoidStringStringBinaryCallback voidStringStringBinaryCallback) {
        this.mCallback = voidStringStringBinaryCallback;
    }

    public void setScanWidgetLiteAppCallback(com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.ScanWidgetLiteAppCallback scanWidgetLiteAppCallback) {
        this.liteAppCallback = scanWidgetLiteAppCallback;
    }
}
