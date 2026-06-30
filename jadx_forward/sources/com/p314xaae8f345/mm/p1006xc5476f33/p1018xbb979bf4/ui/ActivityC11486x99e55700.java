package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI */
/* loaded from: classes15.dex */
public class ActivityC11486x99e55700 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f155909z = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f155913g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155914h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155915i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155916m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155917n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155918o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155919p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155920q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155921r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f155922s;

    /* renamed from: d, reason: collision with root package name */
    public int f155910d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f155911e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f155912f = null;

    /* renamed from: t, reason: collision with root package name */
    public i83.b f155923t = null;

    /* renamed from: u, reason: collision with root package name */
    public i83.b f155924u = new i83.b();

    /* renamed from: v, reason: collision with root package name */
    public android.app.Dialog f155925v = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f155926w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f155927x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f155928y = 0;

    public final boolean T6() {
        i83.b bVar;
        i83.b bVar2;
        android.widget.Button button;
        java.lang.String str;
        java.lang.String str2;
        android.widget.Button button2 = this.f155912f;
        boolean z17 = true;
        if ((button2 == null || !button2.isActivated()) && ((bVar = this.f155923t) == null || (str2 = bVar.f371168e) == null || !str2.equals("0"))) {
            android.widget.Button button3 = this.f155911e;
            if ((button3 != null && button3.isActivated()) || ((bVar2 = this.f155923t) != null && (str = bVar2.f371168e) != null && str.equals("1"))) {
                this.f155918o.setVisibility(8);
                this.f155919p.setVisibility(8);
                this.f155920q.setVisibility(8);
                this.f155921r.setVisibility(8);
                this.f155922s.setVisibility(8);
                this.f155916m.setVisibility(8);
                this.f155917n.setVisibility(0);
                if (!this.f155911e.isActivated() && !this.f155923t.f371168e.equals("1")) {
                    z17 = false;
                }
                if (!this.f155917n.b()) {
                    if (this.f155917n.m48726xfb85ada3().length() > 100) {
                        V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573868g35), 100);
                    }
                    z17 = false;
                }
                android.widget.Button button4 = this.f155911e;
                boolean z18 = (button4 != null && button4.isActivated() && this.f155917n.m48726xfb85ada3().length() == 0) ? false : z17;
                m78501x43e00957(z18);
                return z18;
            }
            this.f155918o.setVisibility(0);
            this.f155919p.setVisibility(0);
            this.f155920q.setVisibility(0);
            this.f155921r.setVisibility(0);
            this.f155922s.setVisibility(0);
            this.f155917n.setVisibility(8);
            this.f155916m.setVisibility(0);
            this.f155917n.setVisibility(8);
            android.widget.Button button5 = this.f155911e;
            if (button5 != null && !button5.isActivated() && (button = this.f155912f) != null && !button.isActivated()) {
                z17 = false;
            }
            if (!this.f155916m.b()) {
                z17 = false;
            }
            if (!this.f155918o.b()) {
                z17 = false;
            }
            if (!this.f155919p.b()) {
                z17 = false;
            }
            if (!this.f155920q.b()) {
                z17 = false;
            }
            if (!this.f155921r.b()) {
                z17 = false;
            }
            if (!this.f155922s.b()) {
                return false;
            }
        } else {
            this.f155918o.setVisibility(0);
            this.f155919p.setVisibility(0);
            this.f155920q.setVisibility(0);
            this.f155921r.setVisibility(0);
            this.f155922s.setVisibility(0);
            this.f155916m.setVisibility(0);
            this.f155917n.setVisibility(8);
            if (!this.f155912f.isActivated() && !this.f155923t.f371168e.equals("0")) {
                z17 = false;
            }
            if (!this.f155916m.b()) {
                if (this.f155916m.m48726xfb85ada3().length() > 100) {
                    V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573868g35), 100);
                }
                z17 = false;
            }
            android.widget.Button button6 = this.f155912f;
            if (button6 != null && button6.isActivated() && this.f155916m.m48726xfb85ada3().length() == 0) {
                z17 = false;
            }
            m78501x43e00957(z17);
            if (this.f155918o.b()) {
                android.widget.TextView textView = this.f155913g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (this.f155918o.m48726xfb85ada3().length() > 0) {
                android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f569120p33);
                if (viewStub != null) {
                    viewStub.inflate();
                    this.f155913g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569119p32);
                }
                android.widget.TextView textView2 = this.f155913g;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            if (!this.f155919p.b()) {
                if (this.f155919p.m48726xfb85ada3().length() > 100) {
                    V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2n), 100);
                }
                z17 = false;
            }
            if (!this.f155920q.b()) {
                if (this.f155920q.m48726xfb85ada3().length() > 100) {
                    V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2w), 100);
                }
                z17 = false;
            }
            if (!this.f155921r.b()) {
                if (this.f155921r.m48726xfb85ada3().length() > 100) {
                    V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2g), 100);
                }
                z17 = false;
            }
            if (!this.f155922s.b()) {
                if (this.f155922s.m48726xfb85ada3().length() <= 48) {
                    return false;
                }
                V6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2i), 39);
                return false;
            }
        }
        return z17;
    }

    public final void U6() {
        java.lang.String str;
        java.lang.String str2;
        boolean z17 = ((this.f155910d == 0 || this.f155923t == null || (str2 = this.f155924u.f371168e) == null || str2.equals("") || this.f155924u.f371168e.equals(this.f155923t.f371168e)) && (this.f155910d != 0 || (str = this.f155924u.f371168e) == null || str.equals(""))) ? false : true;
        android.widget.Button button = this.f155911e;
        if (button != null && this.f155912f != null && !button.isActivated() && !this.f155912f.isActivated() && this.f155923t == null) {
            z17 = true;
        }
        if (this.f155916m.c()) {
            z17 = true;
        }
        if (this.f155917n.c()) {
            z17 = true;
        }
        if (this.f155918o.c()) {
            z17 = true;
        }
        if (this.f155919p.c()) {
            z17 = true;
        }
        if (this.f155920q.c()) {
            z17 = true;
        }
        if (this.f155921r.c()) {
            z17 = true;
        }
        if (this.f155922s.c() ? true : z17) {
            db5.e1.K(this, false, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2f), "", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2e), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2d), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.e(this), null);
        } else {
            setResult(0);
            finish();
        }
    }

    public void V6(java.lang.String str, int i17) {
        db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2l, str, java.lang.Integer.valueOf(i17)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, null);
    }

    public void W6() {
        db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573869g36), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        i83.b bVar;
        java.lang.String str;
        java.lang.String str2;
        android.widget.Button button;
        this.f155928y = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 viewOnFocusChangeListenerC11491x93fec4d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2) findViewById(com.p314xaae8f345.mm.R.id.hfv);
        if (viewOnFocusChangeListenerC11491x93fec4d2 != null) {
            viewOnFocusChangeListenerC11491x93fec4d2.a(viewOnFocusChangeListenerC11491x93fec4d2, viewOnFocusChangeListenerC11491x93fec4d2);
        }
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hfm);
        this.f155911e = button2;
        if (button2 != null) {
            button2.setVisibility(0);
        }
        android.widget.Button button3 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hfk);
        this.f155912f = button3;
        if (button3 != null) {
            button3.setVisibility(0);
        }
        if (this.f155910d == 0 && (button = this.f155912f) != null) {
            button.setActivated(true);
        }
        android.widget.Button button4 = this.f155912f;
        if (button4 != null) {
            button4.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.a(this));
        }
        android.widget.Button button5 = this.f155911e;
        if (button5 != null) {
            button5.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.b(this));
        }
        this.f155915i = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfy);
        this.f155916m = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfx);
        this.f155917n = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfn);
        this.f155918o = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfw);
        this.f155919p = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfj);
        this.f155920q = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfo);
        this.f155921r = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfg);
        this.f155922s = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc) findViewById(com.p314xaae8f345.mm.R.id.hfh);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc viewOnFocusChangeListenerC11488x5fd5e9fc = this.f155918o;
        viewOnFocusChangeListenerC11488x5fd5e9fc.f155943d = true;
        viewOnFocusChangeListenerC11488x5fd5e9fc.f155954r = true;
        viewOnFocusChangeListenerC11488x5fd5e9fc.m48735x749e7e77(this);
        this.f155915i.m48735x749e7e77(this);
        this.f155916m.m48735x749e7e77(this);
        this.f155917n.m48735x749e7e77(this);
        this.f155919p.m48735x749e7e77(this);
        this.f155920q.m48735x749e7e77(this);
        this.f155921r.m48735x749e7e77(this);
        this.f155922s.m48735x749e7e77(this);
        if (this.f155910d != 0) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_q)).setVisibility(8);
            this.f155914h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oru);
            p71.a Ai = o71.l.Ai();
            int i17 = this.f155910d;
            java.util.Iterator it = Ai.f434006a.f371166d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                } else {
                    bVar = (i83.b) it.next();
                    if (bVar.f371167d == i17) {
                        break;
                    }
                }
            }
            this.f155923t = bVar;
            if (bVar == null || (str2 = bVar.f371168e) == null || !str2.equals("0")) {
                i83.b bVar2 = this.f155923t;
                if (bVar2 != null && (str = bVar2.f371168e) != null && str.equals("1")) {
                    this.f155914h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2u));
                }
            } else {
                this.f155914h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2q));
            }
            this.f155914h.setVisibility(0);
            this.f155912f.setVisibility(8);
            this.f155911e.setVisibility(8);
            i83.b bVar3 = this.f155923t;
            if (bVar3 != null) {
                this.f155915i.m48738x27317652(bVar3.f371168e);
                this.f155916m.m48738x27317652(this.f155923t.f371169f);
                this.f155917n.m48738x27317652(this.f155923t.f371170g);
                this.f155918o.m48738x27317652(this.f155923t.f371171h);
                this.f155919p.m48738x27317652(this.f155923t.f371178r);
                this.f155920q.m48738x27317652(this.f155923t.f371175o);
                this.f155921r.m48738x27317652(this.f155923t.f371173m);
                this.f155922s.m48738x27317652(this.f155923t.f371172i);
            }
        }
        if (this.f155927x || this.f155926w) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hp_);
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hp_);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.c(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.d(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(false);
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 3 && i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddInvoiceUI", "MallRecharge pay result : cancel");
                return;
            }
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("karea_result");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                this.f155920q.m48738x27317652(stringExtra);
            }
            java.lang.String stringExtra2 = intent.getStringExtra("kpost_code");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                this.f155920q.m48738x27317652(stringExtra2);
            }
            intent.getStringExtra("kwcode");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f155926w = intent.getBooleanExtra("launch_from_webview", false);
        this.f155927x = intent.getBooleanExtra("launch_from_invoicelist_webview", false);
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, this);
        this.f155924u = new i83.b();
        int intExtra = getIntent().getIntExtra("invoice_id", 0);
        this.f155910d = intExtra;
        if (intExtra == 0) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ip6);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.it7);
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(bb1.d.f4183x366c91de, this);
        c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, this);
        getWindow().setSoftInputMode(3);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddInvoiceUI", "errType " + i17 + ",errCode " + i18 + ",errMsg " + str);
        android.app.Dialog dialog = this.f155925v;
        if (dialog != null) {
            dialog.dismiss();
        }
        android.content.Intent intent = null;
        if (i17 != 0 || i18 != 0) {
            db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, null);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 1180) {
            r45.pu5 pu5Var = ((q71.r) m1Var).f441898f;
            if (pu5Var != null && (linkedList = pu5Var.f464944d) != null && linkedList.size() > 0 && linkedList.get(0) != null) {
                this.f155928y = ((r45.bu3) linkedList.get(0)).f452598e;
            }
            c01.d9.e().q(bb1.d.f4183x366c91de, this);
            c01.d9.e().g(new q71.m());
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 1191) {
            c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, this);
            if (!this.f155926w) {
                if (this.f155910d == 0 && this.f155928y != 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73.class);
                    intent2.putExtra("invoice_id", this.f155928y);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/AddInvoiceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f155928y = 0;
                }
                finish();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddInvoiceUI", "isLaunchFromWebview true...");
            i83.b bVar = this.f155924u;
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvoiceUtil", "invoiceObj == null");
            } else {
                intent = new android.content.Intent();
                intent.putExtra("type", bVar.f371168e);
                java.lang.String str2 = bVar.f371168e;
                if (str2 == null || !str2.equals("1")) {
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, bVar.f371169f);
                    intent.putExtra("tax_number", bVar.f371171h);
                    intent.putExtra("company_address", bVar.f371178r);
                    intent.putExtra("telephone", bVar.f371175o);
                    intent.putExtra("bank_name", bVar.f371173m);
                    intent.putExtra("bank_account", bVar.f371172i);
                } else {
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, bVar.f371170g);
                }
            }
            setResult(-1, intent);
            finish();
        }
    }
}
