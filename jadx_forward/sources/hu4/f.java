package hu4;

/* loaded from: classes9.dex */
public abstract class f {
    public static boolean a() {
        return ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_GESTURE_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
    }

    public static void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardManager", "setUserSetGesturePwd: %b", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_GESTURE_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().i(true);
    }
}
