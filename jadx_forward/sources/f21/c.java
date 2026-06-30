package f21;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static f21.c f340377f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f340378d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f340379e = 3;

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigListUpdater", "isUpdateing : " + this.f340378d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigListUpdater", "isSDCardAvailable : " + gm0.j1.u().l());
        if (this.f340378d || !gm0.j1.u().l()) {
            return;
        }
        this.f340378d = false;
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        this.f340378d = true;
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        ip.e a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
        f21.i0[] D0 = f21.r0.Bi().D0(7);
        if (D0.length != 0) {
            a17.getClass();
            if (!com.p314xaae8f345.mm.vfs.w6.j(ip.e.c(1))) {
                f21.r0.Bi().n0(7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConfigListUpdater", "config file not exist, delete packageInfo, packageInfo size=" + D0.length);
            }
        }
        gm0.j1.n().f354821b.g(new f21.g0(7));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 159) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigListUpdater", "getPackageList sceneEnd, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 0 && i18 == 0) {
                gm0.j1.u().c().w(81938, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            } else {
                int i19 = this.f340379e - 1;
                this.f340379e = i19;
                if (i19 < 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c17.w(81938, java.lang.Long.valueOf(((java.lang.System.currentTimeMillis() - 86400000) + 3600000) / 1000));
                    this.f340379e = 3;
                }
            }
            this.f340378d = false;
            gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        }
    }
}
