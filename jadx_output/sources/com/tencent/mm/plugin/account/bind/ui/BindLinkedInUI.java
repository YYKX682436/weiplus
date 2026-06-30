package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes14.dex */
public class BindLinkedInUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int E = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public android.app.ProgressDialog D;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f72942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f72943f;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Bundle f72947m;

    /* renamed from: n, reason: collision with root package name */
    public int f72948n;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f72951q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f72952r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f72953s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f72954t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f72955u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f72956v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f72957w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f72958x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f72959y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f72960z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f72941d = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f72944g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f72945h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f72946i = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f72949o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f72950p = false;

    public final void T6(boolean z17) {
        n61.a aVar;
        if (this.f72947m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindLinkedInUI", "bindBundle is null !!");
            return;
        }
        n61.a aVar2 = new n61.a(1, this.f72954t.f211363x ? 1 : 2, this.f72958x, this.f72959y, "", this.f72960z, this.A, this.B, this.C);
        if (z17) {
            aVar = aVar2;
        } else {
            aVar = aVar2;
            this.D = db5.e1.Q(this, null, getString(com.tencent.mm.R.string.ggc), true, false, new p61.e0(this, aVar2));
        }
        gm0.j1.d().g(aVar);
    }

    public final void U6() {
        if (!this.f72945h) {
            setResult(-1);
            finish();
            return;
        }
        if (!this.f72950p) {
            setResult(-1);
            finish();
            return;
        }
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(603979776);
        b17.putExtra("preferred_tab", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        this.f72942e = (java.lang.String) gm0.j1.u().c().l(286721, null);
        this.f72941d = !com.tencent.mm.sdk.platformtools.t8.K0(r0);
        this.f72943f = (java.lang.String) gm0.j1.u().c().l(286722, null);
        int p17 = c01.z1.p();
        this.f72948n = p17;
        this.f72944g = (p17 & 4194304) != 0;
    }

    public final void W6(java.lang.String str) {
        int indexOf = getString(com.tencent.mm.R.string.bec).indexOf("%s");
        android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(getString(com.tencent.mm.R.string.bec, str));
        newSpannable.setSpan(new p61.f0(this), indexOf, str.length() + indexOf, 33);
        this.f72951q.setText(newSpannable);
    }

    public final void X6(boolean z17, boolean z18, java.lang.String str, boolean z19) {
        this.f72957w.setVisibility(8);
        if (!z17) {
            this.f72951q.setVisibility(8);
            this.f72951q.setText(getString(com.tencent.mm.R.string.bed));
            this.f72952r.setVisibility(0);
            android.view.View view = this.f72953s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f72955u.setVisibility(0);
            this.f72956v.setVisibility(8);
            return;
        }
        this.f72952r.setVisibility(8);
        this.f72951q.setVisibility(0);
        W6(str);
        android.view.View view2 = this.f72953s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f72955u.setVisibility(8);
        if (z18) {
            this.f72956v.setVisibility(0);
        }
        this.f72954t.setCheck(z19);
        this.f72954t.setSwitchListener(new p61.s(this));
    }

    public final void Y6(boolean z17, boolean z18) {
        if (z17) {
            this.f72948n |= 4194304;
        } else {
            this.f72948n &= -4194305;
        }
        int i17 = z17 ? 1 : 2;
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f72948n));
        if (z18) {
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 33;
            p53Var.f382762e = i17;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
    }

    public final void Z6() {
        boolean z17 = this.f72945h;
        if (z17 && this.f72947m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindLinkedInUI", "bindBundle is null");
            return;
        }
        if (this.f72946i) {
            X6(this.f72941d, false, this.f72943f, this.f72944g);
            return;
        }
        if (!z17) {
            X6(this.f72941d, true, this.f72943f, this.f72944g);
            return;
        }
        boolean z18 = this.f72941d && this.f72942e.equals(this.f72958x);
        java.lang.String str = this.f72959y;
        boolean z19 = this.f72944g;
        this.f72951q.setVisibility(0);
        W6(str);
        android.view.View view = this.f72953s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showQrBindView", "(ZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showQrBindView", "(ZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f72956v.setVisibility(8);
        if (z18) {
            this.f72952r.setVisibility(8);
            this.f72955u.setVisibility(8);
            this.f72957w.setVisibility(8);
            this.f72954t.setCheck(z19);
            this.f72954t.setSwitchListener(new p61.g0(this));
            return;
        }
        this.f72952r.setVisibility(0);
        this.f72955u.setVisibility(0);
        this.f72957w.setVisibility(0);
        this.f72954t.setCheck(z19);
        this.f72954t.setSwitchListener(new p61.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488200ka;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f72945h) {
            setMMTitle(com.tencent.mm.R.string.bep);
        } else if (this.f72946i) {
            setMMTitle(com.tencent.mm.R.string.bes);
        } else {
            setMMTitle(com.tencent.mm.R.string.bei);
        }
        this.f72951q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486860mo2);
        this.f72952r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486861mo3);
        this.f72953s = findViewById(com.tencent.mm.R.id.mvm);
        this.f72954t = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.mvl);
        this.f72955u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aht);
        this.f72956v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ory);
        this.f72957w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b5h);
        this.f72951q.setOnClickListener(new p61.u(this));
        this.f72955u.setOnClickListener(new p61.x(this));
        this.f72956v.setOnClickListener(new p61.b0(this));
        this.f72957w.setOnClickListener(new p61.c0(this));
        setBackBtn(new p61.d0(this));
        Z6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        if (i17 != 100) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindLinkedInUI", "onActivityResult unknow request");
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
        java.lang.String string = bundleExtra.getString("ret");
        java.lang.String string2 = bundleExtra.getString("limid");
        java.lang.String string3 = bundleExtra.getString("liname");
        java.lang.String string4 = bundleExtra.getString("liurl");
        java.lang.String string5 = bundleExtra.getString("liswitch");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindLinkedInUI", "linkedin oauth ret is null, maybe canceled");
            return;
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(string, 0);
        if (D1 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindLinkedInUI", "linkedin oauth bind failed ret %s ", java.lang.Integer.valueOf(D1));
            db5.e1.s(this, getString(D1 == 1 ? com.tencent.mm.R.string.ben : com.tencent.mm.R.string.bem), null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindLinkedInUI", "linkedin member id is null");
            return;
        }
        gm0.j1.u().c().w(286722, string3);
        gm0.j1.u().c().w(286721, string2);
        gm0.j1.u().c().w(286723, string4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
            Y6(com.tencent.mm.sdk.platformtools.t8.D1(string5, 0) == 1, false);
        }
        V6();
        Z6();
        java.lang.String string6 = getString(com.tencent.mm.R.string.bej);
        if (isFinishing()) {
            return;
        }
        dp.a.makeText(this, string6, 0).show();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.media.q4.CTRL_INDEX, this);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.contact.n0.CTRL_INDEX, this);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("qrcode_bundle");
        this.f72947m = bundleExtra;
        this.f72945h = bundleExtra != null;
        if (bundleExtra != null) {
            this.f72958x = bundleExtra.getString("i");
            this.f72959y = this.f72947m.getString("n");
            this.f72960z = this.f72947m.getString("t");
            this.A = this.f72947m.getString("o");
            this.B = this.f72947m.getString("s");
            java.lang.String string = this.f72947m.getString("r");
            this.C = string;
            if (this.f72958x == null || this.f72959y == null || this.f72960z == null || this.B == null || string == null) {
                db5.e1.G(this, getString(com.tencent.mm.R.string.bef), null, false, new p61.t(this));
            }
        }
        this.f72946i = getIntent().getBooleanExtra("oversea_entry", false);
        V6();
        if (this.f72945h) {
            this.f72944g = true;
        }
        initView();
        if (this.f72947m != null && this.f72941d && this.f72942e.equals(this.f72958x)) {
            this.f72949o = true;
            T6(true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.contact.n0.CTRL_INDEX, this);
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.media.q4.CTRL_INDEX, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int i27;
        android.app.ProgressDialog progressDialog = this.D;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.D = null;
        }
        if (i17 != 0 || i18 != 0) {
            if (m1Var.getType() == 549) {
                i19 = i18 == 1 ? com.tencent.mm.R.string.ben : com.tencent.mm.R.string.bem;
            } else if (m1Var.getType() != 550) {
                return;
            } else {
                i19 = com.tencent.mm.R.string.beo;
            }
            db5.e1.s(this, getString(i19), null);
            return;
        }
        if (m1Var.getType() == 549) {
            this.f72950p = true;
            i27 = !this.f72949o ? com.tencent.mm.R.string.bej : com.tencent.mm.R.string.bek;
        } else if (m1Var.getType() != 550) {
            return;
        } else {
            i27 = com.tencent.mm.R.string.beu;
        }
        java.lang.String string = getString(i27);
        if (!isFinishing()) {
            dp.a.makeText(this, string, 0).show();
        }
        V6();
        this.f72944g = this.f72954t.f211363x;
        Z6();
    }
}
