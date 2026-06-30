package nz2;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz2.n f423092d;

    public i(nz2.n nVar) {
        this.f423092d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean d17 = mz2.n0.d();
        nz2.n nVar = this.f423092d;
        if (!d17) {
            try {
                nz2.n.b(nVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HuaweiBiometricPayManagerImpl", e17, "", new java.lang.Object[0]);
                mz2.n0.e(false);
            }
        }
        if (!mz2.n0.f414693a) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g.class.getClassLoader();
                if (android.text.TextUtils.isEmpty(fp.d0.g("teec"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "can not LoadLibrary fingerprintauth.so, because can not find the libteec");
                    mz2.n0.f414693a = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "LoadLibrary fingerprintauth.so, find the libteec so");
                    fp.d0.n("fingerprintauth");
                    mz2.n0.f414693a = true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HuaweiBiometricPayManagerImpl", th6, "", new java.lang.Object[0]);
                mz2.n0.f414693a = false;
            }
        }
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey");
        if (!mz2.n0.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "device is not support");
            return;
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "user had not reg wxpay or is isSimpleReg");
            return;
        }
        try {
            java.lang.String b17 = mz2.n0.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey userId:" + b17);
            java.lang.String m63459x2e2166f5 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63459x2e2166f5(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), b17, wo.w0.k());
            if (android.text.TextUtils.isEmpty(m63459x2e2166f5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "FingerPrintAuth.getRsaKey() is null");
                m63459x2e2166f5 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63457xf0bc036f(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k());
            }
            if (android.text.TextUtils.isEmpty(m63459x2e2166f5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "FingerPrintAuth.genRsaKey() return null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HuaweiBiometricPayManagerImpl", "initRsaKey success!");
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HuaweiBiometricPayManagerImpl", e18, "", new java.lang.Object[0]);
        }
    }
}
