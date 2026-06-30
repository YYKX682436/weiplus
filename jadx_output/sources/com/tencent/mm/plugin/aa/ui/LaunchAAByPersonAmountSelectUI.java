package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class LaunchAAByPersonAmountSelectUI extends com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity {
    public static final /* synthetic */ int C = 0;
    public int A;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f72482h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f72483i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f72484m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f72485n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f72486o;

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashMap f72489r;

    /* renamed from: t, reason: collision with root package name */
    public double f72491t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f72494w;

    /* renamed from: y, reason: collision with root package name */
    public int f72496y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f72497z;

    /* renamed from: g, reason: collision with root package name */
    public final k61.g f72481g = (k61.g) this.f72474e.b(this, k61.g.class);

    /* renamed from: p, reason: collision with root package name */
    public boolean f72487p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f72488q = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.aa.ui.v2 f72490s = null;

    /* renamed from: u, reason: collision with root package name */
    public long f72492u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f72493v = -1;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f72495x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public final java.lang.Runnable B = new com.tencent.mm.plugin.aa.ui.f2(this);

    public static boolean f7(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI, com.tencent.mm.plugin.aa.ui.w2 w2Var) {
        launchAAByPersonAmountSelectUI.getClass();
        if (com.tencent.mm.storage.z3.m4(w2Var.f72870a)) {
            return true;
        }
        if (launchAAByPersonAmountSelectUI.i7() && c01.z1.r().equals(w2Var.f72870a)) {
            return true;
        }
        return launchAAByPersonAmountSelectUI.i7() && !h61.o.o(launchAAByPersonAmountSelectUI.f72497z, w2Var.f72870a);
    }

    public static void g7(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        launchAAByPersonAmountSelectUI.m7();
        launchAAByPersonAmountSelectUI.l7();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.HashMap hashMap = (java.util.HashMap) launchAAByPersonAmountSelectUI.f72488q;
        for (java.lang.String str : hashMap.keySet()) {
            if (com.tencent.mm.wallet_core.ui.r1.h0((java.lang.String) hashMap.get(str), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue() <= launchAAByPersonAmountSelectUI.f72492u) {
                arrayList.add(str + "," + ((java.lang.String) hashMap.get(str)));
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("selectUI", arrayList);
        launchAAByPersonAmountSelectUI.setResult(-1, intent);
        launchAAByPersonAmountSelectUI.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bni;
    }

    public void h7() {
        if (this.f72486o.isShown()) {
            this.f72486o.setText("");
            this.f72486o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477834cs));
            this.f72486o.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f72482h.getLayoutParams();
            layoutParams.topMargin = i65.a.b(getContext(), 0);
            this.f72482h.setLayoutParams(layoutParams);
        }
    }

    public final boolean i7() {
        return this.A == 1;
    }

    public final void j7() {
        if (com.tencent.mm.ui.bk.C()) {
            this.f72483i.setTextColor(android.graphics.Color.parseColor("#4c7D90A9"));
        } else {
            this.f72483i.setTextColor(android.graphics.Color.parseColor("#4c576B95"));
        }
    }

    public void k7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f72486o.setText(str);
        if (this.f72486o.isShown()) {
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477814c8);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.aa.ui.q2(this));
        this.f72486o.startAnimation(loadAnimation);
        this.f72486o.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f72482h.getLayoutParams();
        layoutParams.topMargin = i65.a.b(getContext(), 55);
        this.f72482h.setLayoutParams(layoutParams);
    }

    public final void l7() {
        if (this.f72491t > 0.0d) {
            this.f72487p = true;
            this.f72483i.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479308vo));
        } else {
            this.f72487p = false;
            j7();
        }
    }

    public final void m7() {
        try {
            this.f72491t = 0.0d;
            this.f72494w = false;
            java.util.Map map = this.f72488q;
            if (map != null) {
                java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
                while (it.hasNext()) {
                    double F = com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) it.next(), 0.0d);
                    this.f72491t += F;
                    long j17 = this.f72492u;
                    if (j17 > 0 && F * 100.0d > j17) {
                        this.f72494w = true;
                    }
                }
                com.tencent.mm.plugin.aa.ui.v2 v2Var = this.f72490s;
                if (v2Var != null) {
                    v2Var.a(map);
                }
            }
            this.f72484m.setText(getString(com.tencent.mm.R.string.g_k, java.lang.Double.valueOf(this.f72491t)));
            if (map == null || ((java.util.HashMap) map).size() <= 0) {
                updateOptionMenuText(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, getString(com.tencent.mm.R.string.f490507x1));
            } else {
                updateOptionMenuText(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, getString(com.tencent.mm.R.string.f489726z, java.lang.Integer.valueOf(((java.util.HashMap) map).size())));
            }
            if (this.f72494w) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 7);
                enableOptionMenu(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, false);
                k7(getString(com.tencent.mm.R.string.gae, java.lang.Float.valueOf(((float) this.f72492u) / 100.0f)));
            } else {
                if (map == null || ((java.util.HashMap) map).size() <= 0) {
                    enableOptionMenu(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, false);
                } else {
                    enableOptionMenu(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, true);
                }
                h7();
            }
            if (this.f72483i.getRight() > this.f72484m.getLeft()) {
                android.widget.TextView textView = this.f72484m;
                textView.setMaxEms(textView.length() / 2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "updateTotalAmount error: %s", e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.g_l);
        setBackBtn(new com.tencent.mm.plugin.aa.ui.i2(this));
        addTextOptionMenu(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.aa.ui.j2(this), null, com.tencent.mm.ui.fb.GREEN);
        this.f72482h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482960sy);
        this.f72483i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bxl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482961sz);
        this.f72484m = textView;
        textView.setText(getString(com.tencent.mm.R.string.g_k, java.lang.Float.valueOf(0.0f)));
        this.f72485n = findViewById(com.tencent.mm.R.id.nse);
        this.f72486o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482932s6);
        this.f72473d = this.f72482h;
        android.view.View view = this.f72485n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.bk.r0(this.f72483i.getPaint(), 0.8f);
        this.f72483i.setOnTouchListener(new com.tencent.mm.plugin.aa.ui.l2(this));
        this.f72483i.setOnClickListener(new com.tencent.mm.plugin.aa.ui.o2(this));
        this.f72487p = true;
        this.f72482h.setOnScrollListener(new com.tencent.mm.plugin.aa.ui.p2(this));
        this.f72496y = getIntent().getIntExtra("enter_scene", 1);
        this.f72497z = getIntent().getStringExtra("chatroom");
        this.f72492u = getIntent().getLongExtra("maxPerAmount", -1L);
        this.f72493v = getIntent().getIntExtra("maxUserNumber", -1);
        this.A = getIntent().getIntExtra("group_solitatire_flag", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate, chatroom: %s, maxPerAmount: %s, ", this.f72497z, java.lang.Long.valueOf(this.f72492u));
        k61.g gVar = this.f72481g;
        gVar.a();
        gVar.f255221h.request(k61.f.class);
        com.tencent.mm.plugin.aa.ui.k2 k2Var = new com.tencent.mm.plugin.aa.ui.k2(this);
        java.util.HashMap hashMap = (java.util.HashMap) gVar.f255223m;
        fm5.a aVar = (fm5.d) hashMap.get(k61.f.class);
        if (aVar == null) {
            aVar = new em5.c(gVar, lm5.d.f319600a);
            hashMap.put(k61.f.class, aVar);
        }
        fm5.b bVar = new fm5.b(k2Var, aVar);
        synchronized (aVar) {
            aVar.f264181d.add(bVar);
        }
        java.lang.Object peek = gVar.f255221h.peek(k61.f.class);
        if (peek != null) {
            k2Var.a(peek);
        }
    }

    @Override // com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.Map map = this.f72488q;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
    }
}
