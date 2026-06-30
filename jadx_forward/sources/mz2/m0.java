package mz2;

/* loaded from: classes9.dex */
public abstract class m0 {
    public static boolean a() {
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (m17 != null) {
            return ((java.lang.Boolean) m17).booleanValue();
        }
        return false;
    }

    public static void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintSwitch", "set is open fp: %s", java.lang.Boolean.valueOf(z17));
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINGER_PRINT_IS_OPEN_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }

    public static void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintSwitch", "set is open faceid: %s", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FACE_ID_IS_OPEN_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }
}
