package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes9.dex */
public class EnterpriseBizContactListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f94005o = 0;

    /* renamed from: d, reason: collision with root package name */
    public or1.j1 f94006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94007e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView f94008f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f94009g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f94010h;

    /* renamed from: m, reason: collision with root package name */
    public long f94012m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94011i = false;

    /* renamed from: n, reason: collision with root package name */
    public long f94013n = 0;

    public final void T6(java.util.List list) {
        java.util.List<r45.d67> list2 = list;
        if (list == null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.d67 d67Var = new r45.d67();
            d67Var.f372185d = 1;
            d67Var.f372186e = getString(com.tencent.mm.R.string.f491124c13);
            d67Var.f372187f = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyw) + "/node/wework/images/icon_im.48490d44c5.png";
            linkedList.add(d67Var);
            list2 = linkedList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.d67 d67Var2 : list2) {
            if (d67Var2.f372185d != 2) {
                or1.n0 n0Var = new or1.n0();
                n0Var.f371677e = new com.tencent.mm.storage.z3();
                n0Var.f371678f = new qk.o();
                n0Var.f347541g = true;
                n0Var.f347542h = d67Var2;
                arrayList.add(n0Var);
            }
        }
        this.f94008f.setFixedBrandServiceItem(arrayList);
        this.f94008f.i();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f94013n = java.lang.System.currentTimeMillis() / 1000;
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488743a94;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.LinkedList linkedList;
        qk.o b17;
        setMMTitle(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f94007e, true).f2());
        setBackBtn(new or1.d0(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94007e) && (b17 = r01.z.b(this.f94007e)) != null && b17.I0()) {
            or1.j1 j1Var = this.f94006d;
            j1Var.getClass();
            addIconOptionMenu(1, com.tencent.mm.R.string.f489817cl, com.tencent.mm.R.raw.actionbar_icon_dark_add, new or1.i1(j1Var));
        }
        this.f94009g = findViewById(com.tencent.mm.R.id.f484234dh3);
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView) findViewById(com.tencent.mm.R.id.f484232dh1);
        this.f94008f = enterpriseBizContactListView;
        enterpriseBizContactListView.setFatherBizName(this.f94007e);
        this.f94008f.setExcludeBizChat(true);
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView2 = this.f94008f;
        enterpriseBizContactListView2.getClass();
        enterpriseBizContactListView2.setOnItemClickListener(new or1.j0(enterpriseBizContactListView2));
        if (enterpriseBizContactListView2.getMode() == 0) {
            enterpriseBizContactListView2.setOnItemLongClickListener(new or1.k0(enterpriseBizContactListView2));
        }
        this.f94008f.setEmptyListener(new or1.e0(this));
        try {
            r01.m y07 = r01.q3.bj().y0(this.f94007e);
            r45.ik ikVar = new r45.ik();
            ikVar.parseFrom(y07.field_raw_attrs);
            linkedList = ikVar.f377102d;
        } catch (java.lang.Throwable unused) {
            linkedList = null;
        }
        T6(linkedList);
        r01.q3.bj().b1(this.f94007e, new or1.h0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        or1.j1 j1Var = this.f94006d;
        if (j1Var != null) {
            j1Var.a(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f94007e = stringExtra;
        this.f94006d = new or1.j1(this, stringExtra);
        this.f94012m = java.lang.System.currentTimeMillis() / 1000;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f94010h;
        if (n3Var == null) {
            this.f94010h = new or1.f0(this);
        } else {
            n3Var.removeMessages(1);
        }
        this.f94010h.sendEmptyMessageDelayed(1, 500L);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.EnterpriseBizContactListUI)).Rj(this, iy1.a.EnterpriseBiz);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f94008f != null) {
            ((java.util.ArrayList) r01.q3.pj().f368275a).clear();
        }
        long j17 = this.f94012m;
        if (j17 > 0) {
            long j18 = this.f94013n;
            if (j18 > 0) {
                long j19 = j18 - j17;
                r01.m y07 = r01.q3.bj().y0(this.f94007e);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13465, "", java.lang.Integer.valueOf(y07 != null ? y07.field_qyUin : 0), 0, java.lang.Integer.valueOf(y07 != null ? y07.field_userUin : 0), 2, java.lang.Long.valueOf(j19));
            }
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!c01.e2.J(this.f94007e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", this.f94007e);
            finish();
            return;
        }
        initView();
        if (this.f94011i) {
            return;
        }
        int intExtra = getIntent().getIntExtra("enterprise_from_scene", 5);
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = this.f94008f;
        int contactCount = enterpriseBizContactListView != null ? enterpriseBizContactListView.getContactCount() : -1;
        r01.m y07 = r01.q3.bj().y0(this.f94007e);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12892, this.f94007e, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(contactCount), "", 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(y07 != null ? y07.field_qyUin : 0), java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L));
        this.f94011i = true;
    }
}
