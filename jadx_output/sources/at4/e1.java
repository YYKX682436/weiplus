package at4;

/* loaded from: classes8.dex */
public class e1 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.WalletGetBulletinEvent f13831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13832e;

    public e1() {
        super(0);
        this.f13832e = null;
    }

    public final void b() {
        dt4.e hj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).hj();
        at4.c1 c1Var = new at4.c1();
        c1Var.field_bulletin_scene = this.f13832e;
        if (hj6.get(c1Var, new java.lang.String[0])) {
            am.j10 j10Var = this.f13831d.f54956h;
            j10Var.f6994a = c1Var.field_bulletin_scene;
            j10Var.f6995b = c1Var.field_bulletin_content;
            j10Var.f6996c = c1Var.field_bulletin_url;
            int i17 = c1Var.field_type;
            j10Var.f6997d = i17;
            if (i17 == 2) {
                j10Var.f6998e = new r45.tw4();
                r45.tw4 tw4Var = this.f13831d.f54956h.f6998e;
                tw4Var.f386831d = c1Var.field_is_show_notice;
                tw4Var.f386833f = c1Var.field_left_icon;
                tw4Var.f386834g = c1Var.field_jump_url;
                tw4Var.f386832e = c1Var.field_wording;
                tw4Var.f386835h = c1Var.field_notice_id;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
        }
        java.lang.Runnable runnable = this.f13831d.f192364d;
        if (runnable != null) {
            runnable.run();
        }
        java.lang.Runnable runnable2 = this.f13831d.f54955g.f6894b;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f13831d = null;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = (com.tencent.mm.autogen.events.WalletGetBulletinEvent) iEvent;
        this.f13831d = walletGetBulletinEvent;
        this.f13832e = walletGetBulletinEvent.f54955g.f6893a;
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BULLETIN_GET_TIME_LONG, 0L)).longValue();
        long time = new java.util.Date().getTime();
        long longValue2 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BULLETIN_UPDATE_INTERVAL_LONG, 600000L)).longValue();
        if (time - longValue > (longValue2 > 0 ? longValue2 : 600000L) || com.tencent.mm.sdk.platformtools.t8.K0(this.f13832e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetBulletinEventListener", "data is out of date,do NetSceneGetBannerInfo for update");
            ss4.g gVar = new ss4.g();
            gm0.j1.i();
            com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
            r1Var.a(385, this);
            r1Var.g(gVar);
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f13832e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetBulletinEventListener", "get bulletin data from db");
            b();
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletGetBulletinEventListener", "mScene is null");
        java.lang.Runnable runnable = this.f13831d.f192364d;
        if (runnable != null) {
            runnable.run();
        }
        java.lang.Runnable runnable2 = this.f13831d.f54955g.f6894b;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f13831d = null;
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + i17 + ";errCode=" + i18);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BULLETIN_GET_TIME_LONG, java.lang.Long.valueOf(new java.util.Date().getTime()));
        b();
    }
}
