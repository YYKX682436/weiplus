package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes14.dex */
public class v4 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w4 f268495d;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w4 w4Var) {
        this.f268495d = w4Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.ime());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w4 w4Var = this.f268495d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets isFixApplyWindow:%s, %s, %s , %s ", java.lang.Boolean.valueOf(w4Var.f268542d.f265313t), insets, java.lang.Boolean.valueOf(windowInsets.isVisible(android.view.WindowInsets.Type.ime())), windowInsets);
        boolean isVisible = windowInsets.isVisible(android.view.WindowInsets.Type.ime());
        if (fp.e0.h()) {
            isVisible = isVisible || windowInsets.isVisible(256);
        }
        android.view.WindowInsets rootWindowInsets = w4Var.f268542d.getRootWindowInsets();
        if (rootWindowInsets == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets getRootWindowInsets null and ignore");
            return windowInsets;
        }
        if (isVisible) {
            w4Var.f268542d.f265307n = true;
            int systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf.f265305u.booleanValue()) {
                android.graphics.Insets insets2 = windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars());
                android.graphics.Insets max = android.graphics.Insets.max(android.graphics.Insets.subtract(insets, insets2), android.graphics.Insets.NONE);
                w4Var.f268542d.f265309p = max.bottom - max.top;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewKeyboardLinearLayout", "onApplyWindowInsets old: %s, newKbHeight: %s, navigationBarInsets: %s, diff: %s", java.lang.Integer.valueOf(systemWindowInsetBottom), java.lang.Integer.valueOf(w4Var.f268542d.f265309p), insets2, max);
            } else {
                w4Var.f268542d.f265309p = systemWindowInsetBottom;
            }
            w4Var.f268542d.e(-3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!!mKBHeight: " + w4Var.f268542d.f265309p);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf = w4Var.f268542d;
            c19330x7ca5b1cf.f265307n = false;
            c19330x7ca5b1cf.e(-2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!!mKBHeight: " + w4Var.f268542d.f265309p);
        }
        if (w4Var.f268542d.f265313t) {
            return view.onApplyWindowInsets(windowInsets);
        }
        view.onApplyWindowInsets(windowInsets);
        return windowInsets;
    }
}
