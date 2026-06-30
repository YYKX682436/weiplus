package com.tencent.mm.plugin.card.ui;

/* loaded from: classes4.dex */
public class CardShopUI extends com.tencent.mm.ui.MMActivity implements wt1.i0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f94901s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f94902d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f94903e;

    /* renamed from: g, reason: collision with root package name */
    public tt1.j f94905g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f94907i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.f4 f94908m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f94909n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f94910o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f94904f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f94906h = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f94911p = false;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.BroadcastReceiver f94912q = new com.tencent.mm.plugin.card.ui.b4(this);

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f94913r = new com.tencent.mm.plugin.card.ui.c4(this);

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardShopUI", com.tencent.mm.plugin.appbrand.jsapi.lbs.g0.NAME);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.f94912q, intentFilter);
        if (!((com.tencent.mm.sdk.platformtools.n2.a() || com.tencent.mm.sdk.platformtools.n2.b()) ? false : true)) {
            U6();
        } else {
            db5.e1.u(this, getString(com.tencent.mm.R.string.auo, getString(com.tencent.mm.R.string.ari)), getString(com.tencent.mm.R.string.f490573yv), new lu1.l(this), new lu1.m());
        }
    }

    public final void U6() {
        boolean z17;
        wt1.j0 bj6 = xt1.t0.bj();
        java.lang.String str = this.f94906h;
        java.lang.String str2 = this.f94907i;
        bj6.f449299f = str;
        synchronized (bj6.f449297d) {
            if (!((java.util.HashMap) bj6.f449297d).containsKey(str)) {
                ((java.util.HashMap) bj6.f449297d).put(str, new java.util.HashSet());
            }
            if (!((java.util.Set) ((java.util.HashMap) bj6.f449297d).get(str)).contains(this)) {
                ((java.util.Set) ((java.util.HashMap) bj6.f449297d).get(str)).add(this);
            }
        }
        synchronized (bj6.f449298e) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                bj6.f449298e.put(str, str2);
            }
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        boolean z18 = true;
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
            z17 = false;
        } else {
            e17.l(bj6, true, false, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
            z18 = false;
        } else if (bj6.f449301h != null) {
            gm0.j1.n().f273288b.d(bj6.f449301h);
        }
        if (z18) {
            this.f94903e = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.asg), true, true, new com.tencent.mm.plugin.card.ui.a4(this));
        } else {
            db5.e1.T(this, getString(com.tencent.mm.R.string.asf));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488362r8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (android.text.TextUtils.isEmpty(this.f94905g.s0().Y)) {
            setMMTitle(com.tencent.mm.R.string.ari);
        } else {
            setMMTitle(this.f94905g.s0().Y);
        }
        this.f94902d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f483584bc1);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.tencent.mm.R.layout.f488337qj, null);
        this.f94909n = linearLayout;
        this.f94902d.addHeaderView(linearLayout);
        com.tencent.mm.plugin.card.ui.f4 f4Var = new com.tencent.mm.plugin.card.ui.f4(this, null);
        this.f94908m = f4Var;
        this.f94902d.setAdapter((android.widget.ListAdapter) f4Var);
        this.f94902d.setOnItemClickListener(new com.tencent.mm.plugin.card.ui.y3(this, getIntent()));
        setBackBtn(new com.tencent.mm.plugin.card.ui.z3(this));
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488336qi, null);
        this.f94910o = inflate;
        android.widget.LinearLayout linearLayout2 = this.f94909n;
        if (linearLayout2 != null) {
            linearLayout2.addView(inflate);
        }
        ((android.widget.TextView) this.f94910o.findViewById(com.tencent.mm.R.id.bah)).setText(com.tencent.mm.R.string.avj);
        android.view.View view = this.f94910o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardShopUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardShopUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f94905g = (tt1.j) getIntent().getParcelableExtra("key_card_info_data");
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_CARD_TP_ID");
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_CARD_ID");
        if (this.f94905g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardShopUI", "onCreate  mCardInfo != null");
            this.f94906h = this.f94905g.f();
            this.f94907i = this.f94905g.g();
        } else if (!android.text.TextUtils.isEmpty(stringExtra)) {
            this.f94906h = stringExtra;
            if (android.text.TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "";
            }
            this.f94907i = stringExtra2;
        }
        if (android.text.TextUtils.isEmpty(this.f94906h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardShopUI", "onCreate  mCardTpid == null");
            finish();
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardShopUI", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
        this.f94911p = Di;
        if (Di) {
            T6();
        }
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f94911p) {
            unregisterReceiver(this.f94912q);
        }
        xt1.t0.bj().a(this.f94906h, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardShopUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardShopUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 69) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.baz), false, new com.tencent.mm.plugin.card.ui.d4(this), null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardShopUI", "onMPermissionGranted LocationPermissionGranted " + this.f94911p);
        if (this.f94911p) {
            return;
        }
        this.f94911p = true;
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.card.ui.h4.class);
    }
}
