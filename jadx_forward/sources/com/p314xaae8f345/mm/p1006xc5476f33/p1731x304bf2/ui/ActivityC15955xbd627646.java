package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI */
/* loaded from: classes8.dex */
public class ActivityC15955xbd627646 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15946xc98b8f0c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: r, reason: collision with root package name */
    public android.app.Dialog f222286r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f222287s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f222288t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f222289u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f222290v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f222291w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f222292x = "";

    /* renamed from: y, reason: collision with root package name */
    public m53.e2 f222293y;

    public void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v1 v1Var, int i17) {
        if (isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI hasFinished");
            return;
        }
        if (v1Var != null) {
            m53.e2 e2Var = v1Var.f222027a;
            if ((e2Var != null ? e2Var.f405181d : null) != null) {
                if ((e2Var != null ? e2Var.f405182e : null) != null) {
                    this.f222292x = (e2Var != null ? e2Var.f405182e : null).f405455d;
                } else {
                    this.f222292x = "";
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f222292x)) {
                    if (this.f222291w) {
                        m78551x8f8ecf18(0);
                        this.f222291w = false;
                    }
                } else if (!this.f222291w) {
                    mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78368xa86f0fea, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z2(this));
                    this.f222291w = true;
                }
                this.f222287s.setVisibility(0);
                m53.a0 a0Var = e2Var != null ? e2Var.f405181d : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f405080d)) {
                    this.f222288t.setVisibility(8);
                } else {
                    this.f222288t.setText(a0Var.f405080d);
                    this.f222288t.setVisibility(0);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f405081e)) {
                    this.f222289u.setVisibility(8);
                } else {
                    this.f222289u.setText(a0Var.f405081e);
                    this.f222289u.setVisibility(0);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a0Var.f405082f)) {
                    this.f222290v.setVisibility(8);
                } else {
                    this.f222290v.setText(a0Var.f405082f);
                    this.f222290v.setVisibility(0);
                }
                if (i17 == 2) {
                    r53.f.l().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y2(this));
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameDownloadGuidanceUI", "Null data");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bg9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u2(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fq7);
        this.f222287s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cg7);
        this.f222288t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j8i);
        this.f222289u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mgc);
        this.f222290v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568314mg4);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15946xc98b8f0c, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(2586, this);
        mo43517x10010bd5();
        r53.f.l().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadGuidanceUI", "onDestroy");
        super.onDestroy();
        r53.d dVar = r53.b.f474173a;
        synchronized (dVar) {
            java.util.Map map = dVar.f474180a;
            if (map != null) {
                ((java.util.LinkedHashMap) map).clear();
            }
            dVar.f474181b = false;
        }
        gm0.j1.d().q(2586, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi();
        wi6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
        java.util.LinkedList linkedList = wi6.f221723b;
        if (linkedList != null) {
            linkedList.clear();
        }
        java.util.LinkedList linkedList2 = wi6.f221722a;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadGuidanceUI", "errType: %d errCode: %d, scene: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.hashCode()));
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() != 2586) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r53.f.l().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b3(this, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f3) m1Var).f221845d.f152244b.f152233a, currentTimeMillis));
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fna, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
        android.app.Dialog dialog = this.f222286r;
        if (dialog != null) {
            dialog.cancel();
        }
    }
}
