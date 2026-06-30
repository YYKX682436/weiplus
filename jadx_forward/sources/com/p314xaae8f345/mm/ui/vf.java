package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class vf implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.wf f292688d;

    public vf(com.p314xaae8f345.mm.ui.wf wfVar) {
        this.f292688d = wfVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return windowInsets;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "OnApplyWindowInsetsListener %s", windowInsets);
        windowInsets.consumeSystemWindowInsets();
        com.p314xaae8f345.mm.ui.wf wfVar = this.f292688d;
        com.p314xaae8f345.mm.ui.n8 n8Var = wfVar.f292767g.f278548b;
        windowInsets.getSystemWindowInsetTop();
        android.graphics.Rect rect = new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) n8Var).getClass();
        com.p314xaae8f345.mm.ui.C21374x812c2fd3.FitSystemWindowLayoutView fitSystemWindowLayoutView = wfVar.f292765e;
        fitSystemWindowLayoutView.m78431x6229eb06(wfVar.f292766f);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
        return windowInsets;
    }
}
