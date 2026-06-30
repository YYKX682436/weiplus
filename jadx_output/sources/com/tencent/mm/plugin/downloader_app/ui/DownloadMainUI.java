package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class DownloadMainUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f97371s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.TaskListView f97372d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView f97373e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView f97374f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f97375g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f97376h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.model.n0 f97377i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f97378m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f97379n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f97380o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f97381p;

    /* renamed from: q, reason: collision with root package name */
    public c02.g f97382q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.model.m0 f97383r;

    public final void T6() {
        int size = this.f97372d.getSize();
        for (int i17 = 0; i17 < size; i17++) {
            r02.q0 q0Var = (r02.q0) this.f97372d.p0(i17);
            if (q0Var != null) {
                android.view.View view = q0Var.f368322d;
                if (view instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView) {
                    ((com.tencent.mm.plugin.downloader_app.ui.TaskItemView) view).a(false);
                }
            }
        }
    }

    public final void U6() {
        h02.a d17;
        this.f97378m = getIntent().getStringExtra("appId");
        boolean booleanExtra = getIntent().getBooleanExtra("view_task", false);
        this.f97379n = booleanExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadMainUI", "initData, appId : %s, viewTask : %b", this.f97378m, java.lang.Boolean.valueOf(booleanExtra));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f97378m;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (this.f97380o == 1 && (d17 = com.tencent.mm.plugin.downloader.model.m0.d(this.f97378m)) != null) {
            g02.c cVar = new g02.c();
            cVar.a(d17);
            cVar.f267429j = 0L;
            g02.b.c(19, cVar);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new r02.r(this));
    }

    public final void V6(com.tencent.mm.plugin.downloader_app.model.n0 n0Var, boolean z17) {
        this.f97382q = n0Var != null ? n0Var.f97309d : null;
        if (n0Var != null) {
            java.util.Map map = n0Var.f97307b;
            if (!(((java.util.HashMap) map).size() == 0)) {
                java.util.LinkedList c17 = com.tencent.mm.plugin.downloader_app.model.s0.c();
                java.util.LinkedList<com.tencent.mm.plugin.downloader_app.model.r0> linkedList = n0Var.f97308c;
                linkedList.clear();
                if (!com.tencent.mm.sdk.platformtools.t8.L0(c17)) {
                    java.util.Iterator it = c17.iterator();
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) ((java.util.HashMap) map).get((java.lang.String) it.next());
                        if (r0Var != null) {
                            int i27 = r0Var.f97314c;
                            if (i27 == 2) {
                                i17++;
                                r0Var.f97315d = i17;
                            } else if (i27 == 4) {
                                i18++;
                                r0Var.f97315d = i18;
                            } else if (i27 == 6) {
                                i19++;
                                r0Var.f97315d = i19;
                            }
                            linkedList.add(r0Var);
                        }
                    }
                    com.tencent.mm.plugin.downloader_app.model.r0 r0Var2 = new com.tencent.mm.plugin.downloader_app.model.r0(8);
                    r0Var2.f97325n = n0Var.f97309d;
                    linkedList.add(r0Var2);
                }
                if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    W6(true);
                    return;
                }
                W6(false);
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new l02.o());
                }
                this.f97372d.setData(linkedList);
                return;
            }
        }
        if (z17) {
            W6(true);
        }
    }

    public final void W6(boolean z17) {
        if (z17) {
            android.view.View view = this.f97375g;
            if (view instanceof android.view.ViewStub) {
                android.view.View inflate = ((android.view.ViewStub) view).inflate();
                this.f97375g = inflate;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = this.f97375g;
            if (!(view2 instanceof android.view.ViewStub)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z17) {
            android.view.View view3 = this.f97375g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.plugin.downloader_app.ui.NoTaskLayout) this.f97375g).setData(this.f97382q);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f97380o == 3) {
            overridePendingTransition(com.tencent.mm.R.anim.f477745a6, com.tencent.mm.R.anim.f477752af);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4n;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.downloader_app.model.m0 m0Var;
        boolean z17;
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = this.f97372d;
        if (taskListView != null) {
            if (taskListView.f97422j2) {
                taskListView.l1();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
        }
        if ((this.f97380o == 2) && (m0Var = this.f97383r) != null && m0Var.m0(2)) {
            T6();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("from_scene", 0);
        this.f97380o = intExtra;
        if (intExtra == 3) {
            overridePendingTransition(com.tencent.mm.R.anim.f477904es, com.tencent.mm.R.anim.a_);
        } else if (intExtra == 4) {
            overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadMainUI", "onCreate: " + java.lang.System.currentTimeMillis());
        this.f97376h = true;
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478901k9));
        showActionbarLine();
        setMMTitle(com.tencent.mm.R.string.l8f);
        setBackBtn(new r02.k(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.f490549y8, com.tencent.mm.R.raw.actionbar_icon_dark_search, new r02.l(this));
        this.f97372d = (com.tencent.mm.plugin.downloader_app.ui.TaskListView) findViewById(com.tencent.mm.R.id.i38);
        this.f97373e = (com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView) findViewById(com.tencent.mm.R.id.cte);
        com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = this.f97372d;
        taskListView.f97420h2 = new r02.m(this);
        taskListView.setOnItemButtonClickListener(new r02.n(this));
        this.f97372d.f97421i2 = new r02.o(this);
        this.f97374f = (com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView) findViewById(com.tencent.mm.R.id.gzh);
        this.f97375g = findViewById(com.tencent.mm.R.id.kcu);
        U6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.SOURCE, this.f97380o);
        } catch (org.json.JSONException unused) {
        }
        try {
            str = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException unused2) {
            str = "";
        }
        o02.a.b(10, 0, 0, 1, "", "", str);
        com.tencent.mm.plugin.downloader_app.model.m0 m0Var = new com.tencent.mm.plugin.downloader_app.model.m0(new dp1.u(this));
        this.f97383r = m0Var;
        m0Var.b(16, "GameDownloadFloatBall");
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
        com.tencent.mm.plugin.downloader_app.model.j0.f97286a.m0(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.downloader_app.model.q0.f97310a = null;
        com.tencent.mm.plugin.downloader_app.model.m0 m0Var = this.f97383r;
        if (m0Var != null) {
            m0Var.o0();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        setIntent(intent);
        this.f97372d.l1();
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c02.b bVar;
        super.onPause();
        com.tencent.mm.plugin.downloader_app.model.n0 n0Var = this.f97377i;
        if (n0Var != null) {
            n0Var.getClass();
            j43.c wi6 = ((com.tencent.mm.plugin.game.commlib.l) ((h43.e) i95.n0.c(h43.e.class))).wi();
            wi6.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0("pb_appinfo") && (bVar = n0Var.f97306a) != null) {
                try {
                    wi6.D0("pb_appinfo", bVar.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PBCacheStorage", "Saving Failed: %s", e17.getMessage());
                }
            }
        }
        com.tencent.mm.plugin.downloader_app.model.m0 m0Var = this.f97383r;
        if (m0Var != null) {
            m0Var.z();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f97376h) {
            com.tencent.mm.plugin.downloader_app.model.n0 a17 = com.tencent.mm.plugin.downloader_app.model.q0.a();
            this.f97377i = a17;
            V6(a17, true);
        }
        this.f97376h = false;
        com.tencent.mm.plugin.downloader_app.model.m0 m0Var = this.f97383r;
        if (m0Var != null) {
            m0Var.x();
        }
    }
}
