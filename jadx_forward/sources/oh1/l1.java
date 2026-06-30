package oh1;

/* loaded from: classes9.dex */
public class l1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh1.m1 f426784a;

    public l1(oh1.m1 m1Var) {
        this.f426784a = m1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public void a(k91.v5 v5Var) {
        int i17;
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        oh1.m1 m1Var = this.f426784a;
        tt0.e Ai = ((oh1.k2) x0Var).Ai(m1Var.f426786e.f503336h);
        if (Ai != null && (i17 = Ai.f66303xc4aab016) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeMsgService", "msgType: %d, report ignore", java.lang.Integer.valueOf(i17));
            return;
        }
        cm.c1 c1Var = cm.c1.DEFAULT;
        cm.d1 d1Var = cm.d1.DEFAULT;
        if (Ai != null) {
            int i18 = Ai.f66302xd09abf35;
            if (i18 == 1) {
                c1Var = cm.c1.DONE;
            } else if (i18 == 0) {
                c1Var = cm.c1.DOING;
            }
            int i19 = Ai.f66299x9ac5f93a;
            if (i19 == 2) {
                d1Var = cm.d1.SUBSCRIBE;
            } else if (i19 == 0 || i19 == 1) {
                d1Var = cm.d1.NOTSUBSCRIBE;
            }
        }
        int i27 = v5Var.u0() == null ? 0 : v5Var.u0().f387162d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7150xae2fbc94 c7150xae2fbc94 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7150xae2fbc94();
        tt0.d dVar = m1Var.f426786e;
        c7150xae2fbc94.f144583d = c7150xae2fbc94.b("AppId", dVar.f503332d, true);
        c7150xae2fbc94.f144584e = c7150xae2fbc94.b("PageId", dVar.f503334f, true);
        c7150xae2fbc94.f144586g = c7150xae2fbc94.b("ShareTicket", dVar.f503334f, true);
        java.lang.String str = m1Var.f426787f;
        c7150xae2fbc94.f144587h = c7150xae2fbc94.b("ChattingId", str, true);
        c7150xae2fbc94.f144588i = str.toLowerCase().endsWith("@chatroom") ? cm.b1.YES : cm.b1.NO;
        c7150xae2fbc94.f144589j = cm.a1.CLICKSTARTGAME;
        c7150xae2fbc94.f144590k = 0L;
        c7150xae2fbc94.f144591l = c7150xae2fbc94.b("SceneNote", "", true);
        c7150xae2fbc94.f144594o = cm.z0.a(i27 + 1000);
        c7150xae2fbc94.f144585f = c7150xae2fbc94.i();
        c7150xae2fbc94.f144592m = c1Var;
        c7150xae2fbc94.f144593n = d1Var;
        c7150xae2fbc94.k();
    }
}
