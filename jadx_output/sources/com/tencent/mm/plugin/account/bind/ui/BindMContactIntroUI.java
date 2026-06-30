package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMContactIntroUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f72961y = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f72962e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f72963f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f72964g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f72965h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f72966i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f72967m;

    /* renamed from: n, reason: collision with root package name */
    public js.x0 f72968n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f72969o;

    /* renamed from: q, reason: collision with root package name */
    public s61.m1 f72971q;

    /* renamed from: w, reason: collision with root package name */
    public int f72977w;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f72970p = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f72972r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f72973s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f72974t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f72975u = true;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f72976v = "";

    /* renamed from: x, reason: collision with root package name */
    public int f72978x = 0;

    public final void Z6(boolean z17) {
        u11.a a17;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
        if (z17) {
            intent.putExtra("bind_scene", 3);
        } else {
            intent.putExtra("bind_scene", 0);
        }
        c7(intent);
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso) && (a17 = u11.b.a(simCountryIso)) != null) {
            intent.putExtra("country_name", a17.f423729c);
            intent.putExtra("couttry_code", a17.f423728b);
        }
        com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
    }

    public void a7() {
        hideVKB();
        setResult(0, getIntent());
        if (this.f72977w != 2) {
            V6();
        } else {
            T6();
            finish();
        }
    }

    public void b7() {
        boolean z17 = this.f72975u;
        int ordinal = this.f72968n.ordinal();
        if (ordinal == 0) {
            Z6(false);
            return;
        }
        if (ordinal == 1) {
            java.lang.String str = this.f72969o;
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactIntroUI", "bindBy sms %s", str);
            if (this.f72971q == null) {
                this.f72971q = new s61.m1(s61.l1.BINDMOBILE, this, new p61.l1(this, str));
            }
            s61.m1 m1Var = this.f72971q;
            int i17 = this.f72977w;
            m1Var.f403377n = i17 == 0 || i17 == 3;
            m1Var.d(str);
            return;
        }
        if (ordinal == 2) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("page_id", 50396), new java.util.AbstractMap.SimpleEntry("phonebind_sessionid", this.f72976v), new java.util.AbstractMap.SimpleEntry("contact_enter_src", java.lang.Integer.valueOf(z17 ? 1 : 0))};
            java.util.HashMap hashMap = new java.util.HashMap(3);
            for (int i18 = 0; i18 < 3; i18++) {
                java.util.Map.Entry entry = entryArr[i18];
                java.lang.Object key = entry.getKey();
                java.util.Objects.requireNonNull(key);
                java.lang.Object value = entry.getValue();
                java.util.Objects.requireNonNull(value);
                if (hashMap.put(key, value) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                }
            }
            ((cy1.a) rVar).Hj("view_contact_btn", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 33926);
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI", "onClickMainButton", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI", "onClickMainButton", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (ordinal != 3) {
            return;
        }
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("page_id", 50396), new java.util.AbstractMap.SimpleEntry("phonebind_sessionid", this.f72976v), new java.util.AbstractMap.SimpleEntry("contact_enter_src", java.lang.Integer.valueOf(z17 ? 1 : 0))};
        java.util.HashMap hashMap2 = new java.util.HashMap(3);
        for (int i19 = 0; i19 < 3; i19++) {
            java.util.Map.Entry entry2 = entryArr2[i19];
            java.lang.Object key2 = entry2.getKey();
            java.util.Objects.requireNonNull(key2);
            java.lang.Object value2 = entry2.getValue();
            java.util.Objects.requireNonNull(value2);
            if (hashMap2.put(key2, value2) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
            }
        }
        ((cy1.a) rVar2).Hj("upload_contact_btn", "view_clk", java.util.Collections.unmodifiableMap(hashMap2), 33926);
        r61.q0.k(false);
        y61.e eVar = (y61.e) i95.n0.c(y61.e.class);
        p61.z0 z0Var = new p61.z0(this);
        int i27 = this.f72978x;
        ((m61.i) eVar).getClass();
        x51.i1.b(this, z0Var, true, i27);
    }

    public void c7(android.content.Intent intent) {
    }

    public final void d7(int i17) {
        android.widget.TextView textView = this.f72965h;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        java.lang.String a17 = com.tencent.mm.ui.fg.a(this.f72969o);
        this.f72962e.setText(java.lang.String.format(getString(i17), a17));
        android.widget.TextView textView2 = this.f72965h;
        if (textView2 != null) {
            textView2.setVisibility(0);
            this.f72965h.setOnClickListener(new p61.i1(this, i17, a17));
        }
    }

    public void e7() {
        int ordinal = this.f72968n.ordinal();
        if (ordinal == 0) {
            showOptionMenu(1, false);
            this.f72964g.setVisibility(0);
            android.widget.TextView textView = this.f72963f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f72965h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f72967m.setVisibility(8);
            this.f72962e.setText(getString(com.tencent.mm.R.string.agk));
            this.f72964g.setText(getString(com.tencent.mm.R.string.agj));
            this.f72966i.setText(com.tencent.mm.R.string.afs);
            return;
        }
        if (ordinal == 1) {
            showOptionMenu(1, false);
            this.f72964g.setVisibility(8);
            android.widget.TextView textView3 = this.f72963f;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.f72963f.setText(com.tencent.mm.R.string.ahb);
            }
            this.f72967m.setVisibility(0);
            d7(com.tencent.mm.R.string.agq);
            this.f72966i.setText(com.tencent.mm.R.string.ahf);
            this.f72967m.setText(com.tencent.mm.R.string.f490711ag2);
            this.f72967m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478532ac));
            return;
        }
        if (ordinal == 2) {
            showOptionMenu(1, true);
            this.f72964g.setVisibility(0);
            android.widget.TextView textView4 = this.f72963f;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            this.f72967m.setVisibility(0);
            d7(com.tencent.mm.R.string.ahl);
            this.f72964g.setText(com.tencent.mm.R.string.afy);
            this.f72966i.setText(com.tencent.mm.R.string.age);
            this.f72967m.setText(com.tencent.mm.R.string.f490709ag0);
            this.f72967m.post(new p61.h1(this));
            return;
        }
        if (ordinal != 3) {
            return;
        }
        showOptionMenu(1, true);
        this.f72964g.setVisibility(0);
        android.widget.TextView textView5 = this.f72963f;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        this.f72967m.setVisibility(0);
        d7(com.tencent.mm.R.string.ahl);
        this.f72964g.setText(com.tencent.mm.R.string.ahc);
        this.f72966i.setText(com.tencent.mm.R.string.ahd);
        this.f72967m.setText(com.tencent.mm.R.string.f490709ag0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488202kc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f72977w = getIntent().getIntExtra("bind_scene", 0);
        this.f72973s = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f72978x = getIntent().getIntExtra("key_upload_scene", 0);
        js.x0 b17 = r61.q0.b();
        this.f72968n = b17;
        java.util.Objects.toString(b17);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        this.f72969o = str;
        if (str == null || str.equals("")) {
            this.f72969o = (java.lang.String) gm0.j1.u().c().l(4097, null);
        }
        this.f72962e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.moa);
        this.f72963f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mo_);
        this.f72964g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mo9);
        this.f72965h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ci9);
        this.f72966i = (android.widget.Button) findViewById(com.tencent.mm.R.id.mo8);
        this.f72967m = (android.widget.Button) findViewById(com.tencent.mm.R.id.moc);
        this.f72966i.setOnClickListener(new p61.r0(this));
        this.f72967m.setOnClickListener(new p61.b1(this));
        if (getIntent().getBooleanExtra("skip", false)) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490458vm), new p61.c1(this));
        } else {
            setBackBtn(new p61.d1(this), this.f72978x == 9 ? com.tencent.mm.R.raw.actionbar_icon_close_black : 0);
        }
        js.x0 x0Var = this.f72968n;
        if (x0Var == js.x0.SUCC_UNLOAD || x0Var == js.x0.SUCC) {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowUnbindPhone");
            int D1 = !com.tencent.mm.sdk.platformtools.t8.K0(d17) ? com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) : 2;
            if (D1 != 0) {
                addIconOptionMenu(1, com.tencent.mm.R.raw.icons_outlined_more, new p61.g1(this, D1));
            }
        }
        e7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactIntroUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again mobile: " + this.f72969o);
            gm0.j1.d().g(new r61.f1(2));
            this.f72970p = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490468vx), true, true, new p61.a1(this));
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        gm0.j1.d().a(255, this);
        gm0.j1.d().a(254, this);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        hideActionbarLine();
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setMMTitle(com.tencent.mm.R.string.f490718ah3);
        this.f72975u = getIntent().getBooleanExtra("key_resource_ui", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n() & io.flutter.embedding.android.KeyboardMap.kValueMask;
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        this.f72976v = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactIntroUI", "BindMContactIntroUI onCreate, isFromSetting: %s, sessionId: %s", java.lang.Boolean.valueOf(this.f72975u), this.f72976v);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(255, this);
        gm0.j1.d().q(254, this);
        s61.m1 m1Var = this.f72971q;
        if (m1Var != null) {
            m1Var.b();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
        gm0.j1.d().a(132, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r25, int r26, java.lang.String r27, com.tencent.mm.modelbase.m1 r28) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        gm0.j1.d().q(132, this);
        super.onStop();
    }
}
