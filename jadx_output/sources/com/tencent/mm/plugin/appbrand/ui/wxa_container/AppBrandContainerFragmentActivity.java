package com.tencent.mm.plugin.appbrand.ui.wxa_container;

/* loaded from: classes7.dex */
public abstract class AppBrandContainerFragmentActivity extends com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity implements com.tencent.mm.plugin.appbrand.widget.input.x4, db5.b1 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f90317o;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f90318h;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f90320m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f90319i = true;

    /* renamed from: n, reason: collision with root package name */
    public final x.d f90321n = new x.d(0);

    static {
        com.tencent.mm.ui.ga.Q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        f90317o = new java.lang.String[]{"connectivity", "accessibility", "autofill", "sensor"};
    }

    public static void d7(android.app.Activity activity, int i17) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed() || activity.getWindow() == null) {
            return;
        }
        android.view.Window window = activity.getWindow();
        android.view.View decorView = window.getDecorView();
        boolean g17 = com.tencent.mm.ui.uk.g(i17);
        com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = (com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) activity.findViewById(com.tencent.mm.R.id.twm);
        if (android.os.Build.VERSION.SDK_INT < 26 || com.tencent.mm.ui.ga.q()) {
            return;
        }
        if (edgeToEdgeWrapperLayout != null) {
            edgeToEdgeWrapperLayout.setNavigationBarBackgroundColor(i17);
            new n3.m3(window, decorView).b(!g17);
        } else {
            window.setNavigationBarColor(i17);
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g17 ? systemUiVisibility & (-17) : systemUiVisibility | 16);
        }
    }

    @Override // db5.b1
    public void addDialog(android.app.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        if (isFinishing() || isDestroyed()) {
            dialog.dismiss();
            return;
        }
        if (this.f90320m == null) {
            this.f90320m = new java.util.ArrayList();
        }
        this.f90320m.add(dialog);
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity
    /* renamed from: b7 */
    public boolean getF152056g() {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandContainerFragmentActivity", "hide VKB(View) exception %s", e17);
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.x4
    public android.app.Activity getHostActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (getApplicationContext() != null) {
            if (u46.a.b(f90317o, str)) {
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

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public final void hideVKB() {
        hideVKBHavingResult();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.x4
    public final boolean hideVKBHavingResult() {
        android.view.View currentFocus = getCurrentFocus();
        return currentFocus == null ? c7(this.f90318h) : c7(currentFocus);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public final boolean initNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public final boolean getF65848t() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 28 && getWindow() != null) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        hk1.e eVar = new hk1.e(this);
        this.f90318h = eVar;
        eVar.setId(com.tencent.mm.R.id.w_);
        if (!com.tencent.mm.ui.b4.c(this)) {
            setContentView(this.f90318h);
            return;
        }
        com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = new com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout(this);
        edgeToEdgeWrapperLayout.setId(com.tencent.mm.R.id.twm);
        edgeToEdgeWrapperLayout.setDisableNavigationBarContrastEnforced(true);
        edgeToEdgeWrapperLayout.setNavigationBarStrategy(al5.q.f5989e);
        edgeToEdgeWrapperLayout.setStatusBarStrategy(al5.r.f6004d);
        edgeToEdgeWrapperLayout.addView(this.f90318h);
        setContentView(edgeToEdgeWrapperLayout);
    }

    public void onCreateBeforeSetContentView() {
        cf.b.b(this, 10);
        cf.b.b(this, 1);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.ArrayList arrayList = this.f90320m;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.app.Dialog dialog = (android.app.Dialog) it.next();
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
            this.f90320m.clear();
            this.f90320m = null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity
    public void onPostDestroyed() {
        super.onPostDestroyed();
        this.f90321n.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        java.util.Iterator it = this.f90321n.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.ui.e8 e8Var = (com.tencent.mm.plugin.appbrand.ui.e8) ((hk1.f) it.next());
            e8Var.getClass();
            if (z17) {
                boolean z18 = com.tencent.mm.plugin.appbrand.ui.AppBrandUI.X;
                com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = e8Var.f89686a;
                appBrandUI.l7();
                appBrandUI.E.postDelayed(appBrandUI.F, 500L);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f90319i) {
            onCreateBeforeSetContentView();
            this.f90319i = false;
        }
        super.setContentView(view, layoutParams);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public final void showVKB() {
        com.tencent.mm.ui.ga.M0(this);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public final void hideVKB(android.view.View view) {
        c7(view);
    }
}
