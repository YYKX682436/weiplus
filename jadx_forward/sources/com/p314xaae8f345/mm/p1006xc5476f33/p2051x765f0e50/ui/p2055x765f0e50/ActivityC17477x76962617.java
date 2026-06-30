package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI */
/* loaded from: classes11.dex */
public class ActivityC17477x76962617 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef implements l75.z0 {
    public static final /* synthetic */ int I = 0;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 C;
    public android.view.View D;
    public android.widget.CheckBox E;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 F;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242274g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f242276i;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f242279o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f242280p;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f242284t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f242285u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f242286v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f242287w;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b f242289y;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f242275h = null;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f242277m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f242278n = null;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f242281q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f242282r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f242283s = false;

    /* renamed from: x, reason: collision with root package name */
    public final d70.j f242288x = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.io(this);

    /* renamed from: z, reason: collision with root package name */
    public final int f242290z = 1;
    public final int A = 2;
    public final int B = 3;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 G = null;
    public com.p314xaae8f345.mm.p944x882e457a.u0 H = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsUI", "dklogout User EXIT Now uin:%d", java.lang.Integer.valueOf(gm0.j1.b().h()));
        if (!gm0.j1.b().t() || c01.z1.x()) {
            o7();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.Cdo cdo = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.Cdo(this);
        this.H = cdo;
        d17.a(281, cdo);
        de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
        gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) wi6);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eo(this, wi6), false);
        this.G = b4Var;
        b4Var.c(5000L, 5000L);
        this.f242275h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fo(this, wi6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y6() {
        if (gm0.j1.b().t()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (com.p314xaae8f345.mm.ui.bk.A() && !c01.z1.x()) {
                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.no noVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.no(this);
                this.f242277m = noVar;
                d17.a(281, noVar);
                de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
                gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) wi6);
                Z6();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oo(this, wi6), false);
                this.f242279o = b4Var;
                b4Var.c(5000L, 5000L);
                this.f242275h = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.po(this, wi6));
                return;
            }
        }
        Z6();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qo(this), false);
        this.f242280p = b4Var2;
        b4Var2.c(3000L, 3000L);
        this.f242275h = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbe), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ro(this));
    }

    public final void Z6() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.to toVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.to(this);
        this.f242278n = toVar;
        d17.a(282, toVar);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.r0(4));
    }

    public final void a7(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("welcome_page_show");
        if (z17) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).i();
        } else {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.c(-1, null);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
        c5180xccb1ebb1.f135526g.f88523a = false;
        c5180xccb1ebb1.e();
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).g();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        finish();
        if (k35.p.f385476a != null) {
            com.p314xaae8f345.mm.ui.vb.d(mo55332x76847179(), z17, 2);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b b7() {
        if (this.f242289y == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a;
            this.f242289y = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e(this.f242274g, "settings_chatting");
        }
        return this.f242289y;
    }

    public final java.lang.String c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_welab");
        return (c16742x4f474056 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16742x4f474056.f279286x0)) ? (c16742x4f474056 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(c16742x4f474056.f279309m)) ? "" : c16742x4f474056.f279309m.toString() : c16742x4f474056.f279286x0;
    }

    public final boolean d7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetAccount", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetAccount", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final boolean e7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final boolean f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11545, 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
        if (this.D == null) {
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cl9, null);
            this.D = inflate;
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568406mq3);
            this.E = checkBox;
            checkBox.setChecked(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.C;
        if (j0Var == null) {
            this.C = db5.e1.r(mo55332x76847179(), null, this.D, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gis), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bo(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.co(this));
        } else {
            j0Var.show();
        }
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        if (4 == o17) {
        }
        if (6 == o17) {
            q7();
        } else if (64 == o17) {
            p7();
        }
        if (obj == com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC) {
            t7();
        }
    }

    public final boolean g7(boolean z17) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        if (u11.c.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "oversea user logout");
            db5.e1.K(mo55332x76847179(), true, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574579is5), "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574575is0), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lo(this), null);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11545, 8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCloseEntrance");
        c01.uc ucVar = c01.uc.f119047c;
        if (((java.util.HashSet) ucVar.d()).size() > 1) {
            g0Var.d(14978, 1, 10, ucVar.f(), ucVar.e(), wo.w0.k());
        } else {
            g0Var.d(14978, 0, 10, ucVar.f(), ucVar.e(), wo.w0.k());
        }
        if (z17) {
            this.f242284t = (android.view.ViewGroup) android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.enr, (android.view.ViewGroup) null);
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            js.a aVar = js.a.WCAccountLogoutEntry_NO_PWD;
            is.f fVar = (is.f) r0Var;
            boolean aj6 = fVar.aj(aVar);
            if (aj6) {
                if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).bj(c01.z1.r()) && (viewGroup2 = this.f242284t) != null) {
                    android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.ud8);
                    this.f242285u = textView;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.f242285u.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.this;
                                activityC17477x76962617.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(view);
                                java.lang.Object[] array = arrayList.toArray();
                                arrayList.clear();
                                yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC17477x76962617, array);
                                v61.d.g("one_clk_login_logout", 0);
                                android.content.Intent intent = new android.content.Intent(activityC17477x76962617.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
                                intent.putExtra("highlight_item_id", "settings_no_pwd_title");
                                j45.l.j(activityC17477x76962617.mo55332x76847179(), "setting", ".ui.setting.SettingsAccountInfoUI", intent, null);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC17477x76962617.F;
                                if (z2Var != null) {
                                    z2Var.B();
                                }
                                yj0.a.h(activityC17477x76962617, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                        v61.d.h("one_clk_login_logout", 0);
                    }
                }
                fVar.Bi(aVar);
            }
            js.a aVar2 = js.a.WCAccountLogoutEntry_Fingerprint;
            boolean aj7 = fVar.aj(aVar2);
            if (aj7) {
                if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(c01.z1.r()) && (viewGroup = this.f242284t) != null) {
                    android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ud7);
                    this.f242286v = textView2;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        this.f242286v.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.this;
                                activityC17477x76962617.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(view);
                                java.lang.Object[] array = arrayList.toArray();
                                arrayList.clear();
                                yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC17477x76962617, array);
                                v61.d.g("fingerprint_login_logout", 0);
                                android.content.Intent intent = new android.content.Intent(activityC17477x76962617.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
                                intent.putExtra("highlight_item_id", "settings_fingerprint_title");
                                j45.l.j(activityC17477x76962617.mo55332x76847179(), "setting", ".ui.setting.SettingsAccountInfoUI", intent, null);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC17477x76962617.F;
                                if (z2Var != null) {
                                    z2Var.B();
                                }
                                yj0.a.h(activityC17477x76962617, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                        v61.d.h("fingerprint_login_logout", 0);
                    }
                }
                fVar.Bi(aVar2);
            }
            if (aj6 || aj7) {
                android.widget.TextView textView3 = (android.widget.TextView) this.f242284t.findViewById(com.p314xaae8f345.mm.R.id.f567239ud4);
                if (textView3 != null) {
                    textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p_2);
                }
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f242284t.findViewById(com.p314xaae8f345.mm.R.id.ud9);
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 1, 0, true);
            this.F = z2Var;
            z2Var.m(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.git));
            this.F.o(2);
            this.F.v(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.F;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$a
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.this;
                    activityC17477x76962617.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "onCancel");
                    activityC17477x76962617.F.B();
                }
            };
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$b
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.this;
                    activityC17477x76962617.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "logout");
                    activityC17477x76962617.F.B();
                    activityC17477x76962617.h7();
                }
            };
            z2Var2.D = p3Var;
            z2Var2.E = p3Var2;
            z2Var2.j(this.f242284t);
            this.F.C();
            v61.d.h("logout_float", 0);
        } else {
            this.f242276i.v();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576465c0;
    }

    public final boolean h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11545, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        g0Var.d(11545, 3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
        g0Var.mo68477x336bdfd8(99L, 145L, 1L, false);
        if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
            gm0.j1.d().f152297d.C(false);
        }
        m7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        return true;
    }

    public final void i7() {
        db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.giw), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bln), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ao(this), null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.izw);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f242274g = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("settings_notification_preference").J(com.p314xaae8f345.mm.R.C30867xcad56011.oho);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ap(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        this.f242276i = k0Var;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bp(this);
        k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cp(this));
        this.f242276i.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dp(this);
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ep(this));
        q7();
        s7();
        r7();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_switch_account");
        c21540x14db2dcd.U = false;
        c21540x14db2dcd.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyv), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        java.lang.String r17 = c01.z1.r();
        boolean bj6 = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).bj(r17);
        boolean Zi = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(r17);
        if ((com.p314xaae8f345.mm.ui.bk.A() || c01.z1.x()) || !(bj6 || Zi)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_logout_new", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_close", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_logout");
            c21540x14db2dcd2.U = false;
            c21540x14db2dcd2.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574575is0), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_logout", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_logout_new");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd c21540x14db2dcd4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21540x14db2dcd) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_close");
            c21540x14db2dcd3.U = false;
            c21540x14db2dcd3.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.git), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            c21540x14db2dcd4.U = false;
            c21540x14db2dcd4.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gis), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        rn3.i.Di().k((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_account_info"));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_dnd_mode_switch_new, 0) == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_active_time", true);
        }
    }

    public final void j7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574578is3));
        u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574577is2));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zn(this));
        u1Var.a(true);
        u1Var.q(false);
    }

    public final void k7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea.class);
        intent.putExtra("key_scene", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "jumpToSwitchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "jumpToSwitchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void l7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "oneliang logout mm");
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Zi(c01.z1.r());
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.q2.c();
        gm0.j1.u().c().e(this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
        am.hj hjVar = c5691xc916fb10.f136017g;
        hjVar.getClass();
        hjVar.f88369a = 0;
        c5691xc916fb10.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
        c5180xccb1ebb1.f135526g.f88523a = true;
        c5180xccb1ebb1.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("show_whatsnew");
        gm0.k2.a(this, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(8);
        gm0.j1.n().e();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5177x8d056a0c().e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("Intro_Switch", true);
        ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(intent, mo55332x76847179());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        finish();
    }

    public final void m7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsUI", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        if (c01.z1.x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "queryHasPwdAndLogout: skip QueryHasPasswd for ex-device, do logout directly");
            Y6();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ho hoVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ho(this);
        this.f242281q = hoVar;
        d17.a(255, hoVar);
        com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var = new com.p314xaae8f345.mm.p957x53236a1b.w0(2);
        w0Var.f152977f = 2;
        gm0.j1.d().g(w0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jo(this, w0Var), false);
        this.f242279o = b4Var;
        b4Var.c(12000L, 12000L);
        this.f242275h = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbe), true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ko(this, w0Var));
        if (gm0.j1.a()) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            c01.b9.f118602c.b(com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, false, false));
        }
    }

    public final void n7(boolean z17) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c c7010x69e1879c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(34));
        if (z17) {
            c7010x69e1879c.f143232d = 5L;
        } else {
            c7010x69e1879c.f143232d = 4L;
        }
        java.lang.Object obj2 = c17.first;
        if (obj2 == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_NONE) {
            c7010x69e1879c.f143234f = 2L;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c7())) {
                c7010x69e1879c.p(c7());
            }
        } else {
            c7010x69e1879c.f143234f = 1L;
            c7010x69e1879c.f143235g = ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) obj2).f233929e;
            if (obj2 == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE && (obj = c17.second) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.pm6) obj).f464720e)) {
                c7010x69e1879c.p(((r45.pm6) c17.second).f464720e);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c7())) {
                c7010x69e1879c.p(c7());
            }
        }
        tn3.b bVar = tn3.c.f502356a;
        c7010x69e1879c.f143236h = !bVar.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? this.A : bVar.c() ? this.f242290z : this.B;
        c7010x69e1879c.k();
    }

    public final void o7() {
        if (c01.z1.x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "setPwdOrexit: skip QueryHasPasswd for ex-device, exit directly");
            a7(true);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vo voVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vo(this);
        this.f242281q = voVar;
        d17.a(255, voVar);
        com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var = new com.p314xaae8f345.mm.p957x53236a1b.w0(2);
        w0Var.f152977f = 1;
        gm0.j1.d().g(w0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xo(this, w0Var), false);
        this.f242279o = b4Var;
        b4Var.c(5000L, 5000L);
        this.f242275h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbd), true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yo(this, w0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2) {
            if (intent == null) {
                return;
            }
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 1);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r(), true, false));
            intent2.putExtra("CropImage_ImgPath", b17);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).q(this, intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 3) {
            vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext2 = getApplicationContext();
            java.lang.String a18 = g83.a.a();
            ((ub0.r) oVar2).getClass();
            java.lang.String b18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext2, intent, a18);
            if (b18 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", b18);
            intent3.putExtra("CropImage_ImgPath", b18);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).p(mo55332x76847179(), intent3, 4);
            return;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                super.onActivityResult(i17, i18, intent);
                return;
            } else {
                if (i18 == -1) {
                    l7();
                    return;
                }
                return;
            }
        }
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsUI", "crop picture failed");
            return;
        }
        kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k0) l0Var).getClass();
        new com.p314xaae8f345.mm.p943x351df9c2.y0(mo55332x76847179, stringExtra, false).b(1, null, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.b().m()) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("jumptocare", false)) {
            e7();
        }
        mo43517x10010bd5();
        gm0.j1.u().c().a(this);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().a(this.f242288x);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "unset more tab dot");
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsUI)).Rj(this, iy1.a.Setting);
        ((f50.c0) i95.n0.c(f50.c0.class)).getClass();
        l14.e eVar = l14.e.f396541a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationReporter", "reportSettingsMainPage");
        java.util.Map map = l14.e.f396542b;
        ((java.util.LinkedHashMap) map).clear();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Gj(50236, "page_in", map, 33328);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (gm0.j1.a()) {
            gm0.j1.u().c().e(this);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().m(this.f242288x);
        }
        if (this.f242277m != null) {
            gm0.j1.d().q(281, this.f242277m);
        }
        if (this.f242281q != null) {
            gm0.j1.d().q(255, this.f242281q);
        }
        if (this.H != null) {
            gm0.j1.d().q(281, this.H);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a.d(b7());
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (gm0.j1.a()) {
            gm0.j1.e().f(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zo(this));
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().q("plugin");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a.d(b7());
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        android.widget.CheckBox checkBox;
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", str + " item has been clicked!");
        if ("settings_welab".equals(str)) {
            n7(true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_plugin_params, "", true))) {
                android.content.Intent intent = new android.content.Intent();
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                arrayList.add("labs_browse");
                intent.putStringArrayListExtra("key_exclude_apps", arrayList);
                ((ty4.q) ((uy4.x) i95.n0.c(uy4.x.class))).Bi(this, intent);
            } else {
                try {
                    java.lang.String b17 = v24.w0.f514494a.b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "openLiteApp query:%s", b17);
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).bj(this, b17);
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(48);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsUI", e17, "openLiteApp ", new java.lang.Object[0]);
                }
            }
            rn3.i.Di().a(34);
            return true;
        }
        if ("settings_personnal_info".equals(str)) {
            d7();
            return true;
        }
        if ("settings_account_info".equals(str)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "unset setting account info dot show");
            }
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257);
            rn3.i.Di().a(51);
            m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17406x466e30cc.class);
            return true;
        }
        if ("settings_teen_mode".equals(str)) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).i3(this);
            return true;
        }
        if ("settings_care_mode".equals(str)) {
            e7();
            return true;
        }
        if ("settings_account".equals(str)) {
            d7();
            return true;
        }
        if (str.equals("settings_bind_mobile")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
            intent2.putExtra("key_upload_scene", 4);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent2);
            return true;
        }
        if (str.equals("settings_about_privacy")) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PRIVATY_RED_DOT_DID_SHOW_ID_INT;
            if (intValue > ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(21529, java.lang.String.format("%s,%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 4));
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17456x15980719.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetPrivacy", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetPrivacy", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_about_system")) {
            rn3.i.Di().a(31);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262158, 266265);
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetSystem", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetSystem", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_about_micromsg")) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262145, 266243);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262157, 266262);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262164, 266269);
            rn3.i.Di().a(38);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent5);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(mo55332x76847179, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetMicroMsg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetMicroMsg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).aj();
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yn(this), 100L);
            return true;
        }
        if (str.equals("settings_about_device")) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = "wxd930c3b7cf7c92e6";
            b1Var.f398555f = "pages/device-list/device-list.html";
            b1Var.f398551d = 0;
            b1Var.f398549c = 0;
            b1Var.f398565k = 1112;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(mo55332x76847179(), b1Var);
            return true;
        }
        if (str.equals("settings_logout")) {
            g7(false);
            return true;
        }
        if (str.equals("settings_logout_new")) {
            g7(true);
            return true;
        }
        if (str.equals("settings_exit")) {
            f7();
            return true;
        }
        if (str.equals("settings_close")) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.enk, (android.view.ViewGroup) null);
            this.f242287w = viewGroup;
            if (viewGroup != null && (checkBox = (android.widget.CheckBox) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568406mq3)) != null) {
                checkBox.setChecked(true);
            }
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 1, 0, false);
            z2Var.m(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gis));
            z2Var.o(2);
            z2Var.v(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$d
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11545, 5);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2.this.B();
                }
            };
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$e
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.I;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617.this;
                    activityC17477x76962617.getClass();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
                    android.widget.CheckBox checkBox2 = (android.widget.CheckBox) activityC17477x76962617.f242287w.findViewById(com.p314xaae8f345.mm.R.id.f568406mq3);
                    if (checkBox2 == null || !checkBox2.isChecked()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "normally exit");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.mo68477x336bdfd8(99L, 144L, 1L, false);
                        g0Var.d(11545, 7);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
                        if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
                            gm0.j1.d().f152297d.C(false);
                        }
                        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
                        activityC17477x76962617.X6();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "push notify mode exit");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.mo68477x336bdfd8(99L, 143L, 1L, false);
                        g0Var2.d(11545, 6);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
                        o4Var.getClass();
                        o4Var.putBoolean("is_in_notify_mode", true);
                        activityC17477x76962617.a7(false);
                    }
                    z2Var.B();
                }
            };
            z2Var.D = p3Var;
            z2Var.E = p3Var2;
            z2Var.j(this.f242287w);
            z2Var.C();
            return true;
        }
        if (str.equals("settings_logout_option")) {
            h7();
            return true;
        }
        if (str.equals("settings_notification_preference")) {
            android.content.Intent intent6 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17449x1794bfe2.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent6);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetNotification", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetNotification", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_chatting")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).notifyDataSetChanged();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).notifyDataSetChanged();
            m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17417xe2e7cffd.class);
            return true;
        }
        if (str.equals("settings_active_time")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11351, 1, 0);
            m78603xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17410x62ce94aa.class);
            return true;
        }
        if (str.equals("settings_feedback")) {
            if (c01.e2.a0()) {
                java.lang.String string = (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273981k || !(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_HK") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_TW"))) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8h) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8g);
                android.content.Intent intent7 = new android.content.Intent();
                intent7.putExtra("showShare", false);
                intent7.putExtra("rawUrl", string);
                intent7.putExtra("show_feedback", false);
                intent7.putExtra("KShowFixToolsBtn", true);
                j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent7, null);
            } else {
                com.p314xaae8f345.mm.app.j3.b();
                java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575221la4);
                android.content.Intent intent8 = new android.content.Intent();
                intent8.putExtra("showShare", false);
                intent8.putExtra("rawUrl", string2);
                intent8.putExtra("show_feedback", false);
                intent8.putExtra("KShowFixToolsBtn", true);
                j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent8, null);
            }
        } else if (str.equals("settings_switch_account")) {
            c01.uc ucVar = c01.uc.f119047c;
            if (((java.util.HashSet) ucVar.d()).size() > 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 1, 6, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 0, 6, ucVar.f(), ucVar.e(), wo.w0.k());
            }
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (c01.z1.r().startsWith("wxid") && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !c01.z1.x() && ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
                j7();
                return true;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                i7();
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_SWITCH_ACCOUNT_FIRST_CLICK_BOOLEAN_SYNC;
                if (c18.o(u3Var2, true)) {
                    gm0.j1.u().c().x(u3Var2, java.lang.Boolean.FALSE);
                    db5.e1.E(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyx), getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyy), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fp(this));
                } else {
                    k7();
                }
            }
        } else {
            if (str.equals("settings_permission_index")) {
                android.content.Intent intent9 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17450x1e5c1014.class);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(intent9);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList6.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            if (str.equals("settings_privacy_personal_list")) {
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalite1af500fa066e5b60505c414cd42cacbc")) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("appId", "wxalite1af500fa066e5b60505c414cd42cacbc");
                    bundle.putString("query", "{\"t\":\"datalist/personal\"}");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "open liteapp:wxalite1af500fa066e5b60505c414cd42cacbc,page:");
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(mo55332x76847179(), bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xn(this));
                } else {
                    java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_personal_privacy_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/personal", true);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f239681a.c();
                        android.content.Intent intent10 = new android.content.Intent();
                        intent10.putExtra("showShare", false);
                        intent10.putExtra("rawUrl", Zi);
                        intent10.putExtra("show_feedback", false);
                        intent10.putExtra("show_bottom", false);
                        intent10.putExtra("needRedirect", false);
                        intent10.putExtra("neverGetA8Key", false);
                        j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent10, null);
                    }
                }
                return true;
            }
            if (str.equals("settings_privacy_third_party_list")) {
                java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_privacy_third_party_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/shared", true);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi2)) {
                    android.content.Intent intent11 = new android.content.Intent();
                    intent11.putExtra("showShare", false);
                    intent11.putExtra("rawUrl", Zi2);
                    intent11.putExtra("show_feedback", false);
                    intent11.putExtra("show_bottom", false);
                    intent11.putExtra("needRedirect", false);
                    intent11.putExtra("neverGetA8Key", false);
                    j45.l.j(mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent11, null);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17377x5731ab5b c17377x5731ab5b = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17377x5731ab5b) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_account");
        if (c17377x5731ab5b != null) {
            java.lang.String r17 = c01.z1.r();
            c17377x5731ab5b.M = -1;
            c17377x5731ab5b.N = r17;
            if (c17377x5731ab5b.L != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(c17377x5731ab5b.L, c17377x5731ab5b.N, null);
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_device_entry, 0) != 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5370xd06e2456 c5370xd06e2456 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5370xd06e2456();
            c5370xd06e2456.e();
            if (!c5370xd06e2456.f135701g.f87870a) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).v(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_about_device"));
            }
        }
        p7();
        t7();
        q7();
        s7();
        r7();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetPlugin.h() || c01.e2.a0()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_welab", true);
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_plugin_params, "", true))) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalitebf3a88de4da873052ba340892dc97559", null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_welab");
            rn3.i.Di().k(c16742x4f474056);
            c16742x4f474056.n0(this.f242274g);
            c16742x4f474056.h0();
            ty4.q qVar = (ty4.q) ((uy4.x) i95.n0.c(uy4.x.class));
            boolean Ai = qVar.Ai();
            boolean z17 = !qVar.Ai();
            boolean wi6 = qVar.wi();
            boolean o07 = c16742x4f474056.o0(Ai || (z17 && wi6));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "updateWeLab :%s %s %s %s", java.lang.Boolean.valueOf(o07), java.lang.Boolean.valueOf(Ai), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(wi6));
            if (!o07) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
                if (Ai) {
                    c16742x4f474056.a0(0);
                    c16742x4f474056.V = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
                    c16742x4f474056.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
                    c16742x4f474056.e5(rVar, true);
                } else {
                    c16742x4f474056.a0(8);
                }
                if (!z17) {
                    c16742x4f474056.Y = 8;
                    c16742x4f474056.T1 = -1;
                } else if (wi6) {
                    c16742x4f474056.Y = 0;
                    c16742x4f474056.T1 = com.p314xaae8f345.mm.R.C30861xcebc809e.b8i;
                    c16742x4f474056.e5(rVar, true);
                } else {
                    c16742x4f474056.Y = 0;
                    c16742x4f474056.T1 = com.p314xaae8f345.mm.R.raw.f81426xbefcaaa5;
                }
                c16742x4f474056.f233895f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17480xafb1a6c(c16742x4f474056);
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) rn3.i.Di().c(new vn3.c(34)).first;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "updateWeLab: getShouldShowType type:%s", rVar2);
                if (rVar2 == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_NONE) {
                    java.lang.String c17 = v24.s0.c();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                        c16742x4f474056.D = true;
                        c16742x4f474056.E = android.text.TextUtils.TruncateAt.END;
                        c16742x4f474056.H(c17);
                    }
                }
            }
        }
        if (j65.e.d()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_care_mode", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_care_mode", false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_care_mode");
            if (j65.e.b()) {
                h17.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb));
            }
        }
        super.onResume();
        if (!this.f242282r) {
            this.f242282r = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wo(this));
        }
        if (!this.f242283s) {
            this.f242283s = true;
            n7(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a.c(b7());
    }

    public final void p7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_account_info");
        if (c21549x15041e54 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsUI", "safedevicesate preference is null");
            return;
        }
        c21549x15041e54.Y(8);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().c(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257)) {
            c21549x15041e54.c0(0);
        } else {
            c21549x15041e54.c0(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1) {
            if (!((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
                c21549x15041e54.a0(8);
                c21549x15041e54.V = "";
                c21549x15041e54.W = -1;
            } else if ((gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                c21549x15041e54.V = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
                c21549x15041e54.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
                c21549x15041e54.a0(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "show voiceprint dot");
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).notifyDataSetChanged();
        }
    }

    public final void q7() {
        js.x0 b17 = r61.q0.b();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21576x2793341 c21576x2793341 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21576x2793341) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_bind_mobile");
        if (c21576x2793341 != null) {
            js.x0 x0Var = js.x0.SUCC;
            js.x0 x0Var2 = js.x0.SUCC_UNLOAD;
            boolean z17 = b17 == x0Var || b17 == x0Var2;
            c21576x2793341.M = z17;
            android.widget.TextView textView = c21576x2793341.L;
            if (textView != null) {
                android.content.Context context = c21576x2793341.f279303d;
                if (z17) {
                    iz5.a.g(null, context != null);
                    textView.setTextColor(new com.p314xaae8f345.mm.ui.p2740x696c9db.gd(context).f291981a[0]);
                } else {
                    textView.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
                }
            }
            c21576x2793341.G((b17 == x0Var || b17 == x0Var2) ? com.p314xaae8f345.mm.R.C30867xcad56011.iwm : com.p314xaae8f345.mm.R.C30867xcad56011.iwl);
        }
    }

    public final void r7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_about_privacy");
        if (c21549x15041e54 != null) {
            if (((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue() > ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PRIVATY_RED_DOT_DID_SHOW_ID_INT, 0)).intValue()) {
                c21549x15041e54.c0(0);
            } else {
                c21549x15041e54.c0(8);
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_personal_privacy_switcher, 1) == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_permission_index", true);
        }
        boolean z17 = gm0.j1.b().d() == gm0.j.WeChat;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_personal_privacy_list_entry_switcher, 1) == 0;
        if (z17 || z18) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_privacy_personal_list", true);
        }
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_privacy_third_party_list_entry_switcher, 1) == 0;
        if (z17 || z19) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_privacy_third_party_list", true);
        }
    }

    public final void s7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_about_micromsg");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(java.lang.Boolean.valueOf(bk0.a.g().e(262145, 266243)), false);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262157, 266262);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b18 = bk0.a.g().b(262164, 266269);
        if (!m17) {
            rn3.i.Di().k(c16742x4f474056);
        }
        c16742x4f474056.n0(this.f242274g);
        c16742x4f474056.h0();
        boolean o07 = c16742x4f474056.o0(m17 || b17 || b18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        if (!o07) {
            if (m17) {
                c16742x4f474056.a0(0);
                c16742x4f474056.V = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
                c16742x4f474056.W = com.p314xaae8f345.mm.R.C30861xcebc809e.asx;
                c16742x4f474056.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_NEW, true);
            } else if (b17) {
                c16742x4f474056.c0(0);
                c16742x4f474056.e5(rVar, true);
            } else if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).mj()) {
                c16742x4f474056.c0(0);
                c16742x4f474056.e5(rVar, true);
            } else if (b18) {
                c16742x4f474056.c0(0);
                c16742x4f474056.e5(rVar, true);
            } else {
                c16742x4f474056.c0(8);
                c16742x4f474056.V = "";
                c16742x4f474056.W = -1;
                c16742x4f474056.a0(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f4740562 = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_about_system");
        rn3.i.Di().k(c16742x4f4740562);
        c16742x4f4740562.n0(this.f242274g);
        c16742x4f4740562.h0();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b19 = bk0.a.g().b(262158, 266265);
        boolean e17 = rn3.i.Ai().e(1);
        if (c16742x4f4740562.o0(b19 || e17)) {
            return;
        }
        if (!b19 && !e17) {
            c16742x4f4740562.c0(8);
        } else {
            c16742x4f4740562.c0(0);
            c16742x4f4740562.e5(rVar, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(t14.i.class);
    }

    public final void t7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21551x7269e8da c21551x7269e8da = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21551x7269e8da) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).h("settings_teen_mode");
        if (c21551x7269e8da == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsUI", "updateTeenMode Preference null");
            return;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).Xd()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_teen_mode", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUI", "need hide teen-mode entrance");
            if (mo168058x74219ae7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsUI", "already enable TeenMode, need to close it manually");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
                return;
            }
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242274g).m("settings_teen_mode", false);
        if (!mo168058x74219ae7) {
            c21551x7269e8da.H("");
        } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).Yd()) {
            c21551x7269e8da.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb));
        } else {
            c21551x7269e8da.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb));
        }
        c21551x7269e8da.Z1 = -1;
        c21551x7269e8da.h0();
    }
}
