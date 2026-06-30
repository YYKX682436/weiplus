package qe4;

/* loaded from: classes9.dex */
public class f implements en1.l {
    @Override // en1.l
    /* renamed from: onAuthResponse */
    public void mo43817x48bdb988(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SoterHandleAuthResponse", "autoAuth: %s", java.lang.Boolean.valueOf(z17));
        ((ku5.t0) ku5.t0.f394148d).g(new qe4.e(this));
        if (!z17 && fu5.d.b().d() && ((java.lang.String) fu5.d.b().a().get(1)).equals("WechatAuthKeyPay&null")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SoterHandleAuthResponse", "init error, reinit");
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f348446b = false;
            }
            ne4.h hVar = (ne4.h) i95.n0.c(ne4.h.class);
            hVar.getClass();
            re4.g0.f();
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ne4.g(hVar), true).c(100L, 1000L);
        }
    }

    @Override // en1.l
    /* renamed from: onRegResponse */
    public void mo43818x6279e596(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
