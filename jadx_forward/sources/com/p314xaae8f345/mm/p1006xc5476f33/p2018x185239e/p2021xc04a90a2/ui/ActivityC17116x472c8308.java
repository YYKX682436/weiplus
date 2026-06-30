package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI */
/* loaded from: classes9.dex */
public class ActivityC17116x472c8308 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f238095r = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f238096d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f238097e;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f238102m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v f238103n;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f238098f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238099g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238100h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f238101i = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f238104o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f238105p = new int[2];

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f238106q = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.o(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570838c24;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574081gx3));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.i(this));
        this.f238096d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.jnj);
        this.f238097e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jni);
        java.util.List list = this.f238101i;
        if (((java.util.ArrayList) list).isEmpty()) {
            this.f238096d.setVisibility(8);
            this.f238097e.setVisibility(0);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        this.f238102m = c1162x665295de;
        c1162x665295de.Q(1);
        this.f238096d.mo7967x900dcbe1(this.f238102m);
        this.f238096d.N(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.w(mo55332x76847179()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.v(mo55332x76847179(), this.f238100h, list, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l(this));
        this.f238103n = vVar;
        this.f238096d.mo7960x6cab2c8d(vVar);
        this.f238096d.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m(this));
        this.f238103n.m8146xced61ae5();
        this.f238096d.post(this.f238106q);
        this.f238096d.P(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.n(this));
        this.f238096d.setVisibility(0);
        this.f238097e.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f238098f = getIntent().getStringExtra("key_homepage_ext");
        this.f238100h = getIntent().getBooleanExtra("key_finish", true);
        this.f238099g = getIntent().getStringExtra("key_last_id");
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17111x2fc4c3b7> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_history_record");
        java.util.List list = this.f238101i;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            int i17 = sw3.f.f494999u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17111x2fc4c3b7 c17111x2fc4c3b7 : parcelableArrayListExtra) {
                r45.ow3 ow3Var = new r45.ow3();
                ow3Var.f464108d = c17111x2fc4c3b7.f238081d;
                ow3Var.f464109e = c17111x2fc4c3b7.f238082e;
                ow3Var.f464110f = c17111x2fc4c3b7.f238083f;
                ow3Var.f464111g = c17111x2fc4c3b7.f238084g;
                ow3Var.f464112h = c17111x2fc4c3b7.f238085h;
                ow3Var.f464113i = c17111x2fc4c3b7.f238086i;
                arrayList.add(ow3Var);
            }
            ((java.util.ArrayList) list).addAll(arrayList);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "initData() mFinish:%s mLastId:%s mHisRecord.size:%s", java.lang.Boolean.valueOf(this.f238100h), this.f238099g, java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
        mo43517x10010bd5();
        m83090x14f40144(2993);
        m83090x14f40144(1495);
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2993);
        m83121xf6ff5b27(1495);
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof sw3.f;
            java.util.List list = this.f238101i;
            if (z17) {
                r45.hp6 hp6Var = ((sw3.f) m1Var).f495000t;
                r45.hp6 hp6Var2 = hp6Var != null ? hp6Var : null;
                if (hp6Var2 == null || hp6Var2.f457911d != 0) {
                    db5.t7.m123883x26a183b(mo55332x76847179(), (hp6Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hp6Var2.f457912e)) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : hp6Var2.f457912e, 0).show();
                } else {
                    this.f238099g = hp6Var2.f457915h;
                    boolean z18 = hp6Var2.f457914g;
                    this.f238100h = z18;
                    this.f238103n.f238257d = z18;
                    java.util.LinkedList linkedList = hp6Var2.f457913f;
                    if (!linkedList.isEmpty()) {
                        ((java.util.ArrayList) list).addAll(linkedList);
                    }
                    this.f238103n.m8146xced61ae5();
                }
                return true;
            }
            if (m1Var instanceof sw3.h) {
                sw3.h hVar = (sw3.h) m1Var;
                r45.jp6 jp6Var = hVar.f495004v;
                if (jp6Var == null) {
                    jp6Var = null;
                }
                if (jp6Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "NetSceneMobileRemitGetRecvInfo rcvrResp is null");
                    return true;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(jp6Var.f459550d);
                java.lang.String str2 = jp6Var.f459551e;
                java.lang.String str3 = hVar.f495002t;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "NetSceneMobileRemitGetRecvInfo rcvrId:%s ret_code:%s ret_msg:%s", str3, valueOf, str2);
                if (jp6Var.f459550d == 0) {
                    if (jp6Var.f459553g != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "show remark or nickname change dialog!");
                        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(this, jp6Var.f459553g, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.p(this, jp6Var));
                    } else if (jp6Var.f459566w != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "show free oneself from dialog!");
                        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(this, jp6Var.f459566w, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.q(this, jp6Var));
                    } else {
                        tw3.b.a(mo55332x76847179(), jp6Var);
                    }
                    return true;
                }
                if (jp6Var.f459552f == 1) {
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r45.ow3 ow3Var = (r45.ow3) it.next();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(ow3Var.f464108d, str3)) {
                            ow3Var.f464113i = 1;
                            break;
                        }
                    }
                    this.f238103n.m8146xced61ae5();
                }
                db5.e1.E(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp6Var.f459551e) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : jp6Var.f459551e, "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gww), false, null).show();
                return true;
            }
            if (m1Var instanceof sw3.c) {
                r45.fp6 fp6Var = ((sw3.c) m1Var).f494996t;
                r45.fp6 fp6Var2 = fp6Var != null ? fp6Var : null;
                if (fp6Var2 == null || fp6Var2.f456070d != 0) {
                    db5.t7.m123883x26a183b(mo55332x76847179(), (fp6Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fp6Var2.f456071e)) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : fp6Var2.f456071e, 0).show();
                }
                return true;
            }
        } else {
            if (!(m1Var instanceof sw3.f) && !(m1Var instanceof sw3.h)) {
                boolean z19 = m1Var instanceof sw3.c;
            }
            if (i18 == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwx);
                }
                db5.t7.m123883x26a183b(mo55332x76847179, str, 0).show();
            }
        }
        return false;
    }
}
