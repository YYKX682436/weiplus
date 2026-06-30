package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public class q9 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f239437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239438e;

    public q9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb, android.view.View.OnClickListener onClickListener) {
        this.f239438e = activityC17155x7c2f4bb;
        this.f239437d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "click enter");
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239438e;
            if (activityC17155x7c2f4bb.f239142r) {
                activityC17155x7c2f4bb.mo73823x964575a5();
                activityC17155x7c2f4bb.f239141q.requestFocus();
                android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activityC17155x7c2f4bb.mo55332x76847179().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(activityC17155x7c2f4bb.f239141q, 0);
                }
            } else {
                this.f239437d.onClick(null);
            }
        }
        return true;
    }
}
