package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI */
/* loaded from: classes11.dex */
public class ActivityC17463xb337a9ea extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f242216y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f242217d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 f242218e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242219f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f242220g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f242221h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f242222i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.ValueAnimator f242223m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f242224n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f242225o;

    /* renamed from: p, reason: collision with root package name */
    public int f242226p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f242227q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f242228r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f242229s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f242230t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f242231u = "";

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f242232v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final android.content.BroadcastReceiver f242233w = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.km(this);

    /* renamed from: x, reason: collision with root package name */
    public final w24.s f242234x = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rm(this);

    public final void T6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70 c17358xfe5b6e70 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70) ((java.util.HashMap) this.f242232v).get(str);
        if (c17358xfe5b6e70 == null || this.f242227q) {
            return;
        }
        this.f242227q = true;
        this.f242218e.m69115xb39124aa(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "doLoginScene: wxid: %s username:%s, ticket:%s", str, c17358xfe5b6e70.f241581e, c17358xfe5b6e70.f241583g);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.v0(str, c17358xfe5b6e70.f241581e, c17358xfe5b6e70.f241583g, true, "", 0));
        this.f242218e.m69120x7fc79908(str);
        this.f242218e.b();
        Y6();
    }

    public final void U6() {
        if (gm0.j1.b().t() && !c01.z1.x()) {
            gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2));
        }
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.r0(0));
        this.f242218e.m69116xd6ad5f65(true);
        this.f242218e.b();
        if (this.f242225o == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jm(this), false);
            this.f242225o = b4Var;
            b4Var.c(8000L, 8000L);
        }
    }

    public final void V6() {
        if (this.f242227q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsSwitchAccountUI", "doing login now, ignore go back request.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "go back");
        int i17 = this.f242226p;
        if (i17 != 2 && i17 != 1) {
            qp1.h0.b();
            finish();
            return;
        }
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
        this.f242227q = false;
    }

    public final void W6() {
        if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
            gm0.j1.d().f152297d.C(false);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsSwitchAccountUI", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var = new com.p314xaae8f345.mm.p957x53236a1b.w0(2);
        w0Var.f152977f = 1;
        gm0.j1.d().g(w0Var);
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "switch account logout");
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
        com.p314xaae8f345.mm.p642xad8b531f.q2.c();
        m78560xe21cbbf(false);
        mo74408xb0dfae51(false);
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
        if (gm0.j1.a()) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            c01.b9.f118602c.b(com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, false, false));
            ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Zi(c01.z1.r());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "last login username in sp %s", c01.b9.f118602c.a("login_user_name", ""));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "last login username in configStg %s", c17.v(u3Var, ""));
        java.util.Map q17 = c01.z1.q();
        java.util.HashMap hashMap = (java.util.HashMap) q17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) hashMap.get("login_user_name")) && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20324x4b09c60e()) == 1) {
            hashMap.put("login_user_name", gm0.j1.u().c().v(u3Var, ""));
        }
        c01.uc.f119047c.g(c01.z1.r(), q17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", true).commit();
        java.lang.String r18 = c01.z1.r();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("action_kill_mm_process");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f242233w;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, 4);
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17372xbab57478.class);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(((java.util.HashMap) this.f242232v).values());
        intent.putParcelableArrayListExtra("key_switch_account_users", arrayList);
        intent.putExtra("key_switch_from_wx_username", r18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("transit_to_switch_account", true).commit();
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), this);
        float q18 = i65.a.q(this);
        intent.putExtra("key_langauage_code", o17);
        intent.putExtra("key_font_scale_size", q18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
        intent.putExtra("key_mm_process_pid", android.os.Process.myPid());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "transitToSwitchAccount", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "transitToSwitchAccount", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.h(this);
    }

    public final void Y6() {
        if (this.f242227q) {
            mo74408xb0dfae51(false);
            return;
        }
        if (((java.util.HashMap) this.f242232v).size() <= 1 && this.f242226p == 0) {
            mo74408xb0dfae51(false);
            this.f242219f = false;
            this.f242218e.m69113x2cb4dbe4(false);
        } else if (!this.f242219f) {
            this.f242217d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574626iz5);
            this.f242222i.setVisibility(8);
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572004w0), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.um(this));
        } else {
            this.f242217d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574623iz2);
            this.f242222i.setVisibility(0);
            if (this.f242228r) {
                mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vm(this));
            } else {
                mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hm(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570987cm3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x012f, code lost:
    
        if (r0.f119049a.contains(r24.f242224n) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c5  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 701) {
            if (i18 == -1) {
                U6();
                return;
            }
            return;
        }
        if (i17 == 702) {
            if (i18 == 1) {
                android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0);
                sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
                sharedPreferences.edit().putBoolean("last_switch_account_to_regui", true).commit();
                W6();
                return;
            }
            if (i18 == -1) {
                java.util.Set d17 = c01.uc.f119047c.d();
                java.util.Map map = this.f242232v;
                ((java.util.HashMap) map).clear();
                java.util.Iterator it = ((java.util.HashSet) d17).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    c01.uc ucVar = c01.uc.f119047c;
                    ((java.util.HashMap) map).put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70(str, ucVar.c(str, "login_user_name"), ucVar.c(str, "last_avatar_path"), ucVar.c(str, "last_logout_no_pwd_ticket"), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(ucVar.c(str, "last_login_use_voice"), 0), ucVar.c(str, "last_login_nick_name"), ucVar.c(str, "last_login_alias")));
                }
                this.f242218e.a(map);
                Y6();
                this.f242218e.b();
                this.f242218e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.im(this, intent));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        java.lang.String k17 = wo.w0.k();
        this.f242230t = k17 + "_" + this.f242231u;
        this.f242231u = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.util.Map map = this.f242229s;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("login_sessionid", this.f242230t);
        hashMap.put("page_sessionid", this.f242231u);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, k17);
        hashMap.put("login_page_type", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AccountLoginPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, map);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 34575);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(281, this);
        gm0.j1.d().q(282, this);
        gm0.j1.d().q(255, this);
        try {
            unregisterReceiver(this.f242233w);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "onResume");
        qp1.h0.a(true, true, true);
        this.f242218e.b();
        Y6();
        int i17 = this.f242226p;
        if ((i17 == 1 || i17 == 2) && gm0.j1.a() && gm0.j1.b().f354787q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "account initialized");
            this.f242227q = true;
            android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
            b17.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            db5.f.k(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0269  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r33, int r34, java.lang.String r35, com.p314xaae8f345.mm.p944x882e457a.m1 r36) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "onStop");
        if (this.f242226p == 1) {
            this.f242218e.getClass();
        }
    }
}
