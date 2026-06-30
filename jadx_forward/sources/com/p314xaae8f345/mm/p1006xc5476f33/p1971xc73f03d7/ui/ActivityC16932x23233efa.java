package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI */
/* loaded from: classes8.dex */
public class ActivityC16932x23233efa extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f236389s = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f236393g;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f236396m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ListView f236397n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f236398o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f236399p;

    /* renamed from: q, reason: collision with root package name */
    public os3.c1 f236400q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f236390d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f236391e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f236392f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final os3.p3 f236394h = new os3.p3(this);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f236395i = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final hs3.j f236401r = new os3.z0(this);

    public final void T6() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mailid", this.f236390d);
        hashMap.put("attachid", this.f236391e);
        hashMap.put("fun", "list");
        ks3.k0 wi6 = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi();
        hs3.j jVar = this.f236401r;
        wi6.getClass();
        wi6.g("/cgi-bin/viewcompress", 1, hashMap, null, new hs3.k(), jVar);
    }

    public final void U6(java.lang.String str) {
        os3.a1 a1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompressPreviewUI", "curPath=" + str);
        this.f236399p.setVisibility(8);
        this.f236398o.setVisibility(8);
        this.f236397n.setVisibility(0);
        java.util.List list = this.f236395i;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (true) {
            if (it.hasNext()) {
                a1Var = (os3.a1) it.next();
                if (a1Var.f429559a.equals(str)) {
                    break;
                }
            } else {
                a1Var = null;
                break;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a1Var != null) {
            arrayList.add(a1Var);
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
            os3.a1 a1Var2 = (os3.a1) ((java.util.ArrayList) list).get(i17);
            boolean endsWith = str.endsWith(a1Var2.f429561c);
            java.lang.String str2 = a1Var2.f429561c;
            if ((endsWith && str2.length() > 0) || str2.equals(str)) {
                arrayList.add(a1Var2);
            }
        }
        os3.c1 c1Var = this.f236400q;
        c1Var.f429583d = a1Var;
        c1Var.f429584e = arrayList;
        c1Var.notifyDataSetChanged();
        this.f236397n.setSelection(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f236397n = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f565393c93);
        this.f236398o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565391c91);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.f565392c92);
        this.f236399p = progressBar;
        if (this.f236390d == null || this.f236391e == null) {
            progressBar.setVisibility(8);
            this.f236398o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gps);
            return;
        }
        os3.c1 c1Var = new os3.c1(this, null);
        this.f236400q = c1Var;
        this.f236397n.setAdapter((android.widget.ListAdapter) c1Var);
        this.f236397n.setOnItemClickListener(new os3.u0(this));
        mo54448x9c8c0d33(new os3.v0(this));
        m78597x53c22598(new os3.w0(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571908t8), new os3.x0(this));
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f236390d = getIntent().getStringExtra("mail_id");
        this.f236391e = getIntent().getStringExtra("attach_id");
        this.f236392f = getIntent().getLongExtra("attach_size", 0L);
        this.f236393g = getIntent().getStringExtra("attach_name");
        mo43517x10010bd5();
        mo54450xbf7c1df6(this.f236393g);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        os3.p3 p3Var = this.f236394h;
        p3Var.getClass();
        gm0.j1.n().f354821b.q(138, p3Var);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && this.f236400q.c() != null) {
            U6(this.f236400q.c());
            return true;
        }
        if (keyEvent != null) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }
}
