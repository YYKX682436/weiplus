package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class AddInvoiceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.plugin.address.ui.s {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f74376z = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f74380g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f74381h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74382i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74383m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74384n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74385o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74386p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74387q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74388r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.InvoiceEditView f74389s;

    /* renamed from: d, reason: collision with root package name */
    public int f74377d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f74378e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f74379f = null;

    /* renamed from: t, reason: collision with root package name */
    public i83.b f74390t = null;

    /* renamed from: u, reason: collision with root package name */
    public i83.b f74391u = new i83.b();

    /* renamed from: v, reason: collision with root package name */
    public android.app.Dialog f74392v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f74393w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f74394x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f74395y = 0;

    public final boolean T6() {
        i83.b bVar;
        i83.b bVar2;
        android.widget.Button button;
        java.lang.String str;
        java.lang.String str2;
        android.widget.Button button2 = this.f74379f;
        boolean z17 = true;
        if ((button2 == null || !button2.isActivated()) && ((bVar = this.f74390t) == null || (str2 = bVar.f289635e) == null || !str2.equals("0"))) {
            android.widget.Button button3 = this.f74378e;
            if ((button3 != null && button3.isActivated()) || ((bVar2 = this.f74390t) != null && (str = bVar2.f289635e) != null && str.equals("1"))) {
                this.f74385o.setVisibility(8);
                this.f74386p.setVisibility(8);
                this.f74387q.setVisibility(8);
                this.f74388r.setVisibility(8);
                this.f74389s.setVisibility(8);
                this.f74383m.setVisibility(8);
                this.f74384n.setVisibility(0);
                if (!this.f74378e.isActivated() && !this.f74390t.f289635e.equals("1")) {
                    z17 = false;
                }
                if (!this.f74384n.b()) {
                    if (this.f74384n.getText().length() > 100) {
                        V6(getString(com.tencent.mm.R.string.f492335g35), 100);
                    }
                    z17 = false;
                }
                android.widget.Button button4 = this.f74378e;
                boolean z18 = (button4 != null && button4.isActivated() && this.f74384n.getText().length() == 0) ? false : z17;
                enableOptionMenu(z18);
                return z18;
            }
            this.f74385o.setVisibility(0);
            this.f74386p.setVisibility(0);
            this.f74387q.setVisibility(0);
            this.f74388r.setVisibility(0);
            this.f74389s.setVisibility(0);
            this.f74384n.setVisibility(8);
            this.f74383m.setVisibility(0);
            this.f74384n.setVisibility(8);
            android.widget.Button button5 = this.f74378e;
            if (button5 != null && !button5.isActivated() && (button = this.f74379f) != null && !button.isActivated()) {
                z17 = false;
            }
            if (!this.f74383m.b()) {
                z17 = false;
            }
            if (!this.f74385o.b()) {
                z17 = false;
            }
            if (!this.f74386p.b()) {
                z17 = false;
            }
            if (!this.f74387q.b()) {
                z17 = false;
            }
            if (!this.f74388r.b()) {
                z17 = false;
            }
            if (!this.f74389s.b()) {
                return false;
            }
        } else {
            this.f74385o.setVisibility(0);
            this.f74386p.setVisibility(0);
            this.f74387q.setVisibility(0);
            this.f74388r.setVisibility(0);
            this.f74389s.setVisibility(0);
            this.f74383m.setVisibility(0);
            this.f74384n.setVisibility(8);
            if (!this.f74379f.isActivated() && !this.f74390t.f289635e.equals("0")) {
                z17 = false;
            }
            if (!this.f74383m.b()) {
                if (this.f74383m.getText().length() > 100) {
                    V6(getString(com.tencent.mm.R.string.f492335g35), 100);
                }
                z17 = false;
            }
            android.widget.Button button6 = this.f74379f;
            if (button6 != null && button6.isActivated() && this.f74383m.getText().length() == 0) {
                z17 = false;
            }
            enableOptionMenu(z17);
            if (this.f74385o.b()) {
                android.widget.TextView textView = this.f74380g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (this.f74385o.getText().length() > 0) {
                android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f487587p33);
                if (viewStub != null) {
                    viewStub.inflate();
                    this.f74380g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487586p32);
                }
                android.widget.TextView textView2 = this.f74380g;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            if (!this.f74386p.b()) {
                if (this.f74386p.getText().length() > 100) {
                    V6(getString(com.tencent.mm.R.string.g2n), 100);
                }
                z17 = false;
            }
            if (!this.f74387q.b()) {
                if (this.f74387q.getText().length() > 100) {
                    V6(getString(com.tencent.mm.R.string.g2w), 100);
                }
                z17 = false;
            }
            if (!this.f74388r.b()) {
                if (this.f74388r.getText().length() > 100) {
                    V6(getString(com.tencent.mm.R.string.g2g), 100);
                }
                z17 = false;
            }
            if (!this.f74389s.b()) {
                if (this.f74389s.getText().length() <= 48) {
                    return false;
                }
                V6(getString(com.tencent.mm.R.string.g2i), 39);
                return false;
            }
        }
        return z17;
    }

    public final void U6() {
        java.lang.String str;
        java.lang.String str2;
        boolean z17 = ((this.f74377d == 0 || this.f74390t == null || (str2 = this.f74391u.f289635e) == null || str2.equals("") || this.f74391u.f289635e.equals(this.f74390t.f289635e)) && (this.f74377d != 0 || (str = this.f74391u.f289635e) == null || str.equals(""))) ? false : true;
        android.widget.Button button = this.f74378e;
        if (button != null && this.f74379f != null && !button.isActivated() && !this.f74379f.isActivated() && this.f74390t == null) {
            z17 = true;
        }
        if (this.f74383m.c()) {
            z17 = true;
        }
        if (this.f74384n.c()) {
            z17 = true;
        }
        if (this.f74385o.c()) {
            z17 = true;
        }
        if (this.f74386p.c()) {
            z17 = true;
        }
        if (this.f74387q.c()) {
            z17 = true;
        }
        if (this.f74388r.c()) {
            z17 = true;
        }
        if (this.f74389s.c() ? true : z17) {
            db5.e1.K(this, false, getContext().getString(com.tencent.mm.R.string.g2f), "", getContext().getString(com.tencent.mm.R.string.g2e), getContext().getString(com.tencent.mm.R.string.g2d), new com.tencent.mm.plugin.address.ui.e(this), null);
        } else {
            setResult(0);
            finish();
        }
    }

    public void V6(java.lang.String str, int i17) {
        db5.e1.G(this, getString(com.tencent.mm.R.string.g2l, str, java.lang.Integer.valueOf(i17)), getString(com.tencent.mm.R.string.f490573yv), false, null);
    }

    public void W6() {
        db5.e1.G(this, getString(com.tencent.mm.R.string.f492336g36), getString(com.tencent.mm.R.string.f490573yv), false, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        i83.b bVar;
        java.lang.String str;
        java.lang.String str2;
        android.widget.Button button;
        this.f74395y = 0;
        com.tencent.mm.plugin.address.ui.MMScrollView mMScrollView = (com.tencent.mm.plugin.address.ui.MMScrollView) findViewById(com.tencent.mm.R.id.hfv);
        if (mMScrollView != null) {
            mMScrollView.a(mMScrollView, mMScrollView);
        }
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.hfm);
        this.f74378e = button2;
        if (button2 != null) {
            button2.setVisibility(0);
        }
        android.widget.Button button3 = (android.widget.Button) findViewById(com.tencent.mm.R.id.hfk);
        this.f74379f = button3;
        if (button3 != null) {
            button3.setVisibility(0);
        }
        if (this.f74377d == 0 && (button = this.f74379f) != null) {
            button.setActivated(true);
        }
        android.widget.Button button4 = this.f74379f;
        if (button4 != null) {
            button4.setOnTouchListener(new com.tencent.mm.plugin.address.ui.a(this));
        }
        android.widget.Button button5 = this.f74378e;
        if (button5 != null) {
            button5.setOnTouchListener(new com.tencent.mm.plugin.address.ui.b(this));
        }
        this.f74382i = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfy);
        this.f74383m = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfx);
        this.f74384n = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfn);
        this.f74385o = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfw);
        this.f74386p = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfj);
        this.f74387q = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfo);
        this.f74388r = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfg);
        this.f74389s = (com.tencent.mm.plugin.address.ui.InvoiceEditView) findViewById(com.tencent.mm.R.id.hfh);
        com.tencent.mm.plugin.address.ui.InvoiceEditView invoiceEditView = this.f74385o;
        invoiceEditView.f74410d = true;
        invoiceEditView.f74421r = true;
        invoiceEditView.setOnInputValidChangeListener(this);
        this.f74382i.setOnInputValidChangeListener(this);
        this.f74383m.setOnInputValidChangeListener(this);
        this.f74384n.setOnInputValidChangeListener(this);
        this.f74386p.setOnInputValidChangeListener(this);
        this.f74387q.setOnInputValidChangeListener(this);
        this.f74388r.setOnInputValidChangeListener(this);
        this.f74389s.setOnInputValidChangeListener(this);
        if (this.f74377d != 0) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o_q)).setVisibility(8);
            this.f74381h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oru);
            p71.a Ai = o71.l.Ai();
            int i17 = this.f74377d;
            java.util.Iterator it = Ai.f352473a.f289633d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                } else {
                    bVar = (i83.b) it.next();
                    if (bVar.f289634d == i17) {
                        break;
                    }
                }
            }
            this.f74390t = bVar;
            if (bVar == null || (str2 = bVar.f289635e) == null || !str2.equals("0")) {
                i83.b bVar2 = this.f74390t;
                if (bVar2 != null && (str = bVar2.f289635e) != null && str.equals("1")) {
                    this.f74381h.setText(getString(com.tencent.mm.R.string.g2u));
                }
            } else {
                this.f74381h.setText(getString(com.tencent.mm.R.string.g2q));
            }
            this.f74381h.setVisibility(0);
            this.f74379f.setVisibility(8);
            this.f74378e.setVisibility(8);
            i83.b bVar3 = this.f74390t;
            if (bVar3 != null) {
                this.f74382i.setValStr(bVar3.f289635e);
                this.f74383m.setValStr(this.f74390t.f289636f);
                this.f74384n.setValStr(this.f74390t.f289637g);
                this.f74385o.setValStr(this.f74390t.f289638h);
                this.f74386p.setValStr(this.f74390t.f289645r);
                this.f74387q.setValStr(this.f74390t.f289642o);
                this.f74388r.setValStr(this.f74390t.f289640m);
                this.f74389s.setValStr(this.f74390t.f289639i);
            }
        }
        if (this.f74394x || this.f74393w) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hp_);
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hp_);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setBackBtn(new com.tencent.mm.plugin.address.ui.c(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new com.tencent.mm.plugin.address.ui.d(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(false);
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 3 && i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AddInvoiceUI", "MallRecharge pay result : cancel");
                return;
            }
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("karea_result");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.f74387q.setValStr(stringExtra);
            }
            java.lang.String stringExtra2 = intent.getStringExtra("kpost_code");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                this.f74387q.setValStr(stringExtra2);
            }
            intent.getStringExtra("kwcode");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f74393w = intent.getBooleanExtra("launch_from_webview", false);
        this.f74394x = intent.getBooleanExtra("launch_from_invoicelist_webview", false);
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, this);
        this.f74391u = new i83.b();
        int intExtra = getIntent().getIntExtra("invoice_id", 0);
        this.f74377d = intExtra;
        if (intExtra == 0) {
            setMMTitle(com.tencent.mm.R.string.ip6);
        } else {
            setMMTitle(com.tencent.mm.R.string.it7);
        }
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(bb1.d.CTRL_INDEX, this);
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, this);
        getWindow().setSoftInputMode(3);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddInvoiceUI", "errType " + i17 + ",errCode " + i18 + ",errMsg " + str);
        android.app.Dialog dialog = this.f74392v;
        if (dialog != null) {
            dialog.dismiss();
        }
        android.content.Intent intent = null;
        if (i17 != 0 || i18 != 0) {
            db5.e1.G(this, getString(com.tencent.mm.R.string.g2z), getString(com.tencent.mm.R.string.f490573yv), false, null);
            return;
        }
        if (m1Var.getType() == 1180) {
            r45.pu5 pu5Var = ((q71.r) m1Var).f360365f;
            if (pu5Var != null && (linkedList = pu5Var.f383411d) != null && linkedList.size() > 0 && linkedList.get(0) != null) {
                this.f74395y = ((r45.bu3) linkedList.get(0)).f371065e;
            }
            c01.d9.e().q(bb1.d.CTRL_INDEX, this);
            c01.d9.e().g(new q71.m());
            return;
        }
        if (m1Var.getType() == 1191) {
            c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, this);
            if (!this.f74393w) {
                if (this.f74377d == 0 && this.f74395y != 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClass(this, com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.class);
                    intent2.putExtra("invoice_id", this.f74395y);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/AddInvoiceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f74395y = 0;
                }
                finish();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AddInvoiceUI", "isLaunchFromWebview true...");
            i83.b bVar = this.f74391u;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.InvoiceUtil", "invoiceObj == null");
            } else {
                intent = new android.content.Intent();
                intent.putExtra("type", bVar.f289635e);
                java.lang.String str2 = bVar.f289635e;
                if (str2 == null || !str2.equals("1")) {
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f289636f);
                    intent.putExtra("tax_number", bVar.f289638h);
                    intent.putExtra("company_address", bVar.f289645r);
                    intent.putExtra("telephone", bVar.f289642o);
                    intent.putExtra("bank_name", bVar.f289640m);
                    intent.putExtra("bank_account", bVar.f289639i);
                } else {
                    intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f289637g);
                }
            }
            setResult(-1, intent);
            finish();
        }
    }
}
