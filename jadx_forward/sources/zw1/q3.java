package zw1;

/* loaded from: classes15.dex */
public class q3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558297a;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3) {
        this.f558297a = activityC13149x63b02cb3;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.io.IOException e17;
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiGetQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558297a;
        if (activityC13149x63b02cb3.isFinishing() || activityC13149x63b02cb3.isDestroyed() || (fVar = fVar2.f152151d) == null) {
            return null;
        }
        if (fVar2.f152148a == 0 && fVar2.f152149b == 0) {
            ww1.a3 a3Var = activityC13149x63b02cb3.f177970f;
            r45.fw fwVar = (r45.fw) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeLogic", "[setMchConfig]");
            try {
                str = new java.lang.String(fwVar.mo14344x5f01b1f6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
            } catch (java.io.IOException e18) {
                e17 = e18;
                str = " ";
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeLogic", "setConfig success");
            } catch (java.io.IOException e19) {
                e17 = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeLogic", "save config exp, " + e17.getLocalizedMessage());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, str);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                ww1.c3.a(a3Var, null, fwVar);
                activityC13149x63b02cb3.x7(0);
                return java.lang.Boolean.TRUE;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
            ww1.c3.a(a3Var, null, fwVar);
            activityC13149x63b02cb3.x7(0);
        } else {
            ww1.y2.e(activityC13149x63b02cb3.f177972h, activityC13149x63b02cb3.f177970f, fVar2.f152150c, activityC13149x63b02cb3.mo55332x76847179());
        }
        return java.lang.Boolean.TRUE;
    }
}
