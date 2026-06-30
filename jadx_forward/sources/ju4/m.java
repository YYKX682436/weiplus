package ju4;

/* loaded from: classes9.dex */
public class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        r45.q55 q55Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6196xadf788bd) abstractC20979x809547d1).f136452g.f90028a;
        hu4.i.f366763a = -1L;
        fu4.a.f348417a = -1L;
        boolean j17 = hu4.j.j(q55Var);
        if (j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockInitTask", "tom update PatternLockInfo, sign_len:%d,valid:%b,status:%d,ver:%d", java.lang.Integer.valueOf(q55Var.f465229e.f453372d), java.lang.Boolean.valueOf(j17), java.lang.Integer.valueOf(q55Var.f465230f), java.lang.Integer.valueOf(q55Var.f465228d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGuardInfoManager", "saveSyncedPatternInfo version: %d, status: %d", java.lang.Integer.valueOf(q55Var.f465228d), java.lang.Integer.valueOf(q55Var.f465230f));
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            if (c17 != null) {
                try {
                    c17.w(339990, android.util.Base64.encodeToString(q55Var.mo14344x5f01b1f6(), 2));
                    c17.i(true);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLockInitTask", "UserInfoExt.PatternLockInfo is null or invalid.");
        }
        boolean g17 = hu4.j.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockInitTask", "after update gesture server info, isUserSetGesturePwd: %b", java.lang.Boolean.valueOf(g17));
        hu4.f.b(g17);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().mo74014x316510();
        return false;
    }
}
