package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaOpenBiometricVerifyManagerImpl */
/* loaded from: classes9.dex */
public class C3134xfc152bd3 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3567xabca1713 {
    private static final java.lang.String TAG = "KindaOpenBiometricVerifyManagerImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3567xabca1713
    /* renamed from: openBiometricVerify */
    public void mo25215x8b468ba7(java.lang.String str, boolean z17, com.p314xaae8f345.p347x615374d.gen.EnumC3601x5451fba6 enumC3601x5451fba6) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Fail to start KindaOpenBiometricVerifyManagerImpl due to context is null!");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Fail to start KindaOpenBiometricVerifyManagerImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        final android.app.Activity activity = (android.app.Activity) context;
        activity.getIntent().putExtra("isFromKinda", true);
        activity.getIntent().putExtra("kindaPayPwd", str);
        if (z17) {
            activity.getIntent().putExtra("bSupportFaceAndTouch", true);
            if (enumC3601x5451fba6 == com.p314xaae8f345.p347x615374d.gen.EnumC3601x5451fba6.TOUCHID) {
                activity.getIntent().putExtra("selectBioType", 1);
            } else if (enumC3601x5451fba6 == com.p314xaae8f345.p347x615374d.gen.EnumC3601x5451fba6.FACEID) {
                activity.getIntent().putExtra("selectBioType", 2);
            }
        }
        android.os.Bundle extras = activity.getIntent().getExtras();
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "The Extras data in current kinda Activity is null!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "The Extras data in current kinda Activity is " + extras.toString());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putInt("MMKV_KEY_SOTER_OPEN_SCENE", 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "open bio pay, open scene is 2");
        at4.u1 p17 = vr4.f1.wi().Ai().p();
        if (p17 != null && p17.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "WalletSwitchConfig.isSupportTouchPay return that the user has opened fingerprint (biometric) payment in WeChat.");
            ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(activity);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "WalletSwitchConfig.isSupportTouchPay return that the user has not opened fingerprint (biometric) payment in WeChat. Send a message to call the bind query.");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        l10Var.f88748a = 1;
        l10Var.f88749b = true;
        l10Var.f88750c = true;
        c6243x5c461184.f136492h.f88825a = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaOpenBiometricVerifyManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(activity);
            }
        };
        c6243x5c461184.b(android.os.Looper.myLooper());
    }
}
