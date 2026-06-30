package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameRouteUI */
/* loaded from: classes8.dex */
public class ActivityC16018xae0b4e2b extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f223300i = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f223301h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public java.lang.String T6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public java.lang.String U6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int V6() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int W6() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int X6() {
        return 0;
    }

    public final void Z6() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
    }

    public final void a7(java.util.List list, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d c15921xfed2506d;
        java.util.ArrayList arrayList;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            c15921xfed2506d = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d c15921xfed2506d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d();
            m53.i5 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.p();
            if (p17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.StatusBar statusBar = c15921xfed2506d2.f221685e;
                statusBar.f221686d = p17.f405329e;
                statusBar.f221687e = r53.f.z(p17.f405328d);
            }
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                m53.g1 g1Var = (m53.g1) it.next();
                if (g1Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g1Var.f405226e)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem();
                    tabItem2.f221688d = g1Var.f405226e;
                    tabItem2.f221689e = g1Var.f405225d;
                    tabItem2.f221691g = g1Var.f405228g;
                    boolean z18 = g1Var.f405229h;
                    tabItem2.f221692h = z18;
                    tabItem2.f221690f = g1Var.f405227f;
                    tabItem2.f221695n = g1Var.f405230i;
                    tabItem2.f221696o = g1Var.f405231m;
                    if (z18) {
                        tabItem2.f221697p = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16020x9b157fb6.class.getName();
                    } else {
                        int i18 = i17 + 1;
                        int i19 = i17 % 3;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("com.tencent.mm.plugin.game.ui.tab.GameTabWebUI");
                        sb6.append(i19 != 0 ? java.lang.String.valueOf(i19) : "");
                        tabItem2.f221697p = sb6.toString();
                        i17 = i18;
                    }
                    tabItem2.f221698q = false;
                    tabItem2.f221699r = g1Var.f405232n;
                    tabItem2.f221700s = g1Var.f405233o;
                    tabItem2.f221701t = g1Var.f405234p;
                    c15921xfed2506d2.f221684d.put(tabItem2.f221688d, tabItem2);
                }
            }
            c15921xfed2506d = c15921xfed2506d2;
        }
        if (c15921xfed2506d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15921xfed2506d.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRouteUI", "game tab data is null");
            Z6();
            return;
        }
        java.util.List a17 = c15921xfed2506d.a();
        int i27 = 0;
        while (true) {
            arrayList = (java.util.ArrayList) a17;
            if (i27 >= arrayList.size()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) arrayList.get(i27);
            if (tabItem3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem4 = tabItem3.f221691g ? tabItem3 : tabItem;
                n53.a.b(this, 18, tabItem3.f221699r, tabItem3.f221700s, 1, null, this.f223301h, n53.a.e(tabItem3.f221701t));
                tabItem = tabItem4;
            }
            i27++;
        }
        if (tabItem == null) {
            tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) arrayList.get(0);
        }
        if (tabItem == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRouteUI", "game tab entry item is null");
            Z6();
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new android.os.Bundle();
        }
        extras.putParcelable("tab_data", c15921xfed2506d);
        getIntent().putExtras(extras);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.C16024xb4559647.c(this, tabItem, z17, true, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bhk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new p53.a(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fq7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        this.f223301h = getIntent().getIntExtra("game_report_from_scene", 0);
        byte[] D0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("game_index4_tab_nav");
        m53.c2 c2Var = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(D0)) {
            try {
                m53.c2 c2Var2 = new m53.c2();
                try {
                    c2Var2.mo11468x92b714fd(D0);
                } catch (java.io.IOException unused) {
                }
                c2Var = c2Var2;
            } catch (java.io.IOException unused2) {
            }
        }
        if (c2Var != null) {
            java.util.LinkedList linkedList = c2Var.f405131d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRouteUI", "use cache data");
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3.f221733f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data");
                gm0.j1.d().a(2641, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3.f221734g);
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3());
                boolean booleanExtra = getIntent().getBooleanExtra("switch_country_no_anim", false);
                getIntent().removeExtra("switch_country_no_anim");
                a7(linkedList, !booleanExtra);
                return;
            }
        }
        gm0.j1.d().a(2641, this);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(2641, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        Z6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data success");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new p53.b(this, (m53.c2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3) m1Var).f221736e.f152244b.f152233a));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data fail");
            Z6();
        }
    }
}
