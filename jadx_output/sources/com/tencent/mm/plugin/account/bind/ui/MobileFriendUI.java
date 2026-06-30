package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes11.dex */
public class MobileFriendUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f73082o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f73083d;

    /* renamed from: e, reason: collision with root package name */
    public p61.z3 f73084e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f73085f;

    /* renamed from: h, reason: collision with root package name */
    public r61.t1 f73087h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73088i;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73086g = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f73089m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f73090n = null;

    public static void T6(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI, int i17) {
        mobileFriendUI.getClass();
        if (r61.q0.b() != js.x0.SUCC && r61.q0.b() != js.x0.SUCC_UNLOAD) {
            android.view.View view = mobileFriendUI.f73085f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mobileFriendUI.f73085f.setOnClickListener(new p61.n4(mobileFriendUI));
            mobileFriendUI.f73083d.setVisibility(8);
            mobileFriendUI.f73089m.setVisibility(8);
            return;
        }
        if (mobileFriendUI.f73084e.getCount() <= 0) {
            mobileFriendUI.f73089m.setVisibility(0);
            mobileFriendUI.f73083d.setVisibility(8);
            android.view.View view2 = mobileFriendUI.f73085f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        mobileFriendUI.f73089m.setVisibility(8);
        mobileFriendUI.f73083d.setVisibility(0);
        android.view.View view3 = mobileFriendUI.f73085f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "setShowView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void U6() {
        android.app.ProgressDialog progressDialog;
        if (r61.q0.h()) {
            return;
        }
        this.f73086g = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gwe), true, true, new p61.q4(this));
        if (r61.q0.a()) {
            y61.e eVar = (y61.e) i95.n0.c(y61.e.class);
            p61.r4 r4Var = new p61.r4(this);
            ((m61.i) eVar).getClass();
            if (x51.e.a(r4Var) || (progressDialog = this.f73086g) == null) {
                return;
            }
            progressDialog.dismiss();
            this.f73086g = null;
            return;
        }
        java.util.List g17 = r61.q0.g();
        java.util.List e17 = r61.q0.e();
        if (((java.util.ArrayList) g17).size() == 0 && ((java.util.ArrayList) e17).size() == 0) {
            gm0.j1.d().g(new r61.h1());
        } else {
            this.f73087h = new r61.t1(r61.q0.g(), r61.q0.e());
            gm0.j1.d().g(this.f73087h);
        }
    }

    public void V6(r61.a aVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.i())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MobileFriendUI", "username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", aVar.i());
        intent.putExtra("Contact_Nick", aVar.g());
        intent.putExtra("Contact_Mobile_MD5", aVar.e());
        intent.putExtra("Contact_Alias", aVar.A);
        intent.putExtra("Contact_Sex", aVar.f392806v);
        intent.putExtra("Contact_Signature", aVar.f392809y);
        intent.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(aVar.E, aVar.f392807w, aVar.f392808x));
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("Contact_ShowUserName", false);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this);
    }

    public final void W6() {
        if (fp.h.c(26)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "onCreateAfterMPermissionGranted() checkContacts(android.Manifest.permission.WRITE_CONTACTS)[%b]", java.lang.Boolean.TRUE);
        }
        U6();
        com.tencent.mm.plugin.report.service.b1.f(13, 33);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jmw);
        this.f73089m = textView;
        textView.setText(com.tencent.mm.R.string.gwc);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfn);
        this.f73090n = textView2;
        textView2.setText(com.tencent.mm.R.string.gxl);
        this.f73085f = findViewById(com.tencent.mm.R.id.jmz);
        this.f73083d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jmy);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        c9Var.f210324i = new p61.s4(this);
        addSearchMenu(true, c9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "ABTest Type, NEW(%B)", java.lang.Boolean.TRUE);
        p61.h4 h4Var = new p61.h4(this, new p61.t4(this));
        this.f73084e = h4Var;
        this.f73083d.setAdapter((android.widget.ListAdapter) h4Var);
        this.f73083d.setOnItemClickListener(new p61.u4(this));
        ((p61.h4) this.f73084e).f352283p = new p61.v4(this);
        if (r61.q0.b() != js.x0.SUCC && r61.q0.b() != js.x0.SUCC_UNLOAD) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.jmz);
            this.f73085f = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f73085f.setOnClickListener(new p61.i4(this));
            this.f73083d.setVisibility(8);
        }
        setBackBtn(new p61.j4(this));
        setToTop(new p61.k4(this));
        if (!((c01.z1.p() & 131072) == 0) || r61.q0.h()) {
            db5.e1.j(this, com.tencent.mm.R.string.afr, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490507x1, com.tencent.mm.R.string.f490347sg, new p61.l4(this), new p61.m4(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.gwg);
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        m61.k.wi().f392819d.A("qqlist", "update addr_upload2 set reserved4=0");
        gm0.j1.d().a(32, this);
        gm0.j1.d().a(133, this);
        initView();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "summerper checkPermission checkContacts(android.Manifest.permission.READ_CONTACTS)[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            W6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(32, this);
        gm0.j1.d().q(133, this);
        this.f73084e.c();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] == 0) {
            W6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhf), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new p61.o4(this), new p61.p4(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f73084e.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.ProgressDialog progressDialog;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() == 32 && (progressDialog = this.f73086g) != null) {
            progressDialog.dismiss();
            this.f73086g = null;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + i17 + ", errCode = " + i18);
        }
        if (m1Var.getType() == 133) {
            gm0.j1.d().g(new r61.h1());
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() == 32) {
                ((y61.e) i95.n0.c(y61.e.class)).getClass();
            }
            this.f73084e.f();
        } else if (m1Var.getType() == 32) {
            dp.a.makeText(this, com.tencent.mm.R.string.gwd, 0).show();
        }
    }
}
