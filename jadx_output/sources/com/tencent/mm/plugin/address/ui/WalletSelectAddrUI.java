package com.tencent.mm.plugin.address.ui;

@db5.a(8192)
/* loaded from: classes12.dex */
public class WalletSelectAddrUI extends com.tencent.mm.ui.MMActivity implements r71.a {
    public static final /* synthetic */ int B = 0;

    /* renamed from: g, reason: collision with root package name */
    public s71.b f74491g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.n3 f74492h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f74493i;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f74495n;

    /* renamed from: q, reason: collision with root package name */
    public kk.v f74498q;

    /* renamed from: x, reason: collision with root package name */
    public boolean f74505x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f74506y;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f74488d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f74489e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74490f = false;

    /* renamed from: m, reason: collision with root package name */
    public r71.c f74494m = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f74496o = null;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f74497p = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f74499r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f74500s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f74501t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f74502u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f74503v = 0;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f74504w = null;

    /* renamed from: z, reason: collision with root package name */
    public int f74507z = -2;
    public int A = -2;

    public static void T6(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI, s71.b bVar) {
        walletSelectAddrUI.getClass();
        if (bVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(bVar.f403977n)) {
            sb6.append(walletSelectAddrUI.getString(com.tencent.mm.R.string.lnb));
            sb6.append("：");
            sb6.append(bVar.f403977n);
            sb6.append(" \n");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403978o)) {
            sb6.append(walletSelectAddrUI.getString(com.tencent.mm.R.string.lrt));
            sb6.append("：");
            if (!android.text.TextUtils.isEmpty(bVar.f403981r)) {
                sb6.append(bVar.f403981r);
                sb6.append(" ");
            }
            sb6.append(bVar.f403978o);
            sb6.append(" \n");
        }
        sb6.append(walletSelectAddrUI.getString(com.tencent.mm.R.string.m28));
        sb6.append("：");
        if (!android.text.TextUtils.isEmpty(bVar.f403972f)) {
            sb6.append(bVar.f403972f);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403973g)) {
            sb6.append(bVar.f403973g);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403974h)) {
            sb6.append(bVar.f403974h);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403980q)) {
            sb6.append(bVar.f403980q);
            sb6.append(" ");
        }
        if (!android.text.TextUtils.isEmpty(bVar.f403976m)) {
            sb6.append("\n");
            sb6.append(walletSelectAddrUI.getString(com.tencent.mm.R.string.f5s));
            sb6.append("：");
            sb6.append(bVar.f403976m);
        }
        try {
            com.tencent.mm.sdk.platformtools.b0.d(walletSelectAddrUI.getContext(), null, sb6.toString(), null);
            androidx.appcompat.app.AppCompatActivity context = walletSelectAddrUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = walletSelectAddrUI.getString(com.tencent.mm.R.string.guh);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSelectAddrUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void U6(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f74503v));
        hashMap.put("page_state", java.lang.Integer.valueOf(this.f74505x ? 2 : 1));
        hashMap.put("oper_enter_type", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "edit_address", hashMap, 33328);
        intent.setClass(this, com.tencent.mm.plugin.address.ui.WalletAddAddressUI.class);
        intent.putExtra("address_id", i17);
        intent.putExtra("force_light_mode", this.f74506y);
        intent.putExtra("enter_scene_address", this.f74503v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "editAddressUI", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "editAddressUI", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        synchronized (this.f74497p) {
            o71.l.wi();
            java.util.LinkedList<s71.b> linkedList = o71.l.Bi().f360339a.f403969d;
            this.f74488d = linkedList;
            for (s71.b bVar : linkedList) {
                int i17 = bVar.f403970d;
                if (i17 == this.f74489e) {
                    this.f74491g = bVar;
                    this.f74489e = 0;
                } else {
                    s71.b bVar2 = this.f74491g;
                    if (bVar2 != null && i17 == bVar2.f403970d) {
                        this.f74491g = bVar;
                    }
                }
            }
            com.tencent.mm.plugin.address.ui.n3 n3Var = this.f74492h;
            n3Var.f74603e = this.f74488d;
            n3Var.notifyDataSetChanged();
            if (this.f74488d.isEmpty()) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482734me);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ptt);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f482734me);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ptt);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "notfiyList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return !this.f74505x;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        int i17;
        super.finish();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletSelectAddrUI", "finish", new java.lang.Object[0]);
        int i18 = this.f74507z;
        if (i18 == -2 || (i17 = this.A) == -2) {
            return;
        }
        overridePendingTransition(i18, i17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489605d50;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hb6);
        this.f74496o = textView;
        textView.setVisibility(8);
        this.f74496o.setOnClickListener(new com.tencent.mm.plugin.address.ui.c3(this));
        this.f74493i = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mps);
        if (getIntent().getBooleanExtra("needHeader", false)) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.eqn, (android.view.ViewGroup) this.f74493i, false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.sbm);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.sbl);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.sbj);
            final android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.sbk);
            textView2.setText(getIntent().getStringExtra("headerTitle"));
            textView3.setText(getIntent().getStringExtra("headerDesc"));
            findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.address.ui.WalletSelectAddrUI$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.B;
                    com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.this;
                    walletSelectAddrUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.widget.ImageView imageView2 = imageView;
                    arrayList.add(imageView2);
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", walletSelectAddrUI, array);
                    imageView2.setImageResource(com.tencent.mm.R.raw.radio_on);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("result_if_header_selected", true);
                    walletSelectAddrUI.setResult(-1, intent);
                    walletSelectAddrUI.finish();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, header selected");
                    yj0.a.h(walletSelectAddrUI, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f74493i.addHeaderView(inflate);
        }
        com.tencent.mm.plugin.address.ui.n3 n3Var = new com.tencent.mm.plugin.address.ui.n3(this, this);
        this.f74492h = n3Var;
        n3Var.f74604f = this.f74490f;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l_);
        this.f74495n = findViewById2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f74493i.setAdapter((android.widget.ListAdapter) this.f74492h);
        this.f74493i.setOnItemClickListener(new com.tencent.mm.plugin.address.ui.d3(this));
        this.f74493i.setOnItemLongClickListener(new com.tencent.mm.plugin.address.ui.e3(this));
        V6();
        this.f74495n.setOnClickListener(new com.tencent.mm.plugin.address.ui.f3(this));
        this.f74492h.notifyDataSetChanged();
        setBackBtn(new com.tencent.mm.plugin.address.ui.g3(this));
        addIconOptionMenu(0, getString(com.tencent.mm.R.string.a_e), com.tencent.mm.R.raw.icons_outlined_add2, new com.tencent.mm.plugin.address.ui.h3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        s71.b bVar;
        if (i17 == 1) {
            if (-1 == i18) {
                if (intent == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AddrUtil", "intent == null");
                    bVar = null;
                } else {
                    bVar = new s71.b();
                    bVar.f403979p = intent.getStringExtra("nationalCode");
                    bVar.f403977n = intent.getStringExtra("userName");
                    bVar.f403978o = intent.getStringExtra("telNumber");
                    bVar.f403975i = intent.getStringExtra("addressPostalCode");
                    bVar.f403972f = intent.getStringExtra("proviceFirstStageName");
                    bVar.f403973g = intent.getStringExtra("addressCitySecondStageName");
                    bVar.f403974h = intent.getStringExtra("addressCountiesThirdStageName");
                    bVar.f403980q = intent.getStringExtra("addressCountiesFourStageName");
                    bVar.f403976m = intent.getStringExtra("addressDetailInfo");
                }
                setResult(-1, t71.a.a(bVar));
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, create new address success");
            } else {
                setResult(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] Cancel, create new address success");
            }
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f74500s = intent.getBooleanExtra("launch_from_appbrand", false);
        this.f74501t = intent.getBooleanExtra("launch_from_remittance", false);
        this.f74502u = intent.getBooleanExtra("launch_from_select_addr", false);
        boolean booleanExtra = intent.getBooleanExtra("launch_from_webview", false);
        boolean booleanExtra2 = intent.getBooleanExtra("launch_from_ecs_gift", false);
        this.f74490f = intent.getBooleanExtra("item_selectable", false);
        this.f74489e = intent.getIntExtra("init_addr_id", 0);
        this.f74503v = intent.getIntExtra("enter_scene_address", 0);
        if (booleanExtra || this.f74500s || booleanExtra2) {
            this.f74499r = true;
            android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.f482734me);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if ((this.f74500s || booleanExtra2) && !this.f74505x) {
                getWindow().setBackgroundDrawableResource(com.tencent.mm.R.color.f479461zy);
            }
            if (booleanExtra) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "showDisclaimerDailog()");
                com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_DISCLAIMER_DIALOG_BOOLEAN_SYNC;
                if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "isShowDisclaimerDialog");
                    db5.e1.y(this, getString(com.tencent.mm.R.string.f489928fr), getString(com.tencent.mm.R.string.f489929fs), getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.plugin.address.ui.a3(this));
                    c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
                }
            }
        }
        setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.cgi)).setOnScrollChangeListener(new com.tencent.mm.plugin.address.ui.y2(this));
        findViewById(com.tencent.mm.R.id.pts).setOnClickListener(new com.tencent.mm.plugin.address.ui.z2(this));
        this.f74494m = new r71.c(this, this);
        setMMTitle(com.tencent.mm.R.string.f489927fq);
        if (this.f74502u || this.f74501t || this.f74499r) {
            setMMTitle(com.tencent.mm.R.string.ld7);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("pageTitle"))) {
            setMMTitle(intent.getStringExtra("pageTitle"));
        }
        this.f74494m.a(417);
        this.f74494m.a(com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC);
        this.f74494m.a(419);
        this.f74494m.a(nd1.k1.CTRL_INDEX);
        this.f74494m.b(new q71.o(0, intent.getStringExtra("req_url"), intent.getStringExtra("req_app_id"), 2), false);
        this.f74498q = new kk.v(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) c01.d9.b().p().l(9, null), 0));
        o71.l.Bi().g();
        initView();
        boolean booleanExtra3 = intent.getBooleanExtra("force_light_mode", false);
        this.f74506y = booleanExtra3;
        if (booleanExtra3) {
            getContentView().findViewById(com.tencent.mm.R.id.cgi).setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
            getContentView().findViewById(com.tencent.mm.R.id.f482734me).setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_BG_100));
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_93));
            setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_93));
        }
        int intExtra = intent.getIntExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_ENTER_ANIMATION, -2);
        int intExtra2 = intent.getIntExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXIT_ANIMATION, -2);
        if (intExtra != -2 && intExtra2 != -2) {
            this.f74507z = intExtra;
            this.A = intExtra2;
            overridePendingTransition(intExtra, intExtra2);
        }
        c01.d9.e().g(new f21.g0(12));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        android.content.Intent intent = getIntent();
        int intExtra = intent.getIntExtra("content_view_height", -1);
        boolean z17 = intExtra != -1;
        this.f74505x = z17;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "forceTransparent = " + this.f74505x);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f74494m.c(417);
        this.f74494m.c(com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC);
        this.f74494m.c(419);
        this.f74494m.c(nd1.k1.CTRL_INDEX);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enter_scene_address", java.lang.Integer.valueOf(this.f74503v));
        hashMap.put("page_state", java.lang.Integer.valueOf(this.f74505x ? 2 : 1));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50135, "page_in", hashMap, 33328);
        V6();
    }
}
