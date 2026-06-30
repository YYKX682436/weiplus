package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui;

/* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI */
/* loaded from: classes15.dex */
public class ActivityC11392x4c96dbc1 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements l75.q0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f154742u = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f154743d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f154745f;

    /* renamed from: g, reason: collision with root package name */
    public h71.v f154746g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f154747h;

    /* renamed from: e, reason: collision with root package name */
    public int f154744e = -2;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f154748i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f154749m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f154750n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f154751o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f154752p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f154753q = new h71.n(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f154754r = new h71.p(this);

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f154755s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f154756t = new h71.t(this);

    public final void V6(e71.h hVar, java.text.SimpleDateFormat simpleDateFormat) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c c11393x5bd9875c = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c(this, null);
        c11393x5bd9875c.C("mysafedevice_" + hVar.f69210x4b6e878b);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = hVar.f69207x225f1eb0;
        ((ke0.e) xVar).getClass();
        c11393x5bd9875c.L(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str));
        if (!hVar.f69208x97de538) {
            c11393x5bd9875c.H(k35.m1.f(mo55332x76847179(), hVar.f69204xad24a2e * 1000, false, false));
        }
        h71.v vVar = this.f154746g;
        c11393x5bd9875c.T = vVar;
        c11393x5bd9875c.U = vVar;
        c11393x5bd9875c.M = hVar;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).d(c11393x5bd9875c, -1);
        if (ot5.h.f430410a.a(hVar.f69210x4b6e878b, wo.w0.k(), "MySafeDeviceListUI", false)) {
            return;
        }
        ((java.util.LinkedList) this.f154745f).add(c11393x5bd9875c);
    }

    public final void W6() {
        ((java.util.LinkedList) this.f154745f).clear();
        this.f154747h = e71.k.wi().y0();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f154748i;
        arrayList.clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f154749m;
        arrayList2.clear();
        java.util.Collections.sort(this.f154747h, new h71.r(this));
        for (e71.h hVar : this.f154747h) {
            boolean z17 = hVar.f69208x97de538;
            ot5.h hVar2 = ot5.h.f430410a;
            if (z17) {
                if (hVar2.a(hVar.f69210x4b6e878b, wo.w0.k(), "MySafeDeviceListUI", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MySafeDeviceListUI", "my device uuid: " + hVar.f69210x4b6e878b);
                    arrayList.add(0, hVar);
                } else {
                    arrayList.add(hVar);
                }
            } else if (hVar2.a(hVar.f69210x4b6e878b, wo.w0.k(), "MySafeDeviceListUI", false)) {
                arrayList.add(0, hVar);
            } else {
                arrayList2.add(hVar);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).g(com.p314xaae8f345.mm.R.xml.f576454bn);
        if (((java.util.LinkedList) this.f154747h).size() == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).w("my_safe_device_list_tip");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).w("my_online_device_list_tip");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).w("my_offline_device_list_tip");
            mo74408xb0dfae51(false);
            return;
        }
        if (this.f154744e == 1) {
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7q), this.f154753q);
            this.f154744e = ~this.f154744e;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yy-MM-dd HH:mm:ss");
        if (arrayList.size() > 0) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(mo55332x76847179(), null);
            c21568x1a71b23b.L(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.isn));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).d(c21568x1a71b23b, -1);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V6((e71.h) it.next(), simpleDateFormat);
        }
        if (arrayList2.size() > 0) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(mo55332x76847179(), null);
            c21568x1a71b23b2.L(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ism));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154743d).d(c21568x1a71b23b2, -1);
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            V6((e71.h) it6.next(), simpleDateFormat);
        }
        mo74408xb0dfae51(true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f154755s;
        java.lang.Runnable runnable = this.f154756t;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
        m79335xcc101dd9().addOnLayoutChangeListener(new h71.s(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getFooterView */
    public android.view.View mo48671x42edd6d6() {
        android.widget.TextView textView = (android.widget.TextView) com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.chg, (android.view.ViewGroup) m79335xcc101dd9().getParent(), false).findViewById(com.p314xaae8f345.mm.R.id.mq8);
        this.f154751o = textView.getPaddingTop();
        textView.setText(java.lang.String.format("<a href='%s'>%s</a>", getString(com.p314xaae8f345.mm.R.C30867xcad56011.ij_), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7u)));
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView, 1);
        return textView;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new h71.q(this));
        this.f154743d = m79336x8b97809d();
        this.f154745f = new java.util.LinkedList();
        this.f154746g = new h71.v(this, null);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7q), this.f154753q);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.isk);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(850, this);
        gm0.j1.d().a(361, this);
        e71.k.wi().add(this);
        mo43517x10010bd5();
        e71.f fVar = new e71.f();
        gm0.j1.d().g(fVar);
        this.f154750n = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572138zr), true, true, new h71.o(this, fVar));
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MySafeDeviceListUI);
        aVar.dk(this, getClass().getSimpleName());
        aVar.ik(this, 4, 28198);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(850, this);
        gm0.j1.d().q(361, this);
        e71.k.wi().mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MySafeDeviceListUI", "notify " + str);
        this.f154754r.mo50293x3498a0(new h71.u(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MySafeDeviceListUI", "null key");
            return false;
        }
        if (!str.startsWith("mysafedevice_")) {
            return true;
        }
        e71.h hVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c) c21560x1fce98fb).M;
        android.content.Intent intent = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4.class);
        intent.putExtra("INTENT_Device_Uid", hVar.f69210x4b6e878b);
        intent.putExtra("INTENT_Device_Name", hVar.f69207x225f1eb0);
        intent.putExtra("INTENT_Device_Type", hVar.f69205xe7c5c6f5);
        intent.putExtra("INTENT_Device_LastActiveTime", hVar.f69204xad24a2e);
        intent.putExtra("INTENT_Device_IsOnline", hVar.f69208x97de538);
        intent.putExtra("INTENT_Device_EnableAutoLogin", hVar.f69206xb74667b2);
        intent.putExtra("INTENT_Device_SupportAutoLogin", hVar.f69209xebceb4d0);
        intent.putExtra("INTENT_Device_ClientVersion", hVar.f69203xa74c2c08);
        intent.putExtra("INTENT_Device_AutoLoginWording", hVar.f69202xd500f8e3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI", "startDeviceDetail", "(Lcom/tencent/mm/plugin/account/security/model/SafeDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI", "startDeviceDetail", "(Lcom/tencent/mm/plugin/account/security/model/SafeDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f154754r.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: h71.m$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1.f154742u;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1.this.W6();
            }
        }, 200L);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MySafeDeviceListUI", "errorCode %d, errorMsg %s, scene %s", java.lang.Integer.valueOf(i18), str, m1Var);
        android.app.ProgressDialog progressDialog = this.f154750n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f154750n.dismiss();
            this.f154750n = null;
        }
        if (m1Var.mo808xfb85f7b0() == 361) {
            if (i17 != 0 || i18 != 0) {
                ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4);
            } else {
                e71.k.wi().mo9952xce0038c9(((e71.g) m1Var).f331410f, new java.lang.String[0]);
                db5.e1.T(this, i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.i7w));
            }
        }
    }
}
