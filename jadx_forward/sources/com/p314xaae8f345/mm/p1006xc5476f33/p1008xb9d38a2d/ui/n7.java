package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class n7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d f155593d;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d) {
        this.f155593d = activityC11438x77a05b9d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = this.f155593d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11438x77a05b9d.f154936d.getText().toString()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11438x77a05b9d.f154937e.getText().toString())) {
            activityC11438x77a05b9d.f154948s.setEnabled(false);
        } else {
            activityC11438x77a05b9d.f154948s.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
