package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class RegSetInfoUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int V = 0;
    public android.widget.ImageView A;
    public android.widget.ProgressBar B;
    public android.widget.ImageView D;
    public android.view.View E;
    public android.widget.TextView F;
    public db5.d5 I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f73628J;
    public x51.f L;
    public java.lang.String M;
    public int N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public int S;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f73629d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73630e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f73631f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73633h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73634i;

    /* renamed from: m, reason: collision with root package name */
    public int f73635m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73637o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73638p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73639q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f73640r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f73641s;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f73644v;

    /* renamed from: y, reason: collision with root package name */
    public int f73647y;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73632g = null;

    /* renamed from: n, reason: collision with root package name */
    public int f73636n = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73642t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f73643u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f73645w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f73646x = 3;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f73648z = new java.util.LinkedList();
    public java.lang.String C = "";
    public java.lang.String G = null;
    public boolean H = false;
    public boolean K = false;
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct T = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();
    public final com.tencent.mm.sdk.platformtools.b4 U = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.myLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.account.ui.yg(this), true);

    public static void T6(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        com.tencent.mm.modelsimple.z0 z0Var;
        regSetInfoUI.P = regSetInfoUI.f73629d.getText().toString().trim();
        regSetInfoUI.Q = regSetInfoUI.f73630e.getText().toString().trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(regSetInfoUI.P)) {
            db5.e1.i(regSetInfoUI, com.tencent.mm.R.string.f493434k60, com.tencent.mm.R.string.hwx);
            return;
        }
        if (regSetInfoUI.B.getVisibility() == 0) {
            regSetInfoUI.f73632g = db5.e1.Q(regSetInfoUI, regSetInfoUI.getString(com.tencent.mm.R.string.f490573yv), regSetInfoUI.getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.rg(regSetInfoUI));
            return;
        }
        if (regSetInfoUI.X6() && regSetInfoUI.Z6() && !com.tencent.mm.sdk.platformtools.t8.K0(regSetInfoUI.Q)) {
            java.lang.String charSequence = regSetInfoUI.f73640r.getText().toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence) || charSequence.equals(regSetInfoUI.getString(com.tencent.mm.R.string.hxy))) {
                charSequence = com.tencent.mm.sdk.platformtools.t8.K0(regSetInfoUI.G) ? regSetInfoUI.getString(com.tencent.mm.R.string.f492807hy1) : regSetInfoUI.G;
            }
            db5.e1.s(regSetInfoUI, charSequence, "");
            return;
        }
        regSetInfoUI.hideVKB();
        int V6 = regSetInfoUI.V6();
        gm0.j1.d().a(126, regSetInfoUI);
        if (regSetInfoUI.Z6()) {
            java.util.LinkedList linkedList = regSetInfoUI.f73648z;
            int i17 = (linkedList == null || linkedList.size() == 0) ? 0 : linkedList.contains(regSetInfoUI.Q) ? 1 : 2;
            z0Var = new com.tencent.mm.modelsimple.z0("", regSetInfoUI.f73638p, regSetInfoUI.P, regSetInfoUI.f73635m, regSetInfoUI.f73634i, regSetInfoUI.f73633h, "", "", regSetInfoUI.f73637o, V6, regSetInfoUI.Q, "", "", regSetInfoUI.f73643u, regSetInfoUI.f73645w);
            ((o45.bi) z0Var.f71456e.getReqObj()).f342909a.f391424z = i17;
        } else {
            z0Var = new com.tencent.mm.modelsimple.z0("", regSetInfoUI.f73638p, regSetInfoUI.P, regSetInfoUI.f73635m, regSetInfoUI.f73634i, regSetInfoUI.f73633h, "", "", regSetInfoUI.f73637o, V6, "", "", "", regSetInfoUI.f73643u, regSetInfoUI.f73645w);
        }
        z0Var.L(regSetInfoUI.M);
        z0Var.M(regSetInfoUI.R);
        ((o45.bi) z0Var.f71456e.getReqObj()).f342909a.N = regSetInfoUI.f73647y;
        gm0.j1.d().g(z0Var);
        regSetInfoUI.f73632g = db5.e1.Q(regSetInfoUI, regSetInfoUI.getString(com.tencent.mm.R.string.f490573yv), regSetInfoUI.getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.sg(regSetInfoUI, z0Var));
    }

    public final java.lang.String U6() {
        int i17 = this.f73636n;
        if (!(i17 == 1)) {
            if (!(i17 == 4)) {
                return this.f73639q;
            }
        }
        return this.f73633h;
    }

    public final int V6() {
        int i17 = this.f73636n;
        if (i17 == 1) {
            return 4;
        }
        return i17 == 4 ? 1 : 2;
    }

    public final void W6() {
        hideVKB();
        int i17 = this.f73636n;
        if (i17 == 1) {
            db5.e1.u(this, getString(com.tencent.mm.R.string.hxs), "", new com.tencent.mm.plugin.account.ui.fh(this), new com.tencent.mm.plugin.account.ui.gh(this));
            return;
        }
        if (i17 == 0) {
            db5.e1.u(this, getString(com.tencent.mm.R.string.hxr), "", new com.tencent.mm.plugin.account.ui.hh(this), new com.tencent.mm.plugin.account.ui.ih(this));
            return;
        }
        n71.a.e("R200_100");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", 2);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "goback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "goback", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final boolean X6() {
        return this.A.getVisibility() == 8 || this.H;
    }

    public boolean Y6(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        if (this.L.c(this, new x51.r1(i17, i18, str))) {
            return true;
        }
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return true;
        }
        if (i18 == -2023 || i18 == -100) {
            gm0.m.o();
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f273235x)) {
                str2 = i65.a.r(getContext(), com.tencent.mm.R.string.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f273235x;
            }
            db5.e1.M(context2, str2, getContext().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.dh(this), new com.tencent.mm.plugin.account.ui.eh(this));
            return true;
        }
        if (i18 == -75) {
            db5.e1.i(this, com.tencent.mm.R.string.f489998i0, com.tencent.mm.R.string.hv6);
            return true;
        }
        if (i18 != -48) {
            if (i18 != -10 && i18 != -7) {
                return false;
            }
            db5.e1.i(this, com.tencent.mm.R.string.f492793hv5, com.tencent.mm.R.string.hv6);
            return true;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(this, null, null);
        } else {
            db5.e1.s(this, getString(com.tencent.mm.R.string.hxx), "");
        }
        return true;
    }

    public final boolean Z6() {
        return (this.f73646x & 2) > 0;
    }

    public final void a7(boolean z17, boolean z18) {
        boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73630e.getText().toString().trim())) {
            z17 = false;
        }
        this.A.setImageResource(z18 ? com.tencent.mm.R.drawable.bne : com.tencent.mm.R.drawable.bnb);
        this.A.setVisibility(z17 ? 0 : 8);
        if (z17 && z18) {
            z19 = true;
        }
        this.H = z19;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdt;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73628J = findViewById(com.tencent.mm.R.id.kzb);
        this.E = findViewById(com.tencent.mm.R.id.mnq);
        this.f73644v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mnp);
        this.f73629d = (android.widget.EditText) findViewById(com.tencent.mm.R.id.lro);
        this.F = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mns);
        this.f73630e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.lrv);
        this.f73640r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482935s9);
        this.f73641s = findViewById(com.tencent.mm.R.id.lsa);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pjf);
        this.B = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lbj);
        this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mnr);
        this.f73631f = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.A.setVisibility(8);
        this.B.setVisibility(8);
        this.D.setVisibility(8);
        this.f73645w = false;
        this.H = false;
        android.view.View view = this.E;
        int i17 = (this.f73646x & 1) > 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f73641s;
        int i18 = Z6() ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f73640r.setVisibility(Z6() ? 0 : 8);
        if (((this.f73646x & 1) > 0) && Z6()) {
            this.F.setText(getString(com.tencent.mm.R.string.hxw));
        } else {
            if (!((this.f73646x & 1) > 0) || Z6()) {
                if (((this.f73646x & 1) > 0) || !Z6()) {
                    this.F.setText(getString(com.tencent.mm.R.string.hxt));
                } else {
                    this.F.setText(getString(com.tencent.mm.R.string.hxv));
                }
            } else {
                this.F.setText(getString(com.tencent.mm.R.string.hxu));
            }
        }
        gm0.j1.e().g(new com.tencent.mm.plugin.account.ui.kh(this));
        this.f73629d.addTextChangedListener(new com.tencent.mm.plugin.account.ui.lh(this));
        this.f73631f.setOnClickListener(new com.tencent.mm.plugin.account.ui.mh(this));
        this.f73630e.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.nh(this));
        this.f73630e.addTextChangedListener(new com.tencent.mm.plugin.account.ui.ph(this));
        setBackBtn(new com.tencent.mm.plugin.account.ui.qh(this));
        this.f73629d.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.rh(this));
        this.f73629d.setOnKeyListener(new com.tencent.mm.plugin.account.ui.ng(this));
        this.f73630e.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.og(this));
        this.f73630e.setOnKeyListener(new com.tencent.mm.plugin.account.ui.pg(this));
        this.f73644v.setOnClickListener(new com.tencent.mm.plugin.account.ui.qg(this));
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(lp0.b.j());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        this.f73631f.setEnabled(!com.tencent.mm.sdk.platformtools.t8.K0(this.f73629d.getText().toString().trim()));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RegSetInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.graphics.Bitmap Vi = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent);
        if (Vi != null) {
            this.f73644v.setImageBitmap(Vi);
            this.f73645w = true;
            this.D.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String string = getString(com.tencent.mm.R.string.hxz);
        if (o45.wf.f343033k) {
            string = getString(com.tencent.mm.R.string.f490495wp) + j65.v.b(this);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        setMMTitle(string);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.f73633h = getIntent().getStringExtra("regsetinfo_user");
        this.f73634i = getIntent().getStringExtra("regsetinfo_bind_email");
        this.f73637o = getIntent().getStringExtra("regsetinfo_ticket");
        this.f73638p = getIntent().getStringExtra("regsetinfo_pwd");
        this.f73639q = getIntent().getStringExtra("regsetinfo_binduin");
        this.f73647y = getIntent().getIntExtra("mobile_check_type", 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73639q)) {
            this.f73635m = kk.v.b(this.f73639q);
        }
        this.f73636n = getIntent().getExtras().getInt("regsetinfo_ismobile", 0);
        this.f73643u = getIntent().getExtras().getBoolean("regsetinfo_isForce", false);
        this.f73646x = getIntent().getIntExtra("regsetinfo_NextControl", 3);
        this.M = getIntent().getStringExtra("regsession_id");
        this.R = getIntent().getStringExtra("reg_3d_app_ticket");
        this.S = getIntent().getIntExtra("reg_3d_app_type", 0);
        this.N = getIntent().getIntExtra("key_reg_style", 1);
        initView();
        if (this.f73636n == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_900_phone,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_900_phone"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("R200_900_phone");
        }
        this.K = false;
        this.L = new x51.f();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f73636n == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_900_phone,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_900_phone"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
        }
        x51.f fVar = this.L;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f73629d.postDelayed(new com.tencent.mm.plugin.account.ui.jh(this), 500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r26, int r27, java.lang.String r28, com.tencent.mm.modelbase.m1 r29) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.RegSetInfoUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
