package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI */
/* loaded from: classes12.dex */
public class ActivityC13563x72179722 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements s82.h, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a4 {
    public static final /* synthetic */ int E = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f181839d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c f181840e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f181842g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f181843h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f181844i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181846n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f181847o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 f181848p;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181841f = false;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181845m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public int f181849q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f181850r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f181851s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f181852t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Integer f181853u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Integer f181854v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f181855w = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f181856x = "";

    /* renamed from: y, reason: collision with root package name */
    public final float f181857y = 1024.0f;

    /* renamed from: z, reason: collision with root package name */
    public final o72.h2 f181858z = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e1(this);
    public final com.p314xaae8f345.mm.p944x882e457a.u0 A = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g1(this);
    public final java.lang.Runnable B = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h1(this);
    public long C = 0;
    public final java.lang.Runnable D = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s0(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        activityC13563x72179722.f181840e.notifyDataSetChanged();
        if (activityC13563x72179722.f181840e.isEmpty()) {
            activityC13563x72179722.V6(true);
            if (8 != activityC13563x72179722.f181842g.getVisibility()) {
                activityC13563x72179722.f181842g.setVisibility(8);
            }
        } else {
            activityC13563x72179722.V6(false);
            if (activityC13563x72179722.f181842g.getVisibility() != 0) {
                activityC13563x72179722.f181842g.setVisibility(0);
            }
        }
        activityC13563x72179722.f181842g.removeFooterView(activityC13563x72179722.f181847o);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        W6();
    }

    public final void U6(java.lang.Integer num) {
        mo78514x143f1b92().E(0).f289916i = num.intValue();
        mo2548x55429c53();
    }

    public final void V6(boolean z17) {
        if (z17) {
            android.view.View view = this.f181844i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f181843h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f181842g.removeFooterView(this.f181847o);
            return;
        }
        android.view.View view3 = this.f181844i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f181843h;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181842g.removeFooterView(this.f181847o);
    }

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181840e;
        if (cVar.B) {
            long m17 = cVar.m();
            if (m17 <= 0) {
                mo60878xf6b21fea(0, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572717ng1));
                U6(this.f181853u);
            } else {
                mo60878xf6b21fea(0, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntw, o72.x1.V(m17)));
                U6(this.f181852t);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570284e50;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181852t = java.lang.Integer.valueOf(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        this.f181853u = java.lang.Integer.valueOf(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560290gd));
        this.f181854v = java.lang.Integer.valueOf(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        int i17 = 0;
        this.f181849q = getIntent().getIntExtra("key_enter_fav_cleanui_from", 0);
        getIntent().getIntExtra("key_enter_fav_cleanui_status", 0);
        this.f181846n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(getClass().getName() + "_handlerThread_" + java.lang.System.currentTimeMillis());
        this.f181842g = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.dtu);
        gm0.j1.d().g(new o72.k5());
        gm0.j1.d().a(438, this.A);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c9m);
        mo78491xd9193382(0, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbi), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c1(this));
        mo78514x143f1b92().x0(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_c), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d1(this));
        m78560xe21cbbf(false);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371) findViewById(com.p314xaae8f345.mm.R.id.q4y);
        this.f181848p = c13619xdbaf3371;
        c13619xdbaf3371.m55391x6d801f4a(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a1(this));
        this.f181848p.m55390xc04e3dae(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b1(this));
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.dfm);
        if (viewStub != null) {
            this.f181844i = viewStub.inflate();
        } else {
            this.f181844i = findViewById(com.p314xaae8f345.mm.R.id.dxv);
        }
        this.f181843h = findViewById(com.p314xaae8f345.mm.R.id.t88);
        android.view.View view = this.f181844i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f181843h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181842g.removeFooterView(this.f181847o);
        this.f181847o = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.abn, (android.view.ViewGroup) null);
        this.f181842g.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z0(this));
        o72.i2.b().a(this.f181858z);
        this.f181850r = java.lang.System.currentTimeMillis();
        this.f181856x = getIntent().getStringExtra("key_enter_fav_cleanui_sessionid");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_name", "favCleanPage");
        java.util.List o47 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        long j17 = 0;
        if (o47 != null) {
            java.util.Iterator it = o47.iterator();
            while (it.hasNext()) {
                j17 += o72.x1.b((o72.r2) it.next());
            }
        }
        if (j17 > o72.x1.K()) {
            i17 = 2;
        } else if (o72.x1.m0()) {
            i17 = 1;
        }
        hashMap.put("fav_cap_status", java.lang.Integer.valueOf(i17));
        float a07 = (float) o72.x1.a0();
        float f17 = this.f181857y;
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(a07 / f17));
        hashMap.put("fav_cell_in_cnt", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo150754x7444f759()));
        hashMap.put("fav_cap_in_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / f17));
        hashMap.put("fav_clean_sessionid", this.f181856x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50116, "page_in", hashMap, 32903);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o72.i2 b17 = o72.i2.b();
        o72.h2 h2Var = this.f181858z;
        java.util.ArrayList arrayList = b17.f424887b;
        if (arrayList.contains(h2Var)) {
            arrayList.remove(h2Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f181839d;
        if (raVar != null) {
            raVar.f();
            this.f181839d = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181840e;
        if (cVar != null) {
            cVar.getClass();
        }
        this.f181846n.mo50299x35224f();
        gm0.j1.d().q(438, this.A);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_name", "favCleanPage");
        java.util.List o47 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        long j17 = 0;
        if (o47 != null) {
            java.util.Iterator it = o47.iterator();
            while (it.hasNext()) {
                j17 += o72.x1.b((o72.r2) it.next());
            }
        }
        hashMap.put("fav_cap_status", java.lang.Integer.valueOf(j17 > o72.x1.K() ? 2 : o72.x1.m0() ? 1 : 0));
        float a07 = (float) o72.x1.a0();
        float f17 = this.f181857y;
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(a07 / f17));
        hashMap.put("fav_cell_out_cnt", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo150754x7444f759()));
        hashMap.put("fav_cap_out_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / f17));
        hashMap.put("stay_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f181850r));
        hashMap.put("fav_clean_multselect_cnt", java.lang.Integer.valueOf(this.f181851s));
        hashMap.put("fav_clean_content_list", ((java.util.HashMap) this.f181855w).keySet().stream().map(new java.util.function.Function() { // from class: com.tencent.mm.plugin.fav.ui.FavCleanUI$$a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                o72.r2 r2Var = (o72.r2) obj;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722.E;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722.this;
                activityC13563x72179722.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) activityC13563x72179722.f181855w).get(r2Var);
                    jSONObject.put("fav_type", r2Var.f67657x2262335f);
                    jSONObject.put("cls_type", num == null ? 0 : num.intValue());
                    jSONObject.put("ts", c01.id.a());
                    jSONObject.put("size", r2Var.f67637x73e2be56 / 1024);
                    return jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCleanUI", "toReportJson error", e17);
                    return "";
                }
            }
        }).collect(java.util.stream.Collectors.joining("#")));
        hashMap.put("fav_clean_sessionid", this.f181856x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50116, "page_out", hashMap, 32903);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", 50116);
        hashMap.put("page_name", "favCleanPage");
        hashMap.put("fav_content_type", java.lang.Integer.valueOf(this.f181848p.getSelectedTypeIndex()));
        hashMap.put("fav_clean_sessionid", this.f181856x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_clean_filter", "view_unexp", hashMap, 32903);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("page_id", 50116);
        hashMap2.put("page_name", "favCleanPage");
        hashMap2.put("fav_content_sort", java.lang.Integer.valueOf(this.f181848p.getSelectedSortIndex() + 1));
        hashMap2.put("fav_clean_sessionid", this.f181856x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_clean_sort", "view_unexp", hashMap2, 32903);
    }
}
