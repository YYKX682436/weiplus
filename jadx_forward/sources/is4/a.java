package is4;

/* loaded from: classes9.dex */
public abstract class a {
    public static boolean a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
        if (z17) {
            M.putInt(str, 5);
            return z17;
        }
        int i17 = M.getInt(str, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", "soter:  %s supportCount is %s", str, java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            return z17;
        }
        M.putInt(str, i17 - 1);
        return true;
    }

    public static boolean b() {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletUtil", "no finger mgr!");
            return false;
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        at4.u1 p17 = Ai.p();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h6.f34350x366c91de, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", "support faceid: %s, %s, %s", java.lang.Boolean.valueOf(aVar.Rb()), java.lang.Boolean.valueOf(p17.h()), java.lang.Boolean.valueOf(Ai.w()));
        return aVar.Rb() && p17.h() && Ai.w();
    }

    public static boolean c() {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mgr==null?");
        sb6.append(aVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", sb6.toString());
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", " mgr.isSupportAndLoadSuccess()=" + aVar.Ic());
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        at4.u1 p17 = Ai.p();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("config==null?");
        sb7.append(p17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", sb7.toString());
        if (p17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", "config.isSupportTouchPay()=" + p17.h());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUtil", "userInfoManger.isReg()=" + Ai.w());
        return aVar != null && aVar.Ic() && p17 != null && p17.h() && Ai.w();
    }
}
