package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaDeviceServiceImpl implements com.tencent.kinda.gen.KDeviceService {
    private static final java.lang.String TAG = "KindaDeviceServiceImpl";
    private byte _hellAccFlag_;
    private pz2.a mgr = (pz2.a) gm0.j1.s(pz2.a.class);

    @Override // com.tencent.kinda.gen.KDeviceService
    public void invokePhoneCall(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "invokePhoneCall, phoneNumber: %s", str);
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/app/KindaDeviceServiceImpl", "invokePhoneCall", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/kinda/framework/app/KindaDeviceServiceImpl", "invokePhoneCall", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1589L, 5L, 1L);
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "invokePhoneCall: The device may not have a phone App installed! ", new java.lang.Object[0]);
            android.content.Context context2 = com.tencent.kinda.framework.widget.tools.KindaContext.get();
            if (context2 == null) {
                com.tencent.mars.xlog.Log.e(TAG, "KindaDeviceServiceImpl invokePhoneCall() KindaContext.get() return null! case 9");
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context2);
            u1Var.g(context2.getString(com.tencent.mm.R.string.kjj, str));
            u1Var.m(com.tencent.mm.R.string.kl_);
            u1Var.q(false);
        }
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public boolean isDeviceOpenBiometricVerification() {
        if (!((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).f188570e) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
            boolean z17 = M.getBoolean("MMKV_KEY_HAS_FINGER", false);
            boolean z18 = M.getBoolean("MMKV_KEY_HAS_FACE_ID", false);
            com.tencent.mars.xlog.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, use cache, isDeviceHasFingerPrint: " + z17 + ", isDeviceHasFaceID: " + z18);
            return z17 || z18;
        }
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, mgr == null, return false.");
            return false;
        }
        boolean yh6 = aVar.yh();
        boolean a17 = this.mgr.a1();
        com.tencent.mars.xlog.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, isDeviceHasFingerPrint: " + yh6 + ", isDeviceHasFaceID: " + a17);
        return yh6 || a17;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public boolean isDeviceSupportFaceId() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, mgr == null, return false.");
            return false;
        }
        boolean Rb = aVar.Rb();
        com.tencent.mars.xlog.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, return: " + Rb);
        return Rb;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public boolean isDeviceSupportTouchId() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w(TAG, "KindaDeviceServiceImpl.isDeviceSupportFP, mgr == null, return false.");
            return false;
        }
        boolean Ic = aVar.Ic();
        com.tencent.mars.xlog.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFP, return" + Ic);
        return Ic;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public boolean isDeviceTouchIdHardwareSupported() {
        return this.mgr != null;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public boolean isRoot() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w(TAG, "KindaDeviceServiceImpl.isRoot, mgr == null, return false.");
            return false;
        }
        boolean isRoot = aVar.isRoot();
        com.tencent.mars.xlog.Log.i(TAG, "KindaDeviceServiceImpl.isRoot, return: " + isRoot);
        return isRoot;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public java.lang.String soterCpuId() {
        re4.v a17 = re4.u.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaDeviceServiceImpl.soterCpuId, return: ");
        java.lang.String str = a17.f394553a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
        return str;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public java.lang.String soterUid() {
        re4.v a17 = re4.u.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaDeviceServiceImpl.isDeviceSupportFaceId, return: ");
        java.lang.String str = a17.f394554b;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
        return str;
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public void updateBiometricVerificationState(int i17, boolean z17) {
        if (i17 == 0) {
            if (this.mgr.Ic()) {
                ((mz2.a) this.mgr).e(z17);
                ((mz2.a) this.mgr).d(false);
            } else if (this.mgr.Rb()) {
                ((mz2.a) this.mgr).d(z17);
                ((mz2.a) this.mgr).e(false);
            }
        } else if (i17 == 1 && this.mgr.Ic()) {
            ((mz2.a) this.mgr).e(z17);
            ((mz2.a) this.mgr).d(false);
        } else if (i17 == 2 && this.mgr.Rb()) {
            ((mz2.a) this.mgr).d(z17);
            ((mz2.a) this.mgr).e(false);
        }
        com.tencent.mars.xlog.Log.i(TAG, "KindaDeviceServiceImpl.updateBiometricVerificationState, soterOpenType: " + i17 + ", biometricVerificationState: " + z17);
    }

    @Override // com.tencent.kinda.gen.KDeviceService
    public boolean useLastestTouchInfo() {
        return false;
    }
}
