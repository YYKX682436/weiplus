package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaOpenBiometricVerifyManagerImpl implements com.tencent.kinda.gen.KindaOpenBiometricVerifyManager {
    private static final java.lang.String TAG = "KindaOpenBiometricVerifyManagerImpl";

    @Override // com.tencent.kinda.gen.KindaOpenBiometricVerifyManager
    public void openBiometricVerify(java.lang.String str, boolean z17, com.tencent.kinda.gen.SelectBioType selectBioType) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "Fail to start KindaOpenBiometricVerifyManagerImpl due to context is null!");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e(TAG, "Fail to start KindaOpenBiometricVerifyManagerImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        final android.app.Activity activity = (android.app.Activity) context;
        activity.getIntent().putExtra("isFromKinda", true);
        activity.getIntent().putExtra("kindaPayPwd", str);
        if (z17) {
            activity.getIntent().putExtra("bSupportFaceAndTouch", true);
            if (selectBioType == com.tencent.kinda.gen.SelectBioType.TOUCHID) {
                activity.getIntent().putExtra("selectBioType", 1);
            } else if (selectBioType == com.tencent.kinda.gen.SelectBioType.FACEID) {
                activity.getIntent().putExtra("selectBioType", 2);
            }
        }
        android.os.Bundle extras = activity.getIntent().getExtras();
        if (extras == null) {
            com.tencent.mars.xlog.Log.i(TAG, "The Extras data in current kinda Activity is null!");
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "The Extras data in current kinda Activity is " + extras.toString());
        }
        com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putInt("MMKV_KEY_SOTER_OPEN_SCENE", 2);
        com.tencent.mars.xlog.Log.i(TAG, "open bio pay, open scene is 2");
        at4.u1 p17 = vr4.f1.wi().Ai().p();
        if (p17 != null && p17.h()) {
            com.tencent.mars.xlog.Log.i(TAG, "WalletSwitchConfig.isSupportTouchPay return that the user has opened fingerprint (biometric) payment in WeChat.");
            ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(activity);
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "WalletSwitchConfig.isSupportTouchPay return that the user has not opened fingerprint (biometric) payment in WeChat. Send a message to call the bind query.");
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        l10Var.f7215a = 1;
        l10Var.f7216b = true;
        l10Var.f7217c = true;
        walletGetUserInfoEvent.f54959h.f7292a = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaOpenBiometricVerifyManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(activity);
            }
        };
        walletGetUserInfoEvent.b(android.os.Looper.myLooper());
    }
}
