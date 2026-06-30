package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class InviteMMFBFriendsUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f73287m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f73288d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.b3 f73289e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f73290f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73291g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73292h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f73293i;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ach;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73288d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jmy);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
        textView.setText(com.tencent.mm.R.string.c8g);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        c9Var.f210324i = new com.tencent.mm.plugin.account.ui.o2(this);
        addSearchMenu(true, c9Var);
        com.tencent.mm.plugin.account.ui.b3 b3Var = new com.tencent.mm.plugin.account.ui.b3(this, new com.tencent.mm.plugin.account.ui.p2(this, textView));
        this.f73289e = b3Var;
        this.f73288d.setAdapter((android.widget.ListAdapter) b3Var);
        this.f73290f = findViewById(com.tencent.mm.R.id.jmz);
        this.f73288d.setOnItemClickListener(new com.tencent.mm.plugin.account.ui.q2(this));
        c01.z1.u();
        if (c01.z1.u()) {
            this.f73288d.setVisibility(0);
            android.view.View view = this.f73290f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/InviteMMFBFriendsUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long r17 = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            if (java.lang.System.currentTimeMillis() - r17 > 86400000 && str.length() > 0) {
                com.tencent.mm.ui.mmfb.sdk.l lVar = new com.tencent.mm.ui.mmfb.sdk.l();
                this.f73293i = lVar;
                lVar.g(str);
                new v61.q0(this.f73293i, new com.tencent.mm.plugin.account.ui.r2(this)).c();
            }
            r61.h1 h1Var = new r61.h1();
            h1Var.J();
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.account.ui.s2(this, h1Var), false);
            if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(65829, null)) > 0) {
                gm0.j1.u().c().w(65829, 1);
                gm0.j1.d().g(h1Var);
            } else {
                b4Var.c(5000L, 5000L);
            }
            this.f73291g = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hoq), true, true, new com.tencent.mm.plugin.account.ui.t2(this, b4Var, h1Var));
        }
        setBackBtn(new com.tencent.mm.plugin.account.ui.u2(this));
        setToTop(new com.tencent.mm.plugin.account.ui.v2(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.c8k), new com.tencent.mm.plugin.account.ui.z2(this));
        showOptionMenu(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.c8n);
        gm0.j1.d().a(32, this);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(32, this);
        this.f73289e.c();
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73293i;
        if (lVar != null) {
            lVar.c(this);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.InviteFacebookFriendsUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() != 32) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f73291g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73291g = null;
        }
        if (i17 == 4 && i18 == -68) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(this, str, getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.n2(this), null);
        } else if (i17 == 0 && i18 == 0) {
            this.f73289e.f();
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.gwd, 0).show();
        }
    }
}
