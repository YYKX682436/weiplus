package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder */
/* loaded from: classes10.dex */
public class ActivityC18586x3f849c5f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f254417g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254418d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254419e;

    /* renamed from: f, reason: collision with root package name */
    public int f254420f = 2;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f activityC18586x3f849c5f, int i17) {
        if (activityC18586x3f849c5f.f254420f == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainFinder", "no update, no need data report");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i18 = activityC18586x3f849c5f.f254420f;
        java.lang.String str = "Block";
        java.lang.String str2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str = "Limited";
        } else if (i17 == 1) {
            str = "Allow";
        } else if (i17 != 2) {
            str = "";
        }
        g0Var.d(20917, 3, 1, 1, "Finder", str2, str, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainFinder", "data report ");
    }

    public static java.lang.String U6() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsv);
    }

    public final void V6() {
        int i17;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0g);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nzv);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nzq);
        textView.setContentDescription(U6());
        textView.setText(U6());
        textView2.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        textView2.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        this.f254418d.setVisibility(8);
        this.f254419e.setVisibility(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = this.f254420f;
        if (i18 == 1) {
            this.f254418d.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2.class)).f254707h.m75941xfb821914(2).isEmpty()) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                java.lang.Object[] array = arrayList4.toArray();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0;
                yj0.a.d(findViewById, array, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setContentDescription(getString(i17) + U6());
        } else if (i18 == 2) {
            this.f254419e.setVisibility(0);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0) + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsTeenModeMainFinder", "doSaveConfig: write teenMode range %s", java.lang.Integer.valueOf(this.f254420f));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f254420f));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cm_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = "";
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2) uVar.c(mo55332x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2.class);
        w2Var.getClass();
        r45.kz2 O6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) ((iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class))).O6();
        w2Var.f254707h = O6;
        w2Var.f254704e = O6.m75939xb282bd08(1);
        int i17 = 0;
        w2Var.f254703d = w2Var.f254707h.m75939xb282bd08(0);
        w2Var.f254705f = w2Var.f254707h.m75942xfb822ef2(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeContentManageUIC", "initSelectedContent: origin teenagerInfo selectedBirthMon=" + w2Var.f254704e + ", selectedBirthYear=" + w2Var.f254703d + ", selectContentFlag=" + w2Var.f254705f);
        if (w2Var.f254707h.m75941xfb821914(2).size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTeenModeContentManageUIC", "initSelectedContent: teenagerInfo is null");
        } else {
            w2Var.O6();
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).T2()) {
                android.widget.TextView textView = (android.widget.TextView) w2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.nzn);
                android.app.Activity context = w2Var.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                try {
                    if (android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "minors_mode", 0) == 1) {
                        i17 = android.provider.Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range", 0);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeUtil", "Setting not found: " + e17.getMessage());
                }
                if (i17 == 1) {
                    str = "0~2 岁";
                } else if (i17 == 2) {
                    str = "3~7 岁";
                } else if (i17 == 3) {
                    str = "8~11 岁";
                } else if (i17 == 4) {
                    str = "12~15 岁";
                } else if (i17 == 5) {
                    str = "16~17 岁";
                }
                textView.setText(str);
            }
        }
        this.f254418d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.o0d);
        this.f254419e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.o0f);
        this.f254420f = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
        V6();
        ((android.view.View) this.f254418d.getParent()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.f5(this));
        ((android.view.View) this.f254419e.getParent()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.g5(this));
        findViewById(com.p314xaae8f345.mm.R.id.o0j).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.h5(this));
        findViewById(com.p314xaae8f345.mm.R.id.o0k).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.i5(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.j5(this));
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ol9);
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        int length = string.length() - 2;
        int length2 = string.length();
        if (length > 0) {
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.k5(this), length, length2, 33);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nzq);
            textView2.setText(spannableString);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        r45.al6 al6Var = new r45.al6();
        al6Var.f451643d = this.f254420f;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            al6Var.f451644e = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f518671h.getBytes());
        }
        al6Var.f451645f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i;
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(223, al6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5540xc4fec7 c5540xc4fec7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5540xc4fec7();
        c5540xc4fec7.f135864g.f88672a = 2;
        c5540xc4fec7.e();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2.class);
    }
}
