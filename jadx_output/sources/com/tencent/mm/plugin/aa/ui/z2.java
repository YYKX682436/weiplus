package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class z2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72910d;

    public z2(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72910d = launchAAUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean isFocused = view.isFocused();
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72910d;
        if (isFocused) {
            launchAAUI.f72510p.setPadding(0, i65.a.b(launchAAUI.getContext(), 12), 0, i65.a.b(launchAAUI.getContext(), 16));
            launchAAUI.f72510p.setHint("");
            ((android.view.inputmethod.InputMethodManager) launchAAUI.getContext().getSystemService("input_method")).showSoftInput(launchAAUI.f72510p, 0);
        } else if (launchAAUI.f72510p.getText().length() > 0) {
            launchAAUI.f72510p.setPadding(0, i65.a.b(launchAAUI.getContext(), 12), 0, i65.a.b(launchAAUI.getContext(), 16));
        } else {
            launchAAUI.f72510p.setPadding(0, i65.a.b(launchAAUI.getContext(), 28), 0, i65.a.b(launchAAUI.getContext(), 16));
            launchAAUI.f72510p.setHint(launchAAUI.getString(com.tencent.mm.R.string.g_z));
        }
    }
}
