package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class z2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154443d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154443d = activityC11351x975a7907;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean isFocused = view.isFocused();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154443d;
        if (isFocused) {
            activityC11351x975a7907.f154043p.setPadding(0, i65.a.b(activityC11351x975a7907.mo55332x76847179(), 12), 0, i65.a.b(activityC11351x975a7907.mo55332x76847179(), 16));
            activityC11351x975a7907.f154043p.setHint("");
            ((android.view.inputmethod.InputMethodManager) activityC11351x975a7907.mo55332x76847179().getSystemService("input_method")).showSoftInput(activityC11351x975a7907.f154043p, 0);
        } else if (activityC11351x975a7907.f154043p.getText().length() > 0) {
            activityC11351x975a7907.f154043p.setPadding(0, i65.a.b(activityC11351x975a7907.mo55332x76847179(), 12), 0, i65.a.b(activityC11351x975a7907.mo55332x76847179(), 16));
        } else {
            activityC11351x975a7907.f154043p.setPadding(0, i65.a.b(activityC11351x975a7907.mo55332x76847179(), 28), 0, i65.a.b(activityC11351x975a7907.mo55332x76847179(), 16));
            activityC11351x975a7907.f154043p.setHint(activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_z));
        }
    }
}
