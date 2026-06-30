package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI */
/* loaded from: classes12.dex */
public class ActivityC13098x53df0b7a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f177125y = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177126d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177127e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177128f;

    /* renamed from: g, reason: collision with root package name */
    public int f177129g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177130h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u f177131i;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177133n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f177134o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f177135p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f177136q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f177137r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f177138s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f177139t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f177140u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f177141v;

    /* renamed from: x, reason: collision with root package name */
    public int f177143x;

    /* renamed from: m, reason: collision with root package name */
    public final xv1.b f177132m = new xv1.b();

    /* renamed from: w, reason: collision with root package name */
    public boolean f177142w = true;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a) {
        activityC13098x53df0b7a.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13098x53df0b7a.mo55332x76847179(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.z(activityC13098x53df0b7a);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.a0(activityC13098x53df0b7a);
        k0Var.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public void A(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            if (i17 <= 0) {
                this.f177135p.mo7946xf939df19().m8147xed6e4d18(0);
                return;
            } else {
                this.f177135p.mo7946xf939df19().m8153xd399a4d9(0, i17);
                this.f177135p.mo7946xf939df19().m8151xc67946d3(i17, this.f177143x + i17);
                return;
            }
        }
        U6(false, null);
        this.f177135p.mo7946xf939df19().m8146xced61ae5();
        int mo1894x7e414b06 = this.f177135p.mo7946xf939df19().mo1894x7e414b06();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f177135p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06 - 1));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
        if (i17 > 0) {
            this.f177133n.setVisibility(8);
            this.f177135p.setVisibility(0);
        } else {
            this.f177133n.setVisibility(0);
            this.f177135p.setVisibility(8);
            this.f177133n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7a));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public void P(boolean z17) {
        if (z17) {
            U6(true, null);
        } else {
            this.f177143x = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) this.f177135p.getLayoutManager()).y();
        }
    }

    public final void U6(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (str == null) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
            }
            this.f177141v = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, str, true, 0, null);
        } else {
            android.app.ProgressDialog progressDialog = this.f177141v;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f177141v.dismiss();
            this.f177141v = null;
        }
    }

    public final void V6(java.lang.String str) {
        if ("image".equals(str) || "video".equals(str) || com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(str)) {
            this.f177138s.setVisibility(0);
            this.f177139t.setVisibility(0);
        } else {
            this.f177138s.setVisibility(4);
            this.f177139t.setVisibility(4);
        }
        if (!com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(this.f177128f)) {
            this.f177136q.setVisibility(4);
            this.f177137r.setVisibility(4);
            return;
        }
        this.f177136q.setVisibility(0);
        this.f177137r.setVisibility(0);
        if (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(str)) {
            this.f177137r.setText("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        if ("image".equals(str)) {
            sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7e));
        } else if ("video".equals(str)) {
            sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7f));
        } else if ("file".equals(str)) {
            sb6.append(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7d));
        }
        sb6.append(")");
        this.f177137r.setText(sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public xv1.b f6() {
        return this.f177132m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    /* renamed from: getChildAt */
    public android.view.View mo54477x6a486239(int i17) {
        return this.f177135p.getChildAt(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    /* renamed from: getContext */
    public /* bridge */ /* synthetic */ android.content.Context mo54478x76847179() {
        return super.mo55332x76847179();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570142yj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    /* renamed from: getUserName */
    public java.lang.String mo54479x6bf53a6c() {
        return this.f177126d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177133n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kfa);
        this.f177134o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cql);
        this.f177135p = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.e2d);
        this.f177136q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.e4a);
        this.f177137r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.e4d);
        this.f177138s = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.kmr);
        this.f177139t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kmt);
        this.f177140u = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.nsj);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7));
        java.lang.String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f177126d = stringExtra;
        this.f177127e = xv1.d.f(stringExtra);
        java.lang.String stringExtra2 = getIntent().getStringExtra("TYPE");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileUtils", "type is null, use default type");
        } else if (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equals(stringExtra2) || "image".equals(stringExtra2) || "video".equals(stringExtra2) || "file".equals(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileUtils", "type is invalid, use default type");
            this.f177128f = stringExtra2;
            this.f177129g = getIntent().getIntExtra("COUNT", 9);
            this.f177130h = getIntent().getStringExtra("EXTENSION");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", this.f177126d, this.f177127e, this.f177128f, java.lang.Integer.valueOf(this.f177129g));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", this.f177130h);
            this.f177132m.b(this.f177129g);
            this.f177131i = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u(this);
            mo43517x10010bd5();
            this.f177135p.mo7967x900dcbe1(this.f177131i.b(this));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f177135p;
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar = this.f177131i;
            uVar.getClass();
            c1163xf1deaba4.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.r(uVar, this));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f177135p;
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar2 = this.f177131i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c(uVar2.f177061b, uVar2.f177062c);
            uVar2.f177094d = cVar;
            cVar.f177059g = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.p(uVar2);
            c1163xf1deaba42.mo7960x6cab2c8d(cVar);
            this.f177135p.m7963x830bc99d(true);
            this.f177135p.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.o(this));
            mo54450xbf7c1df6(this.f177127e);
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.r(this));
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.s(this));
            this.f177138s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.t(this));
            this.f177139t.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.u(this));
            this.f177136q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.v(this));
            this.f177137r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.w(this));
            this.f177140u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.y(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar3 = this.f177131i;
            java.lang.String str = this.f177128f;
            java.lang.String str2 = this.f177130h;
            uVar3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "onCreate");
            uVar3.f177095e.mo48813x58998cd();
            uVar3.c(true, str, str2);
            V6(this.f177128f);
            o25.n1.c(this);
        }
        stringExtra2 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;
        this.f177128f = stringExtra2;
        this.f177129g = getIntent().getIntExtra("COUNT", 9);
        this.f177130h = getIntent().getStringExtra("EXTENSION");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", this.f177126d, this.f177127e, this.f177128f, java.lang.Integer.valueOf(this.f177129g));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", this.f177130h);
        this.f177132m.b(this.f177129g);
        this.f177131i = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u(this);
        mo43517x10010bd5();
        this.f177135p.mo7967x900dcbe1(this.f177131i.b(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f177135p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar4 = this.f177131i;
        uVar4.getClass();
        c1163xf1deaba43.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.r(uVar4, this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba422 = this.f177135p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar22 = this.f177131i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c cVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.c(uVar22.f177061b, uVar22.f177062c);
        uVar22.f177094d = cVar2;
        cVar2.f177059g = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.p(uVar22);
        c1163xf1deaba422.mo7960x6cab2c8d(cVar2);
        this.f177135p.m7963x830bc99d(true);
        this.f177135p.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.o(this));
        mo54450xbf7c1df6(this.f177127e);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.r(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.s(this));
        this.f177138s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.t(this));
        this.f177139t.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.u(this));
        this.f177136q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.v(this));
        this.f177137r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.w(this));
        this.f177140u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.y(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar32 = this.f177131i;
        java.lang.String str3 = this.f177128f;
        java.lang.String str22 = this.f177130h;
        uVar32.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "onCreate");
        uVar32.f177095e.mo48813x58998cd();
        uVar32.c(true, str3, str22);
        V6(this.f177128f);
        o25.n1.c(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar = this.f177131i;
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "onDestroy");
        uVar.f177095e.mo48814x2efc64();
        xv1.b bVar = this.f177132m;
        synchronized (bVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileHelper", "uninit");
            ((java.util.concurrent.ConcurrentHashMap) bVar.f538921b).clear();
            bVar.f538921b = null;
            ((java.util.HashSet) bVar.f538923d).clear();
            bVar.f538923d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f177131i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.u uVar = this.f177131i;
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileUIController", "onResume");
        uVar.f177094d.m8146xced61ae5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0
    public void v2() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.p(this));
    }
}
