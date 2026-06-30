package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI */
/* loaded from: classes9.dex */
public class ActivityC12982x2657907a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f175561m = 0;

    /* renamed from: d, reason: collision with root package name */
    public or1.s1 f175562d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f175563e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f175564f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f175565g;

    /* renamed from: h, reason: collision with root package name */
    public or1.j1 f175566h;

    /* renamed from: i, reason: collision with root package name */
    public final or1.p1 f175567i = new or1.p1(new or1.n1(this));

    public final void T6(java.util.List list) {
        if (this.f175562d == null) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            or1.s1 s1Var = this.f175562d;
            s1Var.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(new or1.v1((r45.d67) it.next()));
            }
            s1Var.f429105e = linkedList;
            return;
        }
        or1.s1 s1Var2 = this.f175562d;
        s1Var2.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        or1.v1 v1Var = new or1.v1();
        v1Var.f429123b = com.p314xaae8f345.mm.R.raw.f79059x63f41def;
        r45.d67 d67Var = v1Var.f429122a;
        d67Var.f453718d = 1;
        android.content.Context context = s1Var2.f429104d;
        d67Var.f453719e = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572657c13);
        d67Var.f453720f = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyw) + "/node/wework/images/icon_im.48490d44c5.png";
        linkedList2.add(v1Var);
        or1.v1 v1Var2 = new or1.v1();
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1l);
        r45.d67 d67Var2 = v1Var2.f429122a;
        d67Var2.f453719e = string;
        d67Var2.f453720f = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyw) + "/node/wework/images/icon_workspace.cb133ed72e.png";
        d67Var2.f453718d = 2;
        linkedList2.add(v1Var2);
        s1Var2.f429105e = linkedList2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570275a93;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.util.LinkedList linkedList;
        this.f175563e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f565766dh2);
        if (this.f175562d == null) {
            this.f175562d = new or1.s1(this, this);
            try {
                r01.m y07 = r01.q3.bj().y0(this.f175564f);
                r45.ik ikVar = new r45.ik();
                ikVar.mo11468x92b714fd(y07.f66039x3c18ecc6);
                linkedList = ikVar.f458635d;
            } catch (java.lang.Throwable unused) {
                linkedList = null;
            }
            T6(linkedList);
            r01.q3.bj().b1(this.f175564f, new or1.u1(this));
            this.f175565g = new or1.k1(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "count = %s", java.lang.Integer.valueOf(this.f175562d.getCount()));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f175564f, true);
        mo54450xbf7c1df6(n17.f2());
        if (!n17.r2() || this.f175562d.getCount() <= 0) {
            this.f175563e.setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565767dh3);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c1g);
            textView.setVisibility(0);
        } else {
            this.f175563e.setVisibility(0);
            this.f175563e.setAdapter((android.widget.ListAdapter) this.f175562d);
            this.f175563e.setOnItemClickListener(this.f175565g);
        }
        mo54448x9c8c0d33(new or1.l1(this));
        m78597x53c22598(new or1.m1(this));
        or1.j1 j1Var = this.f175566h;
        j1Var.getClass();
        m78478x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571350cl, com.p314xaae8f345.mm.R.raw.f78351x6c69febc, new or1.i1(j1Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f175566h.a(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("enterprise_scene", 2);
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f175564f = stringExtra;
        this.f175566h = new or1.j1(this, stringExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "bizName = %s", stringExtra);
        mo43517x10010bd5();
        r01.q3.cj().add(this.f175562d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f175562d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        r01.q3.cj().mo49775xc84af884(this.f175562d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f175562d);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c01.e2.J(this.f175564f)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "%s !isContact", this.f175564f);
        finish();
    }
}
