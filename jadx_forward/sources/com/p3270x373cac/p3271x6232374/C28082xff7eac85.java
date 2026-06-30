package com.p3270x373cac.p3271x6232374;

/* renamed from: com.vivo.libra.VivoLibraManager */
/* loaded from: classes13.dex */
public final class C28082xff7eac85 {

    /* renamed from: sInstance */
    private static com.p3270x373cac.p3271x6232374.C28082xff7eac85 f65813xbfaed628;

    /* renamed from: mILibraSdk */
    private com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f f65814x81bf31c2;

    /* renamed from: mWaitPermission */
    private boolean f65815x5be6aef1 = true;

    /* renamed from: getInstance */
    public static com.p3270x373cac.p3271x6232374.C28082xff7eac85 m122357x9cf0d20b() {
        if (f65813xbfaed628 == null) {
            f65813xbfaed628 = new com.p3270x373cac.p3271x6232374.C28082xff7eac85();
        }
        return f65813xbfaed628;
    }

    /* renamed from: checkPermission */
    public boolean m122358x28e6dcf7(java.lang.String str) {
        if (!this.f65815x5be6aef1) {
            return true;
        }
        if (this.f65814x81bf31c2 == null) {
            this.f65814x81bf31c2 = com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f.Proxy.m122354xe4960c2c();
        }
        com.p3270x373cac.p3271x6232374.InterfaceC28080x7e7a078f interfaceC28080x7e7a078f = this.f65814x81bf31c2;
        if (interfaceC28080x7e7a078f == null) {
            return false;
        }
        boolean mo122349x28e6dcf7 = interfaceC28080x7e7a078f.mo122349x28e6dcf7(str);
        this.f65815x5be6aef1 = !mo122349x28e6dcf7;
        return mo122349x28e6dcf7;
    }

    /* renamed from: funSupportCheck */
    public boolean m122359x30429998(java.lang.String str) {
        if (this.f65815x5be6aef1) {
            return false;
        }
        return this.f65814x81bf31c2.mo122351xb7044485(str);
    }

    /* renamed from: getShellTemp */
    public int m122360x6adfef6e() {
        if (this.f65815x5be6aef1) {
            return -2740;
        }
        return this.f65814x81bf31c2.mo122350xfc45ce36("getShellTemp");
    }
}
