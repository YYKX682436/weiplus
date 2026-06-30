package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI */
/* loaded from: classes8.dex */
public class ActivityC13242xdf6880d5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f178904s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 f178905d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 f178906e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13251x9a0aef3a f178907f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f178908g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f178909h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 f178910i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f178911m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f178912n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f178913o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f178914p;

    /* renamed from: q, reason: collision with root package name */
    public c02.g f178915q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 f178916r;

    public final void T6() {
        int m54727xfb854877 = this.f178905d.m54727xfb854877();
        for (int i17 = 0; i17 < m54727xfb854877; i17++) {
            r02.q0 q0Var = (r02.q0) this.f178905d.p0(i17);
            if (q0Var != null) {
                android.view.View view = q0Var.f449855d;
                if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) view).a(false);
                }
            }
        }
    }

    public final void U6() {
        h02.a d17;
        this.f178911m = getIntent().getStringExtra("appId");
        boolean booleanExtra = getIntent().getBooleanExtra("view_task", false);
        this.f178912n = booleanExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadMainUI", "initData, appId : %s, viewTask : %b", this.f178911m, java.lang.Boolean.valueOf(booleanExtra));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f178911m;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (this.f178913o == 1 && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(this.f178911m)) != null) {
            g02.c cVar = new g02.c();
            cVar.a(d17);
            cVar.f348962j = 0L;
            g02.b.c(19, cVar);
        }
        ((ku5.t0) ku5.t0.f394148d).g(new r02.r(this));
    }

    public final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 n0Var, boolean z17) {
        this.f178915q = n0Var != null ? n0Var.f178842d : null;
        if (n0Var != null) {
            java.util.Map map = n0Var.f178840b;
            if (!(((java.util.HashMap) map).size() == 0)) {
                java.util.LinkedList c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.c();
                java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0> linkedList = n0Var.f178841c;
                linkedList.clear();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c17)) {
                    java.util.Iterator it = c17.iterator();
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) ((java.util.HashMap) map).get((java.lang.String) it.next());
                        if (r0Var != null) {
                            int i27 = r0Var.f178847c;
                            if (i27 == 2) {
                                i17++;
                                r0Var.f178848d = i17;
                            } else if (i27 == 4) {
                                i18++;
                                r0Var.f178848d = i18;
                            } else if (i27 == 6) {
                                i19++;
                                r0Var.f178848d = i19;
                            }
                            linkedList.add(r0Var);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0(8);
                    r0Var2.f178858n = n0Var.f178842d;
                    linkedList.add(r0Var2);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    W6(true);
                    return;
                }
                W6(false);
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new l02.o());
                }
                this.f178905d.m54728x76491f2c(linkedList);
                return;
            }
        }
        if (z17) {
            W6(true);
        }
    }

    public final void W6(boolean z17) {
        if (z17) {
            android.view.View view = this.f178908g;
            if (view instanceof android.view.ViewStub) {
                android.view.View inflate = ((android.view.ViewStub) view).inflate();
                this.f178908g = inflate;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = this.f178908g;
            if (!(view2 instanceof android.view.ViewStub)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z17) {
            android.view.View view3 = this.f178908g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13246x8af2e5d0) this.f178908g).m54716x76491f2c(this.f178915q);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f178913o == 3) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559278a6, com.p314xaae8f345.mm.R.C30854x2dc211.f559285af);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a4n;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 m0Var;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = this.f178905d;
        if (c13250xfa9a7928 != null) {
            if (c13250xfa9a7928.f178955j2) {
                c13250xfa9a7928.l1();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
        }
        if ((this.f178913o == 2) && (m0Var = this.f178916r) != null && m0Var.m0(2)) {
            T6();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("from_scene", 0);
        this.f178913o = intExtra;
        if (intExtra == 3) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559437es, com.p314xaae8f345.mm.R.C30854x2dc211.a_);
        } else if (intExtra == 4) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadMainUI", "onCreate: " + java.lang.System.currentTimeMillis());
        this.f178909h = true;
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560434k9));
        m78599xdf056fb4();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.l8f);
        mo54448x9c8c0d33(new r02.k(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new r02.l(this));
        this.f178905d = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928) findViewById(com.p314xaae8f345.mm.R.id.i38);
        this.f178906e = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0) findViewById(com.p314xaae8f345.mm.R.id.cte);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = this.f178905d;
        c13250xfa9a7928.f178953h2 = new r02.m(this);
        c13250xfa9a7928.m54729x8f299b16(new r02.n(this));
        this.f178905d.f178954i2 = new r02.o(this);
        this.f178907f = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13251x9a0aef3a) findViewById(com.p314xaae8f345.mm.R.id.gzh);
        this.f178908g = findViewById(com.p314xaae8f345.mm.R.id.kcu);
        U6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.f77502x92235c1b, this.f178913o);
        } catch (org.json.JSONException unused) {
        }
        try {
            str = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException unused2) {
            str = "";
        }
        o02.a.b(10, 0, 0, 1, "", "", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0(new dp1.u(this));
        this.f178916r = m0Var;
        m0Var.b(16, "GameDownloadFloatBall");
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.m0(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.f178843a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 m0Var = this.f178916r;
        if (m0Var != null) {
            m0Var.o0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        setIntent(intent);
        this.f178905d.l1();
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c02.b bVar;
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 n0Var = this.f178910i;
        if (n0Var != null) {
            n0Var.getClass();
            j43.c wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.l) ((h43.e) i95.n0.c(h43.e.class))).wi();
            wi6.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("pb_appinfo") && (bVar = n0Var.f178839a) != null) {
                try {
                    wi6.D0("pb_appinfo", bVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PBCacheStorage", "Saving Failed: %s", e17.getMessage());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 m0Var = this.f178916r;
        if (m0Var != null) {
            m0Var.z();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f178909h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.a();
            this.f178910i = a17;
            V6(a17, true);
        }
        this.f178909h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.m0 m0Var = this.f178916r;
        if (m0Var != null) {
            m0Var.x();
        }
    }
}
