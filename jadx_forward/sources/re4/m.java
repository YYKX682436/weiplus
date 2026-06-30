package re4;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String b17 = c01.z1.b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(re4.g0.f476068a) || re4.g0.f476068a.equals(b17)) {
            return;
        }
        gm0.j1.i();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        java.lang.String d17 = re4.g0.d(1);
        java.lang.String e17 = re4.g0.e(1);
        boolean i17 = wt5.a.i(d17);
        boolean i18 = wt5.a.i(e17);
        if (booleanValue && !i17 && i18) {
            boolean i19 = wt5.a.i(re4.g0.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerpirntReporter", "report key valid before pay: %s", java.lang.Boolean.valueOf(i19));
            if (i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 50);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 49);
            }
        }
    }
}
