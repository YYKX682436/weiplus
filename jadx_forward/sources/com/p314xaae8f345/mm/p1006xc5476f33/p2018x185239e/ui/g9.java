package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class g9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239262d;

    public g9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        this.f239262d = activityC17155x7c2f4bb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239262d;
        if (!activityC17155x7c2f4bb.f239142r || activityC17155x7c2f4bb.U.getVisibility() != 0 || editable.length() <= 0 || activityC17155x7c2f4bb.f239148x <= 0.0d) {
            activityC17155x7c2f4bb.U.setEnabled(false);
        } else {
            activityC17155x7c2f4bb.U.setEnabled(true);
        }
        if (editable.length() > 0) {
            activityC17155x7c2f4bb.f239149y = editable.toString();
        } else {
            activityC17155x7c2f4bb.f239149y = "";
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
