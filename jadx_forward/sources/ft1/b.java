package ft1;

/* loaded from: classes11.dex */
public final class b implements en1.l {
    @Override // en1.l
    /* renamed from: onAuthResponse */
    public void mo43817x48bdb988(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        if (!w11.a1.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordAuthResponse", "onAuthResponse: not new init, skip verify record sync");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordAuthResponse", "onAuthResponse: new init, start to sync verify record from cloud");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordAuthResponse", "onAuthResponse: delete all local verify record cache");
        com.p314xaae8f345.mm.p2621x8fb0427b.jb jbVar = (com.p314xaae8f345.mm.p2621x8fb0427b.jb) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj();
        l75.k0 k0Var = jbVar.f276595d;
        if (k0Var != null) {
            k0Var.mo70514xb06685ab("VerifyRecordMsgInfo", null, null);
        }
        jbVar.mo142179xf35bbb4("VerifyRecordMsgInfo", 5, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordAuthResponse", "onAuthResponse: request verify record history from cloud");
        ((ft1.j) ((xg3.u) i95.n0.c(xg3.u.class))).Ni(0L, new ft1.a());
    }

    @Override // en1.l
    /* renamed from: onRegResponse */
    public void mo43818x6279e596(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
