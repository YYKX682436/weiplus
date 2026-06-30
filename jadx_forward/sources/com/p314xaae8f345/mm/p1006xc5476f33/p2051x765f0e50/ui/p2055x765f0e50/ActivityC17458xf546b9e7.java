package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI */
/* loaded from: classes8.dex */
public class ActivityC17458xf546b9e7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f242166z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f242167d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f242168e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f242169f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f242170g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f242171h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f242172i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rl f242174n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ListView f242175o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f242176p;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f242179s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f242173m = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f242177q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f242178r = false;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f242180t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f242181u = -1;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f242182v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f242183w = null;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f242184x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f242185y = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7, java.lang.String str) {
        if (activityC17458xf546b9e7.f242178r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsSearchAuthUI", "isSearching and ignore");
            return;
        }
        k14.e0 e0Var = new k14.e0(str, null, true);
        gm0.j1.d().g(e0Var);
        activityC17458xf546b9e7.f242176p = str;
        activityC17458xf546b9e7.f242178r = true;
        activityC17458xf546b9e7.f242177q = java.lang.Integer.valueOf(e0Var.hashCode());
        android.view.View view = activityC17458xf546b9e7.f242168e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC17458xf546b9e7.f242172i.setVisibility(0);
        activityC17458xf546b9e7.f242170g.setVisibility(8);
        activityC17458xf546b9e7.f242171h.setVisibility(8);
        activityC17458xf546b9e7.f242175o.setVisibility(8);
        ((java.util.ArrayList) activityC17458xf546b9e7.f242173m).clear();
        activityC17458xf546b9e7.m78548x39037dd1();
        android.view.View view2 = activityC17458xf546b9e7.f242180t;
        if (view2 != null) {
            activityC17458xf546b9e7.f242175o.removeFooterView(view2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "doSearchUserAuth id: %s, keyword: %s", activityC17458xf546b9e7.f242177q, str);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7, java.lang.String str, byte[] bArr) {
        if (activityC17458xf546b9e7.f242178r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsSearchAuthUI", "isSearching and ignore");
            return;
        }
        k14.e0 e0Var = new k14.e0(str, bArr, true);
        gm0.j1.d().g(e0Var);
        activityC17458xf546b9e7.f242176p = str;
        activityC17458xf546b9e7.f242178r = true;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e0Var.hashCode());
        activityC17458xf546b9e7.f242177q = valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "doSearchUserAuth id: %s", valueOf);
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7 activityC17458xf546b9e7) {
        android.view.View view = activityC17458xf546b9e7.f242168e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "hideAllView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "hideAllView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC17458xf546b9e7.f242170g.setText("");
        ((java.util.ArrayList) activityC17458xf546b9e7.f242173m).clear();
        activityC17458xf546b9e7.f242175o.setVisibility(8);
        activityC17458xf546b9e7.f242176p = null;
        activityC17458xf546b9e7.m78548x39037dd1();
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "cancelSearch searchId: %s, searchingKeyWord: %s", this.f242177q, this.f242176p);
        this.f242178r = false;
        this.f242176p = null;
        if (this.f242177q != null) {
            gm0.j1.d().c(this.f242177q.intValue());
            this.f242177q = null;
        }
    }

    public final void X6() {
        android.view.View view = this.f242168e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f242170g.setVisibility(8);
        this.f242172i.setVisibility(8);
        this.f242171h.setVisibility(0);
        this.f242171h.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipq));
        this.f242175o.setVisibility(8);
        ((java.util.ArrayList) this.f242173m).clear();
        m78548x39037dd1();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cly;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f242167d = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        this.f242175o = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.a8a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rl rlVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rl(this);
        this.f242174n = rlVar;
        this.f242175o.setAdapter((android.widget.ListAdapter) rlVar);
        this.f242168e = findViewById(com.p314xaae8f345.mm.R.id.mfd);
        this.f242170g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mdf);
        this.f242171h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568304mf5);
        this.f242172i = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.met);
        m78548x39037dd1();
        mo2533x106ab264().y(this.f242167d);
        this.f242167d.m81002xcd6a5043(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kl(this));
        this.f242167d.m80997xdc5215a6().g();
        this.f242167d.m80997xdc5215a6().m80988xce28f7ee(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ll(this));
        this.f242167d.m80997xdc5215a6().m();
        this.f242167d.m80997xdc5215a6().t();
        this.f242170g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ml(this));
        this.f242175o.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nl(this));
        this.f242175o.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ol(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7j);
        this.f242169f = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pl(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        int i19;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000 && i18 == -1 && (list = this.f242173m) != null && this.f242174n != null && (i19 = this.f242181u) >= 0 && i19 < ((java.util.ArrayList) list).size()) {
            ((java.util.ArrayList) list).remove(this.f242181u);
            this.f242174n.notifyDataSetChanged();
            if (this.f242179s != null || ((java.util.ArrayList) list).size() > 1) {
                return;
            }
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(ma1.m.f72805x366c91de, this);
        gm0.j1.d().q(1127, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(ma1.m.f72805x366c91de, this);
        gm0.j1.d().a(1127, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(m1Var != null ? m1Var.mo808xfb85f7b0() : -1);
        objArr[4] = java.lang.Integer.valueOf(m1Var != null ? m1Var.hashCode() : -1);
        objArr[5] = this.f242177q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSearchAuthUI", "errType %d, errCode %d, errMsg %s, type: %s, id: %s, currentSearchId: %s", objArr);
        if (m1Var != null && m1Var.hashCode() == this.f242177q.intValue()) {
            this.f242178r = false;
        }
        java.util.List list = this.f242173m;
        if (m1Var == null || i17 != 0 || i18 != 0) {
            if (m1Var != null && m1Var.mo808xfb85f7b0() == 1169 && m1Var.hashCode() == this.f242177q.intValue()) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.isEmpty()) {
                    android.view.View view = this.f242168e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f242170g.setVisibility(8);
                    this.f242172i.setVisibility(8);
                    this.f242171h.setVisibility(0);
                    this.f242171h.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipp));
                    this.f242175o.setVisibility(8);
                    arrayList.clear();
                    m78548x39037dd1();
                    return;
                }
                if (this.f242182v != null) {
                    android.view.View view2 = this.f242183w;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f242184x;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "checkShowErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 1169) {
            if (m1Var.mo808xfb85f7b0() == 1127) {
                java.lang.String str2 = ((k14.w) m1Var).f384925e;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    return;
                }
                java.util.ArrayList arrayList5 = (java.util.ArrayList) list;
                if (!arrayList5.isEmpty()) {
                    java.util.Iterator it = arrayList5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((r45.ov6) it.next()).f464093d.equals(str2)) {
                            it.remove();
                            break;
                        }
                    }
                }
                this.f242174n.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (m1Var.hashCode() != this.f242177q.intValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsSearchAuthUI", "search scene is cancelled and ignore, %s", java.lang.Integer.valueOf(m1Var.hashCode()));
            return;
        }
        k14.e0 e0Var = (k14.e0) m1Var;
        r45.px5 px5Var = e0Var.f384858f;
        this.f242179s = (px5Var == null || px5Var.f464999g != 1) ? null : px5Var.f464998f.g();
        if (!(e0Var.f384859g != null)) {
            ((java.util.ArrayList) list).clear();
        }
        r45.px5 px5Var2 = e0Var.f384858f;
        java.util.ArrayList arrayList6 = (java.util.ArrayList) list;
        arrayList6.addAll(px5Var2 != null ? px5Var2.f464997e : java.util.Collections.emptyList());
        if (arrayList6.isEmpty()) {
            X6();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rl rlVar = this.f242174n;
        rlVar.f243047d = list;
        rlVar.notifyDataSetChanged();
        android.view.View view4 = this.f242168e;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI", "showSearchListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f242175o.setVisibility(0);
        m78548x39037dd1();
        if (!arrayList6.isEmpty() && this.f242179s == null) {
            android.view.View view5 = this.f242182v;
            if (view5 != null) {
                this.f242185y = false;
                this.f242175o.removeFooterView(view5);
            }
            android.view.View view6 = this.f242180t;
            if (view6 != null) {
                this.f242175o.removeFooterView(view6);
            }
            if (this.f242180t == null) {
                this.f242180t = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpa, (android.view.ViewGroup) null);
            }
            this.f242175o.addFooterView(this.f242180t);
        }
        if (arrayList6.isEmpty() || this.f242179s == null || this.f242185y) {
            return;
        }
        android.view.View view7 = this.f242180t;
        if (view7 != null) {
            this.f242175o.removeFooterView(view7);
        }
        this.f242185y = true;
        if (this.f242182v == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bp8, (android.view.ViewGroup) null);
            this.f242182v = inflate;
            this.f242183w = inflate.findViewById(com.p314xaae8f345.mm.R.id.imd);
            android.view.View findViewById = this.f242182v.findViewById(com.p314xaae8f345.mm.R.id.ime);
            this.f242184x = findViewById;
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jl(this));
        }
        this.f242175o.addFooterView(this.f242182v);
    }
}
