package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public class h9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239288d;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        this.f239288d = activityC17155x7c2f4bb;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean isFocused = view.isFocused();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239288d;
        if (isFocused) {
            activityC17155x7c2f4bb.f239141q.setHint("");
            ((android.view.inputmethod.InputMethodManager) activityC17155x7c2f4bb.mo55332x76847179().getSystemService("input_method")).showSoftInput(activityC17155x7c2f4bb.f239141q, 0);
        } else {
            if (activityC17155x7c2f4bb.f239141q.getText().length() > 0) {
                return;
            }
            activityC17155x7c2f4bb.f239141q.setHint(activityC17155x7c2f4bb.f239143s);
        }
    }
}
