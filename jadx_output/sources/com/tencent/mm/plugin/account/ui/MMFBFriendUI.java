package com.tencent.mm.plugin.account.ui;

@java.lang.Deprecated
/* loaded from: classes11.dex */
public class MMFBFriendUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, kv.e0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f73450o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f73451d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.u8 f73452e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f73453f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73454g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f73455h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73456i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73457m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f73458n;

    @Override // kv.e0
    public void U(java.lang.String str) {
        this.f73452e.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ach;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73451d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jmy);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfc);
        this.f73455h = textView;
        textView.setText(com.tencent.mm.R.string.c8i);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
        textView2.setText(com.tencent.mm.R.string.c8g);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        c9Var.f210324i = new com.tencent.mm.plugin.account.ui.y8(this);
        addSearchMenu(true, c9Var);
        com.tencent.mm.plugin.account.ui.u8 u8Var = new com.tencent.mm.plugin.account.ui.u8(this, new com.tencent.mm.plugin.account.ui.z8(this, textView2));
        this.f73452e = u8Var;
        u8Var.f74246q = new com.tencent.mm.plugin.account.ui.a9(this);
        this.f73451d.setAdapter((android.widget.ListAdapter) u8Var);
        this.f73453f = findViewById(com.tencent.mm.R.id.jmz);
        this.f73451d.setOnItemClickListener(new com.tencent.mm.plugin.account.ui.b9(this));
        c01.z1.u();
        if (c01.z1.u()) {
            this.f73451d.setVisibility(0);
            android.view.View view = this.f73453f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long r17 = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            if (java.lang.System.currentTimeMillis() - r17 > 86400000 && str.length() > 0) {
                com.tencent.mm.ui.mmfb.sdk.l lVar = new com.tencent.mm.ui.mmfb.sdk.l();
                this.f73458n = lVar;
                lVar.g(str);
                new v61.q0(this.f73458n, new com.tencent.mm.plugin.account.ui.c9(this)).c();
            }
            r61.h1 h1Var = new r61.h1();
            h1Var.J();
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.account.ui.d9(this, h1Var), false);
            if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(65829, null)) > 0) {
                gm0.j1.u().c().w(65829, 1);
                gm0.j1.d().g(h1Var);
            } else {
                b4Var.c(5000L, 5000L);
            }
            this.f73454g = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hoq), true, true, new com.tencent.mm.plugin.account.ui.e9(this, b4Var, h1Var));
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.cfi), new com.tencent.mm.plugin.account.ui.f9(this));
        } else {
            this.f73451d.setVisibility(8);
            android.view.View view2 = this.f73453f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/MMFBFriendUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f485945jn0)).setText(com.tencent.mm.R.string.ce7);
            this.f73453f.setOnClickListener(new com.tencent.mm.plugin.account.ui.g9(this));
        }
        setBackBtn(new com.tencent.mm.plugin.account.ui.v8(this));
        setToTop(new com.tencent.mm.plugin.account.ui.w8(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.cfh);
        gm0.j1.d().a(32, this);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(32, this);
        this.f73452e.c();
        super.onDestroy();
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73458n;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().f70579a.j(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().f70579a.a(this, android.os.Looper.getMainLooper());
        this.f73452e.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FacebookFriendUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() != 32) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f73454g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73454g = null;
        }
        if (i17 == 4 && i18 == -68) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(this, str, getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.x8(this), null);
        } else if (i17 == 0 && i18 == 0) {
            this.f73452e.f();
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.gwd, 0).show();
        }
    }
}
