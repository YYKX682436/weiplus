package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI */
/* loaded from: classes12.dex */
public class ActivityC11497x3bc191a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements r71.a {
    public static final /* synthetic */ int B = 0;

    /* renamed from: g, reason: collision with root package name */
    public s71.b f156024g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 f156025h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f156026i;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f156028n;

    /* renamed from: q, reason: collision with root package name */
    public kk.v f156031q;

    /* renamed from: x, reason: collision with root package name */
    public boolean f156038x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f156039y;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f156021d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f156022e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f156023f = false;

    /* renamed from: m, reason: collision with root package name */
    public r71.c f156027m = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f156029o = null;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f156030p = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f156032r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f156033s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f156034t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f156035u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f156036v = 0;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f156037w = null;

    /* renamed from: z, reason: collision with root package name */
    public int f156040z = -2;
    public int A = -2;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a, s71.b bVar) {
        activityC11497x3bc191a.getClass();
        if (bVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(bVar.f485510n)) {
            sb6.append(activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lnb));
            sb6.append("：");
            sb6.append(bVar.f485510n);
            sb6.append(" \n");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485511o)) {
            sb6.append(activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lrt));
            sb6.append("：");
            if (!android.text.TextUtils.isEmpty(bVar.f485514r)) {
                sb6.append(bVar.f485514r);
                sb6.append(" ");
            }
            sb6.append(bVar.f485511o);
            sb6.append(" \n");
        }
        sb6.append(activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m28));
        sb6.append("：");
        if (!android.text.TextUtils.isEmpty(bVar.f485505f)) {
            sb6.append(bVar.f485505f);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485506g)) {
            sb6.append(bVar.f485506g);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485507h)) {
            sb6.append(bVar.f485507h);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485513q)) {
            sb6.append(bVar.f485513q);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485509m)) {
            sb6.append("\n");
            sb6.append(activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f5s));
            sb6.append("：");
            sb6.append(bVar.f485509m);
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(activityC11497x3bc191a.mo55332x76847179(), null, sb6.toString(), null);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11497x3bc191a.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guh);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSelectAddrUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void U6(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f156036v));
        hashMap.put("page_state", java.lang.Integer.valueOf(this.f156038x ? 2 : 1));
        hashMap.put("oper_enter_type", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "edit_address", hashMap, 33328);
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.class);
        intent.putExtra("address_id", i17);
        intent.putExtra("force_light_mode", this.f156039y);
        intent.putExtra("enter_scene_address", this.f156036v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "editAddressUI", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "editAddressUI", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        synchronized (this.f156030p) {
            o71.l.wi();
            java.util.LinkedList<s71.b> linkedList = o71.l.Bi().f441872a.f485502d;
            this.f156021d = linkedList;
            for (s71.b bVar : linkedList) {
                int i17 = bVar.f485503d;
                if (i17 == this.f156022e) {
                    this.f156024g = bVar;
                    this.f156022e = 0;
                } else {
                    s71.b bVar2 = this.f156024g;
                    if (bVar2 != null && i17 == bVar2.f485503d) {
                        this.f156024g = bVar;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 n3Var = this.f156025h;
            n3Var.f156136e = this.f156021d;
            n3Var.notifyDataSetChanged();
            if (this.f156021d.isEmpty()) {
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564267me);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ptt);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f564267me);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ptt);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return !this.f156038x;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        int i17;
        super.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WalletSelectAddrUI", "finish", new java.lang.Object[0]);
        int i18 = this.f156040z;
        if (i18 == -2 || (i17 = this.A) == -2) {
            return;
        }
        overridePendingTransition(i18, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571138d50;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hb6);
        this.f156029o = textView;
        textView.setVisibility(8);
        this.f156029o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.c3(this));
        this.f156026i = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mps);
        if (getIntent().getBooleanExtra("needHeader", false)) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eqn, (android.view.ViewGroup) this.f156026i, false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sbm);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sbl);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.sbj);
            final android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sbk);
            textView2.setText(getIntent().getStringExtra("headerTitle"));
            textView3.setText(getIntent().getStringExtra("headerDesc"));
            findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a.B;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a.this;
                    activityC11497x3bc191a.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.widget.ImageView imageView2 = imageView;
                    arrayList.add(imageView2);
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC11497x3bc191a, array);
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("result_if_header_selected", true);
                    activityC11497x3bc191a.setResult(-1, intent);
                    activityC11497x3bc191a.finish();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, header selected");
                    yj0.a.h(activityC11497x3bc191a, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f156026i.addHeaderView(inflate);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n3(this, this);
        this.f156025h = n3Var;
        n3Var.f156137f = this.f156023f;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.l_);
        this.f156028n = findViewById2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f156026i.setAdapter((android.widget.ListAdapter) this.f156025h);
        this.f156026i.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.d3(this));
        this.f156026i.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.e3(this));
        V6();
        this.f156028n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.f3(this));
        this.f156025h.notifyDataSetChanged();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.g3(this));
        m78484x84f07bce(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_e), com.p314xaae8f345.mm.R.raw.f79996xebd1f109, new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.h3(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        s71.b bVar;
        if (i17 == 1) {
            if (-1 == i18) {
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddrUtil", "intent == null");
                    bVar = null;
                } else {
                    bVar = new s71.b();
                    bVar.f485512p = intent.getStringExtra("nationalCode");
                    bVar.f485510n = intent.getStringExtra("userName");
                    bVar.f485511o = intent.getStringExtra("telNumber");
                    bVar.f485508i = intent.getStringExtra("addressPostalCode");
                    bVar.f485505f = intent.getStringExtra("proviceFirstStageName");
                    bVar.f485506g = intent.getStringExtra("addressCitySecondStageName");
                    bVar.f485507h = intent.getStringExtra("addressCountiesThirdStageName");
                    bVar.f485513q = intent.getStringExtra("addressCountiesFourStageName");
                    bVar.f485509m = intent.getStringExtra("addressDetailInfo");
                }
                setResult(-1, t71.a.a(bVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, create new address success");
            } else {
                setResult(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] Cancel, create new address success");
            }
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f156033s = intent.getBooleanExtra("launch_from_appbrand", false);
        this.f156034t = intent.getBooleanExtra("launch_from_remittance", false);
        this.f156035u = intent.getBooleanExtra("launch_from_select_addr", false);
        boolean booleanExtra = intent.getBooleanExtra("launch_from_webview", false);
        boolean booleanExtra2 = intent.getBooleanExtra("launch_from_ecs_gift", false);
        this.f156023f = intent.getBooleanExtra("item_selectable", false);
        this.f156022e = intent.getIntExtra("init_addr_id", 0);
        this.f156036v = intent.getIntExtra("enter_scene_address", 0);
        if (booleanExtra || this.f156033s || booleanExtra2) {
            this.f156032r = true;
            android.view.View findViewById = m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f564267me);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if ((this.f156033s || booleanExtra2) && !this.f156038x) {
                getWindow().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560994zy);
            }
            if (booleanExtra) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "showDisclaimerDailog()");
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADDRESS_HAS_SHOW_DISCLAIMER_DIALOG_BOOLEAN_SYNC;
                if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "isShowDisclaimerDialog");
                    db5.e1.y(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571461fr), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571462fs), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571241h), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.a3(this));
                    c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
                }
            }
        }
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        ((android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.cgi)).setOnScrollChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.y2(this));
        findViewById(com.p314xaae8f345.mm.R.id.pts).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.z2(this));
        this.f156027m = new r71.c(this, this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571460fq);
        if (this.f156035u || this.f156034t || this.f156032r) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ld7);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("pageTitle"))) {
            mo54450xbf7c1df6(intent.getStringExtra("pageTitle"));
        }
        this.f156027m.a(417);
        this.f156027m.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8);
        this.f156027m.a(419);
        this.f156027m.a(nd1.k1.f72951x366c91de);
        this.f156027m.b(new q71.o(0, intent.getStringExtra("req_url"), intent.getStringExtra("req_app_id"), 2), false);
        this.f156031q = new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) c01.d9.b().p().l(9, null), 0));
        o71.l.Bi().g();
        mo43517x10010bd5();
        boolean booleanExtra3 = intent.getBooleanExtra("force_light_mode", false);
        this.f156039y = booleanExtra3;
        if (booleanExtra3) {
            m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.cgi).setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
            m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f564267me).setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
            mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77919x41d15e1e));
            mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77919x41d15e1e));
        }
        int intExtra = intent.getIntExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13299xd840884e, -2);
        int intExtra2 = intent.getIntExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13300x5b49b5b2, -2);
        if (intExtra != -2 && intExtra2 != -2) {
            this.f156040z = intExtra;
            this.A = intExtra2;
            overridePendingTransition(intExtra, intExtra2);
        }
        c01.d9.e().g(new f21.g0(12));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        android.content.Intent intent = getIntent();
        int intExtra = intent.getIntExtra("content_view_height", -1);
        boolean z17 = intExtra != -1;
        this.f156038x = z17;
        if (z17) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.height = intExtra;
            attributes.width = -1;
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setFinishOnTouchOutside(intent.getBooleanExtra("click_empty_close", false));
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            db5.f.c(this, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "forceTransparent = " + this.f156038x);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f156027m.c(417);
        this.f156027m.c(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8);
        this.f156027m.c(419);
        this.f156027m.c(nd1.k1.f72951x366c91de);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f156036v));
        hashMap.put("page_state", java.lang.Integer.valueOf(this.f156038x ? 2 : 1));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "page_in", hashMap, 33328);
        V6();
    }
}
