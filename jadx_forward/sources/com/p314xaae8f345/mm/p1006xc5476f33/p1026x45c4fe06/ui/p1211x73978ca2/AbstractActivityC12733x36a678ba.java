package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1211x73978ca2;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC12733x36a678ba extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17354xafef217a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4, db5.b1 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f171850o;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f171851h;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f171853m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f171852i = true;

    /* renamed from: n, reason: collision with root package name */
    public final x.d f171854n = new x.d(0);

    static {
        com.p314xaae8f345.mm.ui.ga.Q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        f171850o = new java.lang.String[]{"connectivity", "accessibility", "autofill", "sensor"};
    }

    public static void d7(android.app.Activity activity, int i17) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || activity.getWindow() == null) {
            return;
        }
        android.view.Window window = activity.getWindow();
        android.view.View decorView = window.getDecorView();
        boolean g17 = com.p314xaae8f345.mm.ui.uk.g(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) activity.findViewById(com.p314xaae8f345.mm.R.id.twm);
        if (android.os.Build.VERSION.SDK_INT < 26 || com.p314xaae8f345.mm.ui.ga.q()) {
            return;
        }
        if (c22602x8bae1c88 != null) {
            c22602x8bae1c88.m81260xbba45cf8(i17);
            new n3.m3(window, decorView).b(!g17);
        } else {
            window.setNavigationBarColor(i17);
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g17 ? systemUiVisibility & (-17) : systemUiVisibility | 16);
        }
    }

    @Override // db5.b1
    /* renamed from: addDialog */
    public void mo53058xe5d1a549(android.app.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        if (isFinishing() || isDestroyed()) {
            dialog.dismiss();
            return;
        }
        if (this.f171853m == null) {
            this.f171853m = new java.util.ArrayList();
        }
        this.f171853m.add(dialog);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16712xf1541050
    /* renamed from: b7 */
    public boolean getF233589g() {
        return false;
    }

    public final boolean c7(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        if (view == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method")) == null || (windowToken = view.getWindowToken()) == null) {
            return false;
        }
        try {
            return inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandContainerFragmentActivity", "hide VKB(View) exception %s", e17);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: getHostActivity */
    public android.app.Activity mo53059x9d6db74d() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (getApplicationContext() != null) {
            if (u46.a.b(f171850o, str)) {
                return getApplicationContext().getSystemService(str);
            }
            if ("uimode".equals(str) && android.os.Build.VERSION.SDK_INT >= 30) {
                android.content.Context applicationContext = getApplicationContext();
                if (java.util.Objects.equals(getAttributionTag(), applicationContext.getAttributionTag())) {
                    return applicationContext.getSystemService(str);
                }
            }
        }
        return super.getSystemService(str);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKB */
    public final void mo48674x36654fab() {
        mo53061x30be3ed();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKBHavingResult */
    public final boolean mo53061x30be3ed() {
        android.view.View currentFocus = getCurrentFocus();
        return currentFocus == null ? c7(this.f171851h) : c7(currentFocus);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initNavigationSwipeBack */
    public final boolean mo52921x858d605d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isSupportNavigationSwipeBack */
    public final boolean getF147381t() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 28 && getWindow() != null) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        hk1.e eVar = new hk1.e(this);
        this.f171851h = eVar;
        eVar.setId(com.p314xaae8f345.mm.R.id.w_);
        if (!com.p314xaae8f345.mm.ui.b4.c(this)) {
            setContentView(this.f171851h);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88(this);
        c22602x8bae1c88.setId(com.p314xaae8f345.mm.R.id.twm);
        c22602x8bae1c88.m81259x3d6c86dd(true);
        c22602x8bae1c88.m81261xdefc8eb0(al5.q.f87522e);
        c22602x8bae1c88.m81262xe4312112(al5.r.f87537d);
        c22602x8bae1c88.addView(this.f171851h);
        setContentView(c22602x8bae1c88);
    }

    /* renamed from: onCreateBeforeSetContentView */
    public void mo52916x6c4bab6() {
        cf.b.b(this, 10);
        cf.b.b(this, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList arrayList = this.f171853m;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.app.Dialog dialog = (android.app.Dialog) it.next();
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
            this.f171853m.clear();
            this.f171853m = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: onPostDestroyed */
    public void mo53062x6449b5ba() {
        super.mo53062x6449b5ba();
        this.f171854n.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        java.util.Iterator it = this.f171854n.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e8 e8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e8) ((hk1.f) it.next());
            e8Var.getClass();
            if (z17) {
                boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a.X;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = e8Var.f171219a;
                activityC12666xc288131a.l7();
                activityC12666xc288131a.E.mo50297x7c4d7ca2(activityC12666xc288131a.F, 500L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f171852i) {
            mo52916x6c4bab6();
            this.f171852i = false;
        }
        super.setContentView(view, layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: showVKB */
    public final void mo26063x7b383410() {
        com.p314xaae8f345.mm.ui.ga.M0(this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKB */
    public final void mo53060x36654fab(android.view.View view) {
        c7(view);
    }
}
