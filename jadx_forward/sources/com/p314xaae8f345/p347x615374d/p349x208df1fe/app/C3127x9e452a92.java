package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaDeviceServiceImpl */
/* loaded from: classes9.dex */
public class C3127x9e452a92 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4 {
    private static final java.lang.String TAG = "KindaDeviceServiceImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f11984x7f11beae;
    private pz2.a mgr = (pz2.a) gm0.j1.s(pz2.a.class);

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: invokePhoneCall */
    public void mo25133x55c2754(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "invokePhoneCall, phoneNumber: %s", str);
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/app/KindaDeviceServiceImpl", "invokePhoneCall", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/kinda/framework/app/KindaDeviceServiceImpl", "invokePhoneCall", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1589L, 5L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "invokePhoneCall: The device may not have a phone App installed! ", new java.lang.Object[0]);
            android.content.Context context2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
            if (context2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "KindaDeviceServiceImpl invokePhoneCall() KindaContext.get() return null! case 9");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context2);
            u1Var.g(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kjj, str));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.kl_);
            u1Var.q(false);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: isDeviceOpenBiometricVerification */
    public boolean mo25134x2ff6f289() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).f270103e) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
            boolean z17 = M.getBoolean("MMKV_KEY_HAS_FINGER", false);
            boolean z18 = M.getBoolean("MMKV_KEY_HAS_FACE_ID", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, use cache, isDeviceHasFingerPrint: " + z17 + ", isDeviceHasFaceID: " + z18);
            return z17 || z18;
        }
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, mgr == null, return false.");
            return false;
        }
        boolean yh6 = aVar.yh();
        boolean a17 = this.mgr.a1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceOpenBiometricVerification, isDeviceHasFingerPrint: " + yh6 + ", isDeviceHasFaceID: " + a17);
        return yh6 || a17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: isDeviceSupportFaceId */
    public boolean mo25135xd4d424c7() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, mgr == null, return false.");
            return false;
        }
        boolean Rb = aVar.Rb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFaceId, return: " + Rb);
        return Rb;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: isDeviceSupportTouchId */
    public boolean mo25136xc328ba2b() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "KindaDeviceServiceImpl.isDeviceSupportFP, mgr == null, return false.");
            return false;
        }
        boolean Ic = aVar.Ic();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaDeviceServiceImpl.isDeviceSupportFP, return" + Ic);
        return Ic;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: isDeviceTouchIdHardwareSupported */
    public boolean mo25137x2ebcfe4c() {
        return this.mgr != null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: isRoot */
    public boolean mo25138xb9a85d2c() {
        pz2.a aVar = this.mgr;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "KindaDeviceServiceImpl.isRoot, mgr == null, return false.");
            return false;
        }
        boolean mo148657xb9a85d2c = aVar.mo148657xb9a85d2c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaDeviceServiceImpl.isRoot, return: " + mo148657xb9a85d2c);
        return mo148657xb9a85d2c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: soterCpuId */
    public java.lang.String mo25139xbdf4ef9e() {
        re4.v a17 = re4.u.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaDeviceServiceImpl.soterCpuId, return: ");
        java.lang.String str = a17.f476086a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, sb6.toString());
        return str;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: soterUid */
    public java.lang.String mo25140x65b165cb() {
        re4.v a17 = re4.u.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaDeviceServiceImpl.isDeviceSupportFaceId, return: ");
        java.lang.String str = a17.f476087b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, sb6.toString());
        return str;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: updateBiometricVerificationState */
    public void mo25141x73b14d07(int i17, boolean z17) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "KindaDeviceServiceImpl.updateBiometricVerificationState, soterOpenType: " + i17 + ", biometricVerificationState: " + z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3452x8f31d4f4
    /* renamed from: useLastestTouchInfo */
    public boolean mo25142xd7136ae4() {
        return false;
    }
}
