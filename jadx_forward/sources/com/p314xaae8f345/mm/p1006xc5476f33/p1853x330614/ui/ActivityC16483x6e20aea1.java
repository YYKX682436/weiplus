package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI */
/* loaded from: classes9.dex */
public class ActivityC16483x6e20aea1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements l75.z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f229847q = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f229848d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f229849e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f229850f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f229851g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yj6 f229852h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f229853i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f229854m;

    /* renamed from: n, reason: collision with root package name */
    public ef3.p f229855n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f229856o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f229857p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6152x2909442>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.mall.ui.MallWalletUI.1
        {
            this.f39173x3fe91575 = 1699303474;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6152x2909442 c6152x2909442) {
            am.my myVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6152x2909442 c6152x29094422 = c6152x2909442;
            if (c6152x29094422 == null || (myVar = c6152x29094422.f136414g) == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(myVar.f88910a, "fqf_cell")) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "%s click", myVar.f88910a);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1.f229847q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1.this.getClass();
            return false;
        }
    };

    public final void U6(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "do query wechat wallet");
        if (z18) {
            this.f229854m = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(this, false, false, null);
        }
        ef3.q.a(this.f229855n, true, z17, 0);
    }

    public final void V6(boolean z17) {
        r45.rl6 rl6Var;
        r45.yj6 yj6Var = this.f229852h;
        if (yj6Var != null) {
            r45.nt4 nt4Var = yj6Var.f472692d;
            int i17 = 0;
            if (nt4Var != null) {
                mo56583xbf7c1df6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.e(this, nt4Var.f463193d, null));
                r45.ot4 ot4Var = nt4Var.f463195f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w2 w2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w2(this);
                if (ot4Var != null && ot4Var.f464042f == 2 && (rl6Var = ot4Var.f464041e) != null) {
                    mo78491xd9193382(0, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.e(this, rl6Var, null).toString(), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.o1(ot4Var, w2Var, this));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "section size: %s", this.f229852h.f472693e);
            int childCount = this.f229850f.getChildCount();
            int size = this.f229852h.f472693e.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u2 u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u2(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v2 v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.v2(this);
            for (int i18 = 0; i18 < size; i18++) {
                r45.e14 e14Var = (r45.e14) this.f229852h.f472693e.get(i18);
                if (i18 < childCount) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16482x6fc0759d) this.f229850f.getChildAt(i18)).a(e14Var, z17, u2Var, v2Var);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16482x6fc0759d c16482x6fc0759d = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16482x6fc0759d(mo55332x76847179());
                    c16482x6fc0759d.a(e14Var, z17, u2Var, v2Var);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = f229847q;
                    c16482x6fc0759d.setLayoutParams(layoutParams);
                    this.f229850f.addView(c16482x6fc0759d, layoutParams);
                }
            }
            if (childCount > size) {
                this.f229850f.removeViews(size, childCount - size);
            }
            java.util.LinkedList<r45.rl6> linkedList = this.f229852h.f472694f;
            if (linkedList == null || linkedList.isEmpty()) {
                return;
            }
            this.f229851g.removeAllViews();
            linkedList.size();
            for (r45.rl6 rl6Var2 : linkedList) {
                android.widget.TextView textView = new android.widget.TextView(this);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.k(textView, rl6Var2, new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.x2(this), java.lang.Boolean.FALSE);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                if (i17 != 0) {
                    layoutParams2.topMargin = i65.a.b(this, 8);
                }
                this.f229851g.addView(textView, layoutParams2);
                i17++;
            }
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG") || obj.equals("USERINFO_NEW_LQT_LONG")) {
                V6(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bww;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f229850f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.k2u);
        this.f229851g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.k2t);
        this.f229848d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.af7);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f229849e = c22905xef04d72d;
        c22905xef04d72d.a();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "requestCode: %s, resultCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 65281 || i17 == 65286) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        this.f229855n = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t2(this);
        U6(true, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        am.i10 i10Var = c6241x543927b6.f136488g;
        i10Var.f88426a = "1";
        i10Var.f88427b = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.y2(this, c6241x543927b6);
        c6241x543927b6.e();
        this.f229857p.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f229857p.mo48814x2efc64();
        ((java.util.ArrayList) ef3.q.f333960b).remove(this.f229855n);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6(false, false);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.z2.class);
    }
}
