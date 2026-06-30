package xc1;

@j95.b
/* loaded from: classes7.dex */
public final class t extends i95.w implements ft.q4 {
    public void Ai(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeToWxa", "onNativePostData, appId:" + str + ", data:" + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeToWxa", "onNativePostData, in main process");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().O(str, new xc1.n(str, str2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
        jz5.f0 f0Var = null;
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, get runtime success");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = b17.C0();
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (C0 != null) {
                b17.I1(new xc1.o(str2, C0));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, runtime service is null");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, get runtime failed");
        }
    }

    public void Bi(java.lang.String str, ft.p4 p4Var) {
        if ((str == null || str.length() == 0) || p4Var == null) {
            return;
        }
        xc1.s sVar = xc1.s.f534590a;
        xc1.s.f534591b.f(str, p4Var);
    }

    public void wi(java.lang.String str, ft.p4 p4Var) {
        if ((str == null || str.length() == 0) || p4Var == null) {
            return;
        }
        xc1.s sVar = xc1.s.f534590a;
        xc1.s.f534591b.e(str, p4Var);
    }
}
