package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI */
/* loaded from: classes15.dex */
public class ActivityC17476xb3aa84a7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static int f242266n = 5;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f242267d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.GridView f242268e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wn f242269f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f242270g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f242271h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f242272i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242273m;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7) {
        if (((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).size() > 0 && ((java.util.ArrayList) activityC17476xb3aa84a7.f242267d).size() < 3) {
            db5.e1.s(activityC17476xb3aa84a7, activityC17476xb3aa84a7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j07, 3), activityC17476xb3aa84a7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            return;
        }
        k14.v vVar = new k14.v(activityC17476xb3aa84a7.f242267d);
        gm0.j1.d().g(vVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17476xb3aa84a7.f242273m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC17476xb3aa84a7.f242273m = db5.e1.Q(activityC17476xb3aa84a7, activityC17476xb3aa84a7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), activityC17476xb3aa84a7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), false, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jn(activityC17476xb3aa84a7, vVar));
    }

    public final void U6() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(352277, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            arrayList = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        }
        if (((java.util.ArrayList) this.f242267d).size() == arrayList.size() && this.f242267d.containsAll(arrayList)) {
            finish();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8_), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572037wy), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kn(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ln(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cmc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574631j04);
        this.f242268e = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.oju);
        this.f242269f = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wn(this, null);
        this.f242268e.setColumnWidth(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561425i5));
        this.f242268e.setNumColumns(-1);
        this.f242268e.setStretchMode(1);
        this.f242268e.setHorizontalSpacing(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562066a26) * 2);
        this.f242268e.setVerticalSpacing(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a27));
        this.f242268e.setAdapter((android.widget.ListAdapter) this.f242269f);
        ((android.view.ViewGroup) this.f242268e.getParent()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.on(this));
        this.f242268e.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pn(this));
        this.f242268e.setHorizontalScrollBarEnabled(false);
        this.f242268e.setVerticalScrollBarEnabled(false);
        this.f242268e.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qn(this));
        this.f242270g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ojt);
        java.lang.String stringExtra = getIntent().getStringExtra("trust_friend_show_tips");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f242270g.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j08, 3));
        } else {
            this.f242270g.setText(stringExtra);
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ojx);
        this.f242271h = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) this.f242271h.findViewById(com.p314xaae8f345.mm.R.id.pfx)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.j07, 3));
        this.f242271h.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rn(this));
        findViewById(com.p314xaae8f345.mm.R.id.ojv).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sn(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tn(this));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.un(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo74408xb0dfae51(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            ((java.util.ArrayList) this.f242267d).clear();
            ((java.util.ArrayList) this.f242267d).addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
            this.f242269f.notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(352277, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f242267d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        }
        if (this.f242267d == null) {
            this.f242267d = new java.util.ArrayList();
        }
        m78513xc2a54588().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mn(this));
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242273m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            db5.e1.T(this, str);
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 869) {
            if (m1Var.mo808xfb85f7b0() == 583) {
                gm0.j1.u().c().w(352277, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f242267d, ","));
                finish();
                return;
            }
            return;
        }
        r45.mp3 mp3Var = (r45.mp3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
        f242266n = mp3Var.f462260e;
        java.util.LinkedList linkedList = mp3Var.f462259d;
        boolean z17 = true;
        if (linkedList.size() == ((java.util.ArrayList) this.f242267d).size()) {
            if (linkedList.size() != 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((java.util.ArrayList) this.f242267d).contains(((r45.fq6) it.next()).f456087d)) {
                        break;
                    }
                }
            }
            z17 = false;
        }
        if (z17) {
            ((java.util.ArrayList) this.f242267d).clear();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((java.util.ArrayList) this.f242267d).add(((r45.fq6) it6.next()).f456087d);
            }
            this.f242269f.notifyDataSetChanged();
        }
        if (((java.util.ArrayList) this.f242267d).size() > 0 && ((java.util.ArrayList) this.f242267d).size() < 3) {
            android.view.View view = this.f242271h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gm0.j1.u().c().w(352277, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f242267d, ","));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        gm0.j1.d().a(869, this);
        gm0.j1.d().a(583, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(869, this);
        gm0.j1.d().q(583, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(n14.g.class);
    }
}
