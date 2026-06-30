package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI */
/* loaded from: classes12.dex */
public class ActivityC13596x43b3799b extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43 implements l75.q0 {

    /* renamed from: m, reason: collision with root package name */
    public o72.r2 f182210m;

    /* renamed from: n, reason: collision with root package name */
    public long f182211n;

    /* renamed from: o, reason: collision with root package name */
    public o72.q3 f182212o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 f182213p;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ace;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_m));
        this.f182211n = getIntent().getLongExtra("key_detail_info_id", -1L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f182211n);
        this.f182210m = F;
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteDetailUI", "get fav item info error");
            k82.c.f386420a.e(this.f182211n, 3);
            finish();
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                java.util.Iterator it = this.f182210m.f67640x5ab01132.f452497f.iterator();
                while (it.hasNext()) {
                    if (!((r45.gp0) it.next()).T.equals(stringExtra)) {
                        it.remove();
                    }
                }
            }
            Y6(this.f182210m);
            this.f182212o = new o72.q3();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b8344 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344) findViewById(com.p314xaae8f345.mm.R.id.dto);
            this.f182213p = c13562xb95b8344;
            c13562xb95b8344.m55318x591869be(this.f182212o);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.y1.a(this, this.f182210m);
            r45.gp0 J2 = o72.x1.J(this.f182210m);
            java.lang.String x17 = o72.x1.x(J2);
            int c07 = o72.x1.c0(J2.K);
            if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.l2(this));
            } else {
                o72.x1.C0(this.f182210m, true);
            }
            java.lang.String str = ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(this, (int) o72.x1.Y(J2.f456981y))).toString();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b83442 = this.f182213p;
            c13562xb95b83442.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (x17 == null) {
                x17 = "";
            }
            c13562xb95b83442.f181836h = x17;
            c13562xb95b83442.f181837i = c07;
            c13562xb95b83442.setText(str);
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.m2(this));
            m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.r2(this));
        }
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b8344 = this.f182213p;
        if (c13562xb95b8344 != null) {
            c13562xb95b8344.d();
        }
        o72.q3 q3Var = this.f182212o;
        if (q3Var != null) {
            q3Var.c();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = o72.q3.f424979p;
            if (c21000x8b2f716 != null) {
                c21000x8b2f716.a();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = q3Var.f424985i;
            if (s7Var != null) {
                s7Var.b();
            }
            o72.q3.f424979p = null;
            ((java.util.LinkedList) q3Var.f424988o).clear();
        }
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f182211n);
        this.f182210m = F;
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
            finish();
            return;
        }
        if (F.f67644x3059914a != 10 || w0Var == null || w0Var.f398508c == null) {
            return;
        }
        if (F.f67640x5ab01132.f452497f.size() <= 0) {
            k82.c.f386420a.e(this.f182211n, 3);
            return;
        }
        r45.gp0 J2 = o72.x1.J(this.f182210m);
        java.lang.String x17 = o72.x1.x(J2);
        int c07 = o72.x1.c0(J2.K);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
        java.lang.String str2 = ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(this, (int) o72.x1.Y(J2.f456981y))).toString();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13562xb95b8344 c13562xb95b8344 = this.f182213p;
        c13562xb95b8344.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c13562xb95b8344.f181836h = x17 == null ? "" : x17;
        c13562xb95b8344.f181837i = c07;
        c13562xb95b8344.setText(str2);
        if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s2(this));
        } else {
            k82.c.f386420a.e(this.f182211n, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f182212o.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
