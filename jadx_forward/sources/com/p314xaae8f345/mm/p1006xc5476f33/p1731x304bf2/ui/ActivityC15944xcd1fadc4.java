package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCategoryUI */
/* loaded from: classes5.dex */
public class ActivityC15944xcd1fadc4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f222218d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 f222219e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f222220f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f222221g;

    /* renamed from: n, reason: collision with root package name */
    public int f222225n;

    /* renamed from: o, reason: collision with root package name */
    public int f222226o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f222227p;

    /* renamed from: h, reason: collision with root package name */
    public boolean f222222h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f222223i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f222224m = false;

    /* renamed from: q, reason: collision with root package name */
    public int f222228q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b4 f222229r = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b4();

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4 f222230s = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d0(this);

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f222231t = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e0(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570670be4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var2;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCategoryUI", "requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCategoryUI", "error request code");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = null;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("game_app_id") : null;
        if (i18 != 2) {
            if (i18 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var = this.f222219e;
                d4Var.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    return;
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = d4Var.f223414q;
                if (concurrentHashMap.containsKey(stringExtra) && (c0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) concurrentHashMap.get(stringExtra)) != null) {
                    c0Var2.b();
                    return;
                }
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var2 = this.f222219e;
        d4Var2.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = d4Var2.f223414q;
            if (concurrentHashMap2.containsKey(stringExtra) && (c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) concurrentHashMap2.get(stringExtra)) != null) {
                c0Var.f221776c = 1;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var3 = this.f222219e;
        int i19 = 0;
        while (true) {
            if (i19 >= d4Var3.f222886e.size()) {
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) d4Var3.f222886e.get(i19)).f67370x28d45f97.equals(stringExtra)) {
                bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) d4Var3.f222886e.get(i19);
                break;
            }
            i19++;
        }
        if (bVar == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = d4Var3.f223414q;
        if (concurrentHashMap3.containsKey(bVar.f67370x28d45f97)) {
            d4Var3.f223416s.a(bVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) concurrentHashMap3.get(bVar.f67370x28d45f97));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f222225n = getIntent().getIntExtra("extra_type", 0);
        this.f222226o = getIntent().getIntExtra("extra_category_id", 0);
        this.f222227p = getIntent().getStringExtra("extra_category_name");
        this.f222228q = getIntent().getIntExtra("game_report_from_scene", 0);
        gm0.j1.d().a(1220, this);
        mo54450xbf7c1df6(this.f222227p);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b0(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c0(this));
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.gix);
        this.f222218d = listView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b4 b4Var = this.f222229r;
        listView.setOnItemClickListener(b4Var);
        b4Var.f222579d = this.f222228q;
        this.f222218d.setOnScrollListener(this.f222231t);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4(this);
        this.f222219e = d4Var;
        d4Var.f223413p = this.f222228q;
        d4Var.f223417t = this.f222230s;
        android.view.View inflate = ((android.view.LayoutInflater) mo55332x76847179().getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgs, (android.view.ViewGroup) this.f222218d, false);
        this.f222220f = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/ui/GameCategoryUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f222218d.addFooterView(this.f222220f);
        this.f222218d.setAdapter((android.widget.ListAdapter) this.f222219e);
        android.app.Dialog e17 = r53.f.e(this);
        this.f222221g = e17;
        e17.show();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h3(this.f222223i, 15, this.f222225n, this.f222226o));
        this.f222222h = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(1220, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        this.f222219e.h();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCategoryUI", "errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g0(this, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h3) m1Var).f221862e.f152244b.f152233a));
        }
    }
}
