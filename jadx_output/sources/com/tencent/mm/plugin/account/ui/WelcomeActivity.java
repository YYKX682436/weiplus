package com.tencent.mm.plugin.account.ui;

@db5.a(3)
/* loaded from: classes14.dex */
public class WelcomeActivity extends com.tencent.mm.ui.MMFragmentActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f73691h = {"public_profile"};

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.WelcomeSelectView f73692d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f73693e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct f73694f = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();

    /* renamed from: g, reason: collision with root package name */
    public final x51.c1 f73695g = new x51.c1();

    public static void S6(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        welcomeActivity.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) == null) {
            ((cy1.a) rVar).Hj("register_account", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        } else {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WelcomeActivity", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().o();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (android.os.Build.VERSION.SDK_INT >= 26 && !com.tencent.mm.ui.ga.q()) {
            getWindow().setNavigationBarColor(getResources().getColor(com.tencent.mm.R.color.f478519a1));
        }
        com.tencent.mm.plugin.account.ui.WelcomeSelectView welcomeSelectView = new com.tencent.mm.plugin.account.ui.WelcomeSelectView(this);
        this.f73692d = welcomeSelectView;
        setContentView(welcomeSelectView);
        com.tencent.mm.plugin.account.ui.WelcomeSelectView welcomeSelectView2 = this.f73692d;
        welcomeSelectView2.a(welcomeSelectView2.f73696d, 300L);
        welcomeSelectView2.a(welcomeSelectView2.f73699g, 300L);
        android.view.View view = welcomeSelectView2.f73696d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "slideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "slideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        welcomeSelectView2.f73699g.setVisibility(0);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.account.ui.vj(welcomeSelectView2));
        this.f73692d.f73699g.setOnClickListener(new com.tencent.mm.plugin.account.ui.kj(this));
        this.f73692d.f73697e.setOnClickListener(new com.tencent.mm.plugin.account.ui.lj(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        db5.h4 h4Var = new db5.h4(this, 1001, 0);
        h4Var.f228376t = com.tencent.mm.R.string.hvy;
        arrayList2.add(h4Var);
        db5.h4 h4Var2 = new db5.h4(this, 1002, 0);
        if (u11.c.c()) {
            h4Var2.f228376t = com.tencent.mm.R.string.hvx;
            arrayList2.add(h4Var2);
        }
        if (arrayList2.size() > 1) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.account.ui.mj(this, arrayList2);
            k0Var.f211881s = new com.tencent.mm.plugin.account.ui.nj(this);
            k0Var.f211854d = new com.tencent.mm.plugin.account.ui.oj(this);
            this.f73692d.f73698f.setOnClickListener(new com.tencent.mm.plugin.account.ui.pj(this, k0Var, arrayList2, h4Var2));
        } else {
            this.f73692d.f73698f.setOnClickListener(new com.tencent.mm.plugin.account.ui.qj(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AccountLoginFirstRegPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 34575);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f73694f.k();
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73693e;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f73695g.c(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.account.ui.WelcomeSelectView welcomeSelectView = this.f73692d;
        java.lang.String p17 = com.tencent.mm.sdk.platformtools.m2.p(welcomeSelectView.f73700h.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), welcomeSelectView.f73700h);
        welcomeSelectView.f73699g.setText(com.tencent.mm.sdk.platformtools.m2.g(welcomeSelectView.f73700h, com.tencent.mm.R.array.f478007v, com.tencent.mm.R.string.f490464vs));
        if (p17 != null && p17.equals("language_default")) {
            welcomeSelectView.f73699g.setText(welcomeSelectView.f73700h.getString(com.tencent.mm.R.string.gi6));
        }
        welcomeSelectView.f73697e.setText(com.tencent.mm.R.string.g1i);
        welcomeSelectView.f73698f.setText(com.tencent.mm.R.string.g1h);
    }
}
