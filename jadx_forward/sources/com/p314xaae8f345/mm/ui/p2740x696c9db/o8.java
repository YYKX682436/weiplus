package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f292153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f292154e;

    public o8(com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        this.f292154e = c9Var;
        this.f292153d = activityC1102x9ee2d9f;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById;
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f292154e;
        if (c9Var.f291854f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c9Var.f291849a, "want to collapse search view, but search menu item is null");
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f292153d;
        if (activityC1102x9ee2d9f != null && !activityC1102x9ee2d9f.isFinishing()) {
            c9Var.getClass();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activityC1102x9ee2d9f.getSystemService("input_method");
            if (inputMethodManager != null && (currentFocus = activityC1102x9ee2d9f.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        android.view.View actionView = c9Var.f291854f.getActionView();
        if (actionView == null || (findViewById = actionView.findViewById(com.p314xaae8f345.mm.R.id.d98)) == null) {
            return;
        }
        findViewById.clearFocus();
    }
}
